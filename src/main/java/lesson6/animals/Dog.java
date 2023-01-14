package lesson6.animals;

public class Dog extends Animal{
    final static int limitationSwim = 10;
    protected static int countDog;

    public static int getCountDog() {
        return countDog;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.limitation = 500;
        count++;
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance>Dog.limitationSwim){
            System.out.println("Dogs have a swimming limit of " + limitationSwim + " 5 meters.");
        }else {
            System.out.println(name + " swam " + distance + " meters.");
        }
    }
}
