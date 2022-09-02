
//Problem Link:-https://leetcode.com/problems/course-schedule/

import java.io.*;
import java.util.*;

public class course_schedule {

	 public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ind = new int[numCourses];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            ind[a]++;
            ArrayList<Integer> arr = map.getOrDefault(b,new ArrayList<>());
            arr.add(a);
            map.put(b,arr);
        }
        int cc = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<ind.length;i++){
            if(ind[i]==0){
                q.add(i);
                cc++;
            }
        }
        
        if(q.size()==0){
            return false;
        }
        
        while(!q.isEmpty()){
            int x = q.poll();
            if(map.containsKey(x)){
            for(int i=0;i<map.get(x).size();i++){
                ind[map.get(x).get(i)]--;
                if( ind[map.get(x).get(i)]==0){
                    q.add(map.get(x).get(i));
                    cc++;
                }
            }}
        }
        if(cc!=numCourses){
            return false;
        }
        return true;
    }
	

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		
		
	}
}
