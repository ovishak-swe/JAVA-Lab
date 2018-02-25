
package lab2bank;

public class Lab2Account {
       String Name;
      String AccID;
     double balance;
    public Lab2Account( String N,String Acc,double B){
        Name = N;
        AccID = Acc;
        balance = B;
    }
    public double deposite (double amount){
        balance = balance+amount;
        return balance;
    }
public double withdraw (double amount){
    balance=balance - amount;
    return balance;
}
  
    }
    

