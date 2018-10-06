package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalName;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.Address;
import org.kyojo.schemaorg.m3n4.core.Container.Affiliation;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AlumniOf;
import org.kyojo.schemaorg.m3n4.core.Container.AudienceType;
import org.kyojo.schemaorg.m3n4.core.Container.Award;
import org.kyojo.schemaorg.m3n4.core.Container.BirthDate;
import org.kyojo.schemaorg.m3n4.core.Container.BirthPlace;
import org.kyojo.schemaorg.m3n4.core.Container.Brand;
import org.kyojo.schemaorg.m3n4.core.Container.Children;
import org.kyojo.schemaorg.m3n4.core.Container.Colleague;
import org.kyojo.schemaorg.m3n4.core.Container.ContactPoint;
import org.kyojo.schemaorg.m3n4.core.Container.DeathDate;
import org.kyojo.schemaorg.m3n4.core.Container.DeathPlace;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Duns;
import org.kyojo.schemaorg.m3n4.core.Container.Email;
import org.kyojo.schemaorg.m3n4.core.Container.FamilyName;
import org.kyojo.schemaorg.m3n4.core.Container.FamilyNameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.FaxNumber;
import org.kyojo.schemaorg.m3n4.core.Container.Follows;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;
import org.kyojo.schemaorg.m3n4.core.Container.Gender;
import org.kyojo.schemaorg.m3n4.core.Container.GeographicArea;
import org.kyojo.schemaorg.m3n4.core.Container.GivenName;
import org.kyojo.schemaorg.m3n4.core.Container.GivenNameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.GlobalLocationNumber;
import org.kyojo.schemaorg.m3n4.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n4.core.Container.HasPOS;
import org.kyojo.schemaorg.m3n4.core.Container.Height;
import org.kyojo.schemaorg.m3n4.core.Container.HomeLocation;
import org.kyojo.schemaorg.m3n4.core.Container.HonorificPrefix;
import org.kyojo.schemaorg.m3n4.core.Container.HonorificSuffix;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.IsicV4;
import org.kyojo.schemaorg.m3n4.core.Container.JobTitle;
import org.kyojo.schemaorg.m3n4.core.Container.Knows;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MakesOffer;
import org.kyojo.schemaorg.m3n4.core.Container.MemberOf;
import org.kyojo.schemaorg.m3n4.core.Container.Naics;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.Nationality;
import org.kyojo.schemaorg.m3n4.core.Container.NetWorth;
import org.kyojo.schemaorg.m3n4.core.Container.Owns;
import org.kyojo.schemaorg.m3n4.core.Container.Parent;
import org.kyojo.schemaorg.m3n4.core.Container.PerformerIn;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.RelatedTo;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredGender;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMaxAge;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMinAge;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Seeks;
import org.kyojo.schemaorg.m3n4.core.Container.Sibling;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n4.core.Container.Spouse;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedGender;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedMaxAge;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedMinAge;
import org.kyojo.schemaorg.m3n4.core.Container.TaxID;
import org.kyojo.schemaorg.m3n4.core.Container.Telephone;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.VatID;
import org.kyojo.schemaorg.m3n4.core.Container.Weight;
import org.kyojo.schemaorg.m3n4.core.Container.WorkLocation;
import org.kyojo.schemaorg.m3n4.core.Container.WorksFor;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Diagnosis;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaorg.m3n4.meta.Container.SupersededBy;
import org.kyojo.schemaorg.m3n4.pending.Container.HasOccupation;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsAbout;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsLanguage;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class PATIENT implements Clazz.Patient {

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
	public AdditionalName additionalName;
	public AdditionalType additionalType;
	public Address address;
	public Affiliation affiliation;
	public AlternateName alternateName;
	public AlumniOf alumniOf;
	public AudienceType audienceType;
	public Award award;
	public BirthDate birthDate;
	public BirthPlace birthPlace;
	public Brand brand;
	public Children children;
	public Colleague colleague;
	public ContactPoint contactPoint;
	public DeathDate deathDate;
	public DeathPlace deathPlace;
	public Description description;
	public Diagnosis diagnosis;
	public DisambiguatingDescription disambiguatingDescription;
	public Drug drug;
	public Duns duns;
	public Email email;
	public FamilyName familyName;
	public FamilyNameRuby familyNameRuby;
	public FaxNumber faxNumber;
	public Follows follows;
	public Funder funder;
	public Gender gender;
	public GeographicArea geographicArea;
	public GivenName givenName;
	public GivenNameRuby givenNameRuby;
	public GlobalLocationNumber globalLocationNumber;
	public HasOccupation hasOccupation;
	public HasOfferCatalog hasOfferCatalog;
	public HasPOS hasPOS;
	public HealthCondition healthCondition;
	public Height height;
	public HomeLocation homeLocation;
	public HonorificPrefix honorificPrefix;
	public HonorificSuffix honorificSuffix;
	public Identifier identifier;
	public Image image;
	public IsicV4 isicV4;
	public JobTitle jobTitle;
	public Knows knows;
	public KnowsAbout knowsAbout;
	public KnowsLanguage knowsLanguage;
	public MainEntityOfPage mainEntityOfPage;
	public MakesOffer makesOffer;
	public MemberOf memberOf;
	public Naics naics;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Nationality nationality;
	public NetWorth netWorth;
	public Owns owns;
	public Parent parent;
	public PerformerIn performerIn;
	public PotentialAction potentialAction;
	public PublishingPrinciples publishingPrinciples;
	public RelatedTo relatedTo;
	public RequiredGender requiredGender;
	public RequiredMaxAge requiredMaxAge;
	public RequiredMinAge requiredMinAge;
	public SameAs sameAs;
	public Seeks seeks;
	public Sibling sibling;
	public Sponsor sponsor;
	public Spouse spouse;
	public SubjectOf subjectOf;
	public SuggestedGender suggestedGender;
	public SuggestedMaxAge suggestedMaxAge;
	public SuggestedMinAge suggestedMinAge;
	public SupersededBy supersededBy;
	public TaxID taxID;
	public Telephone telephone;
	public Url url;
	public VatID vatID;
	public Weight weight;
	public WorkLocation workLocation;
	public WorksFor worksFor;

	public PATIENT() {
	}

	public PATIENT(Long seq) {
		setSeq(seq);
	}

	public PATIENT(String string) {
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

	public PATIENT(AdditionalName additionalName) {
		setAdditionalName(additionalName);
	}

	@Override
	public AdditionalName getAdditionalName() {
		return additionalName;
	}

	@Override
	public void setAdditionalName(AdditionalName additionalName) {
		this.additionalName = additionalName;
	}

	public PATIENT(AdditionalType additionalType) {
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

	public PATIENT(Address address) {
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

	public PATIENT(Affiliation affiliation) {
		setAffiliation(affiliation);
	}

	@Override
	public Affiliation getAffiliation() {
		return affiliation;
	}

	@Override
	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}

	public PATIENT(AlternateName alternateName) {
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

	public PATIENT(AlumniOf alumniOf) {
		setAlumniOf(alumniOf);
	}

	@Override
	public AlumniOf getAlumniOf() {
		return alumniOf;
	}

	@Override
	public void setAlumniOf(AlumniOf alumniOf) {
		this.alumniOf = alumniOf;
	}

	public PATIENT(AudienceType audienceType) {
		setAudienceType(audienceType);
	}

	@Override
	public AudienceType getAudienceType() {
		return audienceType;
	}

	@Override
	public void setAudienceType(AudienceType audienceType) {
		this.audienceType = audienceType;
	}

	public PATIENT(Award award) {
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

	public PATIENT(BirthDate birthDate) {
		setBirthDate(birthDate);
	}

	@Override
	public BirthDate getBirthDate() {
		return birthDate;
	}

	@Override
	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	public PATIENT(BirthPlace birthPlace) {
		setBirthPlace(birthPlace);
	}

	@Override
	public BirthPlace getBirthPlace() {
		return birthPlace;
	}

	@Override
	public void setBirthPlace(BirthPlace birthPlace) {
		this.birthPlace = birthPlace;
	}

	public PATIENT(Brand brand) {
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

	public PATIENT(Children children) {
		setChildren(children);
	}

	@Override
	public Children getChildren() {
		return children;
	}

	@Override
	public void setChildren(Children children) {
		this.children = children;
	}

	public PATIENT(Colleague colleague) {
		setColleague(colleague);
	}

	@Override
	public Colleague getColleague() {
		return colleague;
	}

	@Override
	public void setColleague(Colleague colleague) {
		this.colleague = colleague;
	}

	public PATIENT(ContactPoint contactPoint) {
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

	public PATIENT(DeathDate deathDate) {
		setDeathDate(deathDate);
	}

	@Override
	public DeathDate getDeathDate() {
		return deathDate;
	}

	@Override
	public void setDeathDate(DeathDate deathDate) {
		this.deathDate = deathDate;
	}

	public PATIENT(DeathPlace deathPlace) {
		setDeathPlace(deathPlace);
	}

	@Override
	public DeathPlace getDeathPlace() {
		return deathPlace;
	}

	@Override
	public void setDeathPlace(DeathPlace deathPlace) {
		this.deathPlace = deathPlace;
	}

	public PATIENT(Description description) {
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

	public PATIENT(Diagnosis diagnosis) {
		setDiagnosis(diagnosis);
	}

	@Override
	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	@Override
	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public PATIENT(DisambiguatingDescription disambiguatingDescription) {
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

	public PATIENT(Drug drug) {
		setDrug(drug);
	}

	@Override
	public Drug getDrug() {
		return drug;
	}

	@Override
	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public PATIENT(Duns duns) {
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

	public PATIENT(Email email) {
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

	public PATIENT(FamilyName familyName) {
		setFamilyName(familyName);
	}

	@Override
	public FamilyName getFamilyName() {
		return familyName;
	}

	@Override
	public void setFamilyName(FamilyName familyName) {
		this.familyName = familyName;
	}

	public PATIENT(FamilyNameRuby familyNameRuby) {
		setFamilyNameRuby(familyNameRuby);
	}

	@Override
	public FamilyNameRuby getFamilyNameRuby() {
		return familyNameRuby;
	}

	@Override
	public void setFamilyNameRuby(FamilyNameRuby familyNameRuby) {
		this.familyNameRuby = familyNameRuby;
	}

	public PATIENT(FaxNumber faxNumber) {
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

	public PATIENT(Follows follows) {
		setFollows(follows);
	}

	@Override
	public Follows getFollows() {
		return follows;
	}

	@Override
	public void setFollows(Follows follows) {
		this.follows = follows;
	}

	public PATIENT(Funder funder) {
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

	public PATIENT(Gender gender) {
		setGender(gender);
	}

	@Override
	public Gender getGender() {
		return gender;
	}

	@Override
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public PATIENT(GeographicArea geographicArea) {
		setGeographicArea(geographicArea);
	}

	@Override
	public GeographicArea getGeographicArea() {
		return geographicArea;
	}

	@Override
	public void setGeographicArea(GeographicArea geographicArea) {
		this.geographicArea = geographicArea;
	}

	public PATIENT(GivenName givenName) {
		setGivenName(givenName);
	}

	@Override
	public GivenName getGivenName() {
		return givenName;
	}

	@Override
	public void setGivenName(GivenName givenName) {
		this.givenName = givenName;
	}

	public PATIENT(GivenNameRuby givenNameRuby) {
		setGivenNameRuby(givenNameRuby);
	}

	@Override
	public GivenNameRuby getGivenNameRuby() {
		return givenNameRuby;
	}

	@Override
	public void setGivenNameRuby(GivenNameRuby givenNameRuby) {
		this.givenNameRuby = givenNameRuby;
	}

	public PATIENT(GlobalLocationNumber globalLocationNumber) {
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

	public PATIENT(HasOccupation hasOccupation) {
		setHasOccupation(hasOccupation);
	}

	@Override
	public HasOccupation getHasOccupation() {
		return hasOccupation;
	}

	@Override
	public void setHasOccupation(HasOccupation hasOccupation) {
		this.hasOccupation = hasOccupation;
	}

	public PATIENT(HasOfferCatalog hasOfferCatalog) {
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

	public PATIENT(HasPOS hasPOS) {
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

	public PATIENT(HealthCondition healthCondition) {
		setHealthCondition(healthCondition);
	}

	@Override
	public HealthCondition getHealthCondition() {
		return healthCondition;
	}

	@Override
	public void setHealthCondition(HealthCondition healthCondition) {
		this.healthCondition = healthCondition;
	}

	public PATIENT(Height height) {
		setHeight(height);
	}

	@Override
	public Height getHeight() {
		return height;
	}

	@Override
	public void setHeight(Height height) {
		this.height = height;
	}

	public PATIENT(HomeLocation homeLocation) {
		setHomeLocation(homeLocation);
	}

	@Override
	public HomeLocation getHomeLocation() {
		return homeLocation;
	}

	@Override
	public void setHomeLocation(HomeLocation homeLocation) {
		this.homeLocation = homeLocation;
	}

	public PATIENT(HonorificPrefix honorificPrefix) {
		setHonorificPrefix(honorificPrefix);
	}

	@Override
	public HonorificPrefix getHonorificPrefix() {
		return honorificPrefix;
	}

	@Override
	public void setHonorificPrefix(HonorificPrefix honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}

	public PATIENT(HonorificSuffix honorificSuffix) {
		setHonorificSuffix(honorificSuffix);
	}

	@Override
	public HonorificSuffix getHonorificSuffix() {
		return honorificSuffix;
	}

	@Override
	public void setHonorificSuffix(HonorificSuffix honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
	}

	public PATIENT(Identifier identifier) {
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

	public PATIENT(Image image) {
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

	public PATIENT(IsicV4 isicV4) {
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

	public PATIENT(JobTitle jobTitle) {
		setJobTitle(jobTitle);
	}

	@Override
	public JobTitle getJobTitle() {
		return jobTitle;
	}

	@Override
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public PATIENT(Knows knows) {
		setKnows(knows);
	}

	@Override
	public Knows getKnows() {
		return knows;
	}

	@Override
	public void setKnows(Knows knows) {
		this.knows = knows;
	}

	public PATIENT(KnowsAbout knowsAbout) {
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

	public PATIENT(KnowsLanguage knowsLanguage) {
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

	public PATIENT(MainEntityOfPage mainEntityOfPage) {
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

	public PATIENT(MakesOffer makesOffer) {
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

	public PATIENT(MemberOf memberOf) {
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

	public PATIENT(Naics naics) {
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

	public PATIENT(Name name) {
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

	public PATIENT(NameFuzzy nameFuzzy) {
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

	public PATIENT(NameRuby nameRuby) {
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

	public PATIENT(Nationality nationality) {
		setNationality(nationality);
	}

	@Override
	public Nationality getNationality() {
		return nationality;
	}

	@Override
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public PATIENT(NetWorth netWorth) {
		setNetWorth(netWorth);
	}

	@Override
	public NetWorth getNetWorth() {
		return netWorth;
	}

	@Override
	public void setNetWorth(NetWorth netWorth) {
		this.netWorth = netWorth;
	}

	public PATIENT(Owns owns) {
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

	public PATIENT(Parent parent) {
		setParent(parent);
	}

	@Override
	public Parent getParent() {
		return parent;
	}

	@Override
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public PATIENT(PerformerIn performerIn) {
		setPerformerIn(performerIn);
	}

	@Override
	public PerformerIn getPerformerIn() {
		return performerIn;
	}

	@Override
	public void setPerformerIn(PerformerIn performerIn) {
		this.performerIn = performerIn;
	}

	public PATIENT(PotentialAction potentialAction) {
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

	public PATIENT(PublishingPrinciples publishingPrinciples) {
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

	public PATIENT(RelatedTo relatedTo) {
		setRelatedTo(relatedTo);
	}

	@Override
	public RelatedTo getRelatedTo() {
		return relatedTo;
	}

	@Override
	public void setRelatedTo(RelatedTo relatedTo) {
		this.relatedTo = relatedTo;
	}

	public PATIENT(RequiredGender requiredGender) {
		setRequiredGender(requiredGender);
	}

	@Override
	public RequiredGender getRequiredGender() {
		return requiredGender;
	}

	@Override
	public void setRequiredGender(RequiredGender requiredGender) {
		this.requiredGender = requiredGender;
	}

	public PATIENT(RequiredMaxAge requiredMaxAge) {
		setRequiredMaxAge(requiredMaxAge);
	}

	@Override
	public RequiredMaxAge getRequiredMaxAge() {
		return requiredMaxAge;
	}

	@Override
	public void setRequiredMaxAge(RequiredMaxAge requiredMaxAge) {
		this.requiredMaxAge = requiredMaxAge;
	}

	public PATIENT(RequiredMinAge requiredMinAge) {
		setRequiredMinAge(requiredMinAge);
	}

	@Override
	public RequiredMinAge getRequiredMinAge() {
		return requiredMinAge;
	}

	@Override
	public void setRequiredMinAge(RequiredMinAge requiredMinAge) {
		this.requiredMinAge = requiredMinAge;
	}

	public PATIENT(SameAs sameAs) {
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

	public PATIENT(Seeks seeks) {
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

	public PATIENT(Sibling sibling) {
		setSibling(sibling);
	}

	@Override
	public Sibling getSibling() {
		return sibling;
	}

	@Override
	public void setSibling(Sibling sibling) {
		this.sibling = sibling;
	}

	public PATIENT(Sponsor sponsor) {
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

	public PATIENT(Spouse spouse) {
		setSpouse(spouse);
	}

	@Override
	public Spouse getSpouse() {
		return spouse;
	}

	@Override
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public PATIENT(SubjectOf subjectOf) {
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

	public PATIENT(SuggestedGender suggestedGender) {
		setSuggestedGender(suggestedGender);
	}

	@Override
	public SuggestedGender getSuggestedGender() {
		return suggestedGender;
	}

	@Override
	public void setSuggestedGender(SuggestedGender suggestedGender) {
		this.suggestedGender = suggestedGender;
	}

	public PATIENT(SuggestedMaxAge suggestedMaxAge) {
		setSuggestedMaxAge(suggestedMaxAge);
	}

	@Override
	public SuggestedMaxAge getSuggestedMaxAge() {
		return suggestedMaxAge;
	}

	@Override
	public void setSuggestedMaxAge(SuggestedMaxAge suggestedMaxAge) {
		this.suggestedMaxAge = suggestedMaxAge;
	}

	public PATIENT(SuggestedMinAge suggestedMinAge) {
		setSuggestedMinAge(suggestedMinAge);
	}

	@Override
	public SuggestedMinAge getSuggestedMinAge() {
		return suggestedMinAge;
	}

	@Override
	public void setSuggestedMinAge(SuggestedMinAge suggestedMinAge) {
		this.suggestedMinAge = suggestedMinAge;
	}

	public PATIENT(SupersededBy supersededBy) {
		setSupersededBy(supersededBy);
	}

	@Override
	public SupersededBy getSupersededBy() {
		return supersededBy;
	}

	@Override
	public void setSupersededBy(SupersededBy supersededBy) {
		this.supersededBy = supersededBy;
	}

	public PATIENT(TaxID taxID) {
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

	public PATIENT(Telephone telephone) {
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

	public PATIENT(Url url) {
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

	public PATIENT(VatID vatID) {
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

	public PATIENT(Weight weight) {
		setWeight(weight);
	}

	@Override
	public Weight getWeight() {
		return weight;
	}

	@Override
	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public PATIENT(WorkLocation workLocation) {
		setWorkLocation(workLocation);
	}

	@Override
	public WorkLocation getWorkLocation() {
		return workLocation;
	}

	@Override
	public void setWorkLocation(WorkLocation workLocation) {
		this.workLocation = workLocation;
	}

	public PATIENT(WorksFor worksFor) {
		setWorksFor(worksFor);
	}

	@Override
	public WorksFor getWorksFor() {
		return worksFor;
	}

	@Override
	public void setWorksFor(WorksFor worksFor) {
		this.worksFor = worksFor;
	}

	public void copy(Clazz.Patient org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalName(org.getAdditionalName());
		setAdditionalType(org.getAdditionalType());
		setAddress(org.getAddress());
		setAffiliation(org.getAffiliation());
		setAlternateName(org.getAlternateName());
		setAlumniOf(org.getAlumniOf());
		setAudienceType(org.getAudienceType());
		setAward(org.getAward());
		setBirthDate(org.getBirthDate());
		setBirthPlace(org.getBirthPlace());
		setBrand(org.getBrand());
		setChildren(org.getChildren());
		setColleague(org.getColleague());
		setContactPoint(org.getContactPoint());
		setDeathDate(org.getDeathDate());
		setDeathPlace(org.getDeathPlace());
		setDescription(org.getDescription());
		setDiagnosis(org.getDiagnosis());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDrug(org.getDrug());
		setDuns(org.getDuns());
		setEmail(org.getEmail());
		setFamilyName(org.getFamilyName());
		setFamilyNameRuby(org.getFamilyNameRuby());
		setFaxNumber(org.getFaxNumber());
		setFollows(org.getFollows());
		setFunder(org.getFunder());
		setGender(org.getGender());
		setGeographicArea(org.getGeographicArea());
		setGivenName(org.getGivenName());
		setGivenNameRuby(org.getGivenNameRuby());
		setGlobalLocationNumber(org.getGlobalLocationNumber());
		setHasOccupation(org.getHasOccupation());
		setHasOfferCatalog(org.getHasOfferCatalog());
		setHasPOS(org.getHasPOS());
		setHealthCondition(org.getHealthCondition());
		setHeight(org.getHeight());
		setHomeLocation(org.getHomeLocation());
		setHonorificPrefix(org.getHonorificPrefix());
		setHonorificSuffix(org.getHonorificSuffix());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsicV4(org.getIsicV4());
		setJobTitle(org.getJobTitle());
		setKnows(org.getKnows());
		setKnowsAbout(org.getKnowsAbout());
		setKnowsLanguage(org.getKnowsLanguage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMakesOffer(org.getMakesOffer());
		setMemberOf(org.getMemberOf());
		setNaics(org.getNaics());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNationality(org.getNationality());
		setNetWorth(org.getNetWorth());
		setOwns(org.getOwns());
		setParent(org.getParent());
		setPerformerIn(org.getPerformerIn());
		setPotentialAction(org.getPotentialAction());
		setPublishingPrinciples(org.getPublishingPrinciples());
		setRelatedTo(org.getRelatedTo());
		setRequiredGender(org.getRequiredGender());
		setRequiredMaxAge(org.getRequiredMaxAge());
		setRequiredMinAge(org.getRequiredMinAge());
		setSameAs(org.getSameAs());
		setSeeks(org.getSeeks());
		setSibling(org.getSibling());
		setSponsor(org.getSponsor());
		setSpouse(org.getSpouse());
		setSubjectOf(org.getSubjectOf());
		setSuggestedGender(org.getSuggestedGender());
		setSuggestedMaxAge(org.getSuggestedMaxAge());
		setSuggestedMinAge(org.getSuggestedMinAge());
		setSupersededBy(org.getSupersededBy());
		setTaxID(org.getTaxID());
		setTelephone(org.getTelephone());
		setUrl(org.getUrl());
		setVatID(org.getVatID());
		setWeight(org.getWeight());
		setWorkLocation(org.getWorkLocation());
		setWorksFor(org.getWorksFor());
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
