public class Truck extends Transport implements ServiceInterface {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }

}