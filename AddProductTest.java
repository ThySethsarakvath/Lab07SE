package Lab07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

class AddProductTest {

	@Test @DisplayName("Add product correctly (product name not exists)")
	void addProductCorrectly() {
		ProductManager prod = new ProductManager();
		prod.addProduct("Iphone", 1600.0,30.0);
		assertEquals(1, prod.getCount());
	}
	@Test @DisplayName("Add product incorrectly (product name duplicated)")
	void addProductInCorrectly() {
		ProductManager prod = new ProductManager();
		prod.addProduct("Iphone", 1600.0,30.0);
		prod.addProduct("Iphone", 1300.0,20.0);
		assertEquals(1, prod.getCount());
	}
	
	@Test
    @DisplayName("Check if product count increases by 1 after adding a product")
    void checkCountAfterAddition() {
        ProductManager prod = new ProductManager();
        int initialCount = prod.getCount(); 
        prod.addProduct("Iphone", 1600.0,30.0); 
        assertEquals(initialCount + 1, prod.getCount()); 
    }

}
