package tasks.classwork.Day1;

public class BreakDemoFor {

    public void foo1() {
        int i = 0;
        for (i = 23; i < 28; i++) {

            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + i);

    }
}
