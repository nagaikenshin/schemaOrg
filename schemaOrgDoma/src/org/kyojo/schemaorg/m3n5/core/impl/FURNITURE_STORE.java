package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.Address;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Alumni;
import org.kyojo.schemaorg.m3n5.core.Container.AmenityFeature;
import org.kyojo.schemaorg.m3n5.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n5.core.Container.Award;
import org.kyojo.schemaorg.m3n5.core.Container.BranchCode;
import org.kyojo.schemaorg.m3n5.core.Container.Brand;
import org.kyojo.schemaorg.m3n5.core.Container.ContactPoint;
import org.kyojo.schemaorg.m3n5.core.Container.ContainedInPlace;
import org.kyojo.schemaorg.m3n5.core.Container.ContainsPlace;
import org.kyojo.schemaorg.m3n5.core.Container.CurrenciesAccepted;
import org.kyojo.schemaorg.m3n5.core.Container.Department;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.DissolutionDate;
import org.kyojo.schemaorg.m3n5.core.Container.Duns;
import org.kyojo.schemaorg.m3n5.core.Container.Email;
import org.kyojo.schemaorg.m3n5.core.Container.Employee;
import org.kyojo.schemaorg.m3n5.core.Container.Event;
import org.kyojo.schemaorg.m3n5.core.Container.FaxNumber;
import org.kyojo.schemaorg.m3n5.core.Container.Founder;
import org.kyojo.schemaorg.m3n5.core.Container.FoundingDate;
import org.kyojo.schemaorg.m3n5.core.Container.FoundingLocation;
import org.kyojo.schemaorg.m3n5.core.Container.Funder;
import org.kyojo.schemaorg.m3n5.core.Container.Geo;
import org.kyojo.schemaorg.m3n5.core.Container.GeoContains;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCoveredBy;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCovers;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCrosses;
import org.kyojo.schemaorg.m3n5.core.Container.GeoDisjoint;
import org.kyojo.schemaorg.m3n5.core.Container.GeoEquals;
import org.kyojo.schemaorg.m3n5.core.Container.GeoIntersects;
import org.kyojo.schemaorg.m3n5.core.Container.GeoOverlaps;
import org.kyojo.schemaorg.m3n5.core.Container.GeoTouches;
import org.kyojo.schemaorg.m3n5.core.Container.GeoWithin;
import org.kyojo.schemaorg.m3n5.core.Container.GlobalLocationNumber;
import org.kyojo.schemaorg.m3n5.core.Container.HasMap;
import org.kyojo.schemaorg.m3n5.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n5.core.Container.HasPOS;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n5.core.Container.IsicV4;
import org.kyojo.schemaorg.m3n5.core.Container.LegalName;
import org.kyojo.schemaorg.m3n5.core.Container.LeiCode;
import org.kyojo.schemaorg.m3n5.core.Container.Location;
import org.kyojo.schemaorg.m3n5.core.Container.Logo;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.MakesOffer;
import org.kyojo.schemaorg.m3n5.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaorg.m3n5.core.Container.Member;
import org.kyojo.schemaorg.m3n5.core.Container.MemberOf;
import org.kyojo.schemaorg.m3n5.core.Container.Naics;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfEmployees;
import org.kyojo.schemaorg.m3n5.core.Container.OpeningHours;
import org.kyojo.schemaorg.m3n5.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n5.core.Container.Owns;
import org.kyojo.schemaorg.m3n5.core.Container.ParentOrganization;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentAccepted;
import org.kyojo.schemaorg.m3n5.core.Container.Photo;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.PriceRange;
import org.kyojo.schemaorg.m3n5.core.Container.PublicAccess;
import org.kyojo.schemaorg.m3n5.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.Seeks;
import org.kyojo.schemaorg.m3n5.core.Container.Slogan;
import org.kyojo.schemaorg.m3n5.core.Container.SmokingAllowed;
import org.kyojo.schemaorg.m3n5.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaorg.m3n5.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n5.core.Container.SubOrganization;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.TaxID;
import org.kyojo.schemaorg.m3n5.core.Container.Telephone;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.VatID;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaorg.m3n5.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaorg.m3n5.pending.Container.DiversityPolicy;
import org.kyojo.schemaorg.m3n5.pending.Container.DiversityStaffingReport;
import org.kyojo.schemaorg.m3n5.pending.Container.EthicsPolicy;
import org.kyojo.schemaorg.m3n5.pending.Container.KnowsAbout;
import org.kyojo.schemaorg.m3n5.pending.Container.KnowsLanguage;
import org.kyojo.schemaorg.m3n5.pending.Container.OwnershipFundingInfo;
import org.kyojo.schemaorg.m3n5.pending.Container.UnnamedSourcesPolicy;


