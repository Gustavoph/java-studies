package entities;

import java.time.Instant;
import enums.OrderStatus;

public class Order {
  private Integer id;
  private Instant createdAt;
  private OrderStatus status;

  public Order(Integer id, Instant createdAt, OrderStatus status) {
    this.id = id;
    this.createdAt = createdAt;
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", createdAt=" + createdAt +
            ", status=" + status +
            '}';
  }
}
