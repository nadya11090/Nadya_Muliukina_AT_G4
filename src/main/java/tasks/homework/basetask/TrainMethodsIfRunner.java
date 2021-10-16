package tasks.homework.basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf operIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + operIf.returnNewInt(5));
        System.out.println("метод returnNewInt вернул " + operIf.returnNewInt(150));
        System.out.println("метод returnNewLong вернул " + operIf.returnNewLong(500));
        System.out.println("метод returnNewLong вернул " + operIf.returnNewLong(956));
        System.out.println("метод returnNewFloat вернул " + operIf.returnNewFloat((float) 0.7));
        System.out.println("метод returnNewFloat вернул " + operIf.returnNewFloat((float) 7.999));
        System.out.println("метод returnNewDouble вернул " + operIf.returnNewDouble(60));
        System.out.println("метод returnNewDouble вернул " + operIf.returnNewDouble(789));
        System.out.println("метод returnNewDouble вернул " + operIf.returnNewDouble(500));
        operIf.returnNewBoolean(true);
        operIf.returnNewBoolean(false);
    }

}