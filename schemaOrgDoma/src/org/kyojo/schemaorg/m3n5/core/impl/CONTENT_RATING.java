package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmployerAggregateRating;
import org.kyojo.schemaorg.m3n5.core.Clazz.EndorsementRating;
import org.kyojo.schemaorg.m3n5.core.Clazz.Rating;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

import org.seasar.doma.Transient;

public class CONTENT_RATING implements Container.ContentRating {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AggregateRating> aggregateRatingList;
	@Transient
	public List<EmployerAggregateRating> employerAggregateRatingList;
	@Transient
	public List<EndorsementRating> endorsementRatingList;
	@Transient
	public List<Rating> ratingList;
	@Transient
	public List<Text> textList;

	public CONTENT_RATING() {
	}

	public CONTENT_RATING(AggregateRating aggregateRating) {
		aggregateRatingList = new ArrayList<AggregateRating>();
		aggregateRatingList.add(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		if(aggregateRatingList != null && aggregateRatingList.size() > 0) {
			return aggregateRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		if(aggregateRatingList == null) {
			aggregateRatingList = new ArrayList<>();
		}
		if(aggregateRatingList.size() == 0) {
			aggregateRatingList.add(aggregateRating);
		} else {
			aggregateRatingList.set(0, aggregateRating);
		}
	}

	@Override
	public List<AggregateRating> getAggregateRatingList() {
		return aggregateRatingList;
	}

	@Override
	public void setAggregateRatingList(List<AggregateRating> aggregateRatingList) {
		this.aggregateRatingList = aggregateRatingList;
	}

	@Override
	public boolean hasAggregateRating() {
		return aggregateRatingList != null && aggregateRatingList.size() > 0 && aggregateRatingList.get(0) != null;
	}

	public CONTENT_RATING(EmployerAggregateRating employerAggregateRating) {
		employerAggregateRatingList = new ArrayList<EmployerAggregateRating>();
		employerAggregateRatingList.add(employerAggregateRating);
	}

	@Override
	public EmployerAggregateRating getEmployerAggregateRating() {
		if(employerAggregateRatingList != null && employerAggregateRatingList.size() > 0) {
			return employerAggregateRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmployerAggregateRating(EmployerAggregateRating employerAggregateRating) {
		if(employerAggregateRatingList == null) {
			employerAggregateRatingList = new ArrayList<>();
		}
		if(employerAggregateRatingList.size() == 0) {
			employerAggregateRatingList.add(employerAggregateRating);
		} else {
			employerAggregateRatingList.set(0, employerAggregateRating);
		}
	}

	@Override
	public List<EmployerAggregateRating> getEmployerAggregateRatingList() {
		return employerAggregateRatingList;
	}

	@Override
	public void setEmployerAggregateRatingList(List<EmployerAggregateRating> employerAggregateRatingList) {
		this.employerAggregateRatingList = employerAggregateRatingList;
	}

	@Override
	public boolean hasEmployerAggregateRating() {
		return employerAggregateRatingList != null && employerAggregateRatingList.size() > 0 && employerAggregateRatingList.get(0) != null;
	}

	public CONTENT_RATING(EndorsementRating endorsementRating) {
		endorsementRatingList = new ArrayList<EndorsementRating>();
		endorsementRatingList.add(endorsementRating);
	}

	@Override
	public EndorsementRating getEndorsementRating() {
		if(endorsementRatingList != null && endorsementRatingList.size() > 0) {
			return endorsementRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEndorsementRating(EndorsementRating endorsementRating) {
		if(endorsementRatingList == null) {
			endorsementRatingList = new ArrayList<>();
		}
		if(endorsementRatingList.size() == 0) {
			endorsementRatingList.add(endorsementRating);
		} else {
			endorsementRatingList.set(0, endorsementRating);
		}
	}

	@Override
	public List<EndorsementRating> getEndorsementRatingList() {
		return endorsementRatingList;
	}

	@Override
	public void setEndorsementRatingList(List<EndorsementRating> endorsementRatingList) {
		this.endorsementRatingList = endorsementRatingList;
	}

	@Override
	public boolean hasEndorsementRating() {
		return endorsementRatingList != null && endorsementRatingList.size() > 0 && endorsementRatingList.get(0) != null;
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

	public CONTENT_RATING(List<AggregateRating> aggregateRatingList,
			List<EmployerAggregateRating> employerAggregateRatingList,
			List<EndorsementRating> endorsementRatingList,
			List<Rating> ratingList,
			List<Text> textList) {
		setAggregateRatingList(aggregateRatingList);
		setEmployerAggregateRatingList(employerAggregateRatingList);
		setEndorsementRatingList(endorsementRatingList);
		setRatingList(ratingList);
		setTextList(textList);
	}

	public void copy(Container.ContentRating org) {
		setAggregateRatingList(org.getAggregateRatingList());
		setEmployerAggregateRatingList(org.getEmployerAggregateRatingList());
		setEndorsementRatingList(org.getEndorsementRatingList());
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
