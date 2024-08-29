import java.util.ArrayList;
import java.util.List;

public class Order  {
    String id;
    List<Product> listProducts;

    public Order(String id){

        this.listProducts = new ArrayList<Product>();
        this.id = id;
        
    }

}
