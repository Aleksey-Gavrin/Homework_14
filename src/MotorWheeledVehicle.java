public abstract class MotorWheeledVehicle extends WheeledVehicle {
    public MotorWheeledVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