public class FURNITURE_STORE implements Clazz.FurnitureStore {

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
	public GeoContains geoContains;
	public GeoCoveredBy geoCoveredBy;
	public GeoCovers geoCovers;
	public GeoCrosses geoCrosses;
	public GeoDisjoint geoDisjoint;
	public GeoEquals geoEquals;
	public GeoIntersects geoIntersects;
	public GeoOverlaps geoOverlaps;
	public GeoTouches geoTouches;
	public GeoWithin geoWithin;
	public GlobalLocationNumber globalLocationNumber;
	public HasMap hasMap;
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
	public Slogan slogan;
	public SmokingAllowed smokingAllowed;
	public SpecialOpeningHoursSpecification specialOpeningHoursSpecification;
	public Sponsor sponsor;
	public SubOrganization subOrganization;
	public SubjectOf subjectOf;
	public TaxID taxID;
	public Telephone telephone;
	public UnnamedSourcesPolicy unnamedSourcesPolicy;
	public Url url;
	public VatID vatID;

	public FURNITURE_STORE() {
	}

	public FURNITURE_STORE(Long seq) {
		setSeq(seq);
	}

	public FURNITURE_STORE(String string) {
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

	public FURNITURE_STORE(ActionableFeedbackPolicy actionableFeedbackPolicy) {
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

	public FURNITURE_STORE(AdditionalProperty additionalProperty) {
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

	public FURNITURE_STORE(AdditionalType additionalType) {
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

	public FURNITURE_STORE(Address address) {
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

	public FURNITURE_STORE(AggregateRating aggregateRating) {
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

	public FURNITURE_STORE(AlternateName alternateName) {
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

	public FURNITURE_STORE(Alumni alumni) {
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

	public FURNITURE_STORE(AmenityFeature amenityFeature) {
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

	public FURNITURE_STORE(AreaServed areaServed) {
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

	public FURNITURE_STORE(Award award) {
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

	public FURNITURE_STORE(BranchCode branchCode) {
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

	public FURNITURE_STORE(Brand brand) {
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

	public FURNITURE_STORE(ContactPoint contactPoint) {
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

	public FURNITURE_STORE(ContainedInPlace containedInPlace) {
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

	public FURNITURE_STORE(ContainsPlace containsPlace) {
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

	public FURNITURE_STORE(CorrectionsPolicy correctionsPolicy) {
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

	public FURNITURE_STORE(CurrenciesAccepted currenciesAccepted) {
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

	public FURNITURE_STORE(Department department) {
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

	public FURNITURE_STORE(Description description) {
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

	public FURNITURE_STORE(DisambiguatingDescription disambiguatingDescription) {
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

	public FURNITURE_STORE(DissolutionDate dissolutionDate) {
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

	public FURNITURE_STORE(DiversityPolicy diversityPolicy) {
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

	public FURNITURE_STORE(DiversityStaffingReport diversityStaffingReport) {
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

	public FURNITURE_STORE(Duns duns) {
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

	public FURNITURE_STORE(Email email) {
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

	public FURNITURE_STORE(Employee employee) {
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

	public FURNITURE_STORE(EthicsPolicy ethicsPolicy) {
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

	public FURNITURE_STORE(Event event) {
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

	public FURNITURE_STORE(FaxNumber faxNumber) {
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

	public FURNITURE_STORE(Founder founder) {
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

	public FURNITURE_STORE(FoundingDate foundingDate) {
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

	public FURNITURE_STORE(FoundingLocation foundingLocation) {
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

	public FURNITURE_STORE(Funder funder) {
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

	public FURNITURE_STORE(Geo geo) {
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

	public FURNITURE_STORE(GeoContains geoContains) {
		setGeoContains(geoContains);
	}

	@Override
	public GeoContains getGeoContains() {
		return geoContains;
	}

	@Override
	public void setGeoContains(GeoContains geoContains) {
		this.geoContains = geoContains;
	}

	public FURNITURE_STORE(GeoCoveredBy geoCoveredBy) {
		setGeoCoveredBy(geoCoveredBy);
	}

	@Override
	public GeoCoveredBy getGeoCoveredBy() {
		return geoCoveredBy;
	}

	@Override
	public void setGeoCoveredBy(GeoCoveredBy geoCoveredBy) {
		this.geoCoveredBy = geoCoveredBy;
	}

	public FURNITURE_STORE(GeoCovers geoCovers) {
		setGeoCovers(geoCovers);
	}

	@Override
	public GeoCovers getGeoCovers() {
		return geoCovers;
	}

	@Override
	public void setGeoCovers(GeoCovers geoCovers) {
		this.geoCovers = geoCovers;
	}

	public FURNITURE_STORE(GeoCrosses geoCrosses) {
		setGeoCrosses(geoCrosses);
	}

	@Override
	public GeoCrosses getGeoCrosses() {
		return geoCrosses;
	}

	@Override
	public void setGeoCrosses(GeoCrosses geoCrosses) {
		this.geoCrosses = geoCrosses;
	}

	public FURNITURE_STORE(GeoDisjoint geoDisjoint) {
		setGeoDisjoint(geoDisjoint);
	}

	@Override
	public GeoDisjoint getGeoDisjoint() {
		return geoDisjoint;
	}

	@Override
	public void setGeoDisjoint(GeoDisjoint geoDisjoint) {
		this.geoDisjoint = geoDisjoint;
	}

	public FURNITURE_STORE(GeoEquals geoEquals) {
		setGeoEquals(geoEquals);
	}

	@Override
	public GeoEquals getGeoEquals() {
		return geoEquals;
	}

	@Override
	public void setGeoEquals(GeoEquals geoEquals) {
		this.geoEquals = geoEquals;
	}

	public FURNITURE_STORE(GeoIntersects geoIntersects) {
		setGeoIntersects(geoIntersects);
	}

	@Override
	public GeoIntersects getGeoIntersects() {
		return geoIntersects;
	}

	@Override
	public void setGeoIntersects(GeoIntersects geoIntersects) {
		this.geoIntersects = geoIntersects;
	}

	public FURNITURE_STORE(GeoOverlaps geoOverlaps) {
		setGeoOverlaps(geoOverlaps);
	}

	@Override
	public GeoOverlaps getGeoOverlaps() {
		return geoOverlaps;
	}

	@Override
	public void setGeoOverlaps(GeoOverlaps geoOverlaps) {
		this.geoOverlaps = geoOverlaps;
	}

	public FURNITURE_STORE(GeoTouches geoTouches) {
		setGeoTouches(geoTouches);
	}

	@Override
	public GeoTouches getGeoTouches() {
		return geoTouches;
	}

	@Override
	public void setGeoTouches(GeoTouches geoTouches) {
		this.geoTouches = geoTouches;
	}

	public FURNITURE_STORE(GeoWithin geoWithin) {
		setGeoWithin(geoWithin);
	}

	@Override
	public GeoWithin getGeoWithin() {
		return geoWithin;
	}

	@Override
	public void setGeoWithin(GeoWithin geoWithin) {
		this.geoWithin = geoWithin;
	}

	public FURNITURE_STORE(GlobalLocationNumber globalLocationNumber) {
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

	public FURNITURE_STORE(HasMap hasMap) {
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

	public FURNITURE_STORE(HasOfferCatalog hasOfferCatalog) {
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

	public FURNITURE_STORE(HasPOS hasPOS) {
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

	public FURNITURE_STORE(Identifier identifier) {
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

	public FURNITURE_STORE(Image image) {
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

	public FURNITURE_STORE(IsAccessibleForFree isAccessibleForFree) {
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

	public FURNITURE_STORE(IsicV4 isicV4) {
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

	public FURNITURE_STORE(KnowsAbout knowsAbout) {
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

	public FURNITURE_STORE(KnowsLanguage knowsLanguage) {
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

	public FURNITURE_STORE(LegalName legalName) {
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

	public FURNITURE_STORE(LeiCode leiCode) {
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

	public FURNITURE_STORE(Location location) {
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

	public FURNITURE_STORE(Logo logo) {
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

	public FURNITURE_STORE(MainEntityOfPage mainEntityOfPage) {
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

	public FURNITURE_STORE(MakesOffer makesOffer) {
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

	public FURNITURE_STORE(MaximumAttendeeCapacity maximumAttendeeCapacity) {
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

	public FURNITURE_STORE(Member member) {
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

	public FURNITURE_STORE(MemberOf memberOf) {
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

	public FURNITURE_STORE(Naics naics) {
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

	public FURNITURE_STORE(Name name) {
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

	public FURNITURE_STORE(NameFuzzy nameFuzzy) {
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

	public FURNITURE_STORE(NameRuby nameRuby) {
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

	public FURNITURE_STORE(NumberOfEmployees numberOfEmployees) {
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

	public FURNITURE_STORE(OpeningHours openingHours) {
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

	public FURNITURE_STORE(OpeningHoursSpecification openingHoursSpecification) {
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

	public FURNITURE_STORE(OwnershipFundingInfo ownershipFundingInfo) {
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

	public FURNITURE_STORE(Owns owns) {
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

	public FURNITURE_STORE(ParentOrganization parentOrganization) {
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

	public FURNITURE_STORE(PaymentAccepted paymentAccepted) {
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

	public FURNITURE_STORE(Photo photo) {
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

	public FURNITURE_STORE(PotentialAction potentialAction) {
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

	public FURNITURE_STORE(PriceRange priceRange) {
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

	public FURNITURE_STORE(PublicAccess publicAccess) {
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

	public FURNITURE_STORE(PublishingPrinciples publishingPrinciples) {
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

	public FURNITURE_STORE(Review review) {
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

	public FURNITURE_STORE(SameAs sameAs) {
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

	public FURNITURE_STORE(Seeks seeks) {
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

	public FURNITURE_STORE(Slogan slogan) {
		setSlogan(slogan);
	}

	@Override
	public Slogan getSlogan() {
		return slogan;
	}

	@Override
	public void setSlogan(Slogan slogan) {
		this.slogan = slogan;
	}

	public FURNITURE_STORE(SmokingAllowed smokingAllowed) {
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

	public FURNITURE_STORE(SpecialOpeningHoursSpecification specialOpeningHoursSpecification) {
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

	public FURNITURE_STORE(Sponsor sponsor) {
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

	public FURNITURE_STORE(SubOrganization subOrganization) {
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

	public FURNITURE_STORE(SubjectOf subjectOf) {
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

	public FURNITURE_STORE(TaxID taxID) {
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

	public FURNITURE_STORE(Telephone telephone) {
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

	public FURNITURE_STORE(UnnamedSourcesPolicy unnamedSourcesPolicy) {
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

	public FURNITURE_STORE(Url url) {
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

	public FURNITURE_STORE(VatID vatID) {
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

	public void copy(Clazz.FurnitureStore org) {
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
		setGeoContains(org.getGeoContains());
		setGeoCoveredBy(org.getGeoCoveredBy());
		setGeoCovers(org.getGeoCovers());
		setGeoCrosses(org.getGeoCrosses());
		setGeoDisjoint(org.getGeoDisjoint());
		setGeoEquals(org.getGeoEquals());
		setGeoIntersects(org.getGeoIntersects());
		setGeoOverlaps(org.getGeoOverlaps());
		setGeoTouches(org.getGeoTouches());
		setGeoWithin(org.getGeoWithin());
		setGlobalLocationNumber(org.getGlobalLocationNumber());
		setHasMap(org.getHasMap());
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
		setSlogan(org.getSlogan());
		setSmokingAllowed(org.getSmokingAllowed());
		setSpecialOpeningHoursSpecification(org.getSpecialOpeningHoursSpecification());
		setSponsor(org.getSponsor());
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
