package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class TRAIN_NUMBER implements Container.TrainNumber {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Text> textList;

	public TRAIN_NUMBER() {
	}

	public TRAIN_NUMBER(String string) {
		this(new TEXT(string));
	}

	public TRAIN_NUMBER(Text text) {
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
