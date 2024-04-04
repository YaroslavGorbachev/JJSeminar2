package Java;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Буся", 5, "ЧаоЧао"),
                new Dog("Муха", 1, "Немецкаяовчарка"),
                new Cat("Анфиса", 7, false),
                new Cat("Геральт", 4, true)};

        for (Animal animal : animals) {
            // Вывод информации о каждом объекте
            System.out.println("Имя: " + animal.name + ", Возраст: " + animal.age);

            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println("У объекта " + animal.getClass().getSimpleName() + " отсутствует метод makeSound.");
            }
        }
    }
}