package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AcceptsReservations;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.Address;
import org.kyojo.schemaorg.m3n4.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Alumni;
import org.kyojo.schemaorg.m3n4.core.Container.AmenityFeature;
import org.kyojo.schemaorg.m3n4.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n4.core.Container.Award;
import org.kyojo.schemaorg.m3n4.core.Container.BranchCode;
import org.kyojo.schemaorg.m3n4.core.Container.Brand;
import org.kyojo.schemaorg.m3n4.core.Container.ContactPoint;
import org.kyojo.schemaorg.m3n4.core.Container.ContainedInPlace;
import org.kyojo.schemaorg.m3n4.core.Container.ContainsPlace;
import org.kyojo.schemaorg.m3n4.core.Container.CurrenciesAccepted;
import org.kyojo.schemaorg.m3n4.core.Container.Department;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.DissolutionDate;
import org.kyojo.schemaorg.m3n4.core.Container.Duns;
import org.kyojo.schemaorg.m3n4.core.Container.Email;
import org.kyojo.schemaorg.m3n4.core.Container.Employee;
import org.kyojo.schemaorg.m3n4.core.Container.Event;
import org.kyojo.schemaorg.m3n4.core.Container.FaxNumber;
import org.kyojo.schemaorg.m3n4.core.Container.Founder;
import org.kyojo.schemaorg.m3n4.core.Container.FoundingDate;
import org.kyojo.schemaorg.m3n4.core.Container.FoundingLocation;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;
import org.kyojo.schemaorg.m3n4.core.Container.Geo;
import org.kyojo.schemaorg.m3n4.core.Container.GlobalLocationNumber;
import org.kyojo.schemaorg.m3n4.core.Container.HasMap;
import org.kyojo.schemaorg.m3n4.core.Container.HasMenu;
import org.kyojo.schemaorg.m3n4.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n4.core.Container.HasPOS;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n4.core.Container.IsicV4;
import org.kyojo.schemaorg.m3n4.core.Container.LegalName;
import org.kyojo.schemaorg.m3n4.core.Container.LeiCode;
import org.kyojo.schemaorg.m3n4.core.Container.Location;
import org.kyojo.schemaorg.m3n4.core.Container.Logo;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MakesOffer;
import org.kyojo.schemaorg.m3n4.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaorg.m3n4.core.Container.Member;
import org.kyojo.schemaorg.m3n4.core.Container.MemberOf;
import org.kyojo.schemaorg.m3n4.core.Container.Naics;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfEmployees;
import org.kyojo.schemaorg.m3n4.core.Container.OpeningHours;
import org.kyojo.schemaorg.m3n4.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n4.core.Container.Owns;
import org.kyojo.schemaorg.m3n4.core.Container.ParentOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentAccepted;
import org.kyojo.schemaorg.m3n4.core.Container.Photo;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.PriceRange;
import org.kyojo.schemaorg.m3n4.core.Container.PublicAccess;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.Review;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Seeks;
import org.kyojo.schemaorg.m3n4.core.Container.ServesCuisine;
import org.kyojo.schemaorg.m3n4.core.Container.SmokingAllowed;
import org.kyojo.schemaorg.m3n4.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n4.core.Container.StarRating;
import org.kyojo.schemaorg.m3n4.core.Container.SubOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.TaxID;
import org.kyojo.schemaorg.m3n4.core.Container.Telephone;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.VatID;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.DiversityPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.DiversityStaffingReport;
import org.kyojo.schemaorg.m3n4.pending.Container.EthicsPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyContains;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCoveredBy;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyDisjoint;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyEquals;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyTouches;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyWithin;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsAbout;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsLanguage;
import org.kyojo.schemaorg.m3n4.pending.Container.OwnershipFundingInfo;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;
import org.kyojo.schemaorg.m3n4.pending.Container.UnnamedSourcesPolicy;

public class BAKERY implements Clazz.Bakery {

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
	public AcceptsReservations acceptsReservations;
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
	public DiversityStaffingReport diversityStaffingReport;
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
	public HasMenu hasMenu;
	public HasOfferCatalog hasOfferCatalog;
	public HasPOS hasPOS;
	public Identifier identifier;
	public Image image;
	public IsAccessibleForFree isAccessibleForFree;
	public IsicV4 isicV4;
	public KnowsAbout knowsAbout;
	public KnowsLanguage knowsLanguage;
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
	public OwnershipFundingInfo ownershipFundingInfo;
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
	public ServesCuisine servesCuisine;
	public SmokingAllowed smokingAllowed;
	public SpecialOpeningHoursSpecification specialOpeningHoursSpecification;
	public Sponsor sponsor;
	public StarRating starRating;
	public SubOrganization subOrganization;
	public SubjectOf subjectOf;
	public TaxID taxID;
	public Telephone telephone;
	public UnnamedSourcesPolicy unnamedSourcesPolicy;
	public Url url;
	public VatID vatID;

