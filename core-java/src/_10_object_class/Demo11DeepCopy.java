package _10_object_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

public class Demo11DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        @ToString
        class Product implements Cloneable {
            private int id;
            private String name;
            private int price;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        @ToString
        class Order implements Cloneable {
            private int id;
            private int orderValue;
            private Product product;
            private LocalDate orderDate;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                Order order = (Order) super.clone();
                Product original = order.getProduct();
                Product copy = (Product)original.clone();
                order.setProduct(copy);
                return order;
            }
        }


        Product product = new Product(1, "Speaker", 40000);
        Order order1 = new Order(1, 80000, product, LocalDate.now());
        Order order2 = (Order) order1.clone();
        System.out.println(order1);
        System.out.println(order2);
    }
}
