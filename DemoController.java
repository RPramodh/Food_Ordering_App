package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import com.example.demo.Entity.DemoEntity;
import com.example.demo.Service.DemoService;

@Controller

public class DemoController {
	
	@Autowired
	private DemoService demoservice;
	
	@GetMapping
	public String ss() {
		return "index";
	}
	
	
	@GetMapping("/save")
	public String save(DemoEntity demoEntity) {
		
		demoservice.save(demoEntity);
		return "index";
		
	}
	
	@GetMapping("/show")
	public ModelAndView show(ModelAndView mv) {
		List<DemoEntity> entities = demoservice.getall();
		System.out.println(entities);
		mv.setViewName("show");
		mv.addObject("Entities", entities);
		return mv;
	
	}

}
