package exceptionpratice;

public class TestException {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        int c;

        System.out.println("Hello");
        try {
                c = a/b;
            System.out.println("Division is  " + c);
            
        } catch (Exception e) {

            System.out.println("Exception is  " +e.toString());
        }

        System.out.println("These program  is end ");

    }

}
