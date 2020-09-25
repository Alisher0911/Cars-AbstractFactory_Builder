package Assignment.Hyundai;

import Assignment.Builder.Car;

public class HyundaiAccent implements Hyundai {

    @Override
    public String getType() {
        return "Accent";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Accent = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Accent.toString() + " Model - " + getType();
    }
}
