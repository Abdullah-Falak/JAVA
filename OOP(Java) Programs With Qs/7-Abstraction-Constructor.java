
abstract class Sti{
    Sti(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void non(){
        System.out.println("This is a normal method of abstract class");
    }
}

class subclasss extends Sti{
    void a_method(){
        System.out.println("This is the abstract method");
    }
}

public class seven {
    public static void main(String[] args) {
        subclasss sub=new subclasss();
        sub.a_method();
        sub.non();
        
    }
}
