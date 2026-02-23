public class LoanSystem {
    public static String loanDecision(int age,int salary, int creditScore) {
        if (age>=21) {
            if (salary >= 25000) {
                if (creditScore >= 700){
                    return "Approved";
                }else{
                    return "Rejected - Low creditScore";
                }
                
                }else{
                    return "Rejected - low salary";
                }
            }else{
                return "Rejected - Under age";
            }
    }
                
            public static void main(String[] args){
                String decision = LoanSystem.loanDecision(25, 30000, 720);
                System.out.println("Loan status:" + decision);
        }
    }
