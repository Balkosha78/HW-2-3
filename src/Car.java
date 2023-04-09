public class Car extends EngineTransport {
    private static final int WHEELS_COUNT = 4;
    public Car(String modelName) {
        super(modelName, WHEELS_COUNT);
    }
}