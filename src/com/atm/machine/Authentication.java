package com.atm.machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Authentication {

	 public List<User> allUser() {
		User u = new User(101, "Vishal", "9004", 14200.33);
		User u1 = new User(102, "Sahil", "777", 8200.71);
		User u2 = new User(103, "Nitesh", "911", 27200.12);
		User u3 = new User(104, "Vikas", "8286", 16300.38);
		List<User> list = new ArrayList<User>();
		list.add(u);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;

	}

	public User getUser(String name, String password) {
		User user=null;
		List<User> list = allUser();
		for (User u : list) {
			if (u.getName().equals(name) && u.getPassword().equals(password)) {
				user = new User(u.getId(), u.getName(), u.getPassword(), u.getAmount());
			} else {
				
			}

		}
		return user;
	}

}
