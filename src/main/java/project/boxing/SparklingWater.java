package project.boxing;


public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    //есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
    //есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;

    }
    //есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае,
    // если она открыта запускает метод degas()

    private void isOpened() {
    if (isOpened == true) {
      //  degas();
    }
     }
    //есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    //public void degas() {
       // int partSecond = 0;
       // for (i < bubbles.length);
        //partSecond += (10 + 5) * this.getTemperature();

    //}
    //есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle() {
        //if bubbles != null;
        return true;
    }
}
