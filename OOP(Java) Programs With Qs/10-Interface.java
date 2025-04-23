
    interface interfi{
        public void add();
        public void sub();
    }
    class Fit implements interfi{
       public void add(int a,int b){
        System.out.println("Addition is  "+(a+b));
       }
       public void sub(){
        System.out.println("Subtraction is  "+(a-b));
       }
    }

public class ten {
    public static void main(String[] args) {
        Fit f=new Fit();
        f.add(78,78);
        f.sub(90,40);
    }
}
