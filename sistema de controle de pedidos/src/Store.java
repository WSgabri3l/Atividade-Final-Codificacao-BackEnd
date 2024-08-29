import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> listProducts;
    List<Order> listOrders;

    public Store(){
        this.listOrders = new ArrayList<Order>();
        this.listProducts = new ArrayList<Product>();
    }

    public void addProduct(Product product){

        listProducts.add(product);

    }

    public void addOrder(Order order){

        listOrders.add(order);

    }

    public void addProductInOrder(Order order, Product product){

       order.listProducts.add(product);
    }

    public void calcOrder(String idPedido){

        double sum = 0.0;

        for (Order order : listOrders) {
            
            if (order.id.equals(idPedido)) {
                
                for (int i = 0; i < order.listProducts.size(); i++) {
                    
                    sum += order.listProducts.get(i).price;
                }
            }
        }

        System.out.println("Total do Pedido " + idPedido + ": " + sum);
    }

    public List<Order> listOrders(){

        return listOrders;

    }
}
