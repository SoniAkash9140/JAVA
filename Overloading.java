class Hello{
    int a=10;
    int b=20;
    void Sum(){
        int result=a+b;
        System.out.println("Sum is: "+result);
    }
}

class Hai extends Hello{
    int c=30;
    void sum(){
        int result=a+b+c;
        System.out.println("Sum is: "+result);
    }
}


public class Overloading {
    public static void main(String[] args) {
        Hello h1=new Hai();
        h1.Sum();
        
        Hai h2=new Hai();
        h2.sum();
        
        //h1.sum();  // This will give an error because sum() is not defined in Hello class
        //h2.Sum();  // This will work because Sum() is inherited from Hello class
        //h2.Sum();  // This will work because Sum() is inherited from Hello class
        //h2.sum();  // This will work because sum() is defined in Hai class
        //h1.sum();  // This will give an error because sum() is not defined in Hello class
    }
}
