package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AddressCountry;
import org.kyojo.schemaorg.m3n4.core.Container.AddressLocality;
import org.kyojo.schemaorg.m3n4.core.Container.AddressRegion;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.BuildingAddress;
import org.kyojo.schemaorg.m3n4.core.Container.ContactOption;
import org.kyojo.schemaorg.m3n4.core.Container.ContactType;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Email;
import org.kyojo.schemaorg.m3n4.core.Container.FaxNumber;
import org.kyojo.schemaorg.m3n4.core.Container.HoursAvailable;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PostOfficeBoxNumber;
import org.kyojo.schemaorg.m3n4.core.Container.PostalCode;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.ProductSupported;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.StreetAddress;
import org.kyojo.schemaorg.m3n4.core.Container.Telephone;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class POSTAL_ADDRESS implements Clazz.PostalAddress {

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
	public AddressCountry addressCountry;
	public AddressLocality addressLocality;
	public AddressRegion addressRegion;
	public AlternateName alternateName;
	public AreaServed areaServed;
	public AvailableLanguage availableLanguage;
	public BuildingAddress buildingAddress;
	public ContactOption contactOption;
	public ContactType contactType;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Email email;
	public FaxNumber faxNumber;
	public HoursAvailable hoursAvailable;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PostOfficeBoxNumber postOfficeBoxNumber;
	public PostalCode postalCode;
	public PotentialAction potentialAction;
	public ProductSupported productSupported;
	public SameAs sameAs;
	public StreetAddress streetAddress;
	public SubjectOf subjectOf;
	public Telephone telephone;
	public Url url;

	public POSTAL_ADDRESS() {
	}

	public POSTAL_ADDRESS(Long seq) {
		setSeq(seq);
	}

	public POSTAL_ADDRESS(String string) {
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

	public POSTAL_ADDRESS(AdditionalType additionalType) {
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

	public POSTAL_ADDRESS(AddressCountry addressCountry) {
		setAddressCountry(addressCountry);
	}

	@Override
	public AddressCountry getAddressCountry() {
		return addressCountry;
	}

	@Override
	public void setAddressCountry(AddressCountry addressCountry) {
		this.addressCountry = addressCountry;
	}

	public POSTAL_ADDRESS(AddressLocality addressLocality) {
		setAddressLocality(addressLocality);
	}

	@Override
	public AddressLocality getAddressLocality() {
		return addressLocality;
	}

	@Override
	public void setAddressLocality(AddressLocality addressLocality) {
		this.addressLocality = addressLocality;
	}

	public POSTAL_ADDRESS(AddressRegion addressRegion) {
		setAddressRegion(addressRegion);
	}

	@Override
	public AddressRegion getAddressRegion() {
		return addressRegion;
	}

	@Override
	public void setAddressRegion(AddressRegion addressRegion) {
		this.addressRegion = addressRegion;
	}

	public POSTAL_ADDRESS(AlternateName alternateName) {
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

	public POSTAL_ADDRESS(AreaServed areaServed) {
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

	public POSTAL_ADDRESS(AvailableLanguage availableLanguage) {
		setAvailableLanguage(availableLanguage);
	}

	@Override
	public AvailableLanguage getAvailableLanguage() {
		return availableLanguage;
	}

	@Override
	public void setAvailableLanguage(AvailableLanguage availableLanguage) {
		this.availableLanguage = availableLanguage;
	}

	public POSTAL_ADDRESS(BuildingAddress buildingAddress) {
		setBuildingAddress(buildingAddress);
	}

	@Override
	public BuildingAddress getBuildingAddress() {
		return buildingAddress;
	}

	@Override
	public void setBuildingAddress(BuildingAddress buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public POSTAL_ADDRESS(ContactOption contactOption) {
		setContactOption(contactOption);
	}

	@Override
	public ContactOption getContactOption() {
		return contactOption;
	}

	@Override
	public void setContactOption(ContactOption contactOption) {
		this.contactOption = contactOption;
	}

	public POSTAL_ADDRESS(ContactType contactType) {
		setContactType(contactType);
	}

	@Override
	public ContactType getContactType() {
		return contactType;
	}

	@Override
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public POSTAL_ADDRESS(Description description) {
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

	public POSTAL_ADDRESS(DisambiguatingDescription disambiguatingDescription) {
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

	public POSTAL_ADDRESS(Email email) {
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

	public POSTAL_ADDRESS(FaxNumber faxNumber) {
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

	public POSTAL_ADDRESS(HoursAvailable hoursAvailable) {
		setHoursAvailable(hoursAvailable);
	}

	@Override
	public HoursAvailable getHoursAvailable() {
		return hoursAvailable;
	}

	@Override
	public void setHoursAvailable(HoursAvailable hoursAvailable) {
		this.hoursAvailable = hoursAvailable;
	}

	public POSTAL_ADDRESS(Identifier identifier) {
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

	public POSTAL_ADDRESS(Image image) {
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

	public POSTAL_ADDRESS(MainEntityOfPage mainEntityOfPage) {
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

	public POSTAL_ADDRESS(Name name) {
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

	public POSTAL_ADDRESS(NameFuzzy nameFuzzy) {
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

	public POSTAL_ADDRESS(NameRuby nameRuby) {
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

	public POSTAL_ADDRESS(PostOfficeBoxNumber postOfficeBoxNumber) {
		setPostOfficeBoxNumber(postOfficeBoxNumber);
	}

	@Override
	public PostOfficeBoxNumber getPostOfficeBoxNumber() {
		return postOfficeBoxNumber;
	}

	@Override
	public void setPostOfficeBoxNumber(PostOfficeBoxNumber postOfficeBoxNumber) {
		this.postOfficeBoxNumber = postOfficeBoxNumber;
	}

	public POSTAL_ADDRESS(PostalCode postalCode) {
		setPostalCode(postalCode);
	}

	@Override
	public PostalCode getPostalCode() {
		return postalCode;
	}

	@Override
	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	public POSTAL_ADDRESS(PotentialAction potentialAction) {
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

	public POSTAL_ADDRESS(ProductSupported productSupported) {
		setProductSupported(productSupported);
	}

	@Override
	public ProductSupported getProductSupported() {
		return productSupported;
	}

	@Override
	public void setProductSupported(ProductSupported productSupported) {
		this.productSupported = productSupported;
	}

	public POSTAL_ADDRESS(SameAs sameAs) {
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

	public POSTAL_ADDRESS(StreetAddress streetAddress) {
		setStreetAddress(streetAddress);
	}

	@Override
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	@Override
	public void setStreetAddress(StreetAddress streetAddress) {
		this.streetAddress = streetAddress;
	}

	public POSTAL_ADDRESS(SubjectOf subjectOf) {
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

	public POSTAL_ADDRESS(Telephone telephone) {
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

	public POSTAL_ADDRESS(Url url) {
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

	public void copy(Clazz.PostalAddress org) {
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
		setAddressCountry(org.getAddressCountry());
		setAddressLocality(org.getAddressLocality());
		setAddressRegion(org.getAddressRegion());
		setAlternateName(org.getAlternateName());
		setAreaServed(org.getAreaServed());
		setAvailableLanguage(org.getAvailableLanguage());
		setBuildingAddress(org.getBuildingAddress());
		setContactOption(org.getContactOption());
		setContactType(org.getContactType());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEmail(org.getEmail());
		setFaxNumber(org.getFaxNumber());
		setHoursAvailable(org.getHoursAvailable());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPostOfficeBoxNumber(org.getPostOfficeBoxNumber());
		setPostalCode(org.getPostalCode());
		setPotentialAction(org.getPotentialAction());
		setProductSupported(org.getProductSupported());
		setSameAs(org.getSameAs());
		setStreetAddress(org.getStreetAddress());
		setSubjectOf(org.getSubjectOf());
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
