package tasks.homework.basetask;

public class Bee {
    private String gender;
    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public static void printBeeDetails(double a) {
        float b = 500 / 3000;
        System.out.println(b);

        System.out.println("Я легче лося в " + " раз");
    }
}