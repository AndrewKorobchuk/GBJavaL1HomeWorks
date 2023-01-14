package lesson6;

/**
 1. Create classes Dog and Cat with inheritance from the Animal class.
 2. All animals can run and swim. The length of the obstacle is passed as a parameter to each method.
 The result of the action will be printing to the console. (For example, dogBobik.run(150); -> 'Bobik ran 150m.');
 3. Each animal has restrictions on actions (running: cat 200 m, dog 500 m; swimming: cat cannot swim, dog 10 m).
 4. * Add count created cats, dogs and animals.
 */

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik",3);
        Animal dogDvornyaga = new Dog("Dvornyaga",5);
        Animal dogBobic = new Dog("Bobic",3);
        cat.swim(15);
        cat.run(250);
        cat.run(150);

        dogDvornyaga.swim(200);
        dogDvornyaga.swim(5);
        dogBobic.run(500);
        dogDvornyaga.run(700);
        Animal someAnimal = new Dog("Super Dvornyaga",9);
        System.out.println("All animals: " + Animal.getCount()+", including cats: " + Cat.getCountCat() + ", dogs: " + Dog.getCountDog());
    }
}
