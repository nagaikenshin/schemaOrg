package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.ProcessingTime;
import org.kyojo.schemaorg.m3n4.core.Container.ProvidesService;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceLocation;
import org.kyojo.schemaorg.m3n4.core.Container.ServicePhone;
import org.kyojo.schemaorg.m3n4.core.Container.ServicePostalAddress;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceSmsNumber;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceUrl;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class SERVICE_CHANNEL implements Clazz.ServiceChannel {

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
	public AvailableLanguage availableLanguage;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public ProcessingTime processingTime;
	public ProvidesService providesService;
	public SameAs sameAs;
	public ServiceLocation serviceLocation;
	public ServicePhone servicePhone;
	public ServicePostalAddress servicePostalAddress;
	public ServiceSmsNumber serviceSmsNumber;
	public ServiceUrl serviceUrl;
	public SubjectOf subjectOf;
	public Url url;

	public SERVICE_CHANNEL() {
	}

	public SERVICE_CHANNEL(Long seq) {
		setSeq(seq);
	}

	public SERVICE_CHANNEL(String string) {
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

	public SERVICE_CHANNEL(AdditionalType additionalType) {
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

	public SERVICE_CHANNEL(AlternateName alternateName) {
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

	public SERVICE_CHANNEL(AvailableLanguage availableLanguage) {
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

	public SERVICE_CHANNEL(Description description) {
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

	public SERVICE_CHANNEL(DisambiguatingDescription disambiguatingDescription) {
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

	public SERVICE_CHANNEL(Identifier identifier) {
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

	public SERVICE_CHANNEL(Image image) {
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

	public SERVICE_CHANNEL(MainEntityOfPage mainEntityOfPage) {
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

	public SERVICE_CHANNEL(Name name) {
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

	public SERVICE_CHANNEL(NameFuzzy nameFuzzy) {
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

	public SERVICE_CHANNEL(NameRuby nameRuby) {
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

	public SERVICE_CHANNEL(PotentialAction potentialAction) {
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

	public SERVICE_CHANNEL(ProcessingTime processingTime) {
		setProcessingTime(processingTime);
	}

	@Override
	public ProcessingTime getProcessingTime() {
		return processingTime;
	}

	@Override
	public void setProcessingTime(ProcessingTime processingTime) {
		this.processingTime = processingTime;
	}

	public SERVICE_CHANNEL(ProvidesService providesService) {
		setProvidesService(providesService);
	}

	@Override
	public ProvidesService getProvidesService() {
		return providesService;
	}

	@Override
	public void setProvidesService(ProvidesService providesService) {
		this.providesService = providesService;
	}

	public SERVICE_CHANNEL(SameAs sameAs) {
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

	public SERVICE_CHANNEL(ServiceLocation serviceLocation) {
		setServiceLocation(serviceLocation);
	}

	@Override
	public ServiceLocation getServiceLocation() {
		return serviceLocation;
	}

	@Override
	public void setServiceLocation(ServiceLocation serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	public SERVICE_CHANNEL(ServicePhone servicePhone) {
		setServicePhone(servicePhone);
	}

	@Override
	public ServicePhone getServicePhone() {
		return servicePhone;
	}

	@Override
	public void setServicePhone(ServicePhone servicePhone) {
		this.servicePhone = servicePhone;
	}

	public SERVICE_CHANNEL(ServicePostalAddress servicePostalAddress) {
		setServicePostalAddress(servicePostalAddress);
	}

	@Override
	public ServicePostalAddress getServicePostalAddress() {
		return servicePostalAddress;
	}

	@Override
	public void setServicePostalAddress(ServicePostalAddress servicePostalAddress) {
		this.servicePostalAddress = servicePostalAddress;
	}

	public SERVICE_CHANNEL(ServiceSmsNumber serviceSmsNumber) {
		setServiceSmsNumber(serviceSmsNumber);
	}

	@Override
	public ServiceSmsNumber getServiceSmsNumber() {
		return serviceSmsNumber;
	}

	@Override
	public void setServiceSmsNumber(ServiceSmsNumber serviceSmsNumber) {
		this.serviceSmsNumber = serviceSmsNumber;
	}

	public SERVICE_CHANNEL(ServiceUrl serviceUrl) {
		setServiceUrl(serviceUrl);
	}

	@Override
	public ServiceUrl getServiceUrl() {
		return serviceUrl;
	}

	@Override
	public void setServiceUrl(ServiceUrl serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public SERVICE_CHANNEL(SubjectOf subjectOf) {
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

	public SERVICE_CHANNEL(Url url) {
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

	public SERVICE_CHANNEL(Long seq,
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
			AvailableLanguage availableLanguage,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			ProcessingTime processingTime,
			ProvidesService providesService,
			SameAs sameAs,
			ServiceLocation serviceLocation,
			ServicePhone servicePhone,
			ServicePostalAddress servicePostalAddress,
			ServiceSmsNumber serviceSmsNumber,
			ServiceUrl serviceUrl,
			SubjectOf subjectOf,
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
		setAvailableLanguage(availableLanguage);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setProcessingTime(processingTime);
		setProvidesService(providesService);
		setSameAs(sameAs);
		setServiceLocation(serviceLocation);
		setServicePhone(servicePhone);
		setServicePostalAddress(servicePostalAddress);
		setServiceSmsNumber(serviceSmsNumber);
		setServiceUrl(serviceUrl);
		setSubjectOf(subjectOf);
		setUrl(url);
	}

	public void copy(Clazz.ServiceChannel org) {
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
		setAvailableLanguage(org.getAvailableLanguage());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setProcessingTime(org.getProcessingTime());
		setProvidesService(org.getProvidesService());
		setSameAs(org.getSameAs());
		setServiceLocation(org.getServiceLocation());
		setServicePhone(org.getServicePhone());
		setServicePostalAddress(org.getServicePostalAddress());
		setServiceSmsNumber(org.getServiceSmsNumber());
		setServiceUrl(org.getServiceUrl());
		setSubjectOf(org.getSubjectOf());
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
