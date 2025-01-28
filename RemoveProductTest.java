package Lab07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveProductTest {

    @Test
    @DisplayName("Remove product correctly (product name exists)")
    void removeProductCorrectly() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0,30.0);
        prod.removeProduct("Iphone");
        assertEquals(0, prod.getCount());
    }

    @Test
    @DisplayName("Remove product incorrectly (product name does not exist)")
    void removeProductIncorrectly() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0,30.0);
        prod.removeProduct("Samsung"); 
        assertEquals(1, prod.getCount()); 
    }
    
    @Test
    @DisplayName("Check if product count decreases by 1 after removing a product")
    void checkCountAfterRemoval() {
        ProductManager prod = new ProductManager();
        prod.addProduct("Iphone", 1600.0,30.0);
        prod.addProduct("Oppo", 600.0,40.0);
        int initialCount = prod.getCount();
        prod.removeProduct("Iphone"); 
        assertEquals(initialCount - 1, prod.getCount());
    }
}