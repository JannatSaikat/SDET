package coreJava;

public class Calculation {
    int a;
    int b;
    int c;

    Calculation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void sum() {
        int d = a + b + c;
        System.out.println(d);
        System.out.println("new thing");
    }
}
