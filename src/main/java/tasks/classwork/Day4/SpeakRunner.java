package tasks.classwork.Day4;

public class SpeakRunner {

    public static void main(String[] args) {


        Person person = new Men();
        Men men = new Men();

        //person
        men.speak("igjif");


        speak1(new Person());
        speak2(new Dog());
        speak3(new Parrot());

        // для чего интерфейс
    }

    private static void speakAnySpeakable(Speakable speakable) {
        speakable.speak("fhfhfh");
    }


    private static void speak1(Person person) {
        person.speak("hi");
    }

    private static void speak2(Dog dog) {
        dog.speak("gav");
    }

    private static void speak3(Parrot parrot) {
        parrot.speak("karr");
    }
}
