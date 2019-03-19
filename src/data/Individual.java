package data;

public class Individual {

    String name;
    int age;
    String passport;
    Gender gender;
    int weight;
    int height;

    public Individual() {

    }

    public Individual(String name, int age, String passport, Gender gender, int weight, int height) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
}

