package day01;

import java.util.Scanner;

import jdk.jfr.internal.PrivateAccess;

public class T {

	public static void main(String[] args) {
		
		int [] nums = new int [50];
		int a= 1;

//		int answer = 0;
//		int sum = 0;
//		for(int i = 0; i<nums.length; i++) {
//			for(int j=i+1; j<nums.length; j++) {
//				for(int k=j+1; k<nums.length; k++) {
//					
//					sum = nums[i] + nums[j] + nums[k];
//				
//					
//					if(isPrime(sum)) {
//						answer++;
//					}
//				}
//			}
//		}
//		return answer;
//		
//		private boolean isPrime(int num) {
//			for(int i=2; i<num; i++) {
//				if(num%i ==0 ) {
//					return false;
//				}
//			
//			}return true;
//			
//		}
		class Solution {
		    public int[] solution(int[] lottos, int[] win_nums) {
		       int cnt = 0;
		        int z = 0;
		        for(int lotto : lottos){
		            if(lotto == 0){
		                z++;
		                continue;
		            }
		        
		            for(int w : win_nums) { 
		                if(w == lotto){
		                    cnt++;
		                    break;
		                }
		            }
		        }
		        return new int [] {7-Math.max(cnt+z,1),7-Math.max(cnt,1)}; 
		        }
		}	
		
}
}