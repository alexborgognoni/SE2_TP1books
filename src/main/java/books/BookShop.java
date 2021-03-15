package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
 
    	double total = 0;
    	
    	// calculate price w/o discount
    	
    	for (int i = 0; i< books.length; i++) {
    		total += books[i] * 8;
    	}
    	
    	// calculate how many different books there are
    	
    	int diff = 0;
    	
    	for (int i = 0; i< books.length; i++) {
    		if (books[i] != 0) {
    			diff++;
    		}
    	}
    	
    	// apply discount based on diff
    			
    	switch(diff) {
    	  case 2:
    	    total -= (diff*8)*0.07;
    	    break;
    	  case 3:
    		total -= (diff*8)*0.14;
    	    break;   	  
    	  case 4:
      		total -= (diff*8)*0.28;
      	    break;
    	  case 5:
      		total -= (diff*8)*0.35;
      	    break;
    	  default:
    		  total = total;
    	}
        return total;
    }
}
