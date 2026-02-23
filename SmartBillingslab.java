public class smartbillingslab{
    public static double calculateBill(double amount, Boolean isFirstOrder){
        double discount = 0;
        if(amount<500){
            discount = 0;
        }
        else if(amount >= 500 && amount < 1500){
            discount = 0.05;
        }
        else if(amount>=1500) {
            discount = 0.10;
        }
        double finalAmount = amount - (amount * discount);
        if (isFirstOrder) {
            finalAmount = finalAmount - (finalAmount * 0.02);
        }
        return finalAmount;
        }
        public static void main(String[] args){
            double finalAmount = calculateBill(1200,true);
            System.out.println("Final Amount:" + finalAmount);
    }
}
