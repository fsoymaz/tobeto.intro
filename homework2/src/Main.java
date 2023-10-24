public class Main {
    public static void main(String[] args) {
        Shoes product1 = new Shoes();
        product1.setName("Adidas");
        product1.setType("sport");
        product1.setFootNumber(42.5);
        product1.setPrice(3499.99);
        product1.setId(12);

        Shoes product2 = new Shoes();
        product2.setName("Nike");;
        product2.setType("sport");
        product2.setFootNumber(42.5);
        product2.setPrice(4499.99);

        Shoes product3 = new Shoes();
        product3.setName("Puma");
        product3.setType("sport");
        product3.setFootNumber(42.5);
        product3.setPrice(1499.99);

        System.out.println("<ul>");
        Shoes[] products = {product1, product2, product3};
        for (Shoes shoe : products) {
            System.out.println("  <li>");
            System.out.println("    Name: " + shoe.getName());
            System.out.println("    Type: " + shoe.getType());
            System.out.println("    Foot Number: " + shoe.getFootNumber());
            System.out.println("    Price: " + shoe.getPrice());
            System.out.println("  </li>");
        }
        System.out.println("</ul>");
    }
}
