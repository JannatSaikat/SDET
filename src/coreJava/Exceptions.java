package coreJava;

public class Exceptions {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Catch block executed");
        }

        String s = null;
        try {
            System.out.println(s.length());
        } catch(Exception e){
            System.out.println("Catch block executed for Exception");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
