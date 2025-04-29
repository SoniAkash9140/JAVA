class MyConstructor {
    int a = 10;
    int b = 20;

    MyConstructor() {
        System.out.println("This is a constructor without parameter");
    }

    MyConstructor(int n) {
        System.out.println("This is a constructor with parameter: " + n);
    }

    void sum() {
        int result = a + b;
        System.out.println("Sum is: " + result);
    }
}

public class MyCons {
    public static void main(String[] args) {
        MyConstructor obj1 = new MyConstructor();  // Object using default constructor
        obj1.sum();

        
        MyConstructor obj2 = new MyConstructor(5);  // Object using parameterized constructor
    }
}
