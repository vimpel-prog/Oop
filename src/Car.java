public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private float engineVolume;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume) {
        if(brand==null) brand="default";
        else this.brand = brand;
        if(model==null) model = "default";
        else this.model = model;
        if(productionYear==0) productionYear=2000;
        else this.productionYear = productionYear;
        if(productionCountry==null) productionCountry="default";
        else this.productionCountry = productionCountry;
        if(color==null)color="белый";
        else this.color = color;
        if(engineVolume==0) engineVolume=1.5f;
        else this.engineVolume = engineVolume;
    }
    void information() {
        System.out.println(brand+" "+ model+ " , сборка "+productionCountry+" , цвет кузова — "+color+" , объем двигателя — "+engineVolume+" л, год выпуска — "+productionYear+".");
    }
}
