
class Student{

    String name,address;
    int age;
    Student(){
        name= "unknown"; age =0;address="not available";
    }

    public void setinfo(String name,int age){
        this.name=name; this.age=age;
    }
    public void setinfo(String name,int age,String address){
        this.name=name; this.age=age; this.address=address;
    }
    void display(){
        System.out.println(name+" "+age+" "+address);
    }
    

}


public class abc {
    
    public static void main(String[] args) {
        Student s[]=new Student[10];
        for(int i=0;i<10;i++)
        {
            s[i]=new Student();
            s[i].setinfo("Student"+(i+1), 18+i, "address"+(i+1));
        }
        for(int i=0;i<10;i++)
        {
           // s[i]=new Student();
            s[i].display();
        }

    }

}
