package com.course.service;

import java.util.List;

import com.course.entity.Course;
import com.course.entity.PreCourse;

public interface IPreCourseManage {
	public void addPreCourse(PreCourse pcos);
	//public void modifyPreCourse(PreCourse pcos);
	public void deletePreCourse(Course cos);
	public List<PreCourse> queryPreCourse(Course cos);
}
