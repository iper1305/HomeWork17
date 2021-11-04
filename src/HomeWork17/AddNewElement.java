package HomeWork17;

public class AddNewElement {

    static int[] addElement(int[] oldArray, int num) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = num;
        return newArray;
    }
}
