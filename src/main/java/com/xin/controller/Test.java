package com.xin.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.xin.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class Test {
	
	@Autowired
	private TestService testService;

	@org.junit.Test
    public void qwer(){
		String sex = testService.dost("01");
		System.out.println(sex);
    }
   
}