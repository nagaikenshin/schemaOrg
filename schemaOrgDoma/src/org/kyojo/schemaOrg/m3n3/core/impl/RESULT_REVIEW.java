package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Review;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class RESULT_REVIEW implements Container.ResultReview {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Review> reviewList;
	@Transient
	public List<Thing> thingList;

	public RESULT_REVIEW() {
	}

	public RESULT_REVIEW(String string) {
		this(new REVIEW(string));
	}

	public String getString() {
		if(reviewList == null || reviewList.size() == 0 || reviewList.get(0) == null) {
			return null;
		} else {
			Name name = reviewList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(reviewList == null) {
			reviewList = new ArrayList<Review>();
		}
		if(reviewList.size() == 0) {
			reviewList.add(new REVIEW(string));
		} else {
			reviewList.set(0, new REVIEW(string));
		}
	}

	public RESULT_REVIEW(Review review) {
		reviewList = new ArrayList<Review>();
		reviewList.add(review);
	}

	@Override
	public Review getReview() {
		if(reviewList != null && reviewList.size() > 0) {
			return reviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReview(Review review) {
		if(reviewList == null) {
			reviewList = new ArrayList<>();
		}
		if(reviewList.size() == 0) {
			reviewList.add(review);
		} else {
			reviewList.set(0, review);
		}
	}

	@Override
	public List<Review> getReviewList() {
		return reviewList;
	}

	@Override
	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	@Override
	public boolean hasReview() {
		return reviewList != null && reviewList.size() > 0 && reviewList.get(0) != null;
	}

	public RESULT_REVIEW(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public RESULT_REVIEW(List<Review> reviewList,
			List<Thing> thingList) {
		setReviewList(reviewList);
		setThingList(thingList);
	}

	public void copy(Container.ResultReview org) {
		setReviewList(org.getReviewList());
		setThingList(org.getThingList());
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
