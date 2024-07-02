package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<OrderMemento> orders;

    public OrderHistory() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(OrderMemento order) {
        this.orders.add(order);
    }

    public OrderMemento getOrder(int index) {
        return this.orders.get(index);
    }
}
