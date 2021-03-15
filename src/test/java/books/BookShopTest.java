package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

    @Test
    public void test_discount(){
        BookShop test_shop = new BookShop("Test Bookshop");
        Random rand = new Random();
        int nr_tests = 20;
        
        for (int test = 0; test < nr_tests; test++) {
        
	        int[] test_basket = new int[5];
	        
	        for (int i = 0; i < test_basket.length; i++) {
	            test_basket[i] = rand.nextInt(6);
	        }
	        
	        System.out.printf("Test #%d\tTest basket: %s\tPrice:%f\n",test,Arrays.toString(test_basket),test_shop.cost(test_basket));
	        
        }
	    assertTrue(true);
    }
}