// Exercise 3.11
// Modified Account Class Withdraw

public class Account311{
   private String name; 
   private double balance; 
    
   public Account311(String name, double balance) {
      this.name = name;
        
      if (balance > 0.0) { 
         this.balance = balance;
      }
   
   }

   public void withdraw(double withdrawAmount) {
      if ((balance - withdrawAmount) > 0.0) { 
         balance = balance - withdrawAmount; 
      }else{
         System.out.print("Withdrawal amount amount exceeded account balance. \n");
      }
   }
            
   public double getBalance() {
      return balance;
   }
            
   public void setName(String name) {
      this.name = name;
   }
            
   public String getName() {
      return name;
   }
   
}