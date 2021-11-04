package HomeWork17;

public class MainForAddNewElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int num = 7;

        int[] newArray = AddNewElement.addElement(array, num);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
