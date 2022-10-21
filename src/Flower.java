public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "название не указано";
        } else {
            this.name = name;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost + 0.00;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String name, String flowerColor, String country, double cost) {
        this(name, flowerColor, country, cost, 3);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    void info() {
        System.out.println("Название: " + name + " || Цвет: " + flowerColor + " || Страна происхождения: " + country + " || Цена штуки: " + String.format("%.2f", cost) + " || Срок стояния: " + lifeSpan);
    }
}
