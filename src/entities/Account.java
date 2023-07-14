package entities;

public class Account {
    public  static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private Long id;
    private Double balance;

    public Account(){
    }

    public Account(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }
    public void deposit(double amaunt){
        if (amaunt > 0) {
            amaunt -= amaunt * DEPOSIT_FEE_PERCENTAGE;
            balance += amaunt;
        }
    }
    public void withdraw(double amaunt){
        if (amaunt > balance){
            throw new IllegalArgumentException();
        }
        balance -= amaunt;
    }

    public  double fullWithdraw(){
        double aux = balance;
        balance = 0.0;
        return aux;
    }
}
