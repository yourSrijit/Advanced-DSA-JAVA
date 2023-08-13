package InterFace_In_Java;
class Book{
    int a;
    void main(){

    }
}
    interface Employee{
      void payment();
//      After java 8 we also can add body
        default void body(){
            System.out.println("I am default method");
        }
        static void Another(){
            System.out.println(" i also have a body ihhihi");
        }
    }

class Srijit implements Employee{
    public void payment(){
        System.out.println("your payment is "+20000);
    }
}
public class Interface {
    public static void main(String[] args) {
        Srijit ob =new Srijit();
        ob.payment();
        ob.body();
        Employee.Another();
    }
}
    Key Points about Interfaces:

//        Definition: An interface in Java is a reference type, similar to a class, that is a collection of abstract methods.
//        Abstract Methods: Interfaces can only contain abstract methods (methods without a body) and constants (public static final variables).
//        No Implementation: Interfaces cannot be instantiated directly. They provide a contract for classes to implement.
//        Multiple Inheritance: A class can implement multiple interfaces, enabling a form of multiple inheritance.
//        Keyword: Interfaces are declared using the interface keyword.
//        Access Modifiers: All interface methods are implicitly public and abstract, so you don't need to explicitly use these modifiers.
//        Implements: To use an interface in a class, you use the implements keyword.
//        Method Overriding: A class implementing an interface must provide concrete implementations for all the methods declared in the interface.
//        Default Methods: Starting from Java 8, interfaces can also have default methods (methods with a default implementation) using the default keyword.
//        Static Methods: Starting from Java 8, interfaces can also have static methods using the static keyword.
//        Functional Interfaces: An interface with a single abstract method is known as a functional interface. Lambda expressions can be used to instantiate functional interfaces.
//        Inheritance Chain: If an interface B extends another interface A, then any class implementing B must also implement A.
//        Marker Interfaces: Interfaces without any methods are known as marker interfaces (e.g., Serializable, Cloneable). They indicate that a class has certain characteristics or capabilities.
//        10 Interview Questions about Interfaces:
//
//        What is an interface in Java?
//        What is the main purpose of using interfaces?
//        Can you define an interface with fields (variables)?
//        Can an interface implement another interface?
//        How do you achieve multiple inheritance in Java?
//        What is the difference between an abstract class and an interface?
//        What is a functional interface? Give an example.
//        Can an interface extend a class? Why or why not?
//        What is the use of default methods in interfaces?
//        Can an interface have private methods? Why or why not?