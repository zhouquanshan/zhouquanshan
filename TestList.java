package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setAge((int) Math.random() * 42 + 18);
		userList.add(0, user);
		userList.add(1, user);
		userList.add(2, user);
		userList.add(3, user);
		userList.add(4, user);
		userList.add(5, user);
		userList.add(6, user);
		userList.add(7, user);
		userList.add(8, user);
		userList.add(9, user);
		Collections.sort(userList, new Comparator<User>() {
			public int compare(User o1, User o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}
				if (o1.getAge() == o2.getAge()) {
					return 0;
				}
				return -1;
			}
		});
		System.out.println("排序：" + userList);
	}

}
