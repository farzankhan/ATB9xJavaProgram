package ATB9x.oct23102024_functions;

public class Lab107 {
    public static void main(String[] args) {
       int result= farzans();
        System.out.println(result);

        mainsss();

        sum("farzz");

        int newResult=summing(3,6);
        System.out.println(newResult);

    }
    //1. without parameters and with return type

    static int farzans(){
        System.out.println("going to add interger");
        return 23;
    }
    //2. without parameters and without return type
     static void mainsss(){
         System.out.println("Without return type");
     }
     //3. with parameters and without return type
    static void sum(String name){
        System.out.println("sum is" + name);
    }
    //4. with parameters and with return type
    static int summing(int a, int b){
        System.out.println("sum of 2 number will be" );
        return a*b;
    }
}
