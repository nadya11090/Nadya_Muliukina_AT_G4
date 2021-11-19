package tasks.homework.Threadtask;

public class Mouse {

    private String pattern = "Mouse <%d>";
    private String name;

    public Mouse(int number) {
        this.name = String.format(pattern, number);
    }

    public void peep() {

        System.out.printf(String.format("\n" + "%s PEEP ", this.name));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
