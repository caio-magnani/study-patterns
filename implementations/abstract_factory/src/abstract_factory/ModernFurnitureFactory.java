package abstract_factory;

import java.util.ArrayList;

import furniture.ModernChairFurniture;
import furniture.ModernTableFurniture;

public class ModernFurnitureFactory extends FurnitureFactory{

    @Override
    public ArrayList<ModernChairFurniture> createChairs(int quantity) {
        ArrayList<ModernChairFurniture> chairs = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            chairs.add(new ModernChairFurniture());
        }
        return chairs;
    }
    
    @Override
    public ModernTableFurniture createTable() {
        return new ModernTableFurniture();
    }
}
