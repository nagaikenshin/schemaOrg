package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.Address;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature;
import org.kyojo.schemaOrg.m3n3.core.Container.BranchCode;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainedInPlace;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainsPlace;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Event;
import org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.Geo;
import org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.HasMap;
import org.kyojo.schemaOrg.m3n3.core.Container.IataCode;
import org.kyojo.schemaOrg.m3n3.core.Container.IcaoCode;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaOrg.m3n3.core.Container.IsicV4;
import org.kyojo.schemaOrg.m3n3.core.Container.Logo;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.OpeningHours;
import org.kyojo.schemaOrg.m3n3.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Photo;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.PublicAccess;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.SmokingAllowed;
import org.kyojo.schemaOrg.m3n3.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Telephone;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyContains;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCoveredBy;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyDisjoint;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyEquals;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyTouches;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyWithin;


public class AIRPORT implements Clazz.Airport {

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
	public AdditionalProperty additionalProperty;
	public AdditionalType additionalType;
	public Address address;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public AmenityFeature amenityFeature;
	public BranchCode branchCode;
	public ContainedInPlace containedInPlace;
	public ContainsPlace containsPlace;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Event event;
	public FaxNumber faxNumber;
	public Geo geo;
	public GeospatiallyContains geospatiallyContains;
	public GeospatiallyCoveredBy geospatiallyCoveredBy;
	public GeospatiallyCovers geospatiallyCovers;
	public GeospatiallyCrosses geospatiallyCrosses;
	public GeospatiallyDisjoint geospatiallyDisjoint;
	public GeospatiallyEquals geospatiallyEquals;
	public GeospatiallyIntersects geospatiallyIntersects;
	public GeospatiallyOverlaps geospatiallyOverlaps;
	public GeospatiallyTouches geospatiallyTouches;
	public GeospatiallyWithin geospatiallyWithin;
	public GlobalLocationNumber globalLocationNumber;
	public HasMap hasMap;
	public IataCode iataCode;
	public IcaoCode icaoCode;
	public Identifier identifier;
	public Image image;
	public IsAccessibleForFree isAccessibleForFree;
	public IsicV4 isicV4;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public MaximumAttendeeCapacity maximumAttendeeCapacity;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OpeningHours openingHours;
	public OpeningHoursSpecification openingHoursSpecification;
	public Photo photo;
	public PotentialAction potentialAction;
	public PublicAccess publicAccess;
	public Review review;
	public SameAs sameAs;
	public SmokingAllowed smokingAllowed;
	public SpecialOpeningHoursSpecification specialOpeningHoursSpecification;
	public Telephone telephone;
	public Url url;

	public AIRPORT() {
	}

	public AIRPORT(Long seq) {
		setSeq(seq);
	}

