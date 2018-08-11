package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ComputerLanguage;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class PROGRAMMING_LANGUAGE implements Container.ProgrammingLanguage {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ComputerLanguage> computerLanguageList;
	@Transient
	public List<Text> textList;

	public PROGRAMMING_LANGUAGE() {
	}

	public PROGRAMMING_LANGUAGE(ComputerLanguage computerLanguage) {
		computerLanguageList = new ArrayList<ComputerLanguage>();
		computerLanguageList.add(computerLanguage);
	}

	@Override
	public ComputerLanguage getComputerLanguage() {
		if(computerLanguageList != null && computerLanguageList.size() > 0) {
			return computerLanguageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComputerLanguage(ComputerLanguage computerLanguage) {
		if(computerLanguageList == null) {
			computerLanguageList = new ArrayList<>();
		}
		if(computerLanguageList.size() == 0) {
			computerLanguageList.add(computerLanguage);
		} else {
			computerLanguageList.set(0, computerLanguage);
		}
	}

	@Override
	public List<ComputerLanguage> getComputerLanguageList() {
		return computerLanguageList;
	}

	@Override
	public void setComputerLanguageList(List<ComputerLanguage> computerLanguageList) {
		this.computerLanguageList = computerLanguageList;
	}

	@Override
	public boolean hasComputerLanguage() {
		return computerLanguageList != null && computerLanguageList.size() > 0 && computerLanguageList.get(0) != null;
	}

	public PROGRAMMING_LANGUAGE(String string) {
		this(new TEXT(string));
	}

	public PROGRAMMING_LANGUAGE(Text text) {
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

	public PROGRAMMING_LANGUAGE(List<ComputerLanguage> computerLanguageList,
			List<Text> textList) {
		setComputerLanguageList(computerLanguageList);
		setTextList(textList);
	}

	public void copy(Container.ProgrammingLanguage org) {
		setComputerLanguageList(org.getComputerLanguageList());
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
