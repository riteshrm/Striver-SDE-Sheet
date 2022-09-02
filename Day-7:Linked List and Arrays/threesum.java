
//Problem Link:-https://leetcode.com/problems/3sum/

import java.io.*;
import java.util.*;

public class threesum {


	public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int K=0;
       List<List<Integer>> ans = new ArrayList<>();
        if(arr.length>=3){
        for(int i=0;i<n;i++){
             if(i>0 && arr[i]==arr[i-1]){
                    continue;
                }
            int l = i+1;
            int r = n-1;
            while(l<r){
               int sum = arr[i] + arr[l]+arr[r];
                if(sum==K){
                    ans.add(new ArrayList<>());
                    ans.get(ans.size()-1).add(arr[i]);
                     ans.get(ans.size()-1).add(arr[l]);
                     ans.get(ans.size()-1).add(arr[r]);

                    while(l<n-2 && arr[l]==arr[l+1]){
                        l++;
                    }

                    while(r>0 && arr[r]==arr[r-1]){
                        r--;
                    }
                    l++;
                    r--;

                }
                else if(sum>K){
                    r--;
                }

                else if(sum<K){
                    l++;
                }

            }

        }
        return ans;}
        
        return ans;
        
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			
			ArrayList<ArrayList<Integer>> ans = threeSum(arr);
			for(int i=0;i<ans.size();i++){
				for(int j=0j<ans.get(i).size();j++){
					System.out.print(ans.get(i).get(j)+" ");
				}
				System.out.println();
			}
			t--;
		}
		
		
	}
}
