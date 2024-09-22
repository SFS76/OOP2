public abstract class Transport implements Serviceable{
    public String modelName;
    public int wheelsCount;

    public Transport() {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for ( int i=0; i< wheelsCount; i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}