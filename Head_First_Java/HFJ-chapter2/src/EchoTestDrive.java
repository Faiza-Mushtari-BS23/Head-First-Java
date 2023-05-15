class Echo {
    int count = 0;
    void hello() {
        System.out.println("helloooo... ");
    }
}
public class EchoTestDrive {
    public static void main(String [] args) {
        Echo e1 = new Echo();
        // correct answer 10
        // Echo e2 = new Echo( );
        // or
        // bonus answer 24
        Echo e2 = e1; //everytime e1 updates, e2 will also be updated
        int x = 0;
        while ( x < 4 ) {
            System.out.println("x => " + x);
            e1.hello();
            System.out.print("e1.count = e1.count + 1 => ");
            System.out.println(e1.count = e1.count + 1);
            if ( x == 3 ) {
                System.out.print("e2.count = e2.count + 1 => ");
                System.out.println(e2.count = e2.count + 1);
            }
            if ( x > 0 ) {
                System.out.print("e2.count = e2.count + e1.count => ");
                System.out.println(e2.count = e2.count + e1.count);
            }
            x = x + 1;
        }
        System.out.print("e2.count => ");
        System.out.println(e2.count);
    }
}
