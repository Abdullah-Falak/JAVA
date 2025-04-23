
    interface Account{
        void deposit(double amount);
        void withdraw(double amount);
        void calculateinterest();
        void viewbalance();
    }
    class SavingAccount implements Account{
        double balance=0.0;
        @Override
        public void deposit(double amount){if(amount > 0){
            balance=balance+amount;
        }
        }
        @Override
        public void withdraw(double amount){
            double minwithdrawlimit=500;
            if(balance-amount>=minwithdrawlimit)
            {
                balance-=amount;
            }
            else{
                System.out.println("Limit Exceded");
            }
        }
        @Override
        public void calculateinterest(){System.out.println("Interest  "+(balance*0.5));}
        @Override
        public void viewbalance(){System.out.println("Balance is   "+balance);}
    }
    class CurrentAccount implements Account{
        double balance=0.0;
        @Override
        public void deposit(double amount){if(amount > 0){
            balance=balance+amount;
        }
        }
        @Override
        public void withdraw(double amount){
            double minwithdrawlimit=500;
            if(balance-amount>=minwithdrawlimit)
            {
                balance-=amount;
            }
            else{
                System.out.println("Limit Exceded");
            }
        }
        @Override
        public void calculateinterest(){System.out.println("no Interest  ");}
        @Override
        public void viewbalance(){System.out.println("Balance is   "+balance);}
    }

public class eleven {
    public static void main(String[] args) {
        CurrentAccount c=new CurrentAccount();
        c.deposit(890.90);
        c.withdraw(670.50);
        c.calculateinterest();
        c.viewbalance();

        SavingAccount s=new SavingAccount();
        s.deposit(890.90);
        s.withdraw(670.50);
        s.calculateinterest();
        s.viewbalance();
    }
}
