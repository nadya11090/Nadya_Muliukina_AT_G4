package tasks.homework;

public class TrainMethodsIf {

    public int returnNewInt(int newInt) {
        if (newInt < 8) {
            return newInt * 7;
        } else {
            return newInt / 4;
        }
    }

    public long returnNewLong(long newLong) {
        if (newLong > 300) {
            return newLong - 300;
        } else {
            return newLong + 20;
        }
    }

    public float returnNewFloat(float newFloat) {
        if (newFloat == 0.67f) {
            return newFloat;
        } else {
            return newFloat * 2;
        }
    }

    public double returnNewDouble(double newDouble) {
        if (newDouble > 30 && newDouble < 80) {
            return newDouble + 87;
        }
        if (newDouble > 80 && newDouble < 400) {
            return newDouble - 87;
        }
        if (newDouble > 400) {
            return newDouble / 4;
        }
        return newDouble;
    }

    public void returnNewBoolean(boolean newBoolean) {
        if (newBoolean = true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}

