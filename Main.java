 class Sum {
    int a =20;
    int b=30;
    
    void sum(){
        int result = a+b;
        System.out.println("Sum is: " + result);
    }
}

public class Main
{
    public static void main(String[] args) {
        Sum sumObj = new Sum();
        sumObj.sum(); // Call the sum method to calculate and print the sum
    }
}