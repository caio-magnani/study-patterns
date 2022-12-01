package abstract_factory;

import java.util.ArrayList;

import furniture.ChairFurniture;
import furniture.TableFurniture;

public abstract class FurnitureFactory {
    public abstract ArrayList<? extends ChairFurniture> createChairs(int quantity);
    public abstract TableFurniture createTable();
}
