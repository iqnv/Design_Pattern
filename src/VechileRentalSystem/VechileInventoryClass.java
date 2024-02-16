package VechileRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VechileInventoryClass {

    List<Vechile> vechileList;

    public VechileInventoryClass(List<Vechile> vechileList) {
        this.vechileList = vechileList;
    }

    public List<Vechile> getVechileList() {
        return vechileList;
    }

    public void setVechileList(List<Vechile> vechileList) {
        this.vechileList = vechileList;
    }

    //CRUD OPERATION FOR MANAGING VECHILES
}
