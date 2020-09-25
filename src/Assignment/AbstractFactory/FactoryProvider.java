package Assignment.AbstractFactory;

public class FactoryProvider {
    public static CarFactory getFactory(String choice) {
        if ("Kia".equalsIgnoreCase(choice)) {
            return new KiaFactory();
        } else if ("Hyundai".equalsIgnoreCase(choice)) {
            return new HyundaiFactory();
        }
        return null;
    }
}
