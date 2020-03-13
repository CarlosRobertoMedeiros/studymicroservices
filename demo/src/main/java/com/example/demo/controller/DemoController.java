package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoRepository demoRepository;
	
	@GetMapping
	public List<Demo> findAll() {
		List<Demo> demoList;
		try {
			demoList = new ArrayList<>(); 
			demoList = demoRepository.findAll();
			System.out.println("Executei o FindAll");
		}catch (Exception e) {
			throw new RuntimeException("Erro "+e);
		}
		
		return demoList;
	}

}
