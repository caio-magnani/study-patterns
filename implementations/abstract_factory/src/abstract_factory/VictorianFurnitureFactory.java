package abstract_factory;

import java.util.ArrayList;

import furniture.VictorianChairFurniture;
import furniture.VictorianTableFurniture;

public class VictorianFurnitureFactory extends FurnitureFactory{

    @Override
    public ArrayList<VictorianChairFurniture> createChairs(int quantity) {
        ArrayList<VictorianChairFurniture> chairs = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            chairs.add(new VictorianChairFurniture());
        }
        return chairs;
    }

    @Override
    public VictorianTableFurniture createTable() {
        return new VictorianTableFurniture();
    }
    
}
