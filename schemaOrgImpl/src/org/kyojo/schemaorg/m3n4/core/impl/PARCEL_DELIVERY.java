package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.DeliveryAddress;
import org.kyojo.schemaorg.m3n4.core.Container.DeliveryStatus;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.ExpectedArrivalFrom;
import org.kyojo.schemaorg.m3n4.core.Container.ExpectedArrivalUntil;
import org.kyojo.schemaorg.m3n4.core.Container.HasDeliveryMethod;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.ItemShipped;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.OriginAddress;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfOrder;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.TrackingNumber;
import org.kyojo.schemaorg.m3n4.core.Container.TrackingUrl;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class PARCEL_DELIVERY implements Clazz.ParcelDelivery {

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
	public DeliveryAddress deliveryAddress;
	public DeliveryStatus deliveryStatus;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public ExpectedArrivalFrom expectedArrivalFrom;
	public ExpectedArrivalUntil expectedArrivalUntil;
	public HasDeliveryMethod hasDeliveryMethod;
	public Identifier identifier;
	public Image image;
	public ItemShipped itemShipped;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OriginAddress originAddress;
	public PartOfOrder partOfOrder;
	public PotentialAction potentialAction;
	public Provider provider;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public TrackingNumber trackingNumber;
	public TrackingUrl trackingUrl;
	public Url url;

	public PARCEL_DELIVERY() {
	}

	public PARCEL_DELIVERY(Long seq) {
		setSeq(seq);
	}

	public PARCEL_DELIVERY(String string) {
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

	public PARCEL_DELIVERY(AdditionalType additionalType) {
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

	public PARCEL_DELIVERY(AlternateName alternateName) {
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

	public PARCEL_DELIVERY(DeliveryAddress deliveryAddress) {
		setDeliveryAddress(deliveryAddress);
	}

	@Override
	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	@Override
	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public PARCEL_DELIVERY(DeliveryStatus deliveryStatus) {
		setDeliveryStatus(deliveryStatus);
	}

	@Override
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	@Override
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public PARCEL_DELIVERY(Description description) {
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

	public PARCEL_DELIVERY(DisambiguatingDescription disambiguatingDescription) {
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

	public PARCEL_DELIVERY(ExpectedArrivalFrom expectedArrivalFrom) {
		setExpectedArrivalFrom(expectedArrivalFrom);
	}

	@Override
	public ExpectedArrivalFrom getExpectedArrivalFrom() {
		return expectedArrivalFrom;
	}

	@Override
	public void setExpectedArrivalFrom(ExpectedArrivalFrom expectedArrivalFrom) {
		this.expectedArrivalFrom = expectedArrivalFrom;
	}

	public PARCEL_DELIVERY(ExpectedArrivalUntil expectedArrivalUntil) {
		setExpectedArrivalUntil(expectedArrivalUntil);
	}

	@Override
	public ExpectedArrivalUntil getExpectedArrivalUntil() {
		return expectedArrivalUntil;
	}

	@Override
	public void setExpectedArrivalUntil(ExpectedArrivalUntil expectedArrivalUntil) {
		this.expectedArrivalUntil = expectedArrivalUntil;
	}

	public PARCEL_DELIVERY(HasDeliveryMethod hasDeliveryMethod) {
		setHasDeliveryMethod(hasDeliveryMethod);
	}

	@Override
	public HasDeliveryMethod getHasDeliveryMethod() {
		return hasDeliveryMethod;
	}

	@Override
	public void setHasDeliveryMethod(HasDeliveryMethod hasDeliveryMethod) {
		this.hasDeliveryMethod = hasDeliveryMethod;
	}

	public PARCEL_DELIVERY(Identifier identifier) {
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

	public PARCEL_DELIVERY(Image image) {
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

	public PARCEL_DELIVERY(ItemShipped itemShipped) {
		setItemShipped(itemShipped);
	}

	@Override
	public ItemShipped getItemShipped() {
		return itemShipped;
	}

	@Override
	public void setItemShipped(ItemShipped itemShipped) {
		this.itemShipped = itemShipped;
	}

	public PARCEL_DELIVERY(MainEntityOfPage mainEntityOfPage) {
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

	public PARCEL_DELIVERY(Name name) {
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

	public PARCEL_DELIVERY(NameFuzzy nameFuzzy) {
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

	public PARCEL_DELIVERY(NameRuby nameRuby) {
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

	public PARCEL_DELIVERY(OriginAddress originAddress) {
		setOriginAddress(originAddress);
	}

	@Override
	public OriginAddress getOriginAddress() {
		return originAddress;
	}

	@Override
	public void setOriginAddress(OriginAddress originAddress) {
		this.originAddress = originAddress;
	}

	public PARCEL_DELIVERY(PartOfOrder partOfOrder) {
		setPartOfOrder(partOfOrder);
	}

	@Override
	public PartOfOrder getPartOfOrder() {
		return partOfOrder;
	}

	@Override
	public void setPartOfOrder(PartOfOrder partOfOrder) {
		this.partOfOrder = partOfOrder;
	}

	public PARCEL_DELIVERY(PotentialAction potentialAction) {
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

	public PARCEL_DELIVERY(Provider provider) {
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

	public PARCEL_DELIVERY(SameAs sameAs) {
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

	public PARCEL_DELIVERY(SubjectOf subjectOf) {
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

	public PARCEL_DELIVERY(TrackingNumber trackingNumber) {
		setTrackingNumber(trackingNumber);
	}

	@Override
	public TrackingNumber getTrackingNumber() {
		return trackingNumber;
	}

	@Override
	public void setTrackingNumber(TrackingNumber trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public PARCEL_DELIVERY(TrackingUrl trackingUrl) {
		setTrackingUrl(trackingUrl);
	}

	@Override
	public TrackingUrl getTrackingUrl() {
		return trackingUrl;
	}

	@Override
	public void setTrackingUrl(TrackingUrl trackingUrl) {
		this.trackingUrl = trackingUrl;
	}

	public PARCEL_DELIVERY(Url url) {
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

	public PARCEL_DELIVERY(Long seq,
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
			DeliveryAddress deliveryAddress,
			DeliveryStatus deliveryStatus,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			ExpectedArrivalFrom expectedArrivalFrom,
			ExpectedArrivalUntil expectedArrivalUntil,
			HasDeliveryMethod hasDeliveryMethod,
			Identifier identifier,
			Image image,
			ItemShipped itemShipped,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			OriginAddress originAddress,
			PartOfOrder partOfOrder,
			PotentialAction potentialAction,
			Provider provider,
			SameAs sameAs,
			SubjectOf subjectOf,
			TrackingNumber trackingNumber,
			TrackingUrl trackingUrl,
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
		setDeliveryAddress(deliveryAddress);
		setDeliveryStatus(deliveryStatus);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setExpectedArrivalFrom(expectedArrivalFrom);
		setExpectedArrivalUntil(expectedArrivalUntil);
		setHasDeliveryMethod(hasDeliveryMethod);
		setIdentifier(identifier);
		setImage(image);
		setItemShipped(itemShipped);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOriginAddress(originAddress);
		setPartOfOrder(partOfOrder);
		setPotentialAction(potentialAction);
		setProvider(provider);
		setSameAs(sameAs);
		setSubjectOf(subjectOf);
		setTrackingNumber(trackingNumber);
		setTrackingUrl(trackingUrl);
		setUrl(url);
	}

	public void copy(Clazz.ParcelDelivery org) {
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
		setDeliveryAddress(org.getDeliveryAddress());
		setDeliveryStatus(org.getDeliveryStatus());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setExpectedArrivalFrom(org.getExpectedArrivalFrom());
		setExpectedArrivalUntil(org.getExpectedArrivalUntil());
		setHasDeliveryMethod(org.getHasDeliveryMethod());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setItemShipped(org.getItemShipped());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOriginAddress(org.getOriginAddress());
		setPartOfOrder(org.getPartOfOrder());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setTrackingNumber(org.getTrackingNumber());
		setTrackingUrl(org.getTrackingUrl());
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
