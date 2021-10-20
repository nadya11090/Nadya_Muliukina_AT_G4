package tasks.classwork.Day6;

public class ObjectContainer {

    int freePlaceNumber = 0;
    Object[] arr = new Object[10];

    public void add(Object incoming) {

        if (freePlaceNumber < arr.length) {
            arr[freePlaceNumber++] = incoming;
        }
    }

    public Object removeLast() {

        if (freePlaceNumber > 0) {
            Object ob = arr[freePlaceNumber - 1]; // достаем объект из последней занятой ячейки массива
            arr[freePlaceNumber - 1] = null;
            freePlaceNumber--;
            return ob; // вернем методу тот объект который забрали
        }
        return null;

    }

    public boolean isEmpty() {

    return freePlaceNumber == 0; //проверяет есть ли в массиве хотя бы 1 объект
    }

    public boolean isFull() {

        return freePlaceNumber == 10;
    }
}