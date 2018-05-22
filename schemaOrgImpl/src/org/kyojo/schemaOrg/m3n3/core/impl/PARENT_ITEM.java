package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Question;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class PARENT_ITEM implements Container.ParentItem {

	private static final long serialVersionUID = 1L;

	public List<Question> questionList;

	public PARENT_ITEM() {
	}

	public PARENT_ITEM(String string) {
		this(new QUESTION(string));
	}

	public String getString() {
		if(questionList == null || questionList.size() == 0 || questionList.get(0) == null) {
			return null;
		} else {
			Name name = questionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(questionList == null) {
			questionList = new ArrayList<Question>();
		}
		if(questionList.size() == 0) {
			questionList.add(new QUESTION(string));
		} else {
			questionList.set(0, new QUESTION(string));
		}
	}

	public PARENT_ITEM(Question question) {
		questionList = new ArrayList<Question>();
		questionList.add(question);
	}

	@Override
	public Question getQuestion() {
		if(questionList != null && questionList.size() > 0) {
			return questionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuestion(Question question) {
		if(questionList == null) {
			questionList = new ArrayList<>();
		}
		if(questionList.size() == 0) {
			questionList.add(question);
		} else {
			questionList.set(0, question);
		}
	}

	@Override
	public List<Question> getQuestionList() {
		return questionList;
	}

	@Override
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
	public boolean hasQuestion() {
		return questionList != null && questionList.size() > 0 && questionList.get(0) != null;
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