	public BAKERY() {
	}

	public BAKERY(Long seq) {
		setSeq(seq);
	}

	public BAKERY(String string) {
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

	public BAKERY(AcceptsReservations acceptsReservations) {
		setAcceptsReservations(acceptsReservations);
	}

	@Override
	public AcceptsReservations getAcceptsReservations() {
		return acceptsReservations;
	}

	@Override
	public void setAcceptsReservations(AcceptsReservations acceptsReservations) {
		this.acceptsReservations = acceptsReservations;
	}

	public BAKERY(ActionableFeedbackPolicy actionableFeedbackPolicy) {
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

	public BAKERY(AdditionalProperty additionalProperty) {
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

	public BAKERY(AdditionalType additionalType) {
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

	public BAKERY(Address address) {
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

	public BAKERY(AggregateRating aggregateRating) {
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

	public BAKERY(AlternateName alternateName) {
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

	public BAKERY(Alumni alumni) {
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

	public BAKERY(AmenityFeature amenityFeature) {
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

	public BAKERY(AreaServed areaServed) {
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

	public BAKERY(Award award) {
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

	public BAKERY(BranchCode branchCode) {
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

	public BAKERY(Brand brand) {
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

	public BAKERY(ContactPoint contactPoint) {
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

	public BAKERY(ContainedInPlace containedInPlace) {
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

	public BAKERY(ContainsPlace containsPlace) {
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

	public BAKERY(CorrectionsPolicy correctionsPolicy) {
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

	public BAKERY(CurrenciesAccepted currenciesAccepted) {
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

	public BAKERY(Department department) {
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

	public BAKERY(Description description) {
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

	public BAKERY(DisambiguatingDescription disambiguatingDescription) {
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

	public BAKERY(DissolutionDate dissolutionDate) {
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

	public BAKERY(DiversityPolicy diversityPolicy) {
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

	public BAKERY(DiversityStaffingReport diversityStaffingReport) {
		setDiversityStaffingReport(diversityStaffingReport);
	}

	@Override
	public DiversityStaffingReport getDiversityStaffingReport() {
		return diversityStaffingReport;
	}

	@Override
	public void setDiversityStaffingReport(DiversityStaffingReport diversityStaffingReport) {
		this.diversityStaffingReport = diversityStaffingReport;
	}

	public BAKERY(Duns duns) {
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

	public BAKERY(Email email) {
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

	public BAKERY(Employee employee) {
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

	public BAKERY(EthicsPolicy ethicsPolicy) {
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

	public BAKERY(Event event) {
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

	public BAKERY(FaxNumber faxNumber) {
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

	public BAKERY(Founder founder) {
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

	public BAKERY(FoundingDate foundingDate) {
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

	public BAKERY(FoundingLocation foundingLocation) {
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

	public BAKERY(Funder funder) {
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

	public BAKERY(Geo geo) {
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

	public BAKERY(GeospatiallyContains geospatiallyContains) {
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

	public BAKERY(GeospatiallyCoveredBy geospatiallyCoveredBy) {
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

	public BAKERY(GeospatiallyCovers geospatiallyCovers) {
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

	public BAKERY(GeospatiallyCrosses geospatiallyCrosses) {
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

	public BAKERY(GeospatiallyDisjoint geospatiallyDisjoint) {
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

	public BAKERY(GeospatiallyEquals geospatiallyEquals) {
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

	public BAKERY(GeospatiallyIntersects geospatiallyIntersects) {
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

	public BAKERY(GeospatiallyOverlaps geospatiallyOverlaps) {
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

	public BAKERY(GeospatiallyTouches geospatiallyTouches) {
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

	public BAKERY(GeospatiallyWithin geospatiallyWithin) {
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

	public BAKERY(GlobalLocationNumber globalLocationNumber) {
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

	public BAKERY(HasMap hasMap) {
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

	public BAKERY(HasMenu hasMenu) {
		setHasMenu(hasMenu);
	}

	@Override
	public HasMenu getHasMenu() {
		return hasMenu;
	}

	@Override
	public void setHasMenu(HasMenu hasMenu) {
		this.hasMenu = hasMenu;
	}

	public BAKERY(HasOfferCatalog hasOfferCatalog) {
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

	public BAKERY(HasPOS hasPOS) {
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

	public BAKERY(Identifier identifier) {
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

	public BAKERY(Image image) {
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

	public BAKERY(IsAccessibleForFree isAccessibleForFree) {
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

	public BAKERY(IsicV4 isicV4) {
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

	public BAKERY(KnowsAbout knowsAbout) {
		setKnowsAbout(knowsAbout);
	}

	@Override
	public KnowsAbout getKnowsAbout() {
		return knowsAbout;
	}

	@Override
	public void setKnowsAbout(KnowsAbout knowsAbout) {
		this.knowsAbout = knowsAbout;
	}

	public BAKERY(KnowsLanguage knowsLanguage) {
		setKnowsLanguage(knowsLanguage);
	}

	@Override
	public KnowsLanguage getKnowsLanguage() {
		return knowsLanguage;
	}

	@Override
	public void setKnowsLanguage(KnowsLanguage knowsLanguage) {
		this.knowsLanguage = knowsLanguage;
	}

	public BAKERY(LegalName legalName) {
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

	public BAKERY(LeiCode leiCode) {
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

	public BAKERY(Location location) {
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

	public BAKERY(Logo logo) {
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

	public BAKERY(MainEntityOfPage mainEntityOfPage) {
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

	public BAKERY(MakesOffer makesOffer) {
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

	public BAKERY(MaximumAttendeeCapacity maximumAttendeeCapacity) {
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

	public BAKERY(Member member) {
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

	public BAKERY(MemberOf memberOf) {
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

	public BAKERY(Naics naics) {
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

	public BAKERY(Name name) {
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

	public BAKERY(NameFuzzy nameFuzzy) {
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

	public BAKERY(NameRuby nameRuby) {
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

	public BAKERY(NumberOfEmployees numberOfEmployees) {
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

	public BAKERY(OpeningHours openingHours) {
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

	public BAKERY(OpeningHoursSpecification openingHoursSpecification) {
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

	public BAKERY(OwnershipFundingInfo ownershipFundingInfo) {
		setOwnershipFundingInfo(ownershipFundingInfo);
	}

	@Override
	public OwnershipFundingInfo getOwnershipFundingInfo() {
		return ownershipFundingInfo;
	}

	@Override
	public void setOwnershipFundingInfo(OwnershipFundingInfo ownershipFundingInfo) {
		this.ownershipFundingInfo = ownershipFundingInfo;
	}

	public BAKERY(Owns owns) {
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

	public BAKERY(ParentOrganization parentOrganization) {
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

	public BAKERY(PaymentAccepted paymentAccepted) {
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

	public BAKERY(Photo photo) {
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

	public BAKERY(PotentialAction potentialAction) {
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

	public BAKERY(PriceRange priceRange) {
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

	public BAKERY(PublicAccess publicAccess) {
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

	public BAKERY(PublishingPrinciples publishingPrinciples) {
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

	public BAKERY(Review review) {
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

	public BAKERY(SameAs sameAs) {
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

	public BAKERY(Seeks seeks) {
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

	public BAKERY(ServesCuisine servesCuisine) {
		setServesCuisine(servesCuisine);
	}

	@Override
	public ServesCuisine getServesCuisine() {
		return servesCuisine;
	}

	@Override
	public void setServesCuisine(ServesCuisine servesCuisine) {
		this.servesCuisine = servesCuisine;
	}

	public BAKERY(SmokingAllowed smokingAllowed) {
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

	public BAKERY(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
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

	public BAKERY(Sponsor sponsor) {
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

	public BAKERY(StarRating starRating) {
		setStarRating(starRating);
	}

	@Override
	public StarRating getStarRating() {
		return starRating;
	}

	@Override
	public void setStarRating(StarRating starRating) {
		this.starRating = starRating;
	}

	public BAKERY(SubOrganization subOrganization) {
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

	public BAKERY(SubjectOf subjectOf) {
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

	public BAKERY(TaxID taxID) {
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

	public BAKERY(Telephone telephone) {
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

	public BAKERY(UnnamedSourcesPolicy unnamedSourcesPolicy) {
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

	public BAKERY(Url url) {
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

	public BAKERY(VatID vatID) {
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

	public void copy(Clazz.Bakery org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAcceptsReservations(org.getAcceptsReservations());
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
		setDiversityStaffingReport(org.getDiversityStaffingReport());
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
		setHasMenu(org.getHasMenu());
		setHasOfferCatalog(org.getHasOfferCatalog());
		setHasPOS(org.getHasPOS());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setIsicV4(org.getIsicV4());
		setKnowsAbout(org.getKnowsAbout());
		setKnowsLanguage(org.getKnowsLanguage());
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
		setOwnershipFundingInfo(org.getOwnershipFundingInfo());
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
		setServesCuisine(org.getServesCuisine());
		setSmokingAllowed(org.getSmokingAllowed());
		setSpecialOpeningHoursSpecification(org.getSpecialOpeningHoursSpecification());
		setSponsor(org.getSponsor());
		setStarRating(org.getStarRating());
		setSubOrganization(org.getSubOrganization());
		setSubjectOf(org.getSubjectOf());
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
