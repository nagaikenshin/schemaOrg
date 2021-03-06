package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.BookingTime;
import org.kyojo.schemaorg.m3n4.core.Container.Broker;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.EndTime;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.ModifiedTime;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PartySize;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.PriceCurrency;
import org.kyojo.schemaorg.m3n4.core.Container.ProgramMembershipUsed;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.ReservationFor;
import org.kyojo.schemaorg.m3n4.core.Container.ReservationId;
import org.kyojo.schemaorg.m3n4.core.Container.ReservationStatus;
import org.kyojo.schemaorg.m3n4.core.Container.ReservedTicket;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.StartTime;
import org.kyojo.schemaorg.m3n4.core.Container.TotalPrice;
import org.kyojo.schemaorg.m3n4.core.Container.UnderName;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class FOOD_ESTABLISHMENT_RESERVATION implements Clazz.FoodEstablishmentReservation {

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
	public BookingTime bookingTime;
	public Broker broker;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EndTime endTime;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public ModifiedTime modifiedTime;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PartySize partySize;
	public PotentialAction potentialAction;
	public PriceCurrency priceCurrency;
	public ProgramMembershipUsed programMembershipUsed;
	public Provider provider;
	public ReservationFor reservationFor;
	public ReservationId reservationId;
	public ReservationStatus reservationStatus;
	public ReservedTicket reservedTicket;
	public SameAs sameAs;
	public StartTime startTime;
	public SubjectOf subjectOf;
	public TotalPrice totalPrice;
	public UnderName underName;
	public Url url;

	public FOOD_ESTABLISHMENT_RESERVATION() {
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Long seq) {
		setSeq(seq);
	}

	public FOOD_ESTABLISHMENT_RESERVATION(String string) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(AdditionalType additionalType) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(AlternateName alternateName) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(BookingTime bookingTime) {
		setBookingTime(bookingTime);
	}

	@Override
	public BookingTime getBookingTime() {
		return bookingTime;
	}

	@Override
	public void setBookingTime(BookingTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Broker broker) {
		setBroker(broker);
	}

	@Override
	public Broker getBroker() {
		return broker;
	}

	@Override
	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Description description) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(DisambiguatingDescription disambiguatingDescription) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(EndTime endTime) {
		setEndTime(endTime);
	}

	@Override
	public EndTime getEndTime() {
		return endTime;
	}

	@Override
	public void setEndTime(EndTime endTime) {
		this.endTime = endTime;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Identifier identifier) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(Image image) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(MainEntityOfPage mainEntityOfPage) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(ModifiedTime modifiedTime) {
		setModifiedTime(modifiedTime);
	}

	@Override
	public ModifiedTime getModifiedTime() {
		return modifiedTime;
	}

	@Override
	public void setModifiedTime(ModifiedTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Name name) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(NameFuzzy nameFuzzy) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(NameRuby nameRuby) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(PartySize partySize) {
		setPartySize(partySize);
	}

	@Override
	public PartySize getPartySize() {
		return partySize;
	}

	@Override
	public void setPartySize(PartySize partySize) {
		this.partySize = partySize;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(PotentialAction potentialAction) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(PriceCurrency priceCurrency) {
		setPriceCurrency(priceCurrency);
	}

	@Override
	public PriceCurrency getPriceCurrency() {
		return priceCurrency;
	}

	@Override
	public void setPriceCurrency(PriceCurrency priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(ProgramMembershipUsed programMembershipUsed) {
		setProgramMembershipUsed(programMembershipUsed);
	}

	@Override
	public ProgramMembershipUsed getProgramMembershipUsed() {
		return programMembershipUsed;
	}

	@Override
	public void setProgramMembershipUsed(ProgramMembershipUsed programMembershipUsed) {
		this.programMembershipUsed = programMembershipUsed;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Provider provider) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(ReservationFor reservationFor) {
		setReservationFor(reservationFor);
	}

	@Override
	public ReservationFor getReservationFor() {
		return reservationFor;
	}

	@Override
	public void setReservationFor(ReservationFor reservationFor) {
		this.reservationFor = reservationFor;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(ReservationId reservationId) {
		setReservationId(reservationId);
	}

	@Override
	public ReservationId getReservationId() {
		return reservationId;
	}

	@Override
	public void setReservationId(ReservationId reservationId) {
		this.reservationId = reservationId;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(ReservationStatus reservationStatus) {
		setReservationStatus(reservationStatus);
	}

	@Override
	public ReservationStatus getReservationStatus() {
		return reservationStatus;
	}

	@Override
	public void setReservationStatus(ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(ReservedTicket reservedTicket) {
		setReservedTicket(reservedTicket);
	}

	@Override
	public ReservedTicket getReservedTicket() {
		return reservedTicket;
	}

	@Override
	public void setReservedTicket(ReservedTicket reservedTicket) {
		this.reservedTicket = reservedTicket;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(SameAs sameAs) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(StartTime startTime) {
		setStartTime(startTime);
	}

	@Override
	public StartTime getStartTime() {
		return startTime;
	}

	@Override
	public void setStartTime(StartTime startTime) {
		this.startTime = startTime;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(SubjectOf subjectOf) {
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

	public FOOD_ESTABLISHMENT_RESERVATION(TotalPrice totalPrice) {
		setTotalPrice(totalPrice);
	}

	@Override
	public TotalPrice getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void setTotalPrice(TotalPrice totalPrice) {
		this.totalPrice = totalPrice;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(UnderName underName) {
		setUnderName(underName);
	}

	@Override
	public UnderName getUnderName() {
		return underName;
	}

	@Override
	public void setUnderName(UnderName underName) {
		this.underName = underName;
	}

	public FOOD_ESTABLISHMENT_RESERVATION(Url url) {
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

	public void copy(Clazz.FoodEstablishmentReservation org) {
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
		setBookingTime(org.getBookingTime());
		setBroker(org.getBroker());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEndTime(org.getEndTime());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setModifiedTime(org.getModifiedTime());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPartySize(org.getPartySize());
		setPotentialAction(org.getPotentialAction());
		setPriceCurrency(org.getPriceCurrency());
		setProgramMembershipUsed(org.getProgramMembershipUsed());
		setProvider(org.getProvider());
		setReservationFor(org.getReservationFor());
		setReservationId(org.getReservationId());
		setReservationStatus(org.getReservationStatus());
		setReservedTicket(org.getReservedTicket());
		setSameAs(org.getSameAs());
		setStartTime(org.getStartTime());
		setSubjectOf(org.getSubjectOf());
		setTotalPrice(org.getTotalPrice());
		setUnderName(org.getUnderName());
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
