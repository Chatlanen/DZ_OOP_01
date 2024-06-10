import java.util.List;

public class HotDrinkMachine implements TradeMachine{
    private final List<Product> products;

    public HotDrinkMachine(List<Product> products){
        this.products = products;
    }

    @Override
    public Product geProduct(String name, int vol, int temp) {
        HotDrink prod = new HotDrink(name, temp, vol);
        for(Product product: products){
            if (product.equals(prod)) {
                return product;
            }
        }
        return null;
    }
}
