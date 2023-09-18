package Lab21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static List<String> arrayToList(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }

    public static List<Integer> arrayToList(Integer[] array) {
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"One", "Two", "Three"};
        List<String> stringList = arrayToList(stringArray);

        System.out.println("List of Strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = arrayToList(intArray);

        System.out.println("List of Integers:");
        for (Integer num : intList) {
            System.out.println(num);
        }
    }
}
