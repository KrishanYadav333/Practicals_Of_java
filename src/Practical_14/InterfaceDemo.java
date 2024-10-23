package Practical_14;

//14. Write a java program to implement Interface using extends keyword.

interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class InterfaceDemo implements Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.print();
        obj.show();
    }
}
