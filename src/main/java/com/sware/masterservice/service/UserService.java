package com.sware.masterservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sware.masterservice.entity.User;
import com.sware.masterservice.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		// Integer n=10/0;

		List<User> userList = new ArrayList<>();
		try {
			userList = userRepository.findAll();

		} catch (Exception e) {
			System.out.println("Exception in UserRepostory:" + e.getMessage());
		}
		System.out.println("Before Sorting:" + userList);
		Collections.sort(userList);
		System.out.println("After Sorting:" + userList);

		return userList;
	}

	public User saveUserToDb(User user) {
		User usr = new User();
		try {
			Date now = new Date();
			user.setCreatedDate(now);
			user.setModifiedDate(now);
			usr = userRepository.save(user);
		} catch (Exception e) {
			System.out.println("Exception in seveUserToDb:" + e.getMessage());
		}
		return usr;
	}

	/*
	 * public User[] saveMultipleUsersToDb(User[] user) { User savedUsers[]=new
	 * User[user.length]; int i=0; try {
	 * 
	 * for(User tmpUser:user) { Date now =new Date(); tmpUser.setCreatedDate(now);
	 * tmpUser.setModifiedDate(now); savedUsers[i]=userRepository.save(tmpUser); }
	 * 
	 * } catch (Exception e) {
	 * System.out.println("Exception in seveUserToDb:"+e.getMessage()); } return
	 * savedUsers; }
	 * 
	 * 
	 * 
	 * 
	 * public User getUserById(Integer id) { User usr=new User(); try {
	 * usr=userRepository.findOne(id); } catch (Exception e) {
	 * System.out.println("Exception in getUserById:"+e.getMessage()); } return usr;
	 * }
	 * 
	 * 
	 * public User updateUser(User user) { try { user.setModifiedDate(new Date());
	 * user=userRepository.save(user); } catch (Exception e) {
	 * System.out.println("Exception in updateUser:"+e.getMessage()); } return user;
	 * }
	 * 
	 * 
	 * public User findUserByEmailAddress(String emailid){ User urs=null; try {
	 * urs=userRepository.findByEmailAddress(emailid); } catch (Exception e) {
	 * System.out.println("Exception in findUserByEmailAddress:"+e.getMessage()); }
	 * return urs; }
	 * 
	 * 
	 * public List<User> findByUserFirstName(String fName){ List<User>usrList=new
	 * ArrayList<>(); Collection<UserWithFnameAndLname> userList=null; try {
	 * userList=userRepository.findByFname(fName); if(userList.size()>0){
	 * for(UserWithFnameAndLname usr:userList){ User tmpUser=new User();
	 * tmpUser.setFname(usr.getFname()); tmpUser.setLname(usr.getLname());
	 * System.out.println(tmpUser); usrList.add(tmpUser); } }
	 * 
	 * } catch (Exception e) {
	 * System.out.println("Exception in findByUserFirstName:"+e.getMessage()); }
	 * 
	 * return usrList; }
	 * 
	 * 
	 * public void deleteUser(Integer userId) { // TODO Auto-generated method stub
	 * try { userRepository.delete(userId); } catch (Exception e) { // TODO: handle
	 * exception }
	 * 
	 * }
	 */

	public int add(int a, int b) {
		return a + b;
	}

}
