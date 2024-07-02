package patterns.behavioral.memento;

public class Order {
    private Status status;

    public Order(Status status) {
        this.status = status;
    }

    public Status getOrderStatus() {
        return status;
    }

    public OrderMemento createOrder() {
        return new OrderMemento(this.status);
    }

    public void restoreStatus(OrderMemento orderMemento) {
        this.status = orderMemento.getStatus();
    }

}
