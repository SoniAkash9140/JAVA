class Hello{
    int a=10;
    int b=20;
    void Sum(){
        int result =a+b;
        System.out.println(result);
    }
}

class Hai extends Hello{
    int c=30;
    void mul(){
        int result =a*b*c;
        System.out.println(result);
    }
}

//multipe inheritance 
class Demo extends Hello{
    int d=40;
}
public class Inheritance {
    public static void main(String[] args) {
        // Hai h1=new Hai();
        // h1.Sum();

        // h1.mul();

        // Demo d1=new Demo();
        // d1.Sum();
        // d1.mul();

        Demo d1=new Demo();
        d1.Sum();
        
        Hai h1=new Hai();
        h1.Sum();
    }
}
