package driver;

import store.Product;
import store.SpecialProduct;

public class driver {

	public static void main(String[] args) {
		
		SpecialProduct keyboard=new SpecialProduct("特価キーボード",3600, 4500);
		System.out.println();
		keyboard.display();
		
		Product mouse=new Product("マウス",2000);
		System.out.println();
		mouse.display();
	
		
		
				

	}

}
