package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.BookingTime;
import org.kyojo.schemaorg.m3n3.core.Container.Broker;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.DropoffLocation;
import org.kyojo.schemaorg.m3n3.core.Container.DropoffTime;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.ModifiedTime;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.PickupLocation;
import org.kyojo.schemaorg.m3n3.core.Container.PickupTime;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.PriceCurrency;
import org.kyojo.schemaorg.m3n3.core.Container.ProgramMembershipUsed;
import org.kyojo.schemaorg.m3n3.core.Container.Provider;
import org.kyojo.schemaorg.m3n3.core.Container.ReservationFor;
import org.kyojo.schemaorg.m3n3.core.Container.ReservationId;
import org.kyojo.schemaorg.m3n3.core.Container.ReservationStatus;
import org.kyojo.schemaorg.m3n3.core.Container.ReservedTicket;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.TotalPrice;
import org.kyojo.schemaorg.m3n3.core.Container.UnderName;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;


public class RENTAL_CAR_RESERVATION implements Clazz.RentalCarReservation {

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
	public DropoffLocation dropoffLocation;
	public DropoffTime dropoffTime;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public ModifiedTime modifiedTime;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PickupLocation pickupLocation;
	public PickupTime pickupTime;
	public PotentialAction potentialAction;
	public PriceCurrency priceCurrency;
	public ProgramMembershipUsed programMembershipUsed;
	public Provider provider;
	public ReservationFor reservationFor;
	public ReservationId reservationId;
	public ReservationStatus reservationStatus;
	public ReservedTicket reservedTicket;
	public SameAs sameAs;
	public TotalPrice totalPrice;
	public UnderName underName;
	public Url url;

	public RENTAL_CAR_RESERVATION() {
	}

	public RENTAL_CAR_RESERVATION(Long seq) {
		setSeq(seq);
	}

	public RENTAL_CAR_RESERVATION(String string) {
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

	public RENTAL_CAR_RESERVATION(AdditionalType additionalType) {
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

	public RENTAL_CAR_RESERVATION(AlternateName alternateName) {
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

	public RENTAL_CAR_RESERVATION(BookingTime bookingTime) {
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

	public RENTAL_CAR_RESERVATION(Broker broker) {
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

	public RENTAL_CAR_RESERVATION(Description description) {
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

	public RENTAL_CAR_RESERVATION(DisambiguatingDescription disambiguatingDescription) {
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

	public RENTAL_CAR_RESERVATION(DropoffLocation dropoffLocation) {
		setDropoffLocation(dropoffLocation);
	}

	@Override
	public DropoffLocation getDropoffLocation() {
		return dropoffLocation;
	}

	@Override
	public void setDropoffLocation(DropoffLocation dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}

	public RENTAL_CAR_RESERVATION(DropoffTime dropoffTime) {
		setDropoffTime(dropoffTime);
	}

	@Override
	public DropoffTime getDropoffTime() {
		return dropoffTime;
	}

	@Override
	public void setDropoffTime(DropoffTime dropoffTime) {
		this.dropoffTime = dropoffTime;
	}

	public RENTAL_CAR_RESERVATION(Identifier identifier) {
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

	public RENTAL_CAR_RESERVATION(Image image) {
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

	public RENTAL_CAR_RESERVATION(MainEntityOfPage mainEntityOfPage) {
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

	public RENTAL_CAR_RESERVATION(ModifiedTime modifiedTime) {
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

	public RENTAL_CAR_RESERVATION(Name name) {
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

	public RENTAL_CAR_RESERVATION(NameFuzzy nameFuzzy) {
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

	public RENTAL_CAR_RESERVATION(NameRuby nameRuby) {
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

	public RENTAL_CAR_RESERVATION(PickupLocation pickupLocation) {
		setPickupLocation(pickupLocation);
	}

	@Override
	public PickupLocation getPickupLocation() {
		return pickupLocation;
	}

	@Override
	public void setPickupLocation(PickupLocation pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public RENTAL_CAR_RESERVATION(PickupTime pickupTime) {
		setPickupTime(pickupTime);
	}

	@Override
	public PickupTime getPickupTime() {
		return pickupTime;
	}

	@Override
	public void setPickupTime(PickupTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public RENTAL_CAR_RESERVATION(PotentialAction potentialAction) {
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

	public RENTAL_CAR_RESERVATION(PriceCurrency priceCurrency) {
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

	public RENTAL_CAR_RESERVATION(ProgramMembershipUsed programMembershipUsed) {
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

	public RENTAL_CAR_RESERVATION(Provider provider) {
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

	public RENTAL_CAR_RESERVATION(ReservationFor reservationFor) {
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

	public RENTAL_CAR_RESERVATION(ReservationId reservationId) {
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

	public RENTAL_CAR_RESERVATION(ReservationStatus reservationStatus) {
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

	public RENTAL_CAR_RESERVATION(ReservedTicket reservedTicket) {
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

	public RENTAL_CAR_RESERVATION(SameAs sameAs) {
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

	public RENTAL_CAR_RESERVATION(TotalPrice totalPrice) {
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

	public RENTAL_CAR_RESERVATION(UnderName underName) {
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

	public RENTAL_CAR_RESERVATION(Url url) {
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

	public RENTAL_CAR_RESERVATION(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AlternateName alternateName,
			BookingTime bookingTime,
			Broker broker,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DropoffLocation dropoffLocation,
			DropoffTime dropoffTime,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			ModifiedTime modifiedTime,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PickupLocation pickupLocation,
			PickupTime pickupTime,
			PotentialAction potentialAction,
			PriceCurrency priceCurrency,
			ProgramMembershipUsed programMembershipUsed,
			Provider provider,
			ReservationFor reservationFor,
			ReservationId reservationId,
			ReservationStatus reservationStatus,
			ReservedTicket reservedTicket,
			SameAs sameAs,
			TotalPrice totalPrice,
			UnderName underName,
			Url url) {
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
		setAlternateName(alternateName);
		setBookingTime(bookingTime);
		setBroker(broker);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDropoffLocation(dropoffLocation);
		setDropoffTime(dropoffTime);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setModifiedTime(modifiedTime);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPickupLocation(pickupLocation);
		setPickupTime(pickupTime);
		setPotentialAction(potentialAction);
		setPriceCurrency(priceCurrency);
		setProgramMembershipUsed(programMembershipUsed);
		setProvider(provider);
		setReservationFor(reservationFor);
		setReservationId(reservationId);
		setReservationStatus(reservationStatus);
		setReservedTicket(reservedTicket);
		setSameAs(sameAs);
		setTotalPrice(totalPrice);
		setUnderName(underName);
		setUrl(url);
	}

	public void copy(Clazz.RentalCarReservation org) {
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
		setDropoffLocation(org.getDropoffLocation());
		setDropoffTime(org.getDropoffTime());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setModifiedTime(org.getModifiedTime());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPickupLocation(org.getPickupLocation());
		setPickupTime(org.getPickupTime());
		setPotentialAction(org.getPotentialAction());
		setPriceCurrency(org.getPriceCurrency());
		setProgramMembershipUsed(org.getProgramMembershipUsed());
		setProvider(org.getProvider());
		setReservationFor(org.getReservationFor());
		setReservationId(org.getReservationId());
		setReservationStatus(org.getReservationStatus());
		setReservedTicket(org.getReservedTicket());
		setSameAs(org.getSameAs());
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
