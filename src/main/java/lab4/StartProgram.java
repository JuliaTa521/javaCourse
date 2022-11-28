package lab4;

import lab4.entity.CarType;
import lab4.entity.HittingStopLIne;
import lab4.entity.OverSpeed;
import lab4.entity.WrongParking;
import lab4.service.PrintDocumentImpl;

public class StartProgram {

    static PrintDocumentImpl printDocument = new PrintDocumentImpl();

    public static void main(String[] args) {
        OverSpeed overSpeed = new OverSpeed(CarType.SEDAN, "А342ИА31RUS", "Василий",
                "Пупкин", 18);

        HittingStopLIne hittingStopLIne = new HittingStopLIne(CarType.HATCHBACK, "И546РЕ31RUS",
                "Мария", "Ожегова",
                "Перекрёсток пересечния проспекта Богдана Хмельницкого и Студенческой улицы");

        WrongParking wrongParking = new WrongParking(CarType.UNIVERSAL, "Л921ТВ31RUS", "Владимир",
                "Козлов", "Белгород, ул. Конева, д.8");

        System.out.println(printDocument.printHittingStopLine(hittingStopLIne));
        System.out.println(printDocument.printOverSpeedInformation(overSpeed));
        System.out.println(printDocument.printWrongParkingInformation(wrongParking));
    }
}
