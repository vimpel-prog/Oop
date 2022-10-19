public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private float engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume) {
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
    }

    void information() {
        System.out.println(brand + " " + model + " , сборка " + productionCountry + " , цвет кузова — " + color + " , объем двигателя — " + engineVolume + " л, год выпуска — " + productionYear + ".");
    }
}
