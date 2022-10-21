package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private final String kuzovType;
    private final int sitsNumbers;
    private String color;
    private float engineVolume;
    private final key key;
    private final insurance insurance;
    private String transmission;
    private String regNumber;
    private boolean winterTires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume, String transmission, String kuzovType, String regNumber, boolean winterTires, int sitsNumbers) {
        this.brand = validValue(brand);
        this.model = validValue(model);
        this.productionYear = Math.max(productionYear, 0);
        this.productionCountry = validValue(productionCountry);
        this.kuzovType = validValue(kuzovType);
        this.sitsNumbers = Math.max(sitsNumbers, 0);
        setColor(color);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }

    private static String validValue(String name) {
        if (name != null && !name.isBlank()) {
            return name;
        } else {
            return "не указано";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validValue(color);
        ;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 0;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validValue(transmission);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {

        if (regNumber.matches([a - z]\d\d\d[a - z][a - z]\d\d\d))

        this.regNumber = validValue(regNumber);
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public String getKuzovType() {
        return kuzovType;
    }

    public int getSitsNumbers() {
        return sitsNumbers;
    }

    public void information() {
        System.out.println(brand + " " + model + " , сборка " + productionCountry +
                " , цвет кузова — " + color +
                " , объем двигателя — " + engineVolume +
                " л, год выпуска — " + productionYear +
                " коробка передач: " + transmission +
                " тип кузова: " + kuzovType +
                " регистрационный номер: " + regNumber +
                " колличество мест: " + sitsNumbers +
                " резина: " + winterTires);
    }

    /*public Car(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume) {
        if (brand == null) this.brand = "default";
        else this.brand = brand;
        if (model == null) this.model = "default";
        else this.model = model;
        if (productionYear == 0) this.productionYear = 2000;
        else this.productionYear = productionYear;
        if (productionCountry == null) this.productionCountry = "default";
        else this.productionCountry = productionCountry;
        if (color == null) this.color = "белый";
        else this.color = color;
        if (engineVolume == 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;
    }*/

    public void changeSeasonWheels(Car car) {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String s = "АВЕКМНОРСТУХ";
        return s.contains("" + symbol);
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChar = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChar[0]) &&
                isNumber(regNumberChar[1]) &&
                isNumber(regNumberChar[2]) &&
                isNumber(regNumberChar[3]) &&
                isNumberLetter(regNumberChar[4]) &&
                isNumberLetter(regNumberChar[5]) &&
                isNumber(regNumberChar[6]) &&
                isNumber(regNumberChar[7]) &&
                isNumber(regNumberChar[8]);
    }

    public static class key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class insurance {
        private final LocalDate validUntil;
        private final float price;
        private final String number;

        public insurance(LocalDate validUntil, float price, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.price = Math.max(price, 1.0f);
            this.number = validValue(number);
        }

        public void isValidNumber() {
            if (number.length() != 9) System.out.println("номер страховки не корректный");
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }
}
