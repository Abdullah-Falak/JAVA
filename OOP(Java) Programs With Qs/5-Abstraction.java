
    abstract class parent{
        abstract void message();
    }
    class sub1 extends parent{
        void message(){
            System.out.println("This is one");
        }
    }
    class sub2 extends parent{
        void message(){
            System.out.println("This is two");
        }
    }


public class five {
    public static void main(String[] args) {
        sub1 s=new sub1();
        s.message();
        sub2 sb=new sub2();
        sb.message();
        
    }
}
