package Assignment.AbstractFactory;

import Assignment.Hyundai.Hyundai;
import Assignment.Kia.Kia;
import Assignment.Kia.KiaCerato;
import Assignment.Kia.KiaRio;
import Assignment.Kia.KiaSportage;

public class KiaFactory implements CarFactory {
    @Override
    public Kia getKia(String KiaType) {
        if ("Cerato".equalsIgnoreCase(KiaType)) {
            return new KiaCerato();
        } else if ("Rio".equalsIgnoreCase(KiaType)) {
            return new KiaRio();
        } else if ("Sportage".equalsIgnoreCase(KiaType)) {
            return new KiaSportage();
        }
        return null;
    }

    @Override
    public Hyundai getHyundai(String HyundaiType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "KiaFactory";
    }
}
