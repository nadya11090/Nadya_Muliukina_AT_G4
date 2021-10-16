package tasks.homework.basetask;

import java.sql.SQLOutput;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("Я мышь, меня зовут " + mouse.getName() + " и мне " + mouse.getAge() + " лет");
    }

    public void processSouce(Souce souce) {
        System.out.println("Это соус " + souce.getName() + souce.getColor() + " цвета");
    }

    public void processBee(Bee bee) {
        System.out.println("Я пчела" + bee.getGender() + " пола " + "и веса " + bee.getWeight());
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Возникло " + obstacle.getSeverity() + " препятствие " + obstacle.getDescription());
    }
    public void processPineapple(Pineapple pineapple) {
        System.out.println("Ананас сорта" + pineapple.getGrade() + " с теплоемкостью " + pineapple.getHeatCapacity());
    }

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Mini", 5);
        new TrainMethodsObjects().processMouse(mouse);
        Souce souce = new Souce("бешамель ", "белого");
        Bee bee = new Bee("мужского", 3000);
        new TrainMethodsObjects().processSouce(souce);
        Obstacle obstacle = new Obstacle("авария на трассе", "серьезное");
        new TrainMethodsObjects().processObstacle(obstacle);
        Pineapple pineapple = new Pineapple("Smooth Cayenne", 1000);
        new TrainMethodsObjects().processPineapple(pineapple);

    }
}
