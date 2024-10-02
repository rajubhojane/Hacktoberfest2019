// A simple Java program to find three elements whose
// sum is equal to zero
import java.util.ArrayList;
import java.util.List;

// Class to find triplets in an array whose sum is zero
class GfG {
    // Method to find and return all triplets with a sum of zero
    static List<int[]> findTriplets(int[] arr) {
        List<int[]> triplets = new ArrayList<>(); 
        int n = arr.length;

        // Loop through each element and use nested
        // loops to find the triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                  
                    // Check if the sum of the current
                    // triplet is zero
                    if (arr[i] + arr[j] + arr[k] == 0){
                        triplets.add(new int[]{arr[i],arr[j],arr[k]});
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        List<int[]> result = findTriplets(arr);
      
        if (result.isEmpty()) {
            System.out.println("No triplets found with sum zero.");
        } else {
            for (int[] t : result) {
                System.out.println(t[0] +
                                   ", " + t[1] + ", " + t[2]);
            }
        }
    }
}
