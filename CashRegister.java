class CashRegister {
    private double purchase;
    private double payment;

public CashRegister() {
    purchase=0;
    payment = 0; 
}
public void recordPurchase(double amount){
        purchase+=amount;
}

public void receivePayment (double amount) {
    payment += amount;
}

    public double giveChange() { 
        double change = payment - purchase;
        purchase=0;
        payment=0; 
        return change;
    }
}
public int getItemCount(int purchase) {
   if(purchase > 0){
       return 1;
   }else{
    return 0;
   }
}
public class Main {
    public static void main(String[] args) {
        CashRegister[] registers = new CashRegister[5];
    }
}

public static int countTotal(CashRegister[] registers) {
    int totalItems = 0;
    for (CashRegister registers : registers) {
        totalItems += registers.getItemCount();
    }
    return totalItems;
}
