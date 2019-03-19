package data;

public class Individual {

    private static int counter = 0;
    private String name;
    private int age;
    private long passport;
    private Gender gender = Gender.MALE;
    private float weight;
    private float height;

    public Individual() {
        this.name = "";
        this.age = 0;
        this.passport = 0L;
        this.weight = 0.0F;
        this.height = 0.0F;
        counter++;
    }

    public Individual(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.passport = 0L;
        this.gender = gender;
        this.weight = 0.0F;
        this.height = 0.0F;
        counter++;
    }

    public Individual(String name, int age, long passport, Gender gender, float weight, float height) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    private void checkGender(char gender) {

        if (gender != 'M' && gender != 'F') {
            this.gender = Gender.MALE;
        }
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age;
    }

    public enum Gender {
        MALE('M'), FEMALE('F');

        private char initialChar;

        Gender(char initialChar) {
            this.initialChar = initialChar;
        }
    }

}

