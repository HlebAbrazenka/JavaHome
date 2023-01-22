package Lessons2;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Żula";

        Dog dog2 = new Dog();
        dog2.name = "Ramses";

        System.out.println("Parent's dog name" + dog.name);
        System.out.println("Our dog name" + dog2.name);


    }
}
