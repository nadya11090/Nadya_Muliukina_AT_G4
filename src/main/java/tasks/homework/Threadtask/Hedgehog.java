package tasks.homework.Threadtask;

public class Hedgehog {

    private String pattern = "Hedgehog <%d>";
    private String name;

    public Hedgehog(int number) {
        this.name = String.format(pattern, number);
    }

    public void tellMe() {

        System.out.printf(String.format("I am %s! ", this.name));
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
