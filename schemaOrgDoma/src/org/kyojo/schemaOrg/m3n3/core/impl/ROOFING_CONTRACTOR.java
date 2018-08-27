package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.Address;
import org.kyojo.schemaorg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.Alumni;
import org.kyojo.schemaorg.m3n3.core.Container.AmenityFeature;
import org.kyojo.schemaorg.m3n3.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n3.core.Container.Award;
import org.kyojo.schemaorg.m3n3.core.Container.BranchCode;
import org.kyojo.schemaorg.m3n3.core.Container.Brand;
import org.kyojo.schemaorg.m3n3.core.Container.ContactPoint;
import org.kyojo.schemaorg.m3n3.core.Container.ContainedInPlace;
import org.kyojo.schemaorg.m3n3.core.Container.ContainsPlace;
import org.kyojo.schemaorg.m3n3.core.Container.CurrenciesAccepted;
import org.kyojo.schemaorg.m3n3.core.Container.Department;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.DissolutionDate;
import org.kyojo.schemaorg.m3n3.core.Container.Duns;
import org.kyojo.schemaorg.m3n3.core.Container.Email;
import org.kyojo.schemaorg.m3n3.core.Container.Employee;
import org.kyojo.schemaorg.m3n3.core.Container.Event;
import org.kyojo.schemaorg.m3n3.core.Container.FaxNumber;
import org.kyojo.schemaorg.m3n3.core.Container.Founder;
import org.kyojo.schemaorg.m3n3.core.Container.FoundingDate;
import org.kyojo.schemaorg.m3n3.core.Container.FoundingLocation;
import org.kyojo.schemaorg.m3n3.core.Container.Funder;
import org.kyojo.schemaorg.m3n3.core.Container.Geo;
import org.kyojo.schemaorg.m3n3.core.Container.GlobalLocationNumber;
import org.kyojo.schemaorg.m3n3.core.Container.HasMap;
import org.kyojo.schemaorg.m3n3.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n3.core.Container.HasPOS;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n3.core.Container.IsicV4;
import org.kyojo.schemaorg.m3n3.core.Container.LegalName;
import org.kyojo.schemaorg.m3n3.core.Container.LeiCode;
import org.kyojo.schemaorg.m3n3.core.Container.Location;
import org.kyojo.schemaorg.m3n3.core.Container.Logo;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.MakesOffer;
import org.kyojo.schemaorg.m3n3.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaorg.m3n3.core.Container.Member;
import org.kyojo.schemaorg.m3n3.core.Container.MemberOf;
import org.kyojo.schemaorg.m3n3.core.Container.Naics;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.NumberOfEmployees;
import org.kyojo.schemaorg.m3n3.core.Container.OpeningHours;
import org.kyojo.schemaorg.m3n3.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n3.core.Container.Owns;
import org.kyojo.schemaorg.m3n3.core.Container.ParentOrganization;
import org.kyojo.schemaorg.m3n3.core.Container.PaymentAccepted;
import org.kyojo.schemaorg.m3n3.core.Container.Photo;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.PriceRange;
import org.kyojo.schemaorg.m3n3.core.Container.PublicAccess;
import org.kyojo.schemaorg.m3n3.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n3.core.Container.Review;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.Seeks;
import org.kyojo.schemaorg.m3n3.core.Container.SmokingAllowed;
import org.kyojo.schemaorg.m3n3.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaorg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n3.core.Container.SubOrganization;
import org.kyojo.schemaorg.m3n3.core.Container.TaxID;
import org.kyojo.schemaorg.m3n3.core.Container.Telephone;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.Container.VatID;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;
import org.kyojo.schemaorg.m3n3.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaorg.m3n3.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaorg.m3n3.pending.Container.DiversityPolicy;
import org.kyojo.schemaorg.m3n3.pending.Container.EthicsPolicy;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyContains;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyCoveredBy;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyDisjoint;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyEquals;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyTouches;
import org.kyojo.schemaorg.m3n3.pending.Container.GeospatiallyWithin;
import org.kyojo.schemaorg.m3n3.pending.Container.UnnamedSourcesPolicy;


