package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Person;
import com.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> select() {
		List<Person> list=personDao.select();
		return list;
	}

}
