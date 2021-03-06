package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalPlatform;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalStation;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalTime;
import org.kyojo.schemaorg.m3n5.core.Container.DeparturePlatform;
import org.kyojo.schemaorg.m3n5.core.Container.DepartureStation;
import org.kyojo.schemaorg.m3n5.core.Container.DepartureTime;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.Provider;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.TrainName;
import org.kyojo.schemaorg.m3n5.core.Container.TrainNumber;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Container.Itinerary;
import org.kyojo.schemaorg.m3n5.pending.Container.PartOfTrip;
import org.kyojo.schemaorg.m3n5.pending.Container.SubTrip;


public class TRAIN_TRIP implements Clazz.TrainTrip {

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
	public ArrivalPlatform arrivalPlatform;
	public ArrivalStation arrivalStation;
	public ArrivalTime arrivalTime;
	public DeparturePlatform departurePlatform;
	public DepartureStation departureStation;
	public DepartureTime departureTime;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Identifier identifier;
	public Image image;
	public Itinerary itinerary;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PartOfTrip partOfTrip;
	public PotentialAction potentialAction;
	public Provider provider;
	public SameAs sameAs;
	public SubTrip subTrip;
	public SubjectOf subjectOf;
	public TrainName trainName;
	public TrainNumber trainNumber;
	public Url url;

	public TRAIN_TRIP() {
	}

	public TRAIN_TRIP(Long seq) {
		setSeq(seq);
	}

	public TRAIN_TRIP(String string) {
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

	public TRAIN_TRIP(AdditionalType additionalType) {
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

	public TRAIN_TRIP(AlternateName alternateName) {
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

	public TRAIN_TRIP(ArrivalPlatform arrivalPlatform) {
		setArrivalPlatform(arrivalPlatform);
	}

	@Override
	public ArrivalPlatform getArrivalPlatform() {
		return arrivalPlatform;
	}

	@Override
	public void setArrivalPlatform(ArrivalPlatform arrivalPlatform) {
		this.arrivalPlatform = arrivalPlatform;
	}

	public TRAIN_TRIP(ArrivalStation arrivalStation) {
		setArrivalStation(arrivalStation);
	}

	@Override
	public ArrivalStation getArrivalStation() {
		return arrivalStation;
	}

	@Override
	public void setArrivalStation(ArrivalStation arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public TRAIN_TRIP(ArrivalTime arrivalTime) {
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

	public TRAIN_TRIP(DeparturePlatform departurePlatform) {
		setDeparturePlatform(departurePlatform);
	}

	@Override
	public DeparturePlatform getDeparturePlatform() {
		return departurePlatform;
	}

	@Override
	public void setDeparturePlatform(DeparturePlatform departurePlatform) {
		this.departurePlatform = departurePlatform;
	}

	public TRAIN_TRIP(DepartureStation departureStation) {
		setDepartureStation(departureStation);
	}

	@Override
	public DepartureStation getDepartureStation() {
		return departureStation;
	}

	@Override
	public void setDepartureStation(DepartureStation departureStation) {
		this.departureStation = departureStation;
	}

	public TRAIN_TRIP(DepartureTime departureTime) {
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

	public TRAIN_TRIP(Description description) {
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

	public TRAIN_TRIP(DisambiguatingDescription disambiguatingDescription) {
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

	public TRAIN_TRIP(Identifier identifier) {
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

	public TRAIN_TRIP(Image image) {
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

	public TRAIN_TRIP(Itinerary itinerary) {
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

	public TRAIN_TRIP(MainEntityOfPage mainEntityOfPage) {
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

	public TRAIN_TRIP(Name name) {
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

	public TRAIN_TRIP(NameFuzzy nameFuzzy) {
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

	public TRAIN_TRIP(NameRuby nameRuby) {
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

	public TRAIN_TRIP(Offers offers) {
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

	public TRAIN_TRIP(PartOfTrip partOfTrip) {
		setPartOfTrip(partOfTrip);
	}

	@Override
	public PartOfTrip getPartOfTrip() {
		return partOfTrip;
	}

	@Override
	public void setPartOfTrip(PartOfTrip partOfTrip) {
		this.partOfTrip = partOfTrip;
	}

	public TRAIN_TRIP(PotentialAction potentialAction) {
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

	public TRAIN_TRIP(Provider provider) {
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

	public TRAIN_TRIP(SameAs sameAs) {
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

	public TRAIN_TRIP(SubTrip subTrip) {
		setSubTrip(subTrip);
	}

	@Override
	public SubTrip getSubTrip() {
		return subTrip;
	}

	@Override
	public void setSubTrip(SubTrip subTrip) {
		this.subTrip = subTrip;
	}

	public TRAIN_TRIP(SubjectOf subjectOf) {
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

	public TRAIN_TRIP(TrainName trainName) {
		setTrainName(trainName);
	}

	@Override
	public TrainName getTrainName() {
		return trainName;
	}

	@Override
	public void setTrainName(TrainName trainName) {
		this.trainName = trainName;
	}

	public TRAIN_TRIP(TrainNumber trainNumber) {
		setTrainNumber(trainNumber);
	}

	@Override
	public TrainNumber getTrainNumber() {
		return trainNumber;
	}

	@Override
	public void setTrainNumber(TrainNumber trainNumber) {
		this.trainNumber = trainNumber;
	}

	public TRAIN_TRIP(Url url) {
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

	public void copy(Clazz.TrainTrip org) {
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
		setArrivalPlatform(org.getArrivalPlatform());
		setArrivalStation(org.getArrivalStation());
		setArrivalTime(org.getArrivalTime());
		setDeparturePlatform(org.getDeparturePlatform());
		setDepartureStation(org.getDepartureStation());
		setDepartureTime(org.getDepartureTime());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setItinerary(org.getItinerary());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPartOfTrip(org.getPartOfTrip());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setSameAs(org.getSameAs());
		setSubTrip(org.getSubTrip());
		setSubjectOf(org.getSubjectOf());
		setTrainName(org.getTrainName());
		setTrainNumber(org.getTrainNumber());
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
