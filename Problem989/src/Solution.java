import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = A.length-1; i >= 0; i--){
            res.add(0, (K + A[i])  % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0){
            res.add(0, K % 10);
            K = K / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1,2,0,0};
        int K = 34;
        List test = addToArrayForm(A, K);
        System.out.println(test);
    }
}