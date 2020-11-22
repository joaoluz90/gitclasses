package pt.iade.unimanage.models;
import java.util.ArrayList;

public class UnitRepository {
    private static ArrayList<Unit> units = new ArrayList<Unit>();

    public static void fill() {
        Unit u; // auxiliary variable
        u = new Unit(1, "POO", 6);
        units.add(u);
        units.add(new Unit(2, "CFM", 3));
        u = new Unit(3, "BD", 6);
        units.add(u);
    }

    public static ArrayList<Unit> getUnits() {
        return units;
    }

    public static Unit getUnit(int id){
        for(Unit unit: units)
            if(unit.getId() == id)
                return unit;
        return null;
    }


    public static boolean deleteUnit(int id){
        return units.removeIf(
            (s) -> s.getId() == id);
    }

    public static Unit addUnit(Unit unit){
        units.add(unit);
        return unit;
    }


}
