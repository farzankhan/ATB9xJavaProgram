package ATB9x.oct21102024_forLoop;

public class Lab095 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + "is even");
                continue;
            } else {
                System.out.println(i + "is odd");
            }
        }
    }
}