//Problem Link:-https://www.codingninjas.com/codestudio/problems/630526?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
import java.io.*;
import java.util.*;

public class kadane {
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
    int sum = 0;
    int ans = 0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum<0){
            sum = 0;
        }
        ans = Math.max(ans,sum);

    }
    return ans;
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] =sc.nextInt();

        }
        System.out.println(maxSubarraySum(arr,n));
		
		
	}
}