	public AIRPORT(String string) {
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

	public AIRPORT(AdditionalProperty additionalProperty) {
		setAdditionalProperty(additionalProperty);
	}

	@Override
	public AdditionalProperty getAdditionalProperty() {
		return additionalProperty;
	}

	@Override
	public void setAdditionalProperty(AdditionalProperty additionalProperty) {
		this.additionalProperty = additionalProperty;
	}

	public AIRPORT(AdditionalType additionalType) {
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

	public AIRPORT(Address address) {
		setAddress(address);
	}

	@Override
	public Address getAddress() {
		return address;
	}

	@Override
	public void setAddress(Address address) {
		this.address = address;
	}

	public AIRPORT(AggregateRating aggregateRating) {
		setAggregateRating(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public AIRPORT(AlternateName alternateName) {
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

	public AIRPORT(AmenityFeature amenityFeature) {
		setAmenityFeature(amenityFeature);
	}

	@Override
	public AmenityFeature getAmenityFeature() {
		return amenityFeature;
	}

	@Override
	public void setAmenityFeature(AmenityFeature amenityFeature) {
		this.amenityFeature = amenityFeature;
	}

	public AIRPORT(BranchCode branchCode) {
		setBranchCode(branchCode);
	}

	@Override
	public BranchCode getBranchCode() {
		return branchCode;
	}

	@Override
	public void setBranchCode(BranchCode branchCode) {
		this.branchCode = branchCode;
	}

	public AIRPORT(ContainedInPlace containedInPlace) {
		setContainedInPlace(containedInPlace);
	}

	@Override
	public ContainedInPlace getContainedInPlace() {
		return containedInPlace;
	}

	@Override
	public void setContainedInPlace(ContainedInPlace containedInPlace) {
		this.containedInPlace = containedInPlace;
	}

	public AIRPORT(ContainsPlace containsPlace) {
		setContainsPlace(containsPlace);
	}

	@Override
	public ContainsPlace getContainsPlace() {
		return containsPlace;
	}

	@Override
	public void setContainsPlace(ContainsPlace containsPlace) {
		this.containsPlace = containsPlace;
	}

	public AIRPORT(Description description) {
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

	public AIRPORT(DisambiguatingDescription disambiguatingDescription) {
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

	public AIRPORT(Event event) {
		setEvent(event);
	}

	@Override
	public Event getEvent() {
		return event;
	}

	@Override
	public void setEvent(Event event) {
		this.event = event;
	}

	public AIRPORT(FaxNumber faxNumber) {
		setFaxNumber(faxNumber);
	}

	@Override
	public FaxNumber getFaxNumber() {
		return faxNumber;
	}

	@Override
	public void setFaxNumber(FaxNumber faxNumber) {
		this.faxNumber = faxNumber;
	}

	public AIRPORT(Geo geo) {
		setGeo(geo);
	}

	@Override
	public Geo getGeo() {
		return geo;
	}

	@Override
	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	public AIRPORT(GeospatiallyContains geospatiallyContains) {
		setGeospatiallyContains(geospatiallyContains);
	}

	@Override
	public GeospatiallyContains getGeospatiallyContains() {
		return geospatiallyContains;
	}

	@Override
	public void setGeospatiallyContains(GeospatiallyContains geospatiallyContains) {
		this.geospatiallyContains = geospatiallyContains;
	}

	public AIRPORT(GeospatiallyCoveredBy geospatiallyCoveredBy) {
		setGeospatiallyCoveredBy(geospatiallyCoveredBy);
	}

	@Override
	public GeospatiallyCoveredBy getGeospatiallyCoveredBy() {
		return geospatiallyCoveredBy;
	}

	@Override
	public void setGeospatiallyCoveredBy(GeospatiallyCoveredBy geospatiallyCoveredBy) {
		this.geospatiallyCoveredBy = geospatiallyCoveredBy;
	}

	public AIRPORT(GeospatiallyCovers geospatiallyCovers) {
		setGeospatiallyCovers(geospatiallyCovers);
	}

	@Override
	public GeospatiallyCovers getGeospatiallyCovers() {
		return geospatiallyCovers;
	}

	@Override
	public void setGeospatiallyCovers(GeospatiallyCovers geospatiallyCovers) {
		this.geospatiallyCovers = geospatiallyCovers;
	}

	public AIRPORT(GeospatiallyCrosses geospatiallyCrosses) {
		setGeospatiallyCrosses(geospatiallyCrosses);
	}

	@Override
	public GeospatiallyCrosses getGeospatiallyCrosses() {
		return geospatiallyCrosses;
	}

	@Override
	public void setGeospatiallyCrosses(GeospatiallyCrosses geospatiallyCrosses) {
		this.geospatiallyCrosses = geospatiallyCrosses;
	}

	public AIRPORT(GeospatiallyDisjoint geospatiallyDisjoint) {
		setGeospatiallyDisjoint(geospatiallyDisjoint);
	}

	@Override
	public GeospatiallyDisjoint getGeospatiallyDisjoint() {
		return geospatiallyDisjoint;
	}

	@Override
	public void setGeospatiallyDisjoint(GeospatiallyDisjoint geospatiallyDisjoint) {
		this.geospatiallyDisjoint = geospatiallyDisjoint;
	}

	public AIRPORT(GeospatiallyEquals geospatiallyEquals) {
		setGeospatiallyEquals(geospatiallyEquals);
	}

	@Override
	public GeospatiallyEquals getGeospatiallyEquals() {
		return geospatiallyEquals;
	}

	@Override
	public void setGeospatiallyEquals(GeospatiallyEquals geospatiallyEquals) {
		this.geospatiallyEquals = geospatiallyEquals;
	}

	public AIRPORT(GeospatiallyIntersects geospatiallyIntersects) {
		setGeospatiallyIntersects(geospatiallyIntersects);
	}

	@Override
	public GeospatiallyIntersects getGeospatiallyIntersects() {
		return geospatiallyIntersects;
	}

	@Override
	public void setGeospatiallyIntersects(GeospatiallyIntersects geospatiallyIntersects) {
		this.geospatiallyIntersects = geospatiallyIntersects;
	}

	public AIRPORT(GeospatiallyOverlaps geospatiallyOverlaps) {
		setGeospatiallyOverlaps(geospatiallyOverlaps);
	}

	@Override
	public GeospatiallyOverlaps getGeospatiallyOverlaps() {
		return geospatiallyOverlaps;
	}

	@Override
	public void setGeospatiallyOverlaps(GeospatiallyOverlaps geospatiallyOverlaps) {
		this.geospatiallyOverlaps = geospatiallyOverlaps;
	}

	public AIRPORT(GeospatiallyTouches geospatiallyTouches) {
		setGeospatiallyTouches(geospatiallyTouches);
	}

	@Override
	public GeospatiallyTouches getGeospatiallyTouches() {
		return geospatiallyTouches;
	}

	@Override
	public void setGeospatiallyTouches(GeospatiallyTouches geospatiallyTouches) {
		this.geospatiallyTouches = geospatiallyTouches;
	}

	public AIRPORT(GeospatiallyWithin geospatiallyWithin) {
		setGeospatiallyWithin(geospatiallyWithin);
	}

	@Override
	public GeospatiallyWithin getGeospatiallyWithin() {
		return geospatiallyWithin;
	}

	@Override
	public void setGeospatiallyWithin(GeospatiallyWithin geospatiallyWithin) {
		this.geospatiallyWithin = geospatiallyWithin;
	}

	public AIRPORT(GlobalLocationNumber globalLocationNumber) {
		setGlobalLocationNumber(globalLocationNumber);
	}

	@Override
	public GlobalLocationNumber getGlobalLocationNumber() {
		return globalLocationNumber;
	}

	@Override
	public void setGlobalLocationNumber(GlobalLocationNumber globalLocationNumber) {
		this.globalLocationNumber = globalLocationNumber;
	}

	public AIRPORT(HasMap hasMap) {
		setHasMap(hasMap);
	}

	@Override
	public HasMap getHasMap() {
		return hasMap;
	}

	@Override
	public void setHasMap(HasMap hasMap) {
		this.hasMap = hasMap;
	}

	public AIRPORT(IataCode iataCode) {
		setIataCode(iataCode);
	}

	@Override
	public IataCode getIataCode() {
		return iataCode;
	}

	@Override
	public void setIataCode(IataCode iataCode) {
		this.iataCode = iataCode;
	}

	public AIRPORT(IcaoCode icaoCode) {
		setIcaoCode(icaoCode);
	}

	@Override
	public IcaoCode getIcaoCode() {
		return icaoCode;
	}

	@Override
	public void setIcaoCode(IcaoCode icaoCode) {
		this.icaoCode = icaoCode;
	}

	public AIRPORT(Identifier identifier) {
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

	public AIRPORT(Image image) {
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

	public AIRPORT(IsAccessibleForFree isAccessibleForFree) {
		setIsAccessibleForFree(isAccessibleForFree);
	}

	@Override
	public IsAccessibleForFree getIsAccessibleForFree() {
		return isAccessibleForFree;
	}

	@Override
	public void setIsAccessibleForFree(IsAccessibleForFree isAccessibleForFree) {
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public AIRPORT(IsicV4 isicV4) {
		setIsicV4(isicV4);
	}

	@Override
	public IsicV4 getIsicV4() {
		return isicV4;
	}

	@Override
	public void setIsicV4(IsicV4 isicV4) {
		this.isicV4 = isicV4;
	}

	public AIRPORT(Logo logo) {
		setLogo(logo);
	}

	@Override
	public Logo getLogo() {
		return logo;
	}

	@Override
	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public AIRPORT(MainEntityOfPage mainEntityOfPage) {
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

	public AIRPORT(MaximumAttendeeCapacity maximumAttendeeCapacity) {
		setMaximumAttendeeCapacity(maximumAttendeeCapacity);
	}

	@Override
	public MaximumAttendeeCapacity getMaximumAttendeeCapacity() {
		return maximumAttendeeCapacity;
	}

	@Override
	public void setMaximumAttendeeCapacity(MaximumAttendeeCapacity maximumAttendeeCapacity) {
		this.maximumAttendeeCapacity = maximumAttendeeCapacity;
	}

	public AIRPORT(Name name) {
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

	public AIRPORT(NameFuzzy nameFuzzy) {
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

	public AIRPORT(NameRuby nameRuby) {
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

	public AIRPORT(OpeningHours openingHours) {
		setOpeningHours(openingHours);
	}

	@Override
	public OpeningHours getOpeningHours() {
		return openingHours;
	}

	@Override
	public void setOpeningHours(OpeningHours openingHours) {
		this.openingHours = openingHours;
	}

	public AIRPORT(OpeningHoursSpecification openingHoursSpecification) {
		setOpeningHoursSpecification(openingHoursSpecification);
	}

	@Override
	public OpeningHoursSpecification getOpeningHoursSpecification() {
		return openingHoursSpecification;
	}

	@Override
	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
		this.openingHoursSpecification = openingHoursSpecification;
	}

	public AIRPORT(Photo photo) {
		setPhoto(photo);
	}

	@Override
	public Photo getPhoto() {
		return photo;
	}

	@Override
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public AIRPORT(PotentialAction potentialAction) {
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

	public AIRPORT(PublicAccess publicAccess) {
		setPublicAccess(publicAccess);
	}

	@Override
	public PublicAccess getPublicAccess() {
		return publicAccess;
	}

	@Override
	public void setPublicAccess(PublicAccess publicAccess) {
		this.publicAccess = publicAccess;
	}

	public AIRPORT(Review review) {
		setReview(review);
	}

	@Override
	public Review getReview() {
		return review;
	}

	@Override
	public void setReview(Review review) {
		this.review = review;
	}

	public AIRPORT(SameAs sameAs) {
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

	public AIRPORT(SmokingAllowed smokingAllowed) {
		setSmokingAllowed(smokingAllowed);
	}

	@Override
	public SmokingAllowed getSmokingAllowed() {
		return smokingAllowed;
	}

	@Override
	public void setSmokingAllowed(SmokingAllowed smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}

	public AIRPORT(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
		setSpecialOpeningHoursSpecification(specialOpeningHoursSpecification);
	}

	@Override
	public SpecialOpeningHoursSpecification getSpecialOpeningHoursSpecification() {
		return specialOpeningHoursSpecification;
	}

	@Override
	public void setSpecialOpeningHoursSpecification(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
		this.specialOpeningHoursSpecification = specialOpeningHoursSpecification;
	}

	public AIRPORT(Telephone telephone) {
		setTelephone(telephone);
	}

	@Override
	public Telephone getTelephone() {
		return telephone;
	}

	@Override
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	public AIRPORT(Url url) {
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

	public AIRPORT(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalProperty additionalProperty,
			AdditionalType additionalType,
			Address address,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			AmenityFeature amenityFeature,
			BranchCode branchCode,
			ContainedInPlace containedInPlace,
			ContainsPlace containsPlace,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Event event,
			FaxNumber faxNumber,
			Geo geo,
			GeospatiallyContains geospatiallyContains,
			GeospatiallyCoveredBy geospatiallyCoveredBy,
			GeospatiallyCovers geospatiallyCovers,
			GeospatiallyCrosses geospatiallyCrosses,
			GeospatiallyDisjoint geospatiallyDisjoint,
			GeospatiallyEquals geospatiallyEquals,
			GeospatiallyIntersects geospatiallyIntersects,
			GeospatiallyOverlaps geospatiallyOverlaps,
			GeospatiallyTouches geospatiallyTouches,
			GeospatiallyWithin geospatiallyWithin,
			GlobalLocationNumber globalLocationNumber,
			HasMap hasMap,
			IataCode iataCode,
			IcaoCode icaoCode,
			Identifier identifier,
			Image image,
			IsAccessibleForFree isAccessibleForFree,
			IsicV4 isicV4,
			Logo logo,
			MainEntityOfPage mainEntityOfPage,
			MaximumAttendeeCapacity maximumAttendeeCapacity,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			OpeningHours openingHours,
			OpeningHoursSpecification openingHoursSpecification,
			Photo photo,
			PotentialAction potentialAction,
			PublicAccess publicAccess,
			Review review,
			SameAs sameAs,
			SmokingAllowed smokingAllowed,
			SpecialOpeningHoursSpecification specialOpeningHoursSpecification,
			Telephone telephone,
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
		setAdditionalProperty(additionalProperty);
		setAdditionalType(additionalType);
		setAddress(address);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAmenityFeature(amenityFeature);
		setBranchCode(branchCode);
		setContainedInPlace(containedInPlace);
		setContainsPlace(containsPlace);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setEvent(event);
		setFaxNumber(faxNumber);
		setGeo(geo);
		setGeospatiallyContains(geospatiallyContains);
		setGeospatiallyCoveredBy(geospatiallyCoveredBy);
		setGeospatiallyCovers(geospatiallyCovers);
		setGeospatiallyCrosses(geospatiallyCrosses);
		setGeospatiallyDisjoint(geospatiallyDisjoint);
		setGeospatiallyEquals(geospatiallyEquals);
		setGeospatiallyIntersects(geospatiallyIntersects);
		setGeospatiallyOverlaps(geospatiallyOverlaps);
		setGeospatiallyTouches(geospatiallyTouches);
		setGeospatiallyWithin(geospatiallyWithin);
		setGlobalLocationNumber(globalLocationNumber);
		setHasMap(hasMap);
		setIataCode(iataCode);
		setIcaoCode(icaoCode);
		setIdentifier(identifier);
		setImage(image);
		setIsAccessibleForFree(isAccessibleForFree);
		setIsicV4(isicV4);
		setLogo(logo);
		setMainEntityOfPage(mainEntityOfPage);
		setMaximumAttendeeCapacity(maximumAttendeeCapacity);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOpeningHours(openingHours);
		setOpeningHoursSpecification(openingHoursSpecification);
		setPhoto(photo);
		setPotentialAction(potentialAction);
		setPublicAccess(publicAccess);
		setReview(review);
		setSameAs(sameAs);
		setSmokingAllowed(smokingAllowed);
		setSpecialOpeningHoursSpecification(specialOpeningHoursSpecification);
		setTelephone(telephone);
		setUrl(url);
	}

	public void copy(Clazz.Airport org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalProperty(org.getAdditionalProperty());
		setAdditionalType(org.getAdditionalType());
		setAddress(org.getAddress());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAmenityFeature(org.getAmenityFeature());
		setBranchCode(org.getBranchCode());
		setContainedInPlace(org.getContainedInPlace());
		setContainsPlace(org.getContainsPlace());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEvent(org.getEvent());
		setFaxNumber(org.getFaxNumber());
		setGeo(org.getGeo());
		setGeospatiallyContains(org.getGeospatiallyContains());
		setGeospatiallyCoveredBy(org.getGeospatiallyCoveredBy());
		setGeospatiallyCovers(org.getGeospatiallyCovers());
		setGeospatiallyCrosses(org.getGeospatiallyCrosses());
		setGeospatiallyDisjoint(org.getGeospatiallyDisjoint());
		setGeospatiallyEquals(org.getGeospatiallyEquals());
		setGeospatiallyIntersects(org.getGeospatiallyIntersects());
		setGeospatiallyOverlaps(org.getGeospatiallyOverlaps());
		setGeospatiallyTouches(org.getGeospatiallyTouches());
		setGeospatiallyWithin(org.getGeospatiallyWithin());
		setGlobalLocationNumber(org.getGlobalLocationNumber());
		setHasMap(org.getHasMap());
		setIataCode(org.getIataCode());
		setIcaoCode(org.getIcaoCode());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setIsicV4(org.getIsicV4());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaximumAttendeeCapacity(org.getMaximumAttendeeCapacity());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOpeningHours(org.getOpeningHours());
		setOpeningHoursSpecification(org.getOpeningHoursSpecification());
		setPhoto(org.getPhoto());
		setPotentialAction(org.getPotentialAction());
		setPublicAccess(org.getPublicAccess());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSmokingAllowed(org.getSmokingAllowed());
		setSpecialOpeningHoursSpecification(org.getSpecialOpeningHoursSpecification());
		setTelephone(org.getTelephone());
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
