public class Main {
    public static void main(String[] args) {
        Shoes product1 = new Shoes();
        product1.setName("Adidas");
        product1.setType("Sport");
        product1.setBase("Rubber Sole");
        product1.setFootNumber(42.5);
        product1.setColor("white");
        product1.setPrice(3499.99);
        product1.setId(123456);

        Dress product2 = new Dress();
        product2.setName("Zara");
        product2.setType("classic");
        product2.setSize('M');
        product2.setColor("red");
        product2.setPrice(1500);
        product2.setId(654321);

        System.out.println("<ul>");
        Product[] products = {product1, product2};
        for (Product produce : products) {
            System.out.println("  <li style='color: #333;'>");
            System.out.println("    ID: <span style='color: #FF5733;'>" + produce.getId() + "</span><br>");
            System.out.println("    Name: <span style='color: #4488FF;'>" + produce.getName() + "</span><br>");
            System.out.println("    Type: <span style='color: #FFC733;'>" + produce.getType() + "</span><br>");
            System.out.println("    Color: <span style='color: #33FF57;'>" + produce.getColor() + "</span><br>");

            if (produce instanceof Shoes shoes) {
                System.out.println("    Base: <span style='color: #FF5733;'>" + shoes.getBase() + "</span><br>");
            } else if (produce instanceof Dress dress) {
                System.out.println("    Size: <span style='color: #FF5733;'>" + dress.getSize() + "</span><br>");
            }

            System.out.println("    Price: <span style='color: #FF5733;'>" + produce.getPrice() + "</span><br>");
            System.out.println("  </li>");

            System.out.println("<br>");
        }



        System.out.println("</ul>");

    }
}
