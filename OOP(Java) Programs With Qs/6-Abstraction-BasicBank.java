
    abstract class Bank{
        abstract public int getBalance();
    }
    class A extends Bank{
        int a;
    public A(int a) {
        this.a=a;
    }
        public int getBalance(){
            return a;
        }
    }
    class B extends Bank{
        int a;
    public B(int a) {
        this.a=a;
    }
        public int getBalance(){
            return a;
        }
    }
    class C extends Bank{
        int a;
    public C(int a) {
        this.a=a;
    }
        public int getBalance(){
            return a;
        }
    }


public class xiss {
    public static void main(String[] args) {
      A a=new A(50000)  ;
      System.out.println(a.getBalance());
      B b=new B(70000);
      System.out.println(b.getBalance());
      C c=new C(80000);
      System.out.println(c.getBalance());

    }
}
