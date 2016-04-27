package com.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Person;
import com.service.PersonService;
import com.service.TestServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext.xml","classpath:application-mvc.xml"})
public class TestJunit {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private TestServiceImpl testServiceImpl;

	@Test
	public void test1(){
		List<Person> person=personService.select();
		System.out.println(person.size()+","+person.get(0).getName());
		System.out.println("测试冲突跨版本冲突rrrrrrrrrtttt");
	}
	
	@Test
	public void test2(){
		List<Person> person=testServiceImpl.select();
		System.out.println(person.size()+","+person.get(0).getName());
		System.out.println("测试支干合主干55555555");
	}
	@Test
	public void test3(){
		List<Person> person=testServiceImpl.select();
		System.out.println(person.size()+","+person.get(0).getName());
		System.out.println("测试主干同步分支44444");
	}
}
