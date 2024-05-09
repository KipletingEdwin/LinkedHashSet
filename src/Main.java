import java.util.Iterator;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        lhs.add(2);
        lhs.add(4);
        lhs.add(3);
        lhs.add(5);

//        System.out.println("lhs content is " +lhs);

        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ",");

        }

    }
}