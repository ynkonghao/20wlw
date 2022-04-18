package org.wlw.stu;

public class TestArray {
	public static void main(String[] args) {
		int[] nums = new int[89];
		nums = new int[]{23,41,22,44,21,45,66,77,22,11,223,44,567,78};
		//访问了第三个元素
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
