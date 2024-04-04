package Java;

public abstract class Animal {
    protected String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}