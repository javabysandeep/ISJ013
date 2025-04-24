package _15_collection._1_list.sorting.comparableDemos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {
    private Integer id;
    private String name;
    private Double price;

    @Override
    public int compareTo(Product product) {
        return (int) (price - product.price);
       // return id - product.id;
    }
}
