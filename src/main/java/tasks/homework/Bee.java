package tasks.homework;

public class Bee {
    private String gender;

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

    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

   // public static float printBeeDetails(float a) {

       // float b = 500 / weight;
      //  System.out.println(b);
        //return b;

        //System.out.println("Я легче лося в " +  " раз");

    }
