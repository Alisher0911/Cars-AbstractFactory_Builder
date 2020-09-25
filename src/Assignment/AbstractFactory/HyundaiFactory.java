package Assignment.AbstractFactory;

import Assignment.Hyundai.Hyundai;
import Assignment.Hyundai.HyundaiAccent;
import Assignment.Hyundai.HyundaiSonata;
import Assignment.Hyundai.HyundaiTucson;
import Assignment.Kia.Kia;

public class HyundaiFactory implements CarFactory {
    @Override
    public Kia getKia(String KiaType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Hyundai getHyundai(String HyundaiType) {
        if ("Accent".equalsIgnoreCase(HyundaiType)) {
            return new HyundaiAccent();
        } else if ("Sonata".equalsIgnoreCase(HyundaiType)) {
            return new HyundaiSonata();
        } else if ("Tucson".equalsIgnoreCase(HyundaiType)) {
            return new HyundaiTucson();
        }
        return null;
    }

    @Override
    public String toString() {
        return "HyundaiFactory";
    }
}
