class Parent {
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

public class helloFromChild {
    public static void main(String[] args) {
        Parent c = new Child();
        Parent p = new Parent();

        c.sayHello();
        p.sayHello();
    }
}
