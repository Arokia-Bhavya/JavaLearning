
public class ArrayDemo {

	public static void main(String[] args) {
      Product[] products= {new Product(1,"Pen",10),
    		  			   new Product(2,"Pencil",20),
    		  			   new Product(3,"Eraser",5)};
      calculateTotal(products);
      
	}

	private static void calculateTotal(Product[] products) {
		int total=0;
        for(Product product:products)
        {
        	total+=product.getPrice();
        }
        
        System.out.println("total:"+total);
	}

}
