package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        //this.isHungry = true;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Name: " + name + ", satiety: " + satiety);
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            satiety = true;
            System.out.println(name + " ate from the plate!");
        }else{
            System.out.println(name + " does not have enough food in the plate");
        };
    }

    public static void Satiety(Cat[] cats){
        for (int i = 0; i <cats.length ; i++) {
            if(cats[i].isSatiety()){
                System.out.println(cats[i].getName() + " ate");
            }else {
                System.out.println(cats[i].getName() + " hungry");
            }
        }
    }
}
