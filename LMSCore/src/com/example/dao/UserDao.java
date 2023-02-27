package com.example.dao;

import java.util.List;

import com.example.model.User;

public interface UserDao {

	public void save(User user);
	public List<User> getallUsers();
	public User getUser(int userId);
	public void updateUser(int userId);
	public void deleteUser(int userId);
}
