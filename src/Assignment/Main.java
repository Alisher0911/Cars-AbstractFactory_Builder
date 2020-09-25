package Assignment;

import Assignment.AbstractFactory.CarFactory;
import Assignment.AbstractFactory.FactoryProvider;
import Assignment.Hyundai.Hyundai;
import Assignment.Kia.Kia;

import java.util.Scanner;

public class Main {

    private static FactoryProvider fp;

    public static void main(String[] args) {
        fp = new FactoryProvider();

        Scanner ch = new Scanner(System.in);


        CarFactory car = null;
        System.out.println("Choose a model: ");
        String model = ch.next();
        try {
            car = fp.getFactory(model);
            car.toString();
        } catch (Exception e) {
            System.out.println("No such model, try again!");
            System.exit(0);
        }


        Kia kia = null;
        Hyundai hyundai = null;
        System.out.println("Choose a submodel: ");
        String subModel = ch.next();
        try {
            if ("KiaFactory".equalsIgnoreCase(car.toString())) {
                kia = car.getKia(subModel);
                kia.getType();
            } else if ("HyundaiFactory".equalsIgnoreCase(car.toString())) {
                hyundai = car.getHyundai(subModel);
                hyundai.getType();
            }
        } catch (Exception e) {
            System.out.println("No such submodel");
            System.exit(0);
        }

        System.out.println("Choose a color: ");
        String color = ch.next();

        System.out.println("Choose an engine: ");
        String engine = ch.next();

        boolean b1 = false;
        System.out.println("With GPS? [true/false] ");
        try {
            b1 = ch.nextBoolean();
        } catch (Exception e) {
            System.out.println("ERROR! Write true or false");
            System.exit(0);
        }

        boolean b2 = false;
        System.out.println("With Trip Computer? [true/false] ");
        try {
            b2 = ch.nextBoolean();
        } catch (Exception e) {
            System.out.println("ERROR! Write true or false");
            System.exit(0);
        }


        if ("KiaFactory".equalsIgnoreCase(car.toString())) {
            System.out.println();
            System.out.println(kia.getCar(color, engine, b1, b2));
        } else if ("HyundaiFactory".equalsIgnoreCase(car.toString())) {
            System.out.println();
            System.out.println(hyundai.getCar(color, engine, b1, b2));
        }
    }
}
