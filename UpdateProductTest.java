package Lab07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UpdateProductTest {

    @Test
    @DisplayName("Update product correctly (product name exists, new name is not blank)")
    void updateProductCorrectly() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Apple", 1600.0, 15.0);
        boolean result = prod.updateProduct("Apple", "Samsung", 700.0, 30.0);
        assertTrue(result);
        assertEquals(1, prod.getCount()); 
    }

    @Test
    @DisplayName("Update product incorrectly ( nameproduct does not exist)")
    void updateProductIncorrectly_ProductNotFound() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1100.0,35.0);
        boolean result = prod.updateProduct("Oppo", "Vivo", 400.0, 20.0);
        assertFalse(result);
        assertEquals(1, prod.getCount());
    }

    @Test
    @DisplayName("Update product incorrectly (product name exists but new name is blank)")
    void updateProductIncorrectly_BlankName() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0, 15.0);
        boolean result = prod.updateProduct("Iphone", " ", 1000.0, 10.0);
        assertTrue(result);
        assertEquals(1, prod.getCount());
    }

    @Test
    @DisplayName("Update product incorrectly (product name exists but new price is less than 0)")
    void updateProductIncorrectly_InvalidPrice() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0, 15.0);
        boolean result = prod.updateProduct("Iphone", "Vivo", -1000.0, 10.0);
        assertTrue(result); 
        assertEquals(1, prod.getCount());
    }

    @Test
    @DisplayName("Update product incorrectly (product name exists but new discount is less than 0 or greater than 100)")
    void updateProductIncorrectly_InvalidDiscount() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0,30.0);
        boolean result = prod.updateProduct("Iphone", "Samsung", 700.0, 150.0);
        assertTrue(result); 
        assertEquals(1, prod.getCount());
    }
}