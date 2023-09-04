package com.practice.spring.service;

import java.util.List;

import com.practice.spring.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchAllDepartments();

	Department fetchByDepartmentId(Long departmentId);

	void deleteDepartmentById(Long departmentId);

	Department updateDepartment(Long departmentId, Department department);

	Department fetchDepartmentByName(String departmentName);

}
