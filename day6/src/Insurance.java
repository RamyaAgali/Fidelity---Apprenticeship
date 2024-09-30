public class Insurance {
    private String No;
    private String Name;
    private double Amount;

    public String getNo() {
        return No;
    }
    public String getName() {
        return Name;
    }
    public double getAmount() {
        return Amount;
    }
    public Insurance(String No, String Name, double Amount) {
        this.No = No;
        this.Name = Name;
        this.Amount = Amount;
    }

}
class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public double getIdv() {
        return idv;
    }
    public float getDepPercent() {
        return depPercent;
    }

    public MotorInsurance(String No, String Name, double Amount, float depPercent) {
        super(No, Name, Amount);
        this.depPercent = depPercent;
        this.idv = Amount - ((Amount*depPercent)/100);
    }

    public double calculatePremium() {
        return 0.03*idv;
    }

}

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benifitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public float getBenifitPercent() {
        return benifitPercent;
    }
    public LifeInsurance(String No, String Name, double Amount, int policyTerm ,float benifitPercent ) {
        super(No, Name, Amount);
        this.policyTerm = policyTerm;
        this.benifitPercent = benifitPercent;
    }
    public double calculatePremium() {
       return (getAmount()-((getAmount()*benifitPercent)/100))/policyTerm;
    }
}
