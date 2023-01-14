package lesson6.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int limitation;
    protected static int count;

    public static int getCount() {
        return count;
    }

    public void run(int distance){
        if(distance>limitation){
            System.out.println(name + " will not run such a distance. Restriction: " + limitation + " meters.");
        }else {
            System.out.println(name + " ran " + distance + " meters.");
        }
    }

    public abstract void swim(int distance);
}
