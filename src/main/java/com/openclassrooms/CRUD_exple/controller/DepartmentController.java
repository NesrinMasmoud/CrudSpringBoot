package com.openclassrooms.CRUD_exple.controller;

import java.util.List;
//Importing required classes

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.openclassrooms.CRUD_exple.model.Department;
import com.openclassrooms.CRUD_exple.service.DepartmentService;

//Annotation
@RestController
public class DepartmentController {

	@Autowired private DepartmentService departmentService;

	// Save operation
	@PostMapping("/department")

	public Department saveDepartment(@Validated @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping("/department")

	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/department/{id}")

	public Department updateDepartment(@RequestBody Department department,@PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/department/{id}")

	public String deleteDepartmentById(@PathVariable("id") Long departmentId)
	{
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
