package com.yiiming.serviceImpl;

import java.util.List;

import com.yiming.daoImpl.StudentImpl;
import com.yiming.entity.StudentClass;
import com.yiming.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentImpl sdi = new StudentImpl();
	@Override
	public List<StudentClass> findAllStudent() {
		return sdi.getStudent();
	}

}
