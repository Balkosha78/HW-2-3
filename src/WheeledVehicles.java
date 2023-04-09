public abstract class WheeledVehicles implements Diagnostable {  // Колесные транспортные средства
    private  final String modelName;
    private  final int wheelsCount;

    public WheeledVehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
       private void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    private void updateTyres(){
        for (int i = 0; i < wheelsCount; ++i);
        updateTyre();
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        updateTyres();
    }
}