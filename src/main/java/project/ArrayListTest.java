package project;

import java.util.ArrayList;
import java.util.Scanner;

//Add input strings into an ArrayList, stop it by entering 00, print all the values in the ArrayList.
public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        ArrayList<String> arr = new ArrayList<>();
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();

            if (string.equals("00")) {
                break;
            }
            arr.add(string);
            System.out.println(string);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
