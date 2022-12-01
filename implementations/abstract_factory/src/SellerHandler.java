import abstract_factory.FurnitureFactory;

public class SellerHandler {
    private FurnitureFactory factory;
    private int chairQuantity;

    public SellerHandler(FurnitureFactory factory){
        this.factory = factory;
        this.chairQuantity = 4;
    }

    public SellerHandler(FurnitureFactory factory, int chairQuantity){
        this.factory = factory;
        this.chairQuantity = chairQuantity;
    }

    public double getPrice(){
        return this.factory.createChairs(chairQuantity).stream().mapToDouble(chair -> chair.getPrice()).sum() + this.factory.createTable().getPrice();
    }

    public String getProducts(){
        return "1 " + this.factory.createTable().toString() + " and 4 "+ this.factory.createChairs(chairQuantity).get(0).toString();
    }
}
