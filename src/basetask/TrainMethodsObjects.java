package basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("Я мышь, меня зовут " + mouse.getName() + " и мне " + mouse.getAge() + " лет");
    }

    public void processSouce(Souce souce) {
        System.out.println("Это соус " + souce.getName() + souce.getColor() + " цвета");
    }

    public static void main(String[] args) {

        //TrainMethodsReturn f3 = new TrainMethodsReturn();
        //f3.returnNewInt(2);
        Mouse mouse = new Mouse("Mini", 5);
        new TrainMethodsObjects().processMouse(mouse);
        Souce souce = new Souce("бешамель ", "белого");
        new TrainMethodsObjects().processSouce(souce);

    }
}
