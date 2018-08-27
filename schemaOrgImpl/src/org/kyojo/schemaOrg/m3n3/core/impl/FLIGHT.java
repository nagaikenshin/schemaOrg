package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.Aircraft;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.ArrivalAirport;
import org.kyojo.schemaorg.m3n3.core.Container.ArrivalGate;
import org.kyojo.schemaorg.m3n3.core.Container.ArrivalTerminal;
import org.kyojo.schemaorg.m3n3.core.Container.ArrivalTime;
import org.kyojo.schemaorg.m3n3.core.Container.BoardingPolicy;
import org.kyojo.schemaorg.m3n3.core.Container.DepartureAirport;
import org.kyojo.schemaorg.m3n3.core.Container.DepartureGate;
import org.kyojo.schemaorg.m3n3.core.Container.DepartureTerminal;
import org.kyojo.schemaorg.m3n3.core.Container.DepartureTime;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.EstimatedFlightDuration;
import org.kyojo.schemaorg.m3n3.core.Container.FlightDistance;
import org.kyojo.schemaorg.m3n3.core.Container.FlightNumber;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.MealService;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.Provider;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.Seller;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.Container.WebCheckinTime;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;

public class FLIGHT implements Clazz.Flight {

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
	public Aircraft aircraft;
	public AlternateName alternateName;
	public ArrivalAirport arrivalAirport;
	public ArrivalGate arrivalGate;
	public ArrivalTerminal arrivalTerminal;
	public ArrivalTime arrivalTime;
	public BoardingPolicy boardingPolicy;
	public DepartureAirport departureAirport;
	public DepartureGate departureGate;
	public DepartureTerminal departureTerminal;
	public DepartureTime departureTime;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EstimatedFlightDuration estimatedFlightDuration;
	public FlightDistance flightDistance;
	public FlightNumber flightNumber;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MealService mealService;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public Provider provider;
	public SameAs sameAs;
	public Seller seller;
	public Url url;
	public WebCheckinTime webCheckinTime;

	public FLIGHT() {
	}

	public FLIGHT(Long seq) {
		setSeq(seq);
	}

	public FLIGHT(String string) {
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

	public FLIGHT(AdditionalType additionalType) {
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

	public FLIGHT(Aircraft aircraft) {
		setAircraft(aircraft);
	}

	@Override
	public Aircraft getAircraft() {
		return aircraft;
	}

	@Override
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public FLIGHT(AlternateName alternateName) {
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

	public FLIGHT(ArrivalAirport arrivalAirport) {
		setArrivalAirport(arrivalAirport);
	}

	@Override
	public ArrivalAirport getArrivalAirport() {
		return arrivalAirport;
	}

	@Override
	public void setArrivalAirport(ArrivalAirport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public FLIGHT(ArrivalGate arrivalGate) {
		setArrivalGate(arrivalGate);
	}

	@Override
	public ArrivalGate getArrivalGate() {
		return arrivalGate;
	}

	@Override
	public void setArrivalGate(ArrivalGate arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	public FLIGHT(ArrivalTerminal arrivalTerminal) {
		setArrivalTerminal(arrivalTerminal);
	}

	@Override
	public ArrivalTerminal getArrivalTerminal() {
		return arrivalTerminal;
	}

	@Override
	public void setArrivalTerminal(ArrivalTerminal arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public FLIGHT(ArrivalTime arrivalTime) {
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

	public FLIGHT(BoardingPolicy boardingPolicy) {
		setBoardingPolicy(boardingPolicy);
	}

	@Override
	public BoardingPolicy getBoardingPolicy() {
		return boardingPolicy;
	}

	@Override
	public void setBoardingPolicy(BoardingPolicy boardingPolicy) {
		this.boardingPolicy = boardingPolicy;
	}

	public FLIGHT(DepartureAirport departureAirport) {
		setDepartureAirport(departureAirport);
	}

	@Override
	public DepartureAirport getDepartureAirport() {
		return departureAirport;
	}

	@Override
	public void setDepartureAirport(DepartureAirport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public FLIGHT(DepartureGate departureGate) {
		setDepartureGate(departureGate);
	}

	@Override
	public DepartureGate getDepartureGate() {
		return departureGate;
	}

	@Override
	public void setDepartureGate(DepartureGate departureGate) {
		this.departureGate = departureGate;
	}

	public FLIGHT(DepartureTerminal departureTerminal) {
		setDepartureTerminal(departureTerminal);
	}

	@Override
	public DepartureTerminal getDepartureTerminal() {
		return departureTerminal;
	}

	@Override
	public void setDepartureTerminal(DepartureTerminal departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public FLIGHT(DepartureTime departureTime) {
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

	public FLIGHT(Description description) {
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

	public FLIGHT(DisambiguatingDescription disambiguatingDescription) {
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

	public FLIGHT(EstimatedFlightDuration estimatedFlightDuration) {
		setEstimatedFlightDuration(estimatedFlightDuration);
	}

	@Override
	public EstimatedFlightDuration getEstimatedFlightDuration() {
		return estimatedFlightDuration;
	}

	@Override
	public void setEstimatedFlightDuration(EstimatedFlightDuration estimatedFlightDuration) {
		this.estimatedFlightDuration = estimatedFlightDuration;
	}

	public FLIGHT(FlightDistance flightDistance) {
		setFlightDistance(flightDistance);
	}

	@Override
	public FlightDistance getFlightDistance() {
		return flightDistance;
	}

	@Override
	public void setFlightDistance(FlightDistance flightDistance) {
		this.flightDistance = flightDistance;
	}

	public FLIGHT(FlightNumber flightNumber) {
		setFlightNumber(flightNumber);
	}

	@Override
	public FlightNumber getFlightNumber() {
		return flightNumber;
	}

	@Override
	public void setFlightNumber(FlightNumber flightNumber) {
		this.flightNumber = flightNumber;
	}

	public FLIGHT(Identifier identifier) {
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

	public FLIGHT(Image image) {
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

	public FLIGHT(MainEntityOfPage mainEntityOfPage) {
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

	public FLIGHT(MealService mealService) {
		setMealService(mealService);
	}

	@Override
	public MealService getMealService() {
		return mealService;
	}

	@Override
	public void setMealService(MealService mealService) {
		this.mealService = mealService;
	}

	public FLIGHT(Name name) {
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

	public FLIGHT(NameFuzzy nameFuzzy) {
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

	public FLIGHT(NameRuby nameRuby) {
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

	public FLIGHT(PotentialAction potentialAction) {
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

	public FLIGHT(Provider provider) {
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

	public FLIGHT(SameAs sameAs) {
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

	public FLIGHT(Seller seller) {
		setSeller(seller);
	}

	@Override
	public Seller getSeller() {
		return seller;
	}

	@Override
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public FLIGHT(Url url) {
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

	public FLIGHT(WebCheckinTime webCheckinTime) {
		setWebCheckinTime(webCheckinTime);
	}

	@Override
	public WebCheckinTime getWebCheckinTime() {
		return webCheckinTime;
	}

	@Override
	public void setWebCheckinTime(WebCheckinTime webCheckinTime) {
		this.webCheckinTime = webCheckinTime;
	}

	public FLIGHT(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			Aircraft aircraft,
			AlternateName alternateName,
			ArrivalAirport arrivalAirport,
			ArrivalGate arrivalGate,
			ArrivalTerminal arrivalTerminal,
			ArrivalTime arrivalTime,
			BoardingPolicy boardingPolicy,
			DepartureAirport departureAirport,
			DepartureGate departureGate,
			DepartureTerminal departureTerminal,
			DepartureTime departureTime,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			EstimatedFlightDuration estimatedFlightDuration,
			FlightDistance flightDistance,
			FlightNumber flightNumber,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			MealService mealService,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			Provider provider,
			SameAs sameAs,
			Seller seller,
			Url url,
			WebCheckinTime webCheckinTime) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAdditionalType(additionalType);
		setAircraft(aircraft);
		setAlternateName(alternateName);
		setArrivalAirport(arrivalAirport);
		setArrivalGate(arrivalGate);
		setArrivalTerminal(arrivalTerminal);
		setArrivalTime(arrivalTime);
		setBoardingPolicy(boardingPolicy);
		setDepartureAirport(departureAirport);
		setDepartureGate(departureGate);
		setDepartureTerminal(departureTerminal);
		setDepartureTime(departureTime);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setEstimatedFlightDuration(estimatedFlightDuration);
		setFlightDistance(flightDistance);
		setFlightNumber(flightNumber);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setMealService(mealService);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setProvider(provider);
		setSameAs(sameAs);
		setSeller(seller);
		setUrl(url);
		setWebCheckinTime(webCheckinTime);
	}

	public void copy(Clazz.Flight org) {
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
		setAircraft(org.getAircraft());
		setAlternateName(org.getAlternateName());
		setArrivalAirport(org.getArrivalAirport());
		setArrivalGate(org.getArrivalGate());
		setArrivalTerminal(org.getArrivalTerminal());
		setArrivalTime(org.getArrivalTime());
		setBoardingPolicy(org.getBoardingPolicy());
		setDepartureAirport(org.getDepartureAirport());
		setDepartureGate(org.getDepartureGate());
		setDepartureTerminal(org.getDepartureTerminal());
		setDepartureTime(org.getDepartureTime());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEstimatedFlightDuration(org.getEstimatedFlightDuration());
		setFlightDistance(org.getFlightDistance());
		setFlightNumber(org.getFlightNumber());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMealService(org.getMealService());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setSameAs(org.getSameAs());
		setSeller(org.getSeller());
		setUrl(org.getUrl());
		setWebCheckinTime(org.getWebCheckinTime());
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
