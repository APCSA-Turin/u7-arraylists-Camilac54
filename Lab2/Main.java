package Lab2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // nums.add(10);
        // nums.add(5);
        // nums.add(24);
        // System.out.println(nums);

        // ArrayList<String> letters = new ArrayList<String>();

        // letters.add("A");
        // letters.add("B");
        // letters.add("C");
        // System.out.println(letters);
        // System.out.println(letters.size());
        // letters.add(0, "D");
        // System.out.println(letters);
        // System.out.println(letters.size());
        // letters.add(3, "E");
        // System.out.println(letters);
        // System.out.println(letters.size());
        // letters.add(1, "F");
        // letters.add(1, "G");
        // letters.add(1, "H");
        // System.out.println(letters);
        // System.out.println(letters.size());
        // System.out.println("-------------");
        // letters.remove(2);
        // System.out.println(letters);
        // System.out.println(letters.size());
        // letters.remove(3);
        // System.out.println(letters);
        // System.out.println(letters.size());
        // letters.remove(0);
        // letters.remove(1);
        // System.out.println(letters);
        // System.out.println(letters.size());
        // System.out.println("-------------");

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(3);
        
        numList.add(0, 6);    
        
        numList.add(7);
        
        numList.add(2, 8);  
        
        numList.set(3, 9);
        
        numList.add(1, 2);
        
        numList.add(1, numList.size());
        
        numList.remove(4);
        
        numList.set(4, 0);
        
        System.out.println(numList);
    }
}