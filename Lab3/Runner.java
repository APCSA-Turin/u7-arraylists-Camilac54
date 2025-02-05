package Lab3;
import java.util.ArrayList; // import the ArrayList class


public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        nums.add(55);
        nums.add(45);
        nums.add(20);
        
        int sum = 0;

        // use an index-based for loop here to sum up the numbers in nums
        // for (int i = 0; i < nums.size(); i ++) {
        //     sum += nums.get(i);
        // }
        for (int num : nums) {
            sum += num;
        }

        System.out.println(sum);  // TEST: this should print 225

        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        // use a for loop here to print out the words in reverse order
        // for (int i = words.size() - 1; i >= 0; i --) {
        //     System.out.println(words.get(i));
        // }
        int i = 0;
        while (i < words.size()) {
        }

    }
}