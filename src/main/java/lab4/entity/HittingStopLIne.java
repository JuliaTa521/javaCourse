package lab4.entity;

public class HittingStopLIne {

    private CarType carType;
    private String carNumber;
    private String driverName;
    private String driverSurname;
    private String addressHittingStopLine;

    public HittingStopLIne(CarType carType, String carNumber, String driverName, String driverSurname, String addressHittingStopLine) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.addressHittingStopLine = addressHittingStopLine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public String getAddressHittingStopLine() {
        return addressHittingStopLine;
    }

    public void setAddressHittingStopLine(String addressHittingStopLine) {
        this.addressHittingStopLine = addressHittingStopLine;
    }

    @Override
    public String toString() {
        return "Наезд на линию останова " +
                "\nТип машины = " + carType +
                ",\nНомер машины = '" + carNumber + '\'' +
                ",\nИмя водителя = '" + driverName + '\'' +
                ",\nФамилия водителя = '" + driverSurname + '\'' +
                ",\nАдрес наезда на стоп линию = '" + addressHittingStopLine + '\'';
    }
}
