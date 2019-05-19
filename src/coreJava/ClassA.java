package coreJava;

public class ClassA {
    String color = "Parent A";

    void methodA(){
        System.out.println("Parent Class");
    }

    ClassA(){
        System.out.println("Parent is created");
    }

}

class ClassB extends  ClassA{

    String color = "Child B";

    void printColor(){

      //  System.out.println(color);
        System.out.println(super.color);
    }
    void methodA(){
        System.out.println("Child Class");
        super.methodA();
    }

    ClassB(){
        super();
       // System.out.println("Child is created");
    }


}