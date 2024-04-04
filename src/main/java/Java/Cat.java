package Java;

class Cat extends Animal {
    private boolean isLazy;

    public Cat(String name, int age, boolean isLazy) {
        super(name, age);
        this.isLazy = isLazy;
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratchFurniture() {
        System.out.println(super.name + " is scratching the furniture");
    }
}