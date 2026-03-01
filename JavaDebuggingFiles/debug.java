package Java.JavaDebuggingFiles;
import java.util.*;

public class debug {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};

        // Swap first (index 0) and last (index 3)
        int temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        System.out.println("First: " + nums[0] + ", Last: " + nums[3]);
    }
}