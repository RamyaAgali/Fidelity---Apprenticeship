import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number:");
        String No = sc.nextLine();
        System.out.println("Insurance Name:");
        String Name = sc.nextLine();
        System.out.println("Amount covered:");
        double Amount = sc.nextDouble();
        System.out.println("Select");
        System.out.println("1. Life Insurance");
        System.out.println("2. Health Insurance");
        int O = sc.nextInt();
        if(O == 1) {
            System.out.println("Policy Term:");
            int policyTerm = sc.nextInt();
            System.out.println("Benifit Percent:");
            float benifitPercent = sc.nextFloat();

            LifeInsurance lifeInsurance = new LifeInsurance(No, Name, Amount, policyTerm, benifitPercent);
            double premium = addPolicy(lifeInsurance, O);
            System.out.println("Calculated Premium:" + premium);
        }else if(O == 2) {
            System.out.println("Depreciation Percent:");
            float depreciationPercent = sc.nextFloat();
            MotorInsurance motorInsurance = new MotorInsurance(No, Name, Amount, depreciationPercent);
            double premium = addPolicy(motorInsurance, O);
            System.out.println("Calculated Premium:" + premium);

        }else{
            System.out.println("Invalid Option selected");
        }
        sc.close();
    }
    public static double addPolicy(Insurance ins, int opt) {
        if(opt == 1) {
            return ((LifeInsurance)ins).calculatePremium();
        }else if(opt== 2) {
            return ((MotorInsurance)ins).calculatePremium();
        }
        return 0;
    }
}
