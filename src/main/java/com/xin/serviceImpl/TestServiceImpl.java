package com.xin.serviceImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xin.dao.TestDao;
import com.xin.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public String dost(String id) {
		String sex = testDao.getSexByName(id);
		return sex;
	}

	@Transactional
	@Override
	public void save() {
		Map<String, Object> map = new HashMap<>();
		int x = testDao.update("08");
		System.out.println(x);
		map.put("s", "99111");
		map.put("sname", "100");
		map.put("sage", new Date());
		map.put("ssex", "100");
		int i = testDao.save(map);
		System.out.println(i);

	}

}
