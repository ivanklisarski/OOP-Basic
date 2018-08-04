package DefiningClasses.Constructors_and_static_members;

public class BankAccaunt {

    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate  = DEFAULT_INTEREST_RATE;
    private static int idSequance;

    private  int id;
    private double Balance;

    public int getId() {
        return id;
    }

    public BankAccaunt(){
      this.id =  ++idSequance;
   }


    public static void setInterest(double interest) {
        interestRate = interest;
    }

    public double getInterest(int year) {

        return this.Balance * interestRate * year;
    }

    public void deposit(double amaunt) {
        this.Balance += amaunt;
    }


}
