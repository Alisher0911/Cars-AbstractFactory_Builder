package Assignment.Hyundai;

import Assignment.Builder.Car;

public class HyundaiTucson implements Hyundai {
    @Override
    public String getType() {
        return "Tucson";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Tucson = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Tucson.toString() + " Model - " + getType();
    }
}
