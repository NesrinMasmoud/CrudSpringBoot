package com.openclassrooms.CRUD_exple.service;

//Java Program to Illustrate DepartmentService.java File

//Importing packages


//Importing required classes
import java.util.List;

import com.openclassrooms.CRUD_exple.model.Department;

//Class
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
								Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}
