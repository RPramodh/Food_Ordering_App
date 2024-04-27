package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.DemoEntity;
import com.example.demo.Repo.DemoRepo;

@Service

public class DemoService {
	
	@Autowired
	private DemoRepo demoRepo;
	
	public void save(DemoEntity demoEntity) {
		demoRepo.save(demoEntity);
	}
	
	public List<DemoEntity> getall(){
		return demoRepo.findAll();
	}
	

}
