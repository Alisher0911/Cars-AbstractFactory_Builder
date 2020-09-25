package Assignment.Builder;

public class Car {
    private String color;
    private String engine;
    private boolean GPS;
    private boolean tripComputer;

    public Car(CarBuilder carBuilder) {
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
        this.GPS = carBuilder.GPS;
        this.tripComputer = carBuilder.tripComputer;
    }

    @Override
    public String toString() {
        return "Car with color " + this.color +
                ", engine " + this.engine +
                ", GPS - " + this.GPS +
                ", Trip Computer - " + this.tripComputer +
                ".";
    }

    public static class CarBuilder {
        private String color;
        private String engine;
        private boolean GPS;
        private boolean tripComputer;

        public CarBuilder(String color, String engine) {
            this.color = color;
            this.engine = engine;
        }

        public CarBuilder withGPS(boolean GPS) {
            this.GPS = GPS;
            return this;
        }

        public CarBuilder withTripComputer(boolean tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
