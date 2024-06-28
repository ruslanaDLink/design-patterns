package patterns.behavioral.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MementoTest {

    @Test
    public void test() {
        //given
        Order order1 = new Order(Status.CONFIRMED);
        Order order2 = new Order(Status.AWAITING_PICKUP);
        Order order3 = new Order(Status.SHIPPED);
        Order order4 = new Order(Status.PENDING);

        OrderHistory orderHistory = new OrderHistory();

        //when
        orderHistory.addOrder(order1.createOrder());
        orderHistory.addOrder(order2.createOrder());
        orderHistory.addOrder(order3.createOrder());
        orderHistory.addOrder(order4.createOrder());

        order2.restoreStatus(orderHistory.getOrder(2));
        order1.restoreStatus(orderHistory.getOrder(1));

        //then
        Assertions.assertEquals(Status.SHIPPED, order2.getOrderStatus());
        Assertions.assertEquals(Status.AWAITING_PICKUP, order1.getOrderStatus());
    }

}