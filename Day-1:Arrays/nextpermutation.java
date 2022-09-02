//Problem Link:-https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_1089580?topList=striver-sde-sheet-problems
import java.io.*;
import java.util.*;

public class nextpermutation {
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
public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) 
    {
        // Write your code here.
        int[] arr = new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i] = a.get(i);
        }
        int index = arr.length-1;
        while(index>0 && arr[index]<arr[index-1]){
            index--;
        }
        if(index==0){
            Arrays.sort(arr);
            ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            ans.add(arr[i]);
        }
        return ans;
        }
        index--;
        int in2 = index+1;
        while(in2<arr.length && arr[index]<arr[in2]){
            in2++;
        }
        in2--;
        int temp = arr[index];
        arr[index] = arr[in2];
        arr[in2] = temp;
int k = a.size()-index;
        for(int i=0;i<k/2;i++){
            int tm = arr[i+index+1];
            arr[i+index+1]  = arr[arr.length-1-i];
            arr[arr.length-1-i] = tm;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            ans.add(arr[i]);
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
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        ArrayList<Integer> ans = nextPermutation(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
		
		
	}
}
