package web.model;

import org.springframework.web.bind.annotation.GetMapping;

public class Car {

    private String model;
    private String color;
    private int series;

    public Car(){};
    public Car(String model, String color, int series){
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){
        return "Car{" + "model: " + model + "color: " + color + " series: " + series + "}";
    }

}
