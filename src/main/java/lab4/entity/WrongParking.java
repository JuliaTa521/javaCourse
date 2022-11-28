package lab4.entity;

public class WrongParking {

    private CarType carType;
    private String carNumber;
    private String driverName;
    private String driverSurname;
    private String addressOfWrongParking;

    public WrongParking(CarType carType, String carNumber, String driverName, String driverSurname, String addressOfWorkingParking) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.addressOfWrongParking = addressOfWorkingParking;
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

    public String getAddressOfWorkingParking() {
        return addressOfWrongParking;
    }

    public void setAddressOfWorkingParking(String addressOfWorkingParking) {
        this.addressOfWrongParking = addressOfWorkingParking;
    }

    @Override
    public String toString() {
        return "\n\nНеверная парковка {" +
                "\nТип машины = " + carType +
                ",\nНомер машины = '" + carNumber + '\'' +
                ",\nИмя водителя = '" + driverName + '\'' +
                ",\nФамилия водителя = '" + driverSurname + '\'' +
                ",\nАдрес нарушения парковки = " + addressOfWrongParking;
    }
}
