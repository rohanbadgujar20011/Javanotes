
```markdown
# Java Method Overriding and Polymorphism Example

This project demonstrates the concepts of **method overriding** and **runtime polymorphism** in Java. The example consists of two classes, `A` and `B`, where class `B` overrides a method from class `A`. In the `Main` class, we show how Java handles polymorphism by calling the overridden method at runtime.

## Code Explanation

### 1. **Class A:**

```java
class A {
    void getEngin() {
        System.out.println("Hii from A");
    }
}
```

- **Class `A`** contains a method `getEngin()` that simply prints `"Hii from A"`.
- This class is intended to be the parent or superclass of another class.

### 2. **Class B:**

```java
class B extends A {
    @Override
    void getEngin() {
        System.out.println("Hii from B");
    }
}
```

- **Class `B`** extends class `A`. This means `B` inherits all non-private fields and methods of `A`.
- The method `getEngin()` is **overridden** in class `B`. The `@Override` annotation indicates that this method in `B` is replacing the inherited method from `A`.
- Now, when `getEngin()` is called on an object of type `B`, it will print `"Hii from B"` instead of the message from class `A`.

### 3. **Main Class:**

```java
public class Main {
    public static void main(String[] args) {
        A objb = new B();
        objb.getEngin();
    }
}
```

- The `main()` method is where the program starts executing.
- The line `A objb = new B();` declares a reference variable `objb` of type `A`, but it is assigned an object of type `B`. This demonstrates **polymorphism** in Java, where a variable of the parent class type (`A`) can refer to an object of the subclass (`B`).
- The line `objb.getEngin();` calls the `getEngin()` method. Although `objb` is declared as an instance of class `A`, it actually refers to an object of class `B`. Therefore, the `getEngin()` method from class `B` is executed.

### Key Concepts

#### 1. **Method Overriding:**

- In Java, **method overriding** occurs when a subclass provides its own implementation of a method that is already defined in its superclass. This allows the subclass to modify or extend the behavior of that method.
- The method signature in the subclass must be the same as the one in the superclass.
- In this example, class `B` overrides the `getEngin()` method from class `A`.

#### 2. **Polymorphism:**

- **Polymorphism** is one of the core concepts of object-oriented programming (OOP) and refers to the ability of different objects to respond to the same method call in different ways.
- In this example, we use **runtime polymorphism** (also called **dynamic method dispatch**) where the method that is executed depends on the actual object type at runtime, not the reference type.
- In the line `A objb = new B();`, the reference variable `objb` is of type `A`, but it points to an instance of class `B`. When `objb.getEngin()` is called, Java looks at the actual type of `objb` (which is `B`) and calls the overridden `getEngin()` method in class `B`.

#### 3. **Dynamic Method Dispatch:**

- The decision of which method to call is made at runtime, based on the object type. This is different from static (compile-time) method resolution.
- In this case, although the reference type is `A`, the object is of type `B`, so the overridden method in `B` gets invoked.

### Output:

The output of this program will be:

```
Hii from B
```

This is because the method `getEngin()` from class `B` is executed, even though the reference variable `objb` is of type `A`. This behavior demonstrates the power of **runtime polymorphism**.

### Conclusion:

This code illustrates two important concepts in Java:
1. **Method Overriding:** A subclass can provide its own implementation of a method already defined in its superclass.
2. **Polymorphism:** A reference of the superclass type can point to an object of a subclass, and the method that gets invoked depends on the actual object type at runtime.

By using these concepts, Java allows for more flexible and dynamic behavior, making it easier to work with hierarchies of classes and objects.
```

