import java.util.TreeSet;
import java.util.Set;
public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(94);
        set.add(15);
        set.add(9);
        set.add(8);
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
        System.out.println(set.contains(9));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


    }

}
