package org.nagarro.advancedjava.web.hrmanager.dao;

import java.util.List;

import org.nagarro.advancedjava.web.hrmanager.model.EmployeeModel;
import org.nagarro.advancedjava.web.hrmanager.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDao extends CrudRepository<UserEntity, Integer> {
	public List<UserEntity> findByUsernameAndPassword(String username,String password);
	
}