public class ROOFING_CONTRACTOR implements Clazz.RoofingContractor {

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
	public ActionableFeedbackPolicy actionableFeedbackPolicy;
	public AdditionalProperty additionalProperty;
	public AdditionalType additionalType;
	public Address address;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public Alumni alumni;
	public AmenityFeature amenityFeature;
	public AreaServed areaServed;
	public Award award;
	public BranchCode branchCode;
	public Brand brand;
	public ContactPoint contactPoint;
	public ContainedInPlace containedInPlace;
	public ContainsPlace containsPlace;
	public CorrectionsPolicy correctionsPolicy;
	public CurrenciesAccepted currenciesAccepted;
	public Department department;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DissolutionDate dissolutionDate;
	public DiversityPolicy diversityPolicy;
	public Duns duns;
	public Email email;
	public Employee employee;
	public EthicsPolicy ethicsPolicy;
	public Event event;
	public FaxNumber faxNumber;
	public Founder founder;
	public FoundingDate foundingDate;
	public FoundingLocation foundingLocation;
	public Funder funder;
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
	public HasOfferCatalog hasOfferCatalog;
	public HasPOS hasPOS;
	public Identifier identifier;
	public Image image;
	public IsAccessibleForFree isAccessibleForFree;
	public IsicV4 isicV4;
	public LegalName legalName;
	public LeiCode leiCode;
	public Location location;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public MakesOffer makesOffer;
	public MaximumAttendeeCapacity maximumAttendeeCapacity;
	public Member member;
	public MemberOf memberOf;
	public Naics naics;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NumberOfEmployees numberOfEmployees;
	public OpeningHours openingHours;
	public OpeningHoursSpecification openingHoursSpecification;
	public Owns owns;
	public ParentOrganization parentOrganization;
	public PaymentAccepted paymentAccepted;
	public Photo photo;
	public PotentialAction potentialAction;
	public PriceRange priceRange;
	public PublicAccess publicAccess;
	public PublishingPrinciples publishingPrinciples;
	public Review review;
	public SameAs sameAs;
	public Seeks seeks;
	public SmokingAllowed smokingAllowed;
	public SpecialOpeningHoursSpecification specialOpeningHoursSpecification;
	public Sponsor sponsor;
	public SubOrganization subOrganization;
	public TaxID taxID;
	public Telephone telephone;
	public UnnamedSourcesPolicy unnamedSourcesPolicy;
	public Url url;
	public VatID vatID;

	public ROOFING_CONTRACTOR() {
	}

	public ROOFING_CONTRACTOR(Long seq) {
		setSeq(seq);
	}

	public ROOFING_CONTRACTOR(String string) {
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

	public ROOFING_CONTRACTOR(ActionableFeedbackPolicy actionableFeedbackPolicy) {
		setActionableFeedbackPolicy(actionableFeedbackPolicy);
	}

	@Override
	public ActionableFeedbackPolicy getActionableFeedbackPolicy() {
		return actionableFeedbackPolicy;
	}

	@Override
	public void setActionableFeedbackPolicy(ActionableFeedbackPolicy actionableFeedbackPolicy) {
		this.actionableFeedbackPolicy = actionableFeedbackPolicy;
	}

	public ROOFING_CONTRACTOR(AdditionalProperty additionalProperty) {
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

	public ROOFING_CONTRACTOR(AdditionalType additionalType) {
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

	public ROOFING_CONTRACTOR(Address address) {
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

	public ROOFING_CONTRACTOR(AggregateRating aggregateRating) {
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

	public ROOFING_CONTRACTOR(AlternateName alternateName) {
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

	public ROOFING_CONTRACTOR(Alumni alumni) {
		setAlumni(alumni);
	}

	@Override
	public Alumni getAlumni() {
		return alumni;
	}

	@Override
	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

	public ROOFING_CONTRACTOR(AmenityFeature amenityFeature) {
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

	public ROOFING_CONTRACTOR(AreaServed areaServed) {
		setAreaServed(areaServed);
	}

	@Override
	public AreaServed getAreaServed() {
		return areaServed;
	}

	@Override
	public void setAreaServed(AreaServed areaServed) {
		this.areaServed = areaServed;
	}

	public ROOFING_CONTRACTOR(Award award) {
		setAward(award);
	}

	@Override
	public Award getAward() {
		return award;
	}

	@Override
	public void setAward(Award award) {
		this.award = award;
	}

	public ROOFING_CONTRACTOR(BranchCode branchCode) {
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

	public ROOFING_CONTRACTOR(Brand brand) {
		setBrand(brand);
	}

	@Override
	public Brand getBrand() {
		return brand;
	}

	@Override
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ROOFING_CONTRACTOR(ContactPoint contactPoint) {
		setContactPoint(contactPoint);
	}

	@Override
	public ContactPoint getContactPoint() {
		return contactPoint;
	}

	@Override
	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	public ROOFING_CONTRACTOR(ContainedInPlace containedInPlace) {
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

	public ROOFING_CONTRACTOR(ContainsPlace containsPlace) {
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

	public ROOFING_CONTRACTOR(CorrectionsPolicy correctionsPolicy) {
		setCorrectionsPolicy(correctionsPolicy);
	}

	@Override
	public CorrectionsPolicy getCorrectionsPolicy() {
		return correctionsPolicy;
	}

	@Override
	public void setCorrectionsPolicy(CorrectionsPolicy correctionsPolicy) {
		this.correctionsPolicy = correctionsPolicy;
	}

	public ROOFING_CONTRACTOR(CurrenciesAccepted currenciesAccepted) {
		setCurrenciesAccepted(currenciesAccepted);
	}

	@Override
	public CurrenciesAccepted getCurrenciesAccepted() {
		return currenciesAccepted;
	}

	@Override
	public void setCurrenciesAccepted(CurrenciesAccepted currenciesAccepted) {
		this.currenciesAccepted = currenciesAccepted;
	}

	public ROOFING_CONTRACTOR(Department department) {
		setDepartment(department);
	}

	@Override
	public Department getDepartment() {
		return department;
	}

	@Override
	public void setDepartment(Department department) {
		this.department = department;
	}

	public ROOFING_CONTRACTOR(Description description) {
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

	public ROOFING_CONTRACTOR(DisambiguatingDescription disambiguatingDescription) {
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

	public ROOFING_CONTRACTOR(DissolutionDate dissolutionDate) {
		setDissolutionDate(dissolutionDate);
	}

	@Override
	public DissolutionDate getDissolutionDate() {
		return dissolutionDate;
	}

	@Override
	public void setDissolutionDate(DissolutionDate dissolutionDate) {
		this.dissolutionDate = dissolutionDate;
	}

	public ROOFING_CONTRACTOR(DiversityPolicy diversityPolicy) {
		setDiversityPolicy(diversityPolicy);
	}

	@Override
	public DiversityPolicy getDiversityPolicy() {
		return diversityPolicy;
	}

	@Override
	public void setDiversityPolicy(DiversityPolicy diversityPolicy) {
		this.diversityPolicy = diversityPolicy;
	}

	public ROOFING_CONTRACTOR(Duns duns) {
		setDuns(duns);
	}

	@Override
	public Duns getDuns() {
		return duns;
	}

	@Override
	public void setDuns(Duns duns) {
		this.duns = duns;
	}

	public ROOFING_CONTRACTOR(Email email) {
		setEmail(email);
	}

	@Override
	public Email getEmail() {
		return email;
	}

	@Override
	public void setEmail(Email email) {
		this.email = email;
	}

	public ROOFING_CONTRACTOR(Employee employee) {
		setEmployee(employee);
	}

	@Override
	public Employee getEmployee() {
		return employee;
	}

	@Override
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ROOFING_CONTRACTOR(EthicsPolicy ethicsPolicy) {
		setEthicsPolicy(ethicsPolicy);
	}

	@Override
	public EthicsPolicy getEthicsPolicy() {
		return ethicsPolicy;
	}

	@Override
	public void setEthicsPolicy(EthicsPolicy ethicsPolicy) {
		this.ethicsPolicy = ethicsPolicy;
	}

	public ROOFING_CONTRACTOR(Event event) {
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

	public ROOFING_CONTRACTOR(FaxNumber faxNumber) {
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

	public ROOFING_CONTRACTOR(Founder founder) {
		setFounder(founder);
	}

	@Override
	public Founder getFounder() {
		return founder;
	}

	@Override
	public void setFounder(Founder founder) {
		this.founder = founder;
	}

	public ROOFING_CONTRACTOR(FoundingDate foundingDate) {
		setFoundingDate(foundingDate);
	}

	@Override
	public FoundingDate getFoundingDate() {
		return foundingDate;
	}

	@Override
	public void setFoundingDate(FoundingDate foundingDate) {
		this.foundingDate = foundingDate;
	}

	public ROOFING_CONTRACTOR(FoundingLocation foundingLocation) {
		setFoundingLocation(foundingLocation);
	}

	@Override
	public FoundingLocation getFoundingLocation() {
		return foundingLocation;
	}

	@Override
	public void setFoundingLocation(FoundingLocation foundingLocation) {
		this.foundingLocation = foundingLocation;
	}

	public ROOFING_CONTRACTOR(Funder funder) {
		setFunder(funder);
	}

	@Override
	public Funder getFunder() {
		return funder;
	}

	@Override
	public void setFunder(Funder funder) {
		this.funder = funder;
	}

	public ROOFING_CONTRACTOR(Geo geo) {
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

	public ROOFING_CONTRACTOR(GeospatiallyContains geospatiallyContains) {
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

	public ROOFING_CONTRACTOR(GeospatiallyCoveredBy geospatiallyCoveredBy) {
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

	public ROOFING_CONTRACTOR(GeospatiallyCovers geospatiallyCovers) {
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

	public ROOFING_CONTRACTOR(GeospatiallyCrosses geospatiallyCrosses) {
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

	public ROOFING_CONTRACTOR(GeospatiallyDisjoint geospatiallyDisjoint) {
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

	public ROOFING_CONTRACTOR(GeospatiallyEquals geospatiallyEquals) {
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

	public ROOFING_CONTRACTOR(GeospatiallyIntersects geospatiallyIntersects) {
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

	public ROOFING_CONTRACTOR(GeospatiallyOverlaps geospatiallyOverlaps) {
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

	public ROOFING_CONTRACTOR(GeospatiallyTouches geospatiallyTouches) {
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

	public ROOFING_CONTRACTOR(GeospatiallyWithin geospatiallyWithin) {
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

	public ROOFING_CONTRACTOR(GlobalLocationNumber globalLocationNumber) {
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

	public ROOFING_CONTRACTOR(HasMap hasMap) {
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

	public ROOFING_CONTRACTOR(HasOfferCatalog hasOfferCatalog) {
		setHasOfferCatalog(hasOfferCatalog);
	}

	@Override
	public HasOfferCatalog getHasOfferCatalog() {
		return hasOfferCatalog;
	}

	@Override
	public void setHasOfferCatalog(HasOfferCatalog hasOfferCatalog) {
		this.hasOfferCatalog = hasOfferCatalog;
	}

	public ROOFING_CONTRACTOR(HasPOS hasPOS) {
		setHasPOS(hasPOS);
	}

	@Override
	public HasPOS getHasPOS() {
		return hasPOS;
	}

	@Override
	public void setHasPOS(HasPOS hasPOS) {
		this.hasPOS = hasPOS;
	}

	public ROOFING_CONTRACTOR(Identifier identifier) {
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

	public ROOFING_CONTRACTOR(Image image) {
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

	public ROOFING_CONTRACTOR(IsAccessibleForFree isAccessibleForFree) {
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

	public ROOFING_CONTRACTOR(IsicV4 isicV4) {
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

	public ROOFING_CONTRACTOR(LegalName legalName) {
		setLegalName(legalName);
	}

	@Override
	public LegalName getLegalName() {
		return legalName;
	}

	@Override
	public void setLegalName(LegalName legalName) {
		this.legalName = legalName;
	}

	public ROOFING_CONTRACTOR(LeiCode leiCode) {
		setLeiCode(leiCode);
	}

	@Override
	public LeiCode getLeiCode() {
		return leiCode;
	}

	@Override
	public void setLeiCode(LeiCode leiCode) {
		this.leiCode = leiCode;
	}

	public ROOFING_CONTRACTOR(Location location) {
		setLocation(location);
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;
	}

	public ROOFING_CONTRACTOR(Logo logo) {
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

	public ROOFING_CONTRACTOR(MainEntityOfPage mainEntityOfPage) {
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

	public ROOFING_CONTRACTOR(MakesOffer makesOffer) {
		setMakesOffer(makesOffer);
	}

	@Override
	public MakesOffer getMakesOffer() {
		return makesOffer;
	}

	@Override
	public void setMakesOffer(MakesOffer makesOffer) {
		this.makesOffer = makesOffer;
	}

	public ROOFING_CONTRACTOR(MaximumAttendeeCapacity maximumAttendeeCapacity) {
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

	public ROOFING_CONTRACTOR(Member member) {
		setMember(member);
	}

	@Override
	public Member getMember() {
		return member;
	}

	@Override
	public void setMember(Member member) {
		this.member = member;
	}

	public ROOFING_CONTRACTOR(MemberOf memberOf) {
		setMemberOf(memberOf);
	}

	@Override
	public MemberOf getMemberOf() {
		return memberOf;
	}

	@Override
	public void setMemberOf(MemberOf memberOf) {
		this.memberOf = memberOf;
	}

	public ROOFING_CONTRACTOR(Naics naics) {
		setNaics(naics);
	}

	@Override
	public Naics getNaics() {
		return naics;
	}

	@Override
	public void setNaics(Naics naics) {
		this.naics = naics;
	}

	public ROOFING_CONTRACTOR(Name name) {
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

	public ROOFING_CONTRACTOR(NameFuzzy nameFuzzy) {
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

	public ROOFING_CONTRACTOR(NameRuby nameRuby) {
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

	public ROOFING_CONTRACTOR(NumberOfEmployees numberOfEmployees) {
		setNumberOfEmployees(numberOfEmployees);
	}

	@Override
	public NumberOfEmployees getNumberOfEmployees() {
		return numberOfEmployees;
	}

	@Override
	public void setNumberOfEmployees(NumberOfEmployees numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public ROOFING_CONTRACTOR(OpeningHours openingHours) {
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

	public ROOFING_CONTRACTOR(OpeningHoursSpecification openingHoursSpecification) {
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

	public ROOFING_CONTRACTOR(Owns owns) {
		setOwns(owns);
	}

	@Override
	public Owns getOwns() {
		return owns;
	}

	@Override
	public void setOwns(Owns owns) {
		this.owns = owns;
	}

	public ROOFING_CONTRACTOR(ParentOrganization parentOrganization) {
		setParentOrganization(parentOrganization);
	}

	@Override
	public ParentOrganization getParentOrganization() {
		return parentOrganization;
	}

	@Override
	public void setParentOrganization(ParentOrganization parentOrganization) {
		this.parentOrganization = parentOrganization;
	}

	public ROOFING_CONTRACTOR(PaymentAccepted paymentAccepted) {
		setPaymentAccepted(paymentAccepted);
	}

	@Override
	public PaymentAccepted getPaymentAccepted() {
		return paymentAccepted;
	}

	@Override
	public void setPaymentAccepted(PaymentAccepted paymentAccepted) {
		this.paymentAccepted = paymentAccepted;
	}

	public ROOFING_CONTRACTOR(Photo photo) {
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

	public ROOFING_CONTRACTOR(PotentialAction potentialAction) {
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

	public ROOFING_CONTRACTOR(PriceRange priceRange) {
		setPriceRange(priceRange);
	}

	@Override
	public PriceRange getPriceRange() {
		return priceRange;
	}

	@Override
	public void setPriceRange(PriceRange priceRange) {
		this.priceRange = priceRange;
	}

	public ROOFING_CONTRACTOR(PublicAccess publicAccess) {
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

	public ROOFING_CONTRACTOR(PublishingPrinciples publishingPrinciples) {
		setPublishingPrinciples(publishingPrinciples);
	}

	@Override
	public PublishingPrinciples getPublishingPrinciples() {
		return publishingPrinciples;
	}

	@Override
	public void setPublishingPrinciples(PublishingPrinciples publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}

	public ROOFING_CONTRACTOR(Review review) {
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

	public ROOFING_CONTRACTOR(SameAs sameAs) {
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

	public ROOFING_CONTRACTOR(Seeks seeks) {
		setSeeks(seeks);
	}

	@Override
	public Seeks getSeeks() {
		return seeks;
	}

	@Override
	public void setSeeks(Seeks seeks) {
		this.seeks = seeks;
	}

	public ROOFING_CONTRACTOR(SmokingAllowed smokingAllowed) {
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

	public ROOFING_CONTRACTOR(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
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

	public ROOFING_CONTRACTOR(Sponsor sponsor) {
		setSponsor(sponsor);
	}

	@Override
	public Sponsor getSponsor() {
		return sponsor;
	}

	@Override
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public ROOFING_CONTRACTOR(SubOrganization subOrganization) {
		setSubOrganization(subOrganization);
	}

	@Override
	public SubOrganization getSubOrganization() {
		return subOrganization;
	}

	@Override
	public void setSubOrganization(SubOrganization subOrganization) {
		this.subOrganization = subOrganization;
	}

	public ROOFING_CONTRACTOR(TaxID taxID) {
		setTaxID(taxID);
	}

	@Override
	public TaxID getTaxID() {
		return taxID;
	}

	@Override
	public void setTaxID(TaxID taxID) {
		this.taxID = taxID;
	}

	public ROOFING_CONTRACTOR(Telephone telephone) {
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

	public ROOFING_CONTRACTOR(UnnamedSourcesPolicy unnamedSourcesPolicy) {
		setUnnamedSourcesPolicy(unnamedSourcesPolicy);
	}

	@Override
	public UnnamedSourcesPolicy getUnnamedSourcesPolicy() {
		return unnamedSourcesPolicy;
	}

	@Override
	public void setUnnamedSourcesPolicy(UnnamedSourcesPolicy unnamedSourcesPolicy) {
		this.unnamedSourcesPolicy = unnamedSourcesPolicy;
	}

	public ROOFING_CONTRACTOR(Url url) {
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

	public ROOFING_CONTRACTOR(VatID vatID) {
		setVatID(vatID);
	}

	@Override
	public VatID getVatID() {
		return vatID;
	}

	@Override
	public void setVatID(VatID vatID) {
		this.vatID = vatID;
	}

	public ROOFING_CONTRACTOR(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			ActionableFeedbackPolicy actionableFeedbackPolicy,
			AdditionalProperty additionalProperty,
			AdditionalType additionalType,
			Address address,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			Alumni alumni,
			AmenityFeature amenityFeature,
			AreaServed areaServed,
			Award award,
			BranchCode branchCode,
			Brand brand,
			ContactPoint contactPoint,
			ContainedInPlace containedInPlace,
			ContainsPlace containsPlace,
			CorrectionsPolicy correctionsPolicy,
			CurrenciesAccepted currenciesAccepted,
			Department department,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DissolutionDate dissolutionDate,
			DiversityPolicy diversityPolicy,
			Duns duns,
			Email email,
			Employee employee,
			EthicsPolicy ethicsPolicy,
			Event event,
			FaxNumber faxNumber,
			Founder founder,
			FoundingDate foundingDate,
			FoundingLocation foundingLocation,
			Funder funder,
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
			HasOfferCatalog hasOfferCatalog,
			HasPOS hasPOS,
			Identifier identifier,
			Image image,
			IsAccessibleForFree isAccessibleForFree,
			IsicV4 isicV4,
			LegalName legalName,
			LeiCode leiCode,
			Location location,
			Logo logo,
			MainEntityOfPage mainEntityOfPage,
			MakesOffer makesOffer,
			MaximumAttendeeCapacity maximumAttendeeCapacity,
			Member member,
			MemberOf memberOf,
			Naics naics,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NumberOfEmployees numberOfEmployees,
			OpeningHours openingHours,
			OpeningHoursSpecification openingHoursSpecification,
			Owns owns,
			ParentOrganization parentOrganization,
			PaymentAccepted paymentAccepted,
			Photo photo,
			PotentialAction potentialAction,
			PriceRange priceRange,
			PublicAccess publicAccess,
			PublishingPrinciples publishingPrinciples,
			Review review,
			SameAs sameAs,
			Seeks seeks,
			SmokingAllowed smokingAllowed,
			SpecialOpeningHoursSpecification specialOpeningHoursSpecification,
			Sponsor sponsor,
			SubOrganization subOrganization,
			TaxID taxID,
			Telephone telephone,
			UnnamedSourcesPolicy unnamedSourcesPolicy,
			Url url,
			VatID vatID) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setActionableFeedbackPolicy(actionableFeedbackPolicy);
		setAdditionalProperty(additionalProperty);
		setAdditionalType(additionalType);
		setAddress(address);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAlumni(alumni);
		setAmenityFeature(amenityFeature);
		setAreaServed(areaServed);
		setAward(award);
		setBranchCode(branchCode);
		setBrand(brand);
		setContactPoint(contactPoint);
		setContainedInPlace(containedInPlace);
		setContainsPlace(containsPlace);
		setCorrectionsPolicy(correctionsPolicy);
		setCurrenciesAccepted(currenciesAccepted);
		setDepartment(department);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDissolutionDate(dissolutionDate);
		setDiversityPolicy(diversityPolicy);
		setDuns(duns);
		setEmail(email);
		setEmployee(employee);
		setEthicsPolicy(ethicsPolicy);
		setEvent(event);
		setFaxNumber(faxNumber);
		setFounder(founder);
		setFoundingDate(foundingDate);
		setFoundingLocation(foundingLocation);
		setFunder(funder);
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
		setHasOfferCatalog(hasOfferCatalog);
		setHasPOS(hasPOS);
		setIdentifier(identifier);
		setImage(image);
		setIsAccessibleForFree(isAccessibleForFree);
		setIsicV4(isicV4);
		setLegalName(legalName);
		setLeiCode(leiCode);
		setLocation(location);
		setLogo(logo);
		setMainEntityOfPage(mainEntityOfPage);
		setMakesOffer(makesOffer);
		setMaximumAttendeeCapacity(maximumAttendeeCapacity);
		setMember(member);
		setMemberOf(memberOf);
		setNaics(naics);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNumberOfEmployees(numberOfEmployees);
		setOpeningHours(openingHours);
		setOpeningHoursSpecification(openingHoursSpecification);
		setOwns(owns);
		setParentOrganization(parentOrganization);
		setPaymentAccepted(paymentAccepted);
		setPhoto(photo);
		setPotentialAction(potentialAction);
		setPriceRange(priceRange);
		setPublicAccess(publicAccess);
		setPublishingPrinciples(publishingPrinciples);
		setReview(review);
		setSameAs(sameAs);
		setSeeks(seeks);
		setSmokingAllowed(smokingAllowed);
		setSpecialOpeningHoursSpecification(specialOpeningHoursSpecification);
		setSponsor(sponsor);
		setSubOrganization(subOrganization);
		setTaxID(taxID);
		setTelephone(telephone);
		setUnnamedSourcesPolicy(unnamedSourcesPolicy);
		setUrl(url);
		setVatID(vatID);
	}

	public void copy(Clazz.RoofingContractor org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setActionableFeedbackPolicy(org.getActionableFeedbackPolicy());
		setAdditionalProperty(org.getAdditionalProperty());
		setAdditionalType(org.getAdditionalType());
		setAddress(org.getAddress());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAlumni(org.getAlumni());
		setAmenityFeature(org.getAmenityFeature());
		setAreaServed(org.getAreaServed());
		setAward(org.getAward());
		setBranchCode(org.getBranchCode());
		setBrand(org.getBrand());
		setContactPoint(org.getContactPoint());
		setContainedInPlace(org.getContainedInPlace());
		setContainsPlace(org.getContainsPlace());
		setCorrectionsPolicy(org.getCorrectionsPolicy());
		setCurrenciesAccepted(org.getCurrenciesAccepted());
		setDepartment(org.getDepartment());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDissolutionDate(org.getDissolutionDate());
		setDiversityPolicy(org.getDiversityPolicy());
		setDuns(org.getDuns());
		setEmail(org.getEmail());
		setEmployee(org.getEmployee());
		setEthicsPolicy(org.getEthicsPolicy());
		setEvent(org.getEvent());
		setFaxNumber(org.getFaxNumber());
		setFounder(org.getFounder());
		setFoundingDate(org.getFoundingDate());
		setFoundingLocation(org.getFoundingLocation());
		setFunder(org.getFunder());
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
		setHasOfferCatalog(org.getHasOfferCatalog());
		setHasPOS(org.getHasPOS());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setIsicV4(org.getIsicV4());
		setLegalName(org.getLegalName());
		setLeiCode(org.getLeiCode());
		setLocation(org.getLocation());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMakesOffer(org.getMakesOffer());
		setMaximumAttendeeCapacity(org.getMaximumAttendeeCapacity());
		setMember(org.getMember());
		setMemberOf(org.getMemberOf());
		setNaics(org.getNaics());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNumberOfEmployees(org.getNumberOfEmployees());
		setOpeningHours(org.getOpeningHours());
		setOpeningHoursSpecification(org.getOpeningHoursSpecification());
		setOwns(org.getOwns());
		setParentOrganization(org.getParentOrganization());
		setPaymentAccepted(org.getPaymentAccepted());
		setPhoto(org.getPhoto());
		setPotentialAction(org.getPotentialAction());
		setPriceRange(org.getPriceRange());
		setPublicAccess(org.getPublicAccess());
		setPublishingPrinciples(org.getPublishingPrinciples());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSeeks(org.getSeeks());
		setSmokingAllowed(org.getSmokingAllowed());
		setSpecialOpeningHoursSpecification(org.getSpecialOpeningHoursSpecification());
		setSponsor(org.getSponsor());
		setSubOrganization(org.getSubOrganization());
		setTaxID(org.getTaxID());
		setTelephone(org.getTelephone());
		setUnnamedSourcesPolicy(org.getUnnamedSourcesPolicy());
		setUrl(org.getUrl());
		setVatID(org.getVatID());
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
