import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> List=new ArrayList<>();
        List.add(23);
        List.add(53);
        List.add(63);
        List.add(13);

        //System.out.println("min element"+Collections.min(List));
        //System.out.println("max element"+Collections.max(List));
        //System.out.println(Collections.frequency(List,13));
        Collections.sort(List, Comparator.reverseOrder());
        System.out.println(List);


    }
}
