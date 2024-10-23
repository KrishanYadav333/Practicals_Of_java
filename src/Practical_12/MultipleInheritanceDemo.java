package Practical_12;

//12. Write a program to implement multiple Inheritances.

interface A {
    public void displayA();
}

interface B {
    public void displayB();
}

class MultipleInheritanceDemo implements A, B {
    public void displayA() {
        System.out.println("Displaying from interface A.");
    }

    public void displayB() {
        System.out.println("Displaying from interface B.");
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        demo.displayA();
        demo.displayB();
    }
}
