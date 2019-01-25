package com.xin.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xin.service.TestService;

@Controller
public class TestController {
	
	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping(value="/someThing/{id}",method=RequestMethod.GET)
	public Map<String,String> doSt(@PathVariable("id") String id) throws UnsupportedEncodingException{
		Map<String,String> map=new HashMap<>();
		String sex = testService.dost(id);
		map.put("data", sex);
		return map;
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public void test(){
		System.out.println(new Date());
	}
	
	
	@RequestMapping(value="save",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void save(){
		testService.save();
	}

}
