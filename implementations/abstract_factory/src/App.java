import abstract_factory.ModernFurnitureFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(FurnitureSetSeller.getProducts(new ModernFurnitureFactory())+" price = "+FurnitureSetSeller.getPrice(new ModernFurnitureFactory()));
    }
}
