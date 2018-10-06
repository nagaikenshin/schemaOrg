package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Author;
import org.kyojo.schemaorg.m3n4.core.Container.BestRating;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.ItemReviewed;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.RatingCount;
import org.kyojo.schemaorg.m3n4.core.Container.RatingValue;
import org.kyojo.schemaorg.m3n4.core.Container.ReviewCount;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.WorstRating;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerAggregateRating;
import org.kyojo.schemaorg.m3n4.pending.Container.ReviewAspect;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

import org.seasar.doma.Transient;

public class AGGREGATE_RATING implements Clazz.AggregateRating, Container.AggregateRating {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public AdditionalType additionalType;
	@Transient
	public List<Clazz.AggregateRating> aggregateRatingList;
	public AlternateName alternateName;
	public Author author;
	public BestRating bestRating;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	@Transient
	public List<EmployerAggregateRating> employerAggregateRatingList;
	public Identifier identifier;
	public Image image;
	public ItemReviewed itemReviewed;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public RatingCount ratingCount;
	public RatingValue ratingValue;
	public ReviewAspect reviewAspect;
	public ReviewCount reviewCount;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public Url url;
	public WorstRating worstRating;

	public AGGREGATE_RATING() {
	}

	public AGGREGATE_RATING(Long seq) {
		setSeq(seq);
	}

	public AGGREGATE_RATING(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public AGGREGATE_RATING(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public AGGREGATE_RATING(Clazz.AggregateRating aggregateRating) {
		aggregateRatingList = new ArrayList<Clazz.AggregateRating>();
		aggregateRatingList.add(aggregateRating);
	}

	@Override
	public Clazz.AggregateRating getAggregateRating() {
		if(aggregateRatingList != null && aggregateRatingList.size() > 0) {
			return aggregateRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAggregateRating(Clazz.AggregateRating aggregateRating) {
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
	public List<Clazz.AggregateRating> getAggregateRatingList() {
		return aggregateRatingList;
	}

	@Override
	public void setAggregateRatingList(List<Clazz.AggregateRating> aggregateRatingList) {
		this.aggregateRatingList = aggregateRatingList;
	}

	@Override
	public boolean hasAggregateRating() {
		return aggregateRatingList != null && aggregateRatingList.size() > 0 && aggregateRatingList.get(0) != null;
	}

	public AGGREGATE_RATING(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public AGGREGATE_RATING(Author author) {
		setAuthor(author);
	}

	@Override
	public Author getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(Author author) {
		this.author = author;
	}

	public AGGREGATE_RATING(BestRating bestRating) {
		setBestRating(bestRating);
	}

	@Override
	public BestRating getBestRating() {
		return bestRating;
	}

	@Override
	public void setBestRating(BestRating bestRating) {
		this.bestRating = bestRating;
	}

	public AGGREGATE_RATING(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public AGGREGATE_RATING(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public AGGREGATE_RATING(EmployerAggregateRating employerAggregateRating) {
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

	public AGGREGATE_RATING(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public AGGREGATE_RATING(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public AGGREGATE_RATING(ItemReviewed itemReviewed) {
		setItemReviewed(itemReviewed);
	}

	@Override
	public ItemReviewed getItemReviewed() {
		return itemReviewed;
	}

	@Override
	public void setItemReviewed(ItemReviewed itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	public AGGREGATE_RATING(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public AGGREGATE_RATING(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public AGGREGATE_RATING(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public AGGREGATE_RATING(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public AGGREGATE_RATING(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public AGGREGATE_RATING(RatingCount ratingCount) {
		setRatingCount(ratingCount);
	}

	@Override
	public RatingCount getRatingCount() {
		return ratingCount;
	}

	@Override
	public void setRatingCount(RatingCount ratingCount) {
		this.ratingCount = ratingCount;
	}

	public AGGREGATE_RATING(RatingValue ratingValue) {
		setRatingValue(ratingValue);
	}

	@Override
	public RatingValue getRatingValue() {
		return ratingValue;
	}

	@Override
	public void setRatingValue(RatingValue ratingValue) {
		this.ratingValue = ratingValue;
	}

	public AGGREGATE_RATING(ReviewAspect reviewAspect) {
		setReviewAspect(reviewAspect);
	}

	@Override
	public ReviewAspect getReviewAspect() {
		return reviewAspect;
	}

	@Override
	public void setReviewAspect(ReviewAspect reviewAspect) {
		this.reviewAspect = reviewAspect;
	}

	public AGGREGATE_RATING(ReviewCount reviewCount) {
		setReviewCount(reviewCount);
	}

	@Override
	public ReviewCount getReviewCount() {
		return reviewCount;
	}

	@Override
	public void setReviewCount(ReviewCount reviewCount) {
		this.reviewCount = reviewCount;
	}

	public AGGREGATE_RATING(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public AGGREGATE_RATING(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public AGGREGATE_RATING(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public AGGREGATE_RATING(WorstRating worstRating) {
		setWorstRating(worstRating);
	}

	@Override
	public WorstRating getWorstRating() {
		return worstRating;
	}

	@Override
	public void setWorstRating(WorstRating worstRating) {
		this.worstRating = worstRating;
	}

	public void copy(Clazz.AggregateRating org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalType(org.getAdditionalType());
		setAlternateName(org.getAlternateName());
		setAuthor(org.getAuthor());
		setBestRating(org.getBestRating());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setItemReviewed(org.getItemReviewed());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setRatingCount(org.getRatingCount());
		setRatingValue(org.getRatingValue());
		setReviewAspect(org.getReviewAspect());
		setReviewCount(org.getReviewCount());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setUrl(org.getUrl());
		setWorstRating(org.getWorstRating());
	}

	public void copy(Container.AggregateRating org) {
		setAggregateRatingList(org.getAggregateRatingList());
		setEmployerAggregateRatingList(org.getEmployerAggregateRatingList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
