package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.AlignmentObject;
import org.kyojo.schemaorg.m3n3.core.Clazz.Course;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class COURSE_PREREQUISITES implements Container.CoursePrerequisites {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AlignmentObject> alignmentObjectList;
	@Transient
	public List<Course> courseList;
	@Transient
	public List<Text> textList;

	public COURSE_PREREQUISITES() {
	}

	public COURSE_PREREQUISITES(AlignmentObject alignmentObject) {
		alignmentObjectList = new ArrayList<AlignmentObject>();
		alignmentObjectList.add(alignmentObject);
	}

	@Override
	public AlignmentObject getAlignmentObject() {
		if(alignmentObjectList != null && alignmentObjectList.size() > 0) {
			return alignmentObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAlignmentObject(AlignmentObject alignmentObject) {
		if(alignmentObjectList == null) {
			alignmentObjectList = new ArrayList<>();
		}
		if(alignmentObjectList.size() == 0) {
			alignmentObjectList.add(alignmentObject);
		} else {
			alignmentObjectList.set(0, alignmentObject);
		}
	}

	@Override
	public List<AlignmentObject> getAlignmentObjectList() {
		return alignmentObjectList;
	}

	@Override
	public void setAlignmentObjectList(List<AlignmentObject> alignmentObjectList) {
		this.alignmentObjectList = alignmentObjectList;
	}

	@Override
	public boolean hasAlignmentObject() {
		return alignmentObjectList != null && alignmentObjectList.size() > 0 && alignmentObjectList.get(0) != null;
	}

	public COURSE_PREREQUISITES(Course course) {
		courseList = new ArrayList<Course>();
		courseList.add(course);
	}

	@Override
	public Course getCourse() {
		if(courseList != null && courseList.size() > 0) {
			return courseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourse(Course course) {
		if(courseList == null) {
			courseList = new ArrayList<>();
		}
		if(courseList.size() == 0) {
			courseList.add(course);
		} else {
			courseList.set(0, course);
		}
	}

	@Override
	public List<Course> getCourseList() {
		return courseList;
	}

	@Override
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public boolean hasCourse() {
		return courseList != null && courseList.size() > 0 && courseList.get(0) != null;
	}

	public COURSE_PREREQUISITES(String string) {
		this(new TEXT(string));
	}

	public COURSE_PREREQUISITES(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public COURSE_PREREQUISITES(List<AlignmentObject> alignmentObjectList,
			List<Course> courseList,
			List<Text> textList) {
		setAlignmentObjectList(alignmentObjectList);
		setCourseList(courseList);
		setTextList(textList);
	}

	public void copy(Container.CoursePrerequisites org) {
		setAlignmentObjectList(org.getAlignmentObjectList());
		setCourseList(org.getCourseList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
