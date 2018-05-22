package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CourseInstance;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class HAS_COURSE_INSTANCE implements Container.HasCourseInstance {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CourseInstance> courseInstanceList;

	public HAS_COURSE_INSTANCE() {
	}

	public HAS_COURSE_INSTANCE(String string) {
		this(new COURSE_INSTANCE(string));
	}

	public String getString() {
		if(courseInstanceList == null || courseInstanceList.size() == 0 || courseInstanceList.get(0) == null) {
			return null;
		} else {
			Name name = courseInstanceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(courseInstanceList == null) {
			courseInstanceList = new ArrayList<CourseInstance>();
		}
		if(courseInstanceList.size() == 0) {
			courseInstanceList.add(new COURSE_INSTANCE(string));
		} else {
			courseInstanceList.set(0, new COURSE_INSTANCE(string));
		}
	}

	public HAS_COURSE_INSTANCE(CourseInstance courseInstance) {
		courseInstanceList = new ArrayList<CourseInstance>();
		courseInstanceList.add(courseInstance);
	}

	@Override
	public CourseInstance getCourseInstance() {
		if(courseInstanceList != null && courseInstanceList.size() > 0) {
			return courseInstanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourseInstance(CourseInstance courseInstance) {
		if(courseInstanceList == null) {
			courseInstanceList = new ArrayList<>();
		}
		if(courseInstanceList.size() == 0) {
			courseInstanceList.add(courseInstance);
		} else {
			courseInstanceList.set(0, courseInstance);
		}
	}

	@Override
	public List<CourseInstance> getCourseInstanceList() {
		return courseInstanceList;
	}

	@Override
	public void setCourseInstanceList(List<CourseInstance> courseInstanceList) {
		this.courseInstanceList = courseInstanceList;
	}

	@Override
	public boolean hasCourseInstance() {
		return courseInstanceList != null && courseInstanceList.size() > 0 && courseInstanceList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
