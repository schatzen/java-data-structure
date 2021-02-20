package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {

    static Person1[] persons = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("person_list.txt"));
            while (sc.hasNext()) {
                persons[n] = new Person1();
                persons[n].name = sc.next();
                persons[n].number = sc.next();

                n++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(persons[i].name + ", " + persons[i].number);
        }

    }
}
