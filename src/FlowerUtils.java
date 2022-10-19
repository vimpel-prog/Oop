public class FlowerUtils {
    void showPriceAndInfo(Flower[] flowers) {
        double total = 0;
        int minLife = flowers[0].getLifeSpan(), roseCount = 0, pionCount = 0, gipsCount = 0, hrizCount = 0;
        for (Flower flower : flowers) {
            total += flower.getCost();
            if (flower.getLifeSpan() < minLife) {
                minLife = flower.getLifeSpan();
            }
            switch (flower.getName()) {
                case "Роза": {
                    roseCount++;
                    break;
                }
                case "Хризантема": {
                    hrizCount++;
                    break;
                }
                case "Пион": {
                    pionCount++;
                    break;
                }
                case "Гипсофила": {
                    gipsCount++;
                    break;
                }

            }
        }
        System.out.println("Букет в котором есть: " +
                (roseCount > 0 ? "Роза - " + roseCount + " " : "") +
                (hrizCount > 0 ? "Хризонтема - " + hrizCount + " " : "") +
                (pionCount > 0 ? "Пион - " + pionCount : "") + " " +
                (gipsCount > 0 ? "Гипсофила - " + gipsCount : "") + " " +
                "||| Общая цена : " + total + " ||| Простоит дней : " + minLife);
    }
}
