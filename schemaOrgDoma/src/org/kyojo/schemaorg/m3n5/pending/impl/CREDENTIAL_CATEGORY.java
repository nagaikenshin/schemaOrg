package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalCode;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CategoryCode;
import org.kyojo.schemaorg.m3n5.pending.Clazz.DefinedTerm;
import org.kyojo.schemaorg.m3n5.pending.Container;

import org.seasar.doma.Transient;

public class CREDENTIAL_CATEGORY implements Container.CredentialCategory {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CategoryCode> categoryCodeList;
	@Transient
	public List<DefinedTerm> definedTermList;
	@Transient
	public List<MedicalCode> medicalCodeList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<URL> urlList;

	public CREDENTIAL_CATEGORY() {
	}

	public CREDENTIAL_CATEGORY(CategoryCode categoryCode) {
		categoryCodeList = new ArrayList<CategoryCode>();
		categoryCodeList.add(categoryCode);
	}

	@Override
	public CategoryCode getCategoryCode() {
		if(categoryCodeList != null && categoryCodeList.size() > 0) {
			return categoryCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCategoryCode(CategoryCode categoryCode) {
		if(categoryCodeList == null) {
			categoryCodeList = new ArrayList<>();
		}
		if(categoryCodeList.size() == 0) {
			categoryCodeList.add(categoryCode);
		} else {
			categoryCodeList.set(0, categoryCode);
		}
	}

	@Override
	public List<CategoryCode> getCategoryCodeList() {
		return categoryCodeList;
	}

	@Override
	public void setCategoryCodeList(List<CategoryCode> categoryCodeList) {
		this.categoryCodeList = categoryCodeList;
	}

	@Override
	public boolean hasCategoryCode() {
		return categoryCodeList != null && categoryCodeList.size() > 0 && categoryCodeList.get(0) != null;
	}

	public CREDENTIAL_CATEGORY(DefinedTerm definedTerm) {
		definedTermList = new ArrayList<DefinedTerm>();
		definedTermList.add(definedTerm);
	}

	@Override
	public DefinedTerm getDefinedTerm() {
		if(definedTermList != null && definedTermList.size() > 0) {
			return definedTermList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTerm(DefinedTerm definedTerm) {
		if(definedTermList == null) {
			definedTermList = new ArrayList<>();
		}
		if(definedTermList.size() == 0) {
			definedTermList.add(definedTerm);
		} else {
			definedTermList.set(0, definedTerm);
		}
	}

	@Override
	public List<DefinedTerm> getDefinedTermList() {
		return definedTermList;
	}

	@Override
	public void setDefinedTermList(List<DefinedTerm> definedTermList) {
		this.definedTermList = definedTermList;
	}

	@Override
	public boolean hasDefinedTerm() {
		return definedTermList != null && definedTermList.size() > 0 && definedTermList.get(0) != null;
	}

	public CREDENTIAL_CATEGORY(MedicalCode medicalCode) {
		medicalCodeList = new ArrayList<MedicalCode>();
		medicalCodeList.add(medicalCode);
	}

	@Override
	public MedicalCode getMedicalCode() {
		if(medicalCodeList != null && medicalCodeList.size() > 0) {
			return medicalCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCode(MedicalCode medicalCode) {
		if(medicalCodeList == null) {
			medicalCodeList = new ArrayList<>();
		}
		if(medicalCodeList.size() == 0) {
			medicalCodeList.add(medicalCode);
		} else {
			medicalCodeList.set(0, medicalCode);
		}
	}

	@Override
	public List<MedicalCode> getMedicalCodeList() {
		return medicalCodeList;
	}

	@Override
	public void setMedicalCodeList(List<MedicalCode> medicalCodeList) {
		this.medicalCodeList = medicalCodeList;
	}

	@Override
	public boolean hasMedicalCode() {
		return medicalCodeList != null && medicalCodeList.size() > 0 && medicalCodeList.get(0) != null;
	}

	public CREDENTIAL_CATEGORY(String string) {
		this(new TEXT(string));
	}

	public CREDENTIAL_CATEGORY(Text text) {
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

	public CREDENTIAL_CATEGORY(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public CREDENTIAL_CATEGORY(List<CategoryCode> categoryCodeList,
			List<DefinedTerm> definedTermList,
			List<MedicalCode> medicalCodeList,
			List<Text> textList,
			List<URL> urlList) {
		setCategoryCodeList(categoryCodeList);
		setDefinedTermList(definedTermList);
		setMedicalCodeList(medicalCodeList);
		setTextList(textList);
		setURLList(urlList);
	}

	public void copy(Container.CredentialCategory org) {
		setCategoryCodeList(org.getCategoryCodeList());
		setDefinedTermList(org.getDefinedTermList());
		setMedicalCodeList(org.getMedicalCodeList());
		setTextList(org.getTextList());
		setURLList(org.getURLList());
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