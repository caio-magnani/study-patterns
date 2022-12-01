package furniture;

public class OldTableFurniture extends TableFurniture{

    @Override
    public String getStyle() {
        return "Old";
    }

    @Override
    public double getPrice() {
        return (double) 200;
    }
    
}
