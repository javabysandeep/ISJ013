package _10_object_class;

public class Demo5 {
    public static void main(String[] args) {
        class Product{
            private int id;
            private String name;
            private double price;

            public Product() {
            }

            public Product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            //override toString method

            @Override
            public String toString() {
                return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
            }
        }
        Product product = new Product(1,"Speaker",40000);
        System.out.println(product);
        System.out.println(product.toString());
    }
}
