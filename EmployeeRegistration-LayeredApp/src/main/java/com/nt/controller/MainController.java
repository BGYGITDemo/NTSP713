package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public  final class MainController {
	private EmployeeMgmtService service;
 
	  //for constructor injection
	public MainController(EmployeeMgmtService service) {
		this.service = service;
	}
	
	public  String  processStudent(EmployeeVO  vo)throws Exception{
		EmployeeDTO dto=null;
		String result=null;
		//convert  VO class object to DTO class object
		dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		
		Date dt=new SimpleDateFormat("DD/MMM/YYYY").parse(vo.getDoj());
		//dto.setDoj(dt);
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//use service
		result=service.registerEmployee(dto);
		return result;
		
	}

	
	

}