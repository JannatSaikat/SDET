package coreJava;

public class C implements A,B {

    @Override
    public void sum() {
        int c = a+b;
        System.out.println(c);
    }

    @Override
    public void multiply() {
        int z = x*y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        C c = new C();
        c.sum();
        c.multiply();

        String s = null;
        System.out.println(s.length());
    }
}
