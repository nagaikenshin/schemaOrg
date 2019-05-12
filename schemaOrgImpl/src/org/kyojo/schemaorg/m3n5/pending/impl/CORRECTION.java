package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n5.pending.Container;

public class CORRECTION implements Container.Correction {

	private static final long serialVersionUID = 1L;

	public List<CorrectionComment> correctionCommentList;
	public List<Text> textList;
	public List<URL> urlList;

	public CORRECTION() {
	}

	public CORRECTION(CorrectionComment correctionComment) {
		correctionCommentList = new ArrayList<CorrectionComment>();
		correctionCommentList.add(correctionComment);
	}

	@Override
	public CorrectionComment getCorrectionComment() {
		if(correctionCommentList != null && correctionCommentList.size() > 0) {
			return correctionCommentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCorrectionComment(CorrectionComment correctionComment) {
		if(correctionCommentList == null) {
			correctionCommentList = new ArrayList<>();
		}
		if(correctionCommentList.size() == 0) {
			correctionCommentList.add(correctionComment);
		} else {
			correctionCommentList.set(0, correctionComment);
		}
	}

	@Override
	public List<CorrectionComment> getCorrectionCommentList() {
		return correctionCommentList;
	}

	@Override
	public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList) {
		this.correctionCommentList = correctionCommentList;
	}

	@Override
	public boolean hasCorrectionComment() {
		return correctionCommentList != null && correctionCommentList.size() > 0 && correctionCommentList.get(0) != null;
	}

	public CORRECTION(String string) {
		this(new TEXT(string));
	}

	public CORRECTION(Text text) {
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

	public CORRECTION(URL url) {
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

	public CORRECTION(List<CorrectionComment> correctionCommentList,
			List<Text> textList,
			List<URL> urlList) {
		setCorrectionCommentList(correctionCommentList);
		setTextList(textList);
		setURLList(urlList);
	}

	public void copy(Container.Correction org) {
		setCorrectionCommentList(org.getCorrectionCommentList());
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
