class GoodDog {
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }
    String name;
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Woof!");
            } else if (size > 14) {
                System.out.println("Ruff!");
            } else {
                System.out.println("Yip!");
            }
            numOfBarks = numOfBarks - 1;
        }
    }
}
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog three = new GoodDog();
        three.setSize(35);
        System.out.println("Dog one: " + one.getSize());
        one.bark(1);
        System.out.println("Dog two: " + two.getSize());
        two.bark(2);
        System.out.println("Dog three: " + three.getSize());
        three.bark(3);
    }
}
