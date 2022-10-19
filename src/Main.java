public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калиниград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        maxim.hello();
        anya.hello();
        kate.hello();
        artem.hello();

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f);
        Car kia = new Car(null, "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);

        lada.information();
        audi.information();
        bmw.information();
        kia.information();
        hyundai.information();

    }
}