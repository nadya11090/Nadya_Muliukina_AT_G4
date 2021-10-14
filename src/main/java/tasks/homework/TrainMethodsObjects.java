package tasks.homework;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("Я мышь, меня зовут " + mouse.getName() + " и мне " + mouse.getAge() + " лет");
    }

    public void processSouce(Souce souce) {
        System.out.println("Это соус " + souce.getName() + souce.getColor() + " цвета");
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Возникло " + obstacle.getSeverity() + " препятствие " + obstacle.getDescription());
    }

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Mini", 5);
        new TrainMethodsObjects().processMouse(mouse);
        Souce souce = new Souce("бешамель ", "белого");
        new TrainMethodsObjects().processSouce(souce);
        Obstacle obstacle = new Obstacle("авария на трассе", "серьезное");
        new TrainMethodsObjects().processObstacle(obstacle);

    }
}
