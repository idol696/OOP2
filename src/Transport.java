public class Transport implements ServiceInterface {
    private String modelName;
    private int wheelsCount;

    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected Transport() {
        modelName = "";
        wheelsCount = 0;
    }

    protected String getModelName() {
        return modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }

    protected void setModelName(String modelName) {
        this.modelName = modelName;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
