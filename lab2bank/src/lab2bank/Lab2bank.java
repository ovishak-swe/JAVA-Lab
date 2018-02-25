
package lab2bank;
public class Lab2bank {
    
    public static void main(String[] args) {
        Lab2Account obj = new Lab2Account ("ABC","101",10.0);
        double afterDeposite = obj.deposite(5000);
        System.out.println("afterDeposite"+afterDeposite );
        double afterWithdraw = obj.withdraw(4000);
        System.out.println("afterWithdraw"+afterWithdraw);
  
    }
}

