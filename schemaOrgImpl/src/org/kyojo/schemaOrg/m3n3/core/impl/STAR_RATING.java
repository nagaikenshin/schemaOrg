package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Rating;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class STAR_RATING implements Container.StarRating {

	private static final long serialVersionUID = 1L;

	public List<Rating> ratingList;

	public STAR_RATING() {
	}

	public STAR_RATING(String string) {
		this(new RATING(string));
	}

	public String getString() {
		if(ratingList == null || ratingList.size() == 0 || ratingList.get(0) == null) {
			return null;
		} else {
			Name name = ratingList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(ratingList == null) {
			ratingList = new ArrayList<Rating>();
		}
		if(ratingList.size() == 0) {
			ratingList.add(new RATING(string));
		} else {
			ratingList.set(0, new RATING(string));
		}
	}

	public STAR_RATING(Rating rating) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
