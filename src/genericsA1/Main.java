package A1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sity on 08/11/2019.
 */
public class Main {
    public static void main(String[] args) {
        String a[] = {"set","mohammad","asghar","mahsa","set","mohammad"};
        Set<String> names = new TreeSet<>();
        for (String n : a)
            names.add(n);
        System.out.println(names);
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        System.out.println("");
        System.out.println(names.contains(search));
    }
}
