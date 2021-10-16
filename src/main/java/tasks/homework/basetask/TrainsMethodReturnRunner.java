package tasks.homework.basetask;

public class TrainsMethodReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn f3 = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + f3.returnNewInt(2));
        System.out.println("метод returnNewChar вернул " + f3.returnNewChar('2'));
        System.out.println("метод returnNewFloat вернул " + f3.returnNewFloat(0.3f));
        System.out.println("метод returnNewDouble вернул " + f3.returnNewDouble(0.5f));
        System.out.println("метод returnNewShort вернул " + f3.returnNewShort(22));
        System.out.println("метод returnNewByte вернул " + f3.returnNewByte(2));
        //Bee f4 = new Bee("male",0.05 );
       // new TrainMethodsObjects().processBee(bee);

    }
}
