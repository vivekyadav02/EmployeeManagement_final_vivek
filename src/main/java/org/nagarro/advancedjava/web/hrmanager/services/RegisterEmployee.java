package org.nagarro.advancedjava.web.hrmanager.services;

import java.util.List;

import org.nagarro.advancedjava.web.hrmanager.dao.HrDao;
import org.nagarro.advancedjava.web.hrmanager.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterEmployee {

	@Autowired
	private HrDao hrDao;
	public String uname;
	// save the Hr data into database
	public void saveUser(UserEntity user) {
		try {
		this.hrDao.save(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// verify the user and password for validation
	public boolean userPasswordValidation(UserEntity user) {
		List<UserEntity> list=null;
		try {
		list=this.hrDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if(list.size()!=0)
		this.uname=list.get(0).getName();
		System.out.print(list);
		if(list!=null) {
			return true;
		}
		return false;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
}
