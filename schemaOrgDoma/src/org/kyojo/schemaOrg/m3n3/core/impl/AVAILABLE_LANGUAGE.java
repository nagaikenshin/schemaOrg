package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Language;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class AVAILABLE_LANGUAGE implements Container.AvailableLanguage {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Language> languageList;
	@Transient
	public List<Text> textList;

	public AVAILABLE_LANGUAGE() {
	}

	public AVAILABLE_LANGUAGE(Language language) {
		languageList = new ArrayList<Language>();
		languageList.add(language);
	}

	@Override
	public Language getLanguage() {
		if(languageList != null && languageList.size() > 0) {
			return languageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLanguage(Language language) {
		if(languageList == null) {
			languageList = new ArrayList<>();
		}
		if(languageList.size() == 0) {
			languageList.add(language);
		} else {
			languageList.set(0, language);
		}
	}

	@Override
	public List<Language> getLanguageList() {
		return languageList;
	}

	@Override
	public void setLanguageList(List<Language> languageList) {
		this.languageList = languageList;
	}

	@Override
	public boolean hasLanguage() {
		return languageList != null && languageList.size() > 0 && languageList.get(0) != null;
	}

	public AVAILABLE_LANGUAGE(String string) {
		this(new TEXT(string));
	}

	public AVAILABLE_LANGUAGE(Text text) {
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

	public AVAILABLE_LANGUAGE(List<Language> languageList,
			List<Text> textList) {
		setLanguageList(languageList);
		setTextList(textList);
	}

	public void copy(Container.AvailableLanguage org) {
		setLanguageList(org.getLanguageList());
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
