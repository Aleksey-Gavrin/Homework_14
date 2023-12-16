public abstract class WheeledVehicle implements Maintainable {
    private final String modelName;
    private final int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public WheeledVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }
}
