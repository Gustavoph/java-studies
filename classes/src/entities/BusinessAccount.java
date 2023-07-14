package entities;

public class BusinessAccount extends Account {
  private Double loanLimit;

  public BusinessAccount() {}

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public void loan (double amount) {
    if (amount <= this.loanLimit){
      this.balance += amount - 10.00;
    }
  }

  @Override
  public void withdraw(double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return "BusinessAccount{" +
            "loanLimit=" + loanLimit +
            ", balance=" + balance +
            '}';
  }
}
