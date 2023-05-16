class DogAgain {
    int size;
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
class DogTestDrive {
    public static void main(String[] args) {
        DogAgain one = new DogAgain();
        one.size = 70;
        DogAgain two = new DogAgain();
        two.size = 8;
        DogAgain three = new DogAgain();
        three.size = 35;
        one.bark(1);
        two.bark(2);
        three.bark(3);
    }
}