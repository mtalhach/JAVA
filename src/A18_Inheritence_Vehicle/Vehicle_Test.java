package A18_Inheritence_Vehicle;

public class Vehicle_Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("566TYU09","101A","Samsung","Red");
        FourWheelVehicle fourWheelVehicle=new FourWheelVehicle("566TYU09","101A","Samsung","Red",4,9);
        SadanVehicle sadanVehicle=new SadanVehicle("566TYU09","101A","Samsung","Red",4,9,90);

        System.out.println(vehicle.toString());
        System.out.println("==================");
        System.out.println(fourWheelVehicle.toString());
        System.out.println("==================");
        System.out.println(sadanVehicle.toString());

    }
}
