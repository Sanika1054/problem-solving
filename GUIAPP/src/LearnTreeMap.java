import java.util.TreeMap;
import java.util.Map;
public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("Four", 4);
        numbers.put("Thirty", 30);
        numbers.put("Ten", 10);
        numbers.put("Nine", 9);
        numbers.put("Eighteen", 18);
        numbers.remove("Ten");
        System.out.println(numbers);
        //if(!numbers.containsKey("Two")){
        //numbers.put("Two",23);
        //}
        // numbers.putIfAbsent("Two",23);
        System.out.println(numbers);
        System.out.println(numbers.containsValue(9));
        System.out.println(numbers.isEmpty());
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

    }
}

