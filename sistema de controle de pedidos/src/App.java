public class App {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product("queijo", 100.0);
        Product product2 = new Product("feijao", 50.0);
        Product product3 = new Product("arroz", 100.0);

        Store store = new Store();

        Order order = new Order("pedido de ryan");

        store.addOrder(order);


        store.addProduct(product3);
        store.addProduct(product2);
        store.addProduct(product1);   

        store.addProductInOrder(order, product3);
        store.addProductInOrder(order, product1);
        store.addProductInOrder(order, product2);

        store.calcOrder("pedido de ryan");

    }
}
