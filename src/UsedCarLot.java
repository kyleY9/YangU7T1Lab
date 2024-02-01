import java.util.*;
public class UsedCarLot {
    // instance variables
    private ArrayList<Car> inventory;

    // constructor
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int idxOne, int idxTwo) {
        if ((idxOne < 0 || idxOne >= inventory.size()) || (idxTwo < 0 || idxTwo >= inventory.size())) {
            return false;
        }
    }

}
