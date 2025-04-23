
    abstract class animals{
        abstract void cats();
        abstract void dogs();
        
    }
    class Cats extends animals{
        void cats(){
            System.out.println("Cats meow");
        }
        void dogs(){}
    }
    class Dogs extends animals{
        void cats(){}
        void dogs(){System.out.println("Dogs meow");}
    }

public class Eight {
    public static void main(String[] args) {
        Dogs d=new Dogs();
        d.dogs();
        Cats c=new Cats();
        c.cats();
        
    }
}
