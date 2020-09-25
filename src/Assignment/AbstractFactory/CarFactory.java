package Assignment.AbstractFactory;

import Assignment.Hyundai.Hyundai;
import Assignment.Kia.Kia;

public interface CarFactory {
    Kia getKia(String KiaType);
    Hyundai getHyundai(String HyundaiType);
}
