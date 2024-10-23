package Practical_15;

//15. Write a java program to create inner classes.

class OuterClass {
    private int outerValue = 10;

    class InnerClass {
        public void displayInner() {
            System.out.println("Value from outer class: " + outerValue);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.displayInner();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner();
    }
}

