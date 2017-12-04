package com.trnet.controller;

import com.trnet.model.Car;
import org.primefaces.model.chart.PieChartModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "car")
public class CarController {


    List<Car> carList = new ArrayList<Car>();
    private PieChartModel pieModel;

    @PostConstruct
    public void init() {

        carList.add(new Car("BMW", 150));
        carList.add(new Car("Mercedes", 100));
        carList.add(new Car("Volkswagen", 500));
        carList.add(new Car("Volvo", 80));
        createPieModel();
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        for (int i = 0; i < carList.size(); i++) {
            pieModel.set(carList.get(i).getBrand(), carList.get(i).getCount());
        }
        pieModel.setTitle("Car brand's amount");
        pieModel.setShowDataLabels(true);
        pieModel.setLegendPosition("e");
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
}
