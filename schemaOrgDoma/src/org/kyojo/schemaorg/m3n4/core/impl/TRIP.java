package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalTime;
import org.kyojo.schemaorg.m3n4.core.Container.DepartureTime;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.HasPart;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.Offers;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.Itinerary;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class TRIP implements Clazz.Trip {

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
	public AlternateName alternateName;
	public ArrivalTime arrivalTime;
	public DepartureTime departureTime;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HasPart hasPart;
	public Identifier identifier;
	public Image image;
	public IsPartOf isPartOf;
	public Itinerary itinerary;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PotentialAction potentialAction;
	public Provider provider;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public Url url;

	public TRIP() {
	}

	public TRIP(Long seq) {
		setSeq(seq);
	}

	public TRIP(String string) {
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

	public TRIP(AdditionalType additionalType) {
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

	public TRIP(AlternateName alternateName) {
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

	public TRIP(ArrivalTime arrivalTime) {
		setArrivalTime(arrivalTime);
	}

	@Override
	public ArrivalTime getArrivalTime() {
		return arrivalTime;
	}

	@Override
	public void setArrivalTime(ArrivalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public TRIP(DepartureTime departureTime) {
		setDepartureTime(departureTime);
	}

	@Override
	public DepartureTime getDepartureTime() {
		return departureTime;
	}

	@Override
	public void setDepartureTime(DepartureTime departureTime) {
		this.departureTime = departureTime;
	}

	public TRIP(Description description) {
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

	public TRIP(DisambiguatingDescription disambiguatingDescription) {
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

	public TRIP(HasPart hasPart) {
		setHasPart(hasPart);
	}

	@Override
	public HasPart getHasPart() {
		return hasPart;
	}

	@Override
	public void setHasPart(HasPart hasPart) {
		this.hasPart = hasPart;
	}

	public TRIP(Identifier identifier) {
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

	public TRIP(Image image) {
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

	public TRIP(IsPartOf isPartOf) {
		setIsPartOf(isPartOf);
	}

	@Override
	public IsPartOf getIsPartOf() {
		return isPartOf;
	}

	@Override
	public void setIsPartOf(IsPartOf isPartOf) {
		this.isPartOf = isPartOf;
	}

	public TRIP(Itinerary itinerary) {
		setItinerary(itinerary);
	}

	@Override
	public Itinerary getItinerary() {
		return itinerary;
	}

	@Override
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}

	public TRIP(MainEntityOfPage mainEntityOfPage) {
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

	public TRIP(Name name) {
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

	public TRIP(NameFuzzy nameFuzzy) {
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

	public TRIP(NameRuby nameRuby) {
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

	public TRIP(Offers offers) {
		setOffers(offers);
	}

	@Override
	public Offers getOffers() {
		return offers;
	}

	@Override
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public TRIP(PotentialAction potentialAction) {
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

	public TRIP(Provider provider) {
		setProvider(provider);
	}

	@Override
	public Provider getProvider() {
		return provider;
	}

	@Override
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public TRIP(SameAs sameAs) {
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

	public TRIP(SubjectOf subjectOf) {
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

	public TRIP(Url url) {
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

	public void copy(Clazz.Trip org) {
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
		setArrivalTime(org.getArrivalTime());
		setDepartureTime(org.getDepartureTime());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHasPart(org.getHasPart());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsPartOf(org.getIsPartOf());
		setItinerary(org.getItinerary());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setUrl(org.getUrl());
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
