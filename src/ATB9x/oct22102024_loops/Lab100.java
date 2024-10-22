package ATB9x.oct22102024_loops;

public class Lab100 {
    public static void main(String[] args) {

        String arg_age=args[0];
        //String to int need to convert
        int value=Integer.parseInt(arg_age);
        System.out.println(value);

        while(value > 0){
            System.out.println(value);
            value--;

        }
    }
}
