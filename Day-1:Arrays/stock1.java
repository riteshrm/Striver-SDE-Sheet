//Problem Link:-https://www.codingninjas.com/codestudio/problems/893405?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
import java.io.*;
import java.util.*;

public class stock1 {
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

	public static int maximumProfit(ArrayList<Integer> prices){
int ans = 0;
int mini = prices.get(0);
for(int i=1;i<prices.size();i++){
    ans = Math.max(ans,(prices.get(i)-mini));
    mini = Math.min(mini,prices.get(i));
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
		int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                 arr.add(sc.nextInt());
            }
            
           
            System.out.println(fun(arr));
            t--;
        }
		
	}
}
