package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Answer;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class ACCEPTED_ANSWER implements Container.AcceptedAnswer {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Answer> answerList;

	public ACCEPTED_ANSWER() {
	}

	public ACCEPTED_ANSWER(String string) {
		this(new ANSWER(string));
	}

	public String getString() {
		if(answerList == null || answerList.size() == 0 || answerList.get(0) == null) {
			return null;
		} else {
			Name name = answerList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(answerList == null) {
			answerList = new ArrayList<Answer>();
		}
		if(answerList.size() == 0) {
			answerList.add(new ANSWER(string));
		} else {
			answerList.set(0, new ANSWER(string));
		}
	}

	public ACCEPTED_ANSWER(Answer answer) {
		answerList = new ArrayList<Answer>();
		answerList.add(answer);
	}

	@Override
	public Answer getAnswer() {
		if(answerList != null && answerList.size() > 0) {
			return answerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnswer(Answer answer) {
		if(answerList == null) {
			answerList = new ArrayList<>();
		}
		if(answerList.size() == 0) {
			answerList.add(answer);
		} else {
			answerList.set(0, answer);
		}
	}

	@Override
	public List<Answer> getAnswerList() {
		return answerList;
	}

	@Override
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}

	@Override
	public boolean hasAnswer() {
		return answerList != null && answerList.size() > 0 && answerList.get(0) != null;
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
