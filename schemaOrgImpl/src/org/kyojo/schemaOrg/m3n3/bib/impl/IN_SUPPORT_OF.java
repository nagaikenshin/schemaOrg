package org.kyojo.schemaOrg.m3n3.bib.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.bib.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class IN_SUPPORT_OF implements Container.InSupportOf {

	private static final long serialVersionUID = 1L;

	public List<Text> textList;

	public IN_SUPPORT_OF() {
	}

	public IN_SUPPORT_OF(String string) {
		this(new TEXT(string));
	}

	public IN_SUPPORT_OF(Text text) {
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