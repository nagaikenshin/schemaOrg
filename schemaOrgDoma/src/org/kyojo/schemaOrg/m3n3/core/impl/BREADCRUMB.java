package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.BreadcrumbList;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class BREADCRUMB implements Container.Breadcrumb {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BreadcrumbList> breadcrumbListList;
	@Transient
	public List<Text> textList;

	public BREADCRUMB() {
	}

	public BREADCRUMB(BreadcrumbList breadcrumbList) {
		breadcrumbListList = new ArrayList<BreadcrumbList>();
		breadcrumbListList.add(breadcrumbList);
	}

	@Override
	public BreadcrumbList getBreadcrumbList() {
		if(breadcrumbListList != null && breadcrumbListList.size() > 0) {
			return breadcrumbListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBreadcrumbList(BreadcrumbList breadcrumbList) {
		if(breadcrumbListList == null) {
			breadcrumbListList = new ArrayList<>();
		}
		if(breadcrumbListList.size() == 0) {
			breadcrumbListList.add(breadcrumbList);
		} else {
			breadcrumbListList.set(0, breadcrumbList);
		}
	}

	@Override
	public List<BreadcrumbList> getBreadcrumbListList() {
		return breadcrumbListList;
	}

	@Override
	public void setBreadcrumbListList(List<BreadcrumbList> breadcrumbListList) {
		this.breadcrumbListList = breadcrumbListList;
	}

	@Override
	public boolean hasBreadcrumbList() {
		return breadcrumbListList != null && breadcrumbListList.size() > 0 && breadcrumbListList.get(0) != null;
	}

	public BREADCRUMB(String string) {
		this(new TEXT(string));
	}

	public BREADCRUMB(Text text) {
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

	public BREADCRUMB(List<BreadcrumbList> breadcrumbListList,
			List<Text> textList) {
		setBreadcrumbListList(breadcrumbListList);
		setTextList(textList);
	}

	public void copy(Container.Breadcrumb org) {
		setBreadcrumbListList(org.getBreadcrumbListList());
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
