package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Organization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Person;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.Address;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Alumni;
import org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature;
import org.kyojo.schemaOrg.m3n3.core.Container.AreaServed;
import org.kyojo.schemaOrg.m3n3.core.Container.Award;
import org.kyojo.schemaOrg.m3n3.core.Container.BranchCode;
import org.kyojo.schemaOrg.m3n3.core.Container.Brand;
import org.kyojo.schemaOrg.m3n3.core.Container.ContactPoint;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainedInPlace;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainsPlace;
import org.kyojo.schemaOrg.m3n3.core.Container.CurrenciesAccepted;
import org.kyojo.schemaOrg.m3n3.core.Container.Department;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.DissolutionDate;
import org.kyojo.schemaOrg.m3n3.core.Container.Duns;
import org.kyojo.schemaOrg.m3n3.core.Container.Email;
import org.kyojo.schemaOrg.m3n3.core.Container.Employee;
import org.kyojo.schemaOrg.m3n3.core.Container.Event;
import org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.Founder;
import org.kyojo.schemaOrg.m3n3.core.Container.FoundingDate;
import org.kyojo.schemaOrg.m3n3.core.Container.FoundingLocation;
import org.kyojo.schemaOrg.m3n3.core.Container.Funder;
import org.kyojo.schemaOrg.m3n3.core.Container.Geo;
import org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.HasMap;
import org.kyojo.schemaOrg.m3n3.core.Container.HasOfferCatalog;
import org.kyojo.schemaOrg.m3n3.core.Container.HasPOS;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaOrg.m3n3.core.Container.IsicV4;
import org.kyojo.schemaOrg.m3n3.core.Container.LegalName;
import org.kyojo.schemaOrg.m3n3.core.Container.LeiCode;
import org.kyojo.schemaOrg.m3n3.core.Container.Location;
import org.kyojo.schemaOrg.m3n3.core.Container.Logo;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.MakesOffer;
import org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaOrg.m3n3.core.Container.Member;
import org.kyojo.schemaOrg.m3n3.core.Container.MemberOf;
import org.kyojo.schemaOrg.m3n3.core.Container.Naics;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEmployees;
import org.kyojo.schemaOrg.m3n3.core.Container.OpeningHours;
import org.kyojo.schemaOrg.m3n3.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Owns;
import org.kyojo.schemaOrg.m3n3.core.Container.ParentOrganization;
import org.kyojo.schemaOrg.m3n3.core.Container.PaymentAccepted;
import org.kyojo.schemaOrg.m3n3.core.Container.Photo;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceRange;
import org.kyojo.schemaOrg.m3n3.core.Container.PublicAccess;
import org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Seeks;
import org.kyojo.schemaOrg.m3n3.core.Container.SmokingAllowed;
import org.kyojo.schemaOrg.m3n3.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaOrg.m3n3.core.Container.SubOrganization;
import org.kyojo.schemaOrg.m3n3.core.Container.TaxID;
import org.kyojo.schemaOrg.m3n3.core.Container.Telephone;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.VatID;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.DiversityPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.EthicsPolicy;
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
import org.kyojo.schemaOrg.m3n3.pending.Container.UnnamedSourcesPolicy;

public class REAL_ESTATE_AGENT implements Clazz.RealEstateAgent, Container.RealEstateAgent {

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
	public List<Organization> organizationList;
	public Owns owns;
	public ParentOrganization parentOrganization;
	public PaymentAccepted paymentAccepted;
	public List<Person> personList;
	public Photo photo;
	public PotentialAction potentialAction;
	public PriceRange priceRange;
	public PublicAccess publicAccess;
	public PublishingPrinciples publishingPrinciples;
	public List<Clazz.RealEstateAgent> realEstateAgentList;
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

	public REAL_ESTATE_AGENT() {
	}

	public REAL_ESTATE_AGENT(Long seq) {
		setSeq(seq);
	}

