package lesson6.animals;

public class Cat extends Animal {

    protected static int countCat;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.limitation = 200;
        count++;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats haven't learned to swim yet");
    }
}
