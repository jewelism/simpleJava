package advJava3_2.finalexam;

class Product {
    String name;
    String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else{
        	Product p = (Product)obj;
        	if(this.name.equals(p.name)&&this.category.equals(p.category))
        		return true;
        	else
        		return false;
        }
    }
}

public class Example06 {

    public static void main(String[] args) {
        Product product1 = new Product("볼펜", "학용품");        
        Product product2 = new Product("연필", "학용품");
        Product product3 = new Product("볼펜", "사무용품");
        Product product4 = new Product(null, "학용품");
        Product product5 = new Product("볼펜", null);
        Product product6 = new Product("볼펜", "학용품");

        System.out.println(product1.equals(null));
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(product1.equals(product4));
        System.out.println(product1.equals(product5));
        System.out.println(product1.equals(product6));
    }

}

