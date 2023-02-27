package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.example.model.Book;
import com.example.model.User;

public class UserDaoImpl implements UserDao{

	public List<User> users = new ArrayList<>();
	public Map<Integer, User> userMap = new HashMap<>();
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		userMap.put(user.getId(), user);
	}

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return userMap.get(userId);
	}

	@Override
	public void updateUser(int userId) {
		// TODO Auto-generated method stub
		User user = userMap.get(userId);
		 System.out.println("Enter the field u wnat to update");
		 System.out.println("1:\tName ---> Press 1\n2:\tUsername ---> Press 2\n3:\tEmail ---> Press 3");
		 Scanner scanner = new Scanner(System.in);
		 int choice = Integer.parseInt(scanner.nextLine());
		 if(choice==1)
		 {
			 System.out.println("Enter Name: ");
			 String newName = scanner.nextLine();
			 user.setName(newName);
		 }
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		users.remove(userMap.get(userId));
		userMap.remove(userId);
	}

}
