package lab4.service;

import lab4.entity.HittingStopLIne;
import lab4.entity.OverSpeed;
import lab4.entity.WrongParking;

public interface PrintDocument {
    String printWrongParkingInformation(WrongParking wrongParking);

    String printOverSpeedInformation(OverSpeed overSpeed);

    String printHittingStopLine(HittingStopLIne hittingStopLIne);
}
