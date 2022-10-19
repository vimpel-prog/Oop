public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = Math.max(2022 - yearOfBirth, 0);
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null || job.isBlank() || job.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + (2022 - yearOfBirth) + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
