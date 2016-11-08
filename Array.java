package com.sort;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		Integer[] foo = { 9, 38, 5, 97, 76, -13, 27, 49, -78, 34, -1 };
		// 方法一，冒泡法排序
		int temp;
		System.out.print("冒泡排序结果：");
		for (int i = 0; i < foo.length; i++) {
			for (int j = i; j < foo.length; j++) {
				if (foo[i] > foo[j]) {
					temp = foo[i];
					foo[i] = foo[j];
					foo[j] = temp;
				}
			}
			System.out.print(foo[i] + "   ");
		}
		System.out.println();

		// 方法二，利用数组自带的sort（）方法进行排序
		Arrays.sort(foo);
		System.out.print("数组自带排序方法排序结果：");
		for (int i = 0; i < foo.length; i++) {
			System.out.print(foo[i] + "   ");
		}
	}

}
