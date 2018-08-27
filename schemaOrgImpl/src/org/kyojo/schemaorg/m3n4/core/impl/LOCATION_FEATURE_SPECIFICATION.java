package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.HoursAvailable;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MaxValue;
import org.kyojo.schemaorg.m3n4.core.Container.MinValue;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.PropertyID;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.UnitCode;
import org.kyojo.schemaorg.m3n4.core.Container.UnitText;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.ValidFrom;
import org.kyojo.schemaorg.m3n4.core.Container.ValidThrough;
import org.kyojo.schemaorg.m3n4.core.Container.Value;
import org.kyojo.schemaorg.m3n4.core.Container.ValueReference;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.MeasurementTechnique;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class LOCATION_FEATURE_SPECIFICATION implements Clazz.LocationFeatureSpecification {

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
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HoursAvailable hoursAvailable;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MaxValue maxValue;
	public MeasurementTechnique measurementTechnique;
	public MinValue minValue;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public PropertyID propertyID;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public UnitCode unitCode;
	public UnitText unitText;
	public Url url;
	public ValidFrom validFrom;
	public ValidThrough validThrough;
	public Value value;
	public ValueReference valueReference;

	public LOCATION_FEATURE_SPECIFICATION() {
	}

	public LOCATION_FEATURE_SPECIFICATION(Long seq) {
		setSeq(seq);
	}

	public LOCATION_FEATURE_SPECIFICATION(String string) {
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

	public LOCATION_FEATURE_SPECIFICATION(AdditionalType additionalType) {
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

	public LOCATION_FEATURE_SPECIFICATION(AlternateName alternateName) {
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

	public LOCATION_FEATURE_SPECIFICATION(Description description) {
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

	public LOCATION_FEATURE_SPECIFICATION(DisambiguatingDescription disambiguatingDescription) {
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

	public LOCATION_FEATURE_SPECIFICATION(HoursAvailable hoursAvailable) {
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

	public LOCATION_FEATURE_SPECIFICATION(Identifier identifier) {
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

	public LOCATION_FEATURE_SPECIFICATION(Image image) {
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

	public LOCATION_FEATURE_SPECIFICATION(MainEntityOfPage mainEntityOfPage) {
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

	public LOCATION_FEATURE_SPECIFICATION(MaxValue maxValue) {
		setMaxValue(maxValue);
	}

	@Override
	public MaxValue getMaxValue() {
		return maxValue;
	}

	@Override
	public void setMaxValue(MaxValue maxValue) {
		this.maxValue = maxValue;
	}

	public LOCATION_FEATURE_SPECIFICATION(MeasurementTechnique measurementTechnique) {
		setMeasurementTechnique(measurementTechnique);
	}

	@Override
	public MeasurementTechnique getMeasurementTechnique() {
		return measurementTechnique;
	}

	@Override
	public void setMeasurementTechnique(MeasurementTechnique measurementTechnique) {
		this.measurementTechnique = measurementTechnique;
	}

	public LOCATION_FEATURE_SPECIFICATION(MinValue minValue) {
		setMinValue(minValue);
	}

	@Override
	public MinValue getMinValue() {
		return minValue;
	}

	@Override
	public void setMinValue(MinValue minValue) {
		this.minValue = minValue;
	}

	public LOCATION_FEATURE_SPECIFICATION(Name name) {
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

	public LOCATION_FEATURE_SPECIFICATION(NameFuzzy nameFuzzy) {
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

	public LOCATION_FEATURE_SPECIFICATION(NameRuby nameRuby) {
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

	public LOCATION_FEATURE_SPECIFICATION(PotentialAction potentialAction) {
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

	public LOCATION_FEATURE_SPECIFICATION(PropertyID propertyID) {
		setPropertyID(propertyID);
	}

	@Override
	public PropertyID getPropertyID() {
		return propertyID;
	}

	@Override
	public void setPropertyID(PropertyID propertyID) {
		this.propertyID = propertyID;
	}

	public LOCATION_FEATURE_SPECIFICATION(SameAs sameAs) {
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

	public LOCATION_FEATURE_SPECIFICATION(SubjectOf subjectOf) {
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

	public LOCATION_FEATURE_SPECIFICATION(UnitCode unitCode) {
		setUnitCode(unitCode);
	}

	@Override
	public UnitCode getUnitCode() {
		return unitCode;
	}

	@Override
	public void setUnitCode(UnitCode unitCode) {
		this.unitCode = unitCode;
	}

	public LOCATION_FEATURE_SPECIFICATION(UnitText unitText) {
		setUnitText(unitText);
	}

	@Override
	public UnitText getUnitText() {
		return unitText;
	}

	@Override
	public void setUnitText(UnitText unitText) {
		this.unitText = unitText;
	}

	public LOCATION_FEATURE_SPECIFICATION(Url url) {
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

	public LOCATION_FEATURE_SPECIFICATION(ValidFrom validFrom) {
		setValidFrom(validFrom);
	}

	@Override
	public ValidFrom getValidFrom() {
		return validFrom;
	}

	@Override
	public void setValidFrom(ValidFrom validFrom) {
		this.validFrom = validFrom;
	}

	public LOCATION_FEATURE_SPECIFICATION(ValidThrough validThrough) {
		setValidThrough(validThrough);
	}

	@Override
	public ValidThrough getValidThrough() {
		return validThrough;
	}

	@Override
	public void setValidThrough(ValidThrough validThrough) {
		this.validThrough = validThrough;
	}

	public LOCATION_FEATURE_SPECIFICATION(Value value) {
		setValue(value);
	}

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public void setValue(Value value) {
		this.value = value;
	}

	public LOCATION_FEATURE_SPECIFICATION(ValueReference valueReference) {
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

	public LOCATION_FEATURE_SPECIFICATION(Long seq,
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
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			HoursAvailable hoursAvailable,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			MaxValue maxValue,
			MeasurementTechnique measurementTechnique,
			MinValue minValue,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			PropertyID propertyID,
			SameAs sameAs,
			SubjectOf subjectOf,
			UnitCode unitCode,
			UnitText unitText,
			Url url,
			ValidFrom validFrom,
			ValidThrough validThrough,
			Value value,
			ValueReference valueReference) {
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
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setHoursAvailable(hoursAvailable);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setMaxValue(maxValue);
		setMeasurementTechnique(measurementTechnique);
		setMinValue(minValue);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setPropertyID(propertyID);
		setSameAs(sameAs);
		setSubjectOf(subjectOf);
		setUnitCode(unitCode);
		setUnitText(unitText);
		setUrl(url);
		setValidFrom(validFrom);
		setValidThrough(validThrough);
		setValue(value);
		setValueReference(valueReference);
	}

	public void copy(Clazz.LocationFeatureSpecification org) {
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
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHoursAvailable(org.getHoursAvailable());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaxValue(org.getMaxValue());
		setMeasurementTechnique(org.getMeasurementTechnique());
		setMinValue(org.getMinValue());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setPropertyID(org.getPropertyID());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setUnitCode(org.getUnitCode());
		setUnitText(org.getUnitText());
		setUrl(org.getUrl());
		setValidFrom(org.getValidFrom());
		setValidThrough(org.getValidThrough());
		setValue(org.getValue());
		setValueReference(org.getValueReference());
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
