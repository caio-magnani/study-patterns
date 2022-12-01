import abstract_factory.ModernFurnitureFactory;
import abstract_factory.OldFurnitureFactory;
import abstract_factory.VictorianFurnitureFactory;

public class App {
    public static void main(String[] args) throws Exception {
        SellerHandler seller = new SellerHandler(new OldFurnitureFactory());
        System.out.println(seller.getProducts() + " price = " + seller.getPrice());

        seller = new SellerHandler(new ModernFurnitureFactory());
        System.out.println(seller.getProducts() + " price = " + seller.getPrice());

        seller = new SellerHandler(new VictorianFurnitureFactory());
        System.out.println(seller.getProducts() + " price = " + seller.getPrice());
    }
}
