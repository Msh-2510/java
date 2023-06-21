// ClassA.java
public class ClassA {
    public void displayMessage() {
        System.out.println("This is ClassA.");
    }
}

// ClassB.java
public class ClassB {
    public void displayMessage() {
        System.out.println("This is ClassB.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.displayMessage();
        classB.displayMessage();
    }
}
