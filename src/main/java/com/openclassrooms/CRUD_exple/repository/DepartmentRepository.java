package com.openclassrooms.CRUD_exple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.CRUD_exple.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
