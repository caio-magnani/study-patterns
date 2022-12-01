package abstract_factory;

import java.util.ArrayList;

import furniture.ChairFurniture;
import furniture.OldChairFurniture;
import furniture.OldTableFurniture;

public class OldFurnitureFactory extends FurnitureFactory{
    
    @Override
    public ArrayList<? extends ChairFurniture> createChairs(int quantity) {
        ArrayList<OldChairFurniture> chairs = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            chairs.add(new OldChairFurniture());
        }
        return chairs;
    }

    @Override
    public OldTableFurniture createTable() {
        return new OldTableFurniture();
    }
    
}
