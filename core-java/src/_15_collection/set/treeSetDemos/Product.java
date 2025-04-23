package _15_collection.set.treeSetDemos;

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
    public int compareTo(Product o) {
        return id - o.id;
    }
}
