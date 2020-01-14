package hackerrank;

import java.util.*;

public class DroneAmazon {

    public static void main(final String[] args) {

        final List<Drone> drones = new ArrayList<>();
        drones.add(new Drone(4, 11));
        drones.add(new Drone(2, 15));
        drones.add(new Drone(5, 16));
        drones.add(new Drone(3, 40));
        drones.add(new Drone(1, 20));
        drones.add(new Drone(9, 60));
        drones.add(new Drone(6, 22));

        final List<Drone> maintenanceDrones = new ArrayList<>();
        maintenanceDrones.add(new Drone(1, 20));
        maintenanceDrones.add(new Drone(5, 16));
        maintenanceDrones.add(new Drone(9, 60));

        largestFlightDrones(drones, maintenanceDrones, 3);
    }

    public static List<Drone> largestFlightDrones(final List<Drone> drones, final List<Drone> maintenance,
            final int G) {
        final Map<Integer, Drone> result = new HashMap<>();

        for (int i = 0; i < drones.size(); i++) {
            final Drone drone = drones.get(i);
            if (!maintenance.contains(drone)) {
                if (result.size() < G) {
                    result.put(result.size(), drone);
                } else {
                    if (drone.getFlightDistance() > result.get(0).getFlightDistance()) {

                    }
                }
            }
        }

        System.out.println(result);

        return new ArrayList<>(result.values());
    }
}

class Drone {

    private final int id;

    private final int flightDistance;

    public Drone(final int id, final int flightDistance) {
        this.id = id;
        this.flightDistance = flightDistance;
    }

    public int getId() {
        return id;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    @Override
    public String toString() {
        return id + " - " + flightDistance;
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj instanceof Drone) {
            return ((Drone) obj).getId() == getId();
        }
        return false;
    }
}
