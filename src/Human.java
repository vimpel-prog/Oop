public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = Math.max(2022 - yearOfBirth, 0);
        this.name = name;
        this.town = town;
        this.job = job;
    }

    void hello() {
        if (name == null) name = "Информация не указана";
        if (town == null) town = "Информация не указана";
        if (job == null) job = "Информация не указана";
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + (2022 - yearOfBirth) + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