	public REAL_ESTATE_AGENT(String string) {
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

	public REAL_ESTATE_AGENT(ActionableFeedbackPolicy actionableFeedbackPolicy) {
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

	public REAL_ESTATE_AGENT(AdditionalProperty additionalProperty) {
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

	public REAL_ESTATE_AGENT(AdditionalType additionalType) {
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

	public REAL_ESTATE_AGENT(Address address) {
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

	public REAL_ESTATE_AGENT(AggregateRating aggregateRating) {
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

	public REAL_ESTATE_AGENT(AlternateName alternateName) {
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

	public REAL_ESTATE_AGENT(Alumni alumni) {
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

	public REAL_ESTATE_AGENT(AmenityFeature amenityFeature) {
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

	public REAL_ESTATE_AGENT(AreaServed areaServed) {
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

	public REAL_ESTATE_AGENT(Award award) {
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

	public REAL_ESTATE_AGENT(BranchCode branchCode) {
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

	public REAL_ESTATE_AGENT(Brand brand) {
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

	public REAL_ESTATE_AGENT(ContactPoint contactPoint) {
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

	public REAL_ESTATE_AGENT(ContainedInPlace containedInPlace) {
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

	public REAL_ESTATE_AGENT(ContainsPlace containsPlace) {
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

	public REAL_ESTATE_AGENT(CorrectionsPolicy correctionsPolicy) {
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

	public REAL_ESTATE_AGENT(CurrenciesAccepted currenciesAccepted) {
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

	public REAL_ESTATE_AGENT(Department department) {
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

	public REAL_ESTATE_AGENT(Description description) {
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

	public REAL_ESTATE_AGENT(DisambiguatingDescription disambiguatingDescription) {
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

	public REAL_ESTATE_AGENT(DissolutionDate dissolutionDate) {
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

	public REAL_ESTATE_AGENT(DiversityPolicy diversityPolicy) {
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

	public REAL_ESTATE_AGENT(Duns duns) {
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

	public REAL_ESTATE_AGENT(Email email) {
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

	public REAL_ESTATE_AGENT(Employee employee) {
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

	public REAL_ESTATE_AGENT(EthicsPolicy ethicsPolicy) {
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

	public REAL_ESTATE_AGENT(Event event) {
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

	public REAL_ESTATE_AGENT(FaxNumber faxNumber) {
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

	public REAL_ESTATE_AGENT(Founder founder) {
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

	public REAL_ESTATE_AGENT(FoundingDate foundingDate) {
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

	public REAL_ESTATE_AGENT(FoundingLocation foundingLocation) {
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

	public REAL_ESTATE_AGENT(Funder funder) {
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

	public REAL_ESTATE_AGENT(Geo geo) {
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

	public REAL_ESTATE_AGENT(GeospatiallyContains geospatiallyContains) {
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

	public REAL_ESTATE_AGENT(GeospatiallyCoveredBy geospatiallyCoveredBy) {
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

	public REAL_ESTATE_AGENT(GeospatiallyCovers geospatiallyCovers) {
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

	public REAL_ESTATE_AGENT(GeospatiallyCrosses geospatiallyCrosses) {
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

	public REAL_ESTATE_AGENT(GeospatiallyDisjoint geospatiallyDisjoint) {
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

	public REAL_ESTATE_AGENT(GeospatiallyEquals geospatiallyEquals) {
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

	public REAL_ESTATE_AGENT(GeospatiallyIntersects geospatiallyIntersects) {
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

	public REAL_ESTATE_AGENT(GeospatiallyOverlaps geospatiallyOverlaps) {
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

	public REAL_ESTATE_AGENT(GeospatiallyTouches geospatiallyTouches) {
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

	public REAL_ESTATE_AGENT(GeospatiallyWithin geospatiallyWithin) {
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

	public REAL_ESTATE_AGENT(GlobalLocationNumber globalLocationNumber) {
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

	public REAL_ESTATE_AGENT(HasMap hasMap) {
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

	public REAL_ESTATE_AGENT(HasOfferCatalog hasOfferCatalog) {
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

	public REAL_ESTATE_AGENT(HasPOS hasPOS) {
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

	public REAL_ESTATE_AGENT(Identifier identifier) {
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

	public REAL_ESTATE_AGENT(Image image) {
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

	public REAL_ESTATE_AGENT(IsAccessibleForFree isAccessibleForFree) {
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

	public REAL_ESTATE_AGENT(IsicV4 isicV4) {
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

	public REAL_ESTATE_AGENT(LegalName legalName) {
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

	public REAL_ESTATE_AGENT(LeiCode leiCode) {
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

	public REAL_ESTATE_AGENT(Location location) {
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

	public REAL_ESTATE_AGENT(Logo logo) {
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

	public REAL_ESTATE_AGENT(MainEntityOfPage mainEntityOfPage) {
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

	public REAL_ESTATE_AGENT(MakesOffer makesOffer) {
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

	public REAL_ESTATE_AGENT(MaximumAttendeeCapacity maximumAttendeeCapacity) {
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

	public REAL_ESTATE_AGENT(Member member) {
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

	public REAL_ESTATE_AGENT(MemberOf memberOf) {
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

	public REAL_ESTATE_AGENT(Naics naics) {
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

	public REAL_ESTATE_AGENT(Name name) {
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

	public REAL_ESTATE_AGENT(NameFuzzy nameFuzzy) {
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

	public REAL_ESTATE_AGENT(NameRuby nameRuby) {
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

	public REAL_ESTATE_AGENT(NumberOfEmployees numberOfEmployees) {
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

	public REAL_ESTATE_AGENT(OpeningHours openingHours) {
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

	public REAL_ESTATE_AGENT(OpeningHoursSpecification openingHoursSpecification) {
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

	public REAL_ESTATE_AGENT(Organization organization) {
		organizationList = new ArrayList<Organization>();
		organizationList.add(organization);
	}

	@Override
	public Organization getOrganization() {
		if(organizationList != null && organizationList.size() > 0) {
			return organizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganization(Organization organization) {
		if(organizationList == null) {
			organizationList = new ArrayList<>();
		}
		if(organizationList.size() == 0) {
			organizationList.add(organization);
		} else {
			organizationList.set(0, organization);
		}
	}

	@Override
	public List<Organization> getOrganizationList() {
		return organizationList;
	}

	@Override
	public void setOrganizationList(List<Organization> organizationList) {
		this.organizationList = organizationList;
	}

	@Override
	public boolean hasOrganization() {
		return organizationList != null && organizationList.size() > 0 && organizationList.get(0) != null;
	}

	public REAL_ESTATE_AGENT(Owns owns) {
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

	public REAL_ESTATE_AGENT(ParentOrganization parentOrganization) {
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

	public REAL_ESTATE_AGENT(PaymentAccepted paymentAccepted) {
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

	public REAL_ESTATE_AGENT(Person person) {
		personList = new ArrayList<Person>();
		personList.add(person);
	}

	@Override
	public Person getPerson() {
		if(personList != null && personList.size() > 0) {
			return personList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerson(Person person) {
		if(personList == null) {
			personList = new ArrayList<>();
		}
		if(personList.size() == 0) {
			personList.add(person);
		} else {
			personList.set(0, person);
		}
	}

	@Override
	public List<Person> getPersonList() {
		return personList;
	}

	@Override
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@Override
	public boolean hasPerson() {
		return personList != null && personList.size() > 0 && personList.get(0) != null;
	}

	public REAL_ESTATE_AGENT(Photo photo) {
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

	public REAL_ESTATE_AGENT(PotentialAction potentialAction) {
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

	public REAL_ESTATE_AGENT(PriceRange priceRange) {
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

	public REAL_ESTATE_AGENT(PublicAccess publicAccess) {
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

	public REAL_ESTATE_AGENT(PublishingPrinciples publishingPrinciples) {
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

	public REAL_ESTATE_AGENT(Clazz.RealEstateAgent realEstateAgent) {
		realEstateAgentList = new ArrayList<Clazz.RealEstateAgent>();
		realEstateAgentList.add(realEstateAgent);
	}

	@Override
	public Clazz.RealEstateAgent getRealEstateAgent() {
		if(realEstateAgentList != null && realEstateAgentList.size() > 0) {
			return realEstateAgentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRealEstateAgent(Clazz.RealEstateAgent realEstateAgent) {
		if(realEstateAgentList == null) {
			realEstateAgentList = new ArrayList<>();
		}
		if(realEstateAgentList.size() == 0) {
			realEstateAgentList.add(realEstateAgent);
		} else {
			realEstateAgentList.set(0, realEstateAgent);
		}
	}

	@Override
	public List<Clazz.RealEstateAgent> getRealEstateAgentList() {
		return realEstateAgentList;
	}

	@Override
	public void setRealEstateAgentList(List<Clazz.RealEstateAgent> realEstateAgentList) {
		this.realEstateAgentList = realEstateAgentList;
	}

	@Override
	public boolean hasRealEstateAgent() {
		return realEstateAgentList != null && realEstateAgentList.size() > 0 && realEstateAgentList.get(0) != null;
	}

	public REAL_ESTATE_AGENT(Review review) {
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

	public REAL_ESTATE_AGENT(SameAs sameAs) {
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

	public REAL_ESTATE_AGENT(Seeks seeks) {
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

	public REAL_ESTATE_AGENT(SmokingAllowed smokingAllowed) {
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

	public REAL_ESTATE_AGENT(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
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

	public REAL_ESTATE_AGENT(Sponsor sponsor) {
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

	public REAL_ESTATE_AGENT(SubOrganization subOrganization) {
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

	public REAL_ESTATE_AGENT(TaxID taxID) {
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

	public REAL_ESTATE_AGENT(Telephone telephone) {
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

	public REAL_ESTATE_AGENT(UnnamedSourcesPolicy unnamedSourcesPolicy) {
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

	public REAL_ESTATE_AGENT(Url url) {
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

	public REAL_ESTATE_AGENT(VatID vatID) {
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

	public REAL_ESTATE_AGENT(Long seq,
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
			List<Organization> organizationList,
			Owns owns,
			ParentOrganization parentOrganization,
			PaymentAccepted paymentAccepted,
			List<Person> personList,
			Photo photo,
			PotentialAction potentialAction,
			PriceRange priceRange,
			PublicAccess publicAccess,
			PublishingPrinciples publishingPrinciples,
			List<Clazz.RealEstateAgent> realEstateAgentList,
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
		setOrganizationList(organizationList);
		setOwns(owns);
		setParentOrganization(parentOrganization);
		setPaymentAccepted(paymentAccepted);
		setPersonList(personList);
		setPhoto(photo);
		setPotentialAction(potentialAction);
		setPriceRange(priceRange);
		setPublicAccess(publicAccess);
		setPublishingPrinciples(publishingPrinciples);
		setRealEstateAgentList(realEstateAgentList);
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

	public void copy(Clazz.RealEstateAgent org) {
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

	public void copy(Container.RealEstateAgent org) {
		setOrganizationList(org.getOrganizationList());
		setPersonList(org.getPersonList());
		setRealEstateAgentList(org.getRealEstateAgentList());
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