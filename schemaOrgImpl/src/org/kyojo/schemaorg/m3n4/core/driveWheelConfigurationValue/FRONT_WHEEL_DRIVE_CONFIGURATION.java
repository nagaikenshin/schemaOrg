package org.kyojo.schemaorg.m3n4.core.driveWheelConfigurationValue;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Equal;
import org.kyojo.schemaorg.m3n4.core.Container.Greater;
import org.kyojo.schemaorg.m3n4.core.Container.GreaterOrEqual;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.Lesser;
import org.kyojo.schemaorg.m3n4.core.Container.LesserOrEqual;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.NonEqual;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.ValueReference;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.DriveWheelConfigurationValue;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.meta.Container.SupersededBy;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class FRONT_WHEEL_DRIVE_CONFIGURATION implements DriveWheelConfigurationValue.FrontWheelDriveConfiguration {

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
	public AlternateName alternateName;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Equal equal;
	public Greater greater;
	public GreaterOrEqual greaterOrEqual;
	public Identifier identifier;
	public Image image;
	public Lesser lesser;
	public LesserOrEqual lesserOrEqual;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NonEqual nonEqual;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public SupersededBy supersededBy;
	public Url url;
	public ValueReference valueReference;

	public FRONT_WHEEL_DRIVE_CONFIGURATION() {
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Long seq) {
		setSeq(seq);
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(String string) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(AdditionalProperty additionalProperty) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(AdditionalType additionalType) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(AlternateName alternateName) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Description description) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(DisambiguatingDescription disambiguatingDescription) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Equal equal) {
		setEqual(equal);
	}

	@Override
	public Equal getEqual() {
		return equal;
	}

	@Override
	public void setEqual(Equal equal) {
		this.equal = equal;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Greater greater) {
		setGreater(greater);
	}

	@Override
	public Greater getGreater() {
		return greater;
	}

	@Override
	public void setGreater(Greater greater) {
		this.greater = greater;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(GreaterOrEqual greaterOrEqual) {
		setGreaterOrEqual(greaterOrEqual);
	}

	@Override
	public GreaterOrEqual getGreaterOrEqual() {
		return greaterOrEqual;
	}

	@Override
	public void setGreaterOrEqual(GreaterOrEqual greaterOrEqual) {
		this.greaterOrEqual = greaterOrEqual;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Identifier identifier) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Image image) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Lesser lesser) {
		setLesser(lesser);
	}

	@Override
	public Lesser getLesser() {
		return lesser;
	}

	@Override
	public void setLesser(Lesser lesser) {
		this.lesser = lesser;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(LesserOrEqual lesserOrEqual) {
		setLesserOrEqual(lesserOrEqual);
	}

	@Override
	public LesserOrEqual getLesserOrEqual() {
		return lesserOrEqual;
	}

	@Override
	public void setLesserOrEqual(LesserOrEqual lesserOrEqual) {
		this.lesserOrEqual = lesserOrEqual;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(MainEntityOfPage mainEntityOfPage) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Name name) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(NameFuzzy nameFuzzy) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(NameRuby nameRuby) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(NonEqual nonEqual) {
		setNonEqual(nonEqual);
	}

	@Override
	public NonEqual getNonEqual() {
		return nonEqual;
	}

	@Override
	public void setNonEqual(NonEqual nonEqual) {
		this.nonEqual = nonEqual;
	}

	public FRONT_WHEEL_DRIVE_CONFIGURATION(PotentialAction potentialAction) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(SameAs sameAs) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(SubjectOf subjectOf) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(SupersededBy supersededBy) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(Url url) {
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

	public FRONT_WHEEL_DRIVE_CONFIGURATION(ValueReference valueReference) {
		setValueReference(valueReference);
	}

	@Override
	public ValueReference getValueReference() {
		return valueReference;
	}

	@Override
	public void setValueReference(ValueReference valueReference) {
		this.valueReference = valueReference;
	}

	public void copy(DriveWheelConfigurationValue.FrontWheelDriveConfiguration org) {
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
		setAlternateName(org.getAlternateName());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEqual(org.getEqual());
		setGreater(org.getGreater());
		setGreaterOrEqual(org.getGreaterOrEqual());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setLesser(org.getLesser());
		setLesserOrEqual(org.getLesserOrEqual());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNonEqual(org.getNonEqual());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setSupersededBy(org.getSupersededBy());
		setUrl(org.getUrl());
		setValueReference(org.getValueReference());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return DriveWheelConfigurationValue.FrontWheelDriveConfiguration.class.getAnnotation(SampleValue.class).value();
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
