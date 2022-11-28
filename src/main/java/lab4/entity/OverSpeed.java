package lab4.entity;

public class OverSpeed {

    private CarType carType;
    private String carNumber;
    private String driverName;
    private String driverSurname;
    private int countOfOverSpeed;

    public OverSpeed(CarType carType, String carNumber, String driverName, String driverSurname, int countOfOverSpeed) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.countOfOverSpeed = countOfOverSpeed;
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

    public int getCountOfOverSpeed() {
        return countOfOverSpeed;
    }

    public void setCountOfOverSpeed(int countOfOverSpeed) {
        this.countOfOverSpeed = countOfOverSpeed;
    }

    @Override
    public String toString() {
        return "\n\nПревышение скорости " +
                "\nТип машины =" + carType +
                ",\nНомер машины ='" + carNumber + '\'' +
                ",\nИмя водителя ='" + driverName + '\'' +
                ",\nФамилия водителя ='" + driverSurname + '\'' +
                ",\nПревышения скорости на = " + countOfOverSpeed + "км/ч";
    }
}
