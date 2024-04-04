package Java;

class Dog extends Animal {
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public void fetch() {
        System.out.println("Playing fetch with " + super.name);
    }
}