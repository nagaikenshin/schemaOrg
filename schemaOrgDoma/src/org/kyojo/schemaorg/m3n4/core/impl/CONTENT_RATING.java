package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Rating;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

import org.seasar.doma.Transient;

public class CONTENT_RATING implements Container.ContentRating {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Rating> ratingList;
	@Transient
	public List<Text> textList;

	public CONTENT_RATING() {
	}

	public CONTENT_RATING(Rating rating) {
		ratingList = new ArrayList<Rating>();
		ratingList.add(rating);
	}

	@Override
	public Rating getRating() {
		if(ratingList != null && ratingList.size() > 0) {
			return ratingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRating(Rating rating) {
		if(ratingList == null) {
			ratingList = new ArrayList<>();
		}
		if(ratingList.size() == 0) {
			ratingList.add(rating);
		} else {
			ratingList.set(0, rating);
		}
	}

	@Override
	public List<Rating> getRatingList() {
		return ratingList;
	}

	@Override
	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}

	@Override
	public boolean hasRating() {
		return ratingList != null && ratingList.size() > 0 && ratingList.get(0) != null;
	}

	public CONTENT_RATING(String string) {
		this(new TEXT(string));
	}

	public CONTENT_RATING(Text text) {
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

	public CONTENT_RATING(List<Rating> ratingList,
			List<Text> textList) {
		setRatingList(ratingList);
		setTextList(textList);
	}

	public void copy(Container.ContentRating org) {
		setRatingList(org.getRatingList());
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
