

    class Employee{
        double salary;
        Employee(double salary){
            this.salary=salary;
        }
        
        public double getSalary(){
            return salary;
        }

    }

    class manager extends Employee{
        double salary;double travel;double house_rent;

        manager(double salary,double travel,double house_rent){
            super(salary);
            this.travel=travel;
            this.house_rent=house_rent;
        }

        public double getSalary(){
            double b=super.getSalary() + travel +house_rent;
            return b;

        }

    }
    public class abcd{
        public static void main(String[] args){
            manager m=new manager(5000,4000,300);
            System.out.println(m.getSalary());
        }
    }