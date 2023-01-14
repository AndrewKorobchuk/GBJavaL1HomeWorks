package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if(amount<=food) {
            food -= amount;
            return true;
        }else{
            return false;
        }
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

    public void addFood(int food){
        this.food+=food;
    }
}
