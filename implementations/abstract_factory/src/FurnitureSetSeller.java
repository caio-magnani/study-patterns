import abstract_factory.FurnitureFactory;

public class FurnitureSetSeller {
    public static double getPrice(FurnitureFactory factory){
        return factory.createChairs(4).stream().mapToDouble(chair -> chair.getPrice()).sum() + factory.createTable().getPrice();
    }

    public static String getProducts(FurnitureFactory factory){
        return "1 " + factory.createTable().toString() + " and 4 "+ factory.createChairs(4).get(0).toString();
    }
}
