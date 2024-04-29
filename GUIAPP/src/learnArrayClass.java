import java.util.Arrays;
public class learnArrayClass {
    public static void main(String[] args) {
        //int[] numbers={1,2,3,4,5,6,7,8,9,10};
        //int index=Arrays.binarySearch(numbers,4);
        //System.out.println("the index of 4 element in array"+index);
        Integer[] numbers={12,34,56,89,76,4,59,13,8,5,11};
        Arrays.sort(numbers);
        //Arrays.fill(numbers,10);
        for(int i:numbers)
        {
            System.out.println(i + " ");
        }
    }
}
