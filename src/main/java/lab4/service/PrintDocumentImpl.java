package lab4.service;

import lab4.entity.HittingStopLIne;
import lab4.entity.OverSpeed;
import lab4.entity.WrongParking;
import lab4.realization.HittingStopLineImpl;
import lab4.realization.OverSpeedImpl;
import lab4.realization.WrongParkingImpl;

public class PrintDocumentImpl implements PrintDocument{

    @Override
    public String printWrongParkingInformation(WrongParking wrongParking) {
        WrongParkingImpl wrongParkingImpl = new WrongParkingImpl();
        return wrongParkingImpl.print(wrongParking);
    }

    @Override
    public String printOverSpeedInformation(OverSpeed overSpeed) {
        OverSpeedImpl overSpeedImpl = new OverSpeedImpl();
        return overSpeedImpl.print(overSpeed);
    }

    @Override
    public String printHittingStopLine(HittingStopLIne hittingStopLIne) {
        HittingStopLineImpl hittingStopLineImpl = new HittingStopLineImpl();
        return hittingStopLineImpl.print(hittingStopLIne);
    }
}
