package strategy;

import model.ParkingLot;
import model.ParkingSlot;
import model.VehicleType;

public interface SlotAllocationStrategy {

    ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
