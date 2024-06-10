import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Product dr1 = new HotDrink("Coffee", 90, 200);
        Product dr2 = new HotDrink("Coffee", 90, 300);
        Product dr3 = new HotDrink("Tea", 90, 300);

        HotDrinkMachine hdm1 = new HotDrinkMachine(List.of(dr1,dr2,dr3,new HotDrink("Tea", 90, 200) ));

        System.out.println(hdm1.geProduct("tee", 200, 90));
        System.out.println(hdm1.geProduct("tea", 200, 90));
    }
}
