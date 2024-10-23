package Practical_13;

//13. write program to demonstrate method overriding and super keyword.
class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        super.display();  // Call the parent class method
        System.out.println("This is the child class.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

