import java.util.HashMap;
import java.util.Map;
public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("Four", 4);
        numbers.put("Thirty", 30);
        numbers.put("Ten", 10);
        numbers.put("Nine", 9);
        numbers.put("Eighteen", 18);
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
