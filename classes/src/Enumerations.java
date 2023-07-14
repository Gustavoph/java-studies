import entities.Order;
import enums.OrderStatus;
import java.time.Instant;

public class Enumerations {
  public static void main(String[] args) {
    Order order = new Order(1, Instant.now(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    System.out.println(os1);
    System.out.println(os2);
  }
}
