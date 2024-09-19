package oneple;

public class Main {

    public static void main(String[] args) {
        
        Product laptop = new Product("Lenovo", 1084, 2.65);  
        Product phone = new Product("Iphone", 800, 0.4);   
        Product headphones = new Product();
        
    
        headphones.setName("Airpods");
        headphones.setPrice(370);
        headphones.setWeight(0.1);

        
        Product[] list = new Product[] {laptop, phone, headphones};

        
        for (int k = 0; k < list.length; k++) {
            System.out.printf("Product name: %-6.6s;  price: %8.2f $;  weight: %4.1f kg%n",
                              list[k].getName(), list[k].getPrice(), list[k].getWeight());
            System.out.println(list[k].toString());
        }
    }
}
