public class Main {
  public static Double getFinalAmount(double amount, Boolean isMember) {
      double discount = 0;
      
      if(amount >= 1000){
          if(isMember) {
              discount = 0.20;
          } else{
              discount = 0.10;
          }
      } else{
          discount = 0;
      }
      double finalAmount = amount - (amount * discount);
      return finalAmount;
  }
  public static void main(String[] args) {
      double amount = 1200;
      Boolean isMember = true;
      double result = getFinalAmount(amount,isMember);
      System.out.println("final Amount:" + result);
  }
}
