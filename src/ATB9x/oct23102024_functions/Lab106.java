package ATB9x.oct23102024_functions;

public class Lab106 {
    public static void main(String[] args) {
        farzan();

        int result = farzan_java();
        System.out.println(result);
        if (result == 13) {
            System.out.println("he is the winner");
        } else {
            System.out.println("loser ");
        }
        greet_with_name("khan");
        greet_with_name("farzan");
        greet_with_two_names("Mohammed","Farzan");

        int result1 = sum_of_two_numbers(3,5);
        System.out.println(result1);

    }

    //1. without parameters and without return type
    static void farzan() {
        System.out.println("Farzan is learning core java");
    }

    //2.without parameters but with return type

    static int farzan_java() {
        System.out.println("this is second function");
        return 12;
    }

    //3. with parameters and without return type
    static void greet_with_name(String name1) {
        System.out.println("My name is" + name1);
    }
    static void greet_with_two_names(String firstname1,String Secondname){
        System.out.println("Two names are" + firstname1 + Secondname);
    }
    //4. with parameters and with return type
    static int sum_of_two_numbers(int a,int c) {
    return a+c;
    }
}
