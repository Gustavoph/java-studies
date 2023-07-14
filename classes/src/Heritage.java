import entities.BusinessAccount;

public class Heritage {
  public static void main(String[] args) {
    BusinessAccount account = new BusinessAccount(1, "Gustavo", 100.00, 1000.00);
    System.out.println(account);
  }
}
