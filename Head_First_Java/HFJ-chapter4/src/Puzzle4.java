public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6];
        int number = 1;
        int i = 0;
        while (i < 6) {
            values[i] = new Value();
            values[i].intValue = number;
            System.out.println("i = " + i + ", intValue = " + values[i].intValue);
            number = number * 10;
            i = i + 1;
        }
        int result = 0;
        i = 6;
        while (i > 0) {
            i = i - 1;
            System.out.println("result for i = " + i + " is " + values[i].doStuff(i));
            result = result + values[i].doStuff(i);
        }
        System.out.println("final result " + result);
    }
}
class Value {
    int intValue;
    public int doStuff(int factor) {
        if (intValue > 100) {
            System.out.print("intValue * factor => ");
            return intValue * factor;
        }
        else {
            System.out.print("intValue * (5 - factor) => ");
            return intValue * (5 - factor);
        }
    }
}