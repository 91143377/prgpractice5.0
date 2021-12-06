import java.text.DecimalFormat;
public class Dog implements Comparable {

    //Each dog has a name, age, breed and weight in pounds.
    private String name;
    private int age;
    private String breed;
    private int weight; //In pounds
    private double weightKg;
    //static variable dogCount so that you can count how many dogs you have.
    public static int dogCount = 0;
    //Brain method to display the dog’s weight in kilograms.

    //Default and a full constructor using this notation.
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, int age, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }


    //Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getWeight() {
        return this.weight;
    }

    public static int getCount() {
        return dogCount;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed() {
        this.breed = breed;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String whatKgIs(int weight) {
        weightKg = weight / 2.2046;
        DecimalFormat fmt = new DecimalFormat("0.##");
        return "\nWeight Kg: " + fmt.format(weightKg);
    }

    //toString().
    public String toString() {
        String output = "";
        output += "\nName: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight Ibs: " + weight;
        return output;
    }

    public String fangToString() {
        String output = "";
        output += "\nName: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        return output;
    }

    public String piperToString() {
        String output = "";
        output += "\nName: " + name;
        output += "\nWeight Ibs: " + weight;
        return output;

    }

    int output = 0;

    public int compareTo(Object newDog) {
        if (this.age < ((Dog) newDog).getAge()) {
            output = -1;
        } else if (this.age > ((Dog) newDog).getAge()) {
            output = 1;
        }
        return output;
    }



}

