import com.factory.example.Drone;
import com.factory.example.DroneType;
import com.factory.example.DronesFactory;

public class Main {
    public static void main(String[] args) {
        DronesFactory dronesFactory = new DronesFactory();

        Drone simple = dronesFactory.getDrone(DroneType.SIMPLE);
        simple.createDrone();

        Drone missiles = dronesFactory.getDrone(DroneType.MISSILIES);
        missiles.createDrone();

        Drone kamikaza = dronesFactory.getDrone(DroneType.KAMIKAZA);
        kamikaza.createDrone();
    }
}