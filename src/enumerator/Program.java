package enumerator;

import enumerator.entitie.Order;
import enumerator.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
