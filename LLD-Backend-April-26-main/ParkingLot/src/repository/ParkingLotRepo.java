package repository;

import model.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepo {

    private Map<Integer,ParkingLot> parkingLotDb;

    public ParkingLotRepo() {
        this.parkingLotDb = new HashMap<>();
    }

    // DAO
    public Optional<ParkingLot> findById(int parkingLotId) {
        ParkingLot parkingLot = parkingLotDb.get(parkingLotId);
        if(parkingLot==null) {
            return Optional.empty();
        }

        return Optional.of(parkingLot);
    }
}
