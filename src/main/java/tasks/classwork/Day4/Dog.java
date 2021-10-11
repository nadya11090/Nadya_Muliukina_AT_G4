package tasks.classwork.Day4;

public class Dog implements Speakable{
    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }

    @Override
    public void shout(String phrase) {
        System.out.println("RRR" + phrase);
    }
}
