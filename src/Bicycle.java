public class Bicycle extends Vehicle implements Maintainable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
       }
       @Override
        public void service() {
           System.out.println("Обслуживаем " + this.getModelName());
           for (int i = 0; i < this.getWheelsCount(); i++) {
               this.updateTyre();
           }
       }
}
