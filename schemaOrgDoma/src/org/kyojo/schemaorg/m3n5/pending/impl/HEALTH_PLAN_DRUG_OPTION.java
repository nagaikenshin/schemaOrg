package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Container;

import org.seasar.doma.Transient;

public class HEALTH_PLAN_DRUG_OPTION implements Container.HealthPlanDrugOption {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Text> textList;

	public HEALTH_PLAN_DRUG_OPTION() {
	}

	public HEALTH_PLAN_DRUG_OPTION(String string) {
		this(new TEXT(string));
	}

	public HEALTH_PLAN_DRUG_OPTION(Text text) {
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
