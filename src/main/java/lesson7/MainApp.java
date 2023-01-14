package lesson7;

/**
 * 1. Expand the problem about cats and plates of food.
 *
 * 2. Make it so that a negative amount of food cannot be obtained in a plate of food
 * (for example, there are 10 foods in a bowl, and the cat tries to eat 15-20).
 *
 * 3. Each cat needs to add a satiety field (when we create cats, they are hungry).
 * If the cat managed to eat (there was enough food), satiety = true.
 *
 * 4. We believe that if the cat does not have enough food in the plate,
 * then he simply does not touch it, that is, he cannot be half full
 * (this is done to simplify the logic of the program).
 *
 * 5. Create an array of cats and a plate of food, ask all cats to eat from this plate,
 * and then print information about the satiety of cats to the console.
 *
 * 6. Add to the plate a method by which food could be added to the plate.
 */

public class MainApp {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Barsik");
        Plate plateBarsik = new Plate(7);
        catBarsik.eat(plateBarsik);
        catBarsik.eat(plateBarsik);

        System.out.println("----------------------");

        Cat[] cats = {
            new Cat("Barsuk"),
            new Cat("BlackCat"),
            new Cat("Antoshka"),
            new Cat("Murka"),
            new Cat("Kiska"),
            new Cat("Kotik"),
            new Cat("Cat")};

        Plate plateCats = new Plate(23);
        for (int i = 0; i <cats.length ; i++) {
            cats[i].eat(plateCats);
        }

        System.out.println("----------------------");
        Cat.Satiety(cats);
        System.out.println("----------------------");

        plateCats.addFood(23);
        for (int i = 0; i <cats.length ; i++) {
            if(!cats[i].isSatiety()){
                cats[i].eat(plateCats);
            }
        }

        System.out.println("----------------------");
        Cat.Satiety(cats);

    }
}
