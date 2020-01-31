package genericsB2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sity on 20/12/2019.
 */
public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a setence");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        Set<String> tokenSet = new TreeSet<>();
        for (String s : tokens){
        tokenSet.add(s);
        }
        for (String m : tokenSet){
            System.out.println(m);
        }
    }
    public Sentence (){}

}
