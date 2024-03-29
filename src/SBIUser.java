import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {

    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private  double rateOfInterest = 6.5;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {

        return this.balance;
    }

    @Override
    public String addMoney(int amount) {

        balance=balance+amount;
        return "Bhai tu too ameer ho gaya "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
         if(Objects.equals(enteredpassword,password)){
             if(amount>balance){
                 return "Bhai gareebi k shikar ho gaye app";
             }
             else{
                 balance=balance-amount;
                 return "Aapka kat gaya .......paisa "+amount;
             }
         }
        else{
            return "Wrong password";
         }
    }

    @Override
    public double calculateInterest(int years) {

        return (balance*years*rateOfInterest)/100;
    }
}
