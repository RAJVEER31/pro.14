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
public int getItemCount(){
    return(purchase > 0) ? 1 : 0;
}
}
public class Main {
    public static void main(String[] args) {
        CashRegister[] registers = new CashRegister[5];
        for (int i = 0; i< registers.length; i++) {
            registers[i] = new CashRegister();
        }
        registers[0].recordPurchase(345.34);
        registers[1].recordPurchase(152.23);
        registers[0].recordPurchase(324.43);
        System.out.println("TOTAL ITEM RECORDERD :"+ countTotal(registers));
    }

public static int countTotal(CashRegister[] registers) {
    int totalItems = 0;
    for (CashRegister register : registers) {
        totalItems += register.getItemCount();
    }
    return totalItems;
}
}