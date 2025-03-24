package _10_object_class;

import lombok.*;

import java.util.Objects;

public class Demo7 {
    public static void main(String[] args) {
        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        @ToString
        class Product {
            private int id;
            private String name;
            private double price;

            @Override
            public boolean equals(Object obj) {
                if (obj == null) return false;
                if (this == obj) return true;
                if (!(obj instanceof Product)) return false;
                Product p = (Product) obj;
                return this.id == p.id;
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(id);
            }
        }
        Product product1 = new Product(1, "Speaker", 40000);
        Product product2 = new Product(1, "Speaker", 40000);
        System.out.println(product1 == product2);//false
        System.out.println(product1.equals(product2));//true
        System.out.println(product1.equals(product1));//true
        System.out.println(product1.equals(null));//false
        System.out.println("product1 hashCode: " + product1.hashCode());
        System.out.println("product2 hashCode: " + product2.hashCode());
    }
}
