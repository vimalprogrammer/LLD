package strategy;

import model.*;

public class FirstEmptySlotStrategy implements SlotAllocationStrategy{
    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor: parkingLot.getFloors()) {
            for(ParkingSlot slot: floor.getSlots()) {
                if(slot.getStatus().equals(ParkingSlotStatus.EMPTY) &&
                slot.getAllowedType().equals(vehicleType)) {
                    return slot;
                }
            }
        }
        return null;
    }
}
