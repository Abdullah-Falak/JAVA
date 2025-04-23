

    class A{
        A(){
            System.out.println("a no parameters");
        }
        A(int a,int b){
            System.out.println("Parameters TWo"+a+b);
        }
        void display(){
            System.out.println("Method of A");
        }
    }
    class B extends A{
        B(){
            System.out.println("b no parameters");
        }
        B(int a,int b){
            super(a,b);
            System.out.println("Parameters TWo"+a+b);
        }
        void display(){
            super.display();
            System.out.println("Method of B");
        }
    }
    class C extends B{
        C(){
            System.out.println("c no parameters");
        }
        C(int a,int b){
            super(a,b);
            System.out.println("Parameters TWo"+a+b);
        }
        void display(){
            super.display();
            System.out.println("Method of C");
        }
    }
    class D extends C{
        D(){
            System.out.println("D no parameters");
        }
        D(int a,int b){
            super(a,b);
            System.out.println("Parameters TWo"+a+b);
        }
        void display(){
            super.display();
            System.out.println("Method of D");
        }
    }
    class E extends D{
        E(){
            System.out.println("e no parameters");
        }
        E(int a,int b){
            super(a,b);
            System.out.println("Parameters TWo"+a+b);
        }
        void display(){
            super.display();
            System.out.println("Method of E");
        }
    }

public class abe {
    public static void main(String[] args) {
        E e2=new E();
        E e3=new E(22,55);
        e2.display();

    }
    
}
