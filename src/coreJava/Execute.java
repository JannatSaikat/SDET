package coreJava;

public class Execute implements A{

    public static void main(String[] args) {
      //  ClassB classB = new ClassB();
       // classB.printColor();
      //  classB.methodA();
        Execute execute =new Execute();
        execute.sum();

    }

    @Override
    public void sum() {
        int c = a+b;

    }
}
