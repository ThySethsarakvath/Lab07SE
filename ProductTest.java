package Lab07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test @DisplayName("Set name correctly (name is not blank)")
	void setNameCorrectly() {
		Product prod = new Product();
		prod.setName("Grape");
		assertEquals("Grape" , prod.getName());
		
	}
	
	@Test @DisplayName("Set name correctly(name is blank)")
	void setNameInCorrectly() {
		Product prod = new Product();
		prod.setName("  ");
		assertNull( prod.getName());
		
	}
	
	@Test @DisplayName("Set price correctly (price is greater than 0)")
	void setPriceCorrectly() {
		Product prod = new Product();
		prod.setPrice(2.0);
		assertEquals(2.0, prod.getPrice());
		
	}
	
	@Test @DisplayName("Set price incorrectly (price is less than or equals to 0)")
	void setPriceInCorrectly() {
		Product prod = new Product();
		prod.setPrice(-10.0);
		assertEquals(0.0,prod.getPrice());
		
	}
	@Test @DisplayName("Set discount correctly (discount is between 0 and 100)")
	void setDisountCorrectly() {
		Product prod = new Product();
		prod.setDiscount(30.0);
		assertEquals(30.0, prod.getDiscount());
	}
	@Test @DisplayName("Set discount incorrectly (discount less than 0 or greater than 100)")
	void setDisountInCorrectly() {
		Product prod = new Product();
		prod.setDiscount(130.0);
		assertEquals(0.0, prod.getDiscount());
	}
	

}
