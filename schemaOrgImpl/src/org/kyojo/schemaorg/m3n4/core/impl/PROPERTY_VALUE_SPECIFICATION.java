package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.DefaultValue;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MaxValue;
import org.kyojo.schemaorg.m3n4.core.Container.MinValue;
import org.kyojo.schemaorg.m3n4.core.Container.MultipleValues;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.ReadonlyValue;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.StepValue;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.ValueMaxLength;
import org.kyojo.schemaorg.m3n4.core.Container.ValueMinLength;
import org.kyojo.schemaorg.m3n4.core.Container.ValueName;
import org.kyojo.schemaorg.m3n4.core.Container.ValuePattern;
import org.kyojo.schemaorg.m3n4.core.Container.ValueRequired;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class PROPERTY_VALUE_SPECIFICATION implements Clazz.PropertyValueSpecification {

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
	public DefaultValue defaultValue;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MaxValue maxValue;
	public MinValue minValue;
	public MultipleValues multipleValues;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public ReadonlyValue readonlyValue;
	public SameAs sameAs;
	public StepValue stepValue;
	public SubjectOf subjectOf;
	public Url url;
	public ValueMaxLength valueMaxLength;
	public ValueMinLength valueMinLength;
	public ValueName valueName;
	public ValuePattern valuePattern;
	public ValueRequired valueRequired;

	public PROPERTY_VALUE_SPECIFICATION() {
	}

	public PROPERTY_VALUE_SPECIFICATION(Long seq) {
		setSeq(seq);
	}

	public PROPERTY_VALUE_SPECIFICATION(String string) {
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

	public PROPERTY_VALUE_SPECIFICATION(AdditionalType additionalType) {
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

	public PROPERTY_VALUE_SPECIFICATION(AlternateName alternateName) {
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

	public PROPERTY_VALUE_SPECIFICATION(DefaultValue defaultValue) {
		setDefaultValue(defaultValue);
	}

	@Override
	public DefaultValue getDefaultValue() {
		return defaultValue;
	}

	@Override
	public void setDefaultValue(DefaultValue defaultValue) {
		this.defaultValue = defaultValue;
	}

	public PROPERTY_VALUE_SPECIFICATION(Description description) {
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

	public PROPERTY_VALUE_SPECIFICATION(DisambiguatingDescription disambiguatingDescription) {
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

	public PROPERTY_VALUE_SPECIFICATION(Identifier identifier) {
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

	public PROPERTY_VALUE_SPECIFICATION(Image image) {
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

	public PROPERTY_VALUE_SPECIFICATION(MainEntityOfPage mainEntityOfPage) {
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

	public PROPERTY_VALUE_SPECIFICATION(MaxValue maxValue) {
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

	public PROPERTY_VALUE_SPECIFICATION(MinValue minValue) {
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

	public PROPERTY_VALUE_SPECIFICATION(MultipleValues multipleValues) {
		setMultipleValues(multipleValues);
	}

	@Override
	public MultipleValues getMultipleValues() {
		return multipleValues;
	}

	@Override
	public void setMultipleValues(MultipleValues multipleValues) {
		this.multipleValues = multipleValues;
	}

	public PROPERTY_VALUE_SPECIFICATION(Name name) {
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

	public PROPERTY_VALUE_SPECIFICATION(NameFuzzy nameFuzzy) {
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

	public PROPERTY_VALUE_SPECIFICATION(NameRuby nameRuby) {
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

	public PROPERTY_VALUE_SPECIFICATION(PotentialAction potentialAction) {
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

	public PROPERTY_VALUE_SPECIFICATION(ReadonlyValue readonlyValue) {
		setReadonlyValue(readonlyValue);
	}

	@Override
	public ReadonlyValue getReadonlyValue() {
		return readonlyValue;
	}

	@Override
	public void setReadonlyValue(ReadonlyValue readonlyValue) {
		this.readonlyValue = readonlyValue;
	}

	public PROPERTY_VALUE_SPECIFICATION(SameAs sameAs) {
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

	public PROPERTY_VALUE_SPECIFICATION(StepValue stepValue) {
		setStepValue(stepValue);
	}

	@Override
	public StepValue getStepValue() {
		return stepValue;
	}

	@Override
	public void setStepValue(StepValue stepValue) {
		this.stepValue = stepValue;
	}

	public PROPERTY_VALUE_SPECIFICATION(SubjectOf subjectOf) {
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

	public PROPERTY_VALUE_SPECIFICATION(Url url) {
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

	public PROPERTY_VALUE_SPECIFICATION(ValueMaxLength valueMaxLength) {
		setValueMaxLength(valueMaxLength);
	}

	@Override
	public ValueMaxLength getValueMaxLength() {
		return valueMaxLength;
	}

	@Override
	public void setValueMaxLength(ValueMaxLength valueMaxLength) {
		this.valueMaxLength = valueMaxLength;
	}

	public PROPERTY_VALUE_SPECIFICATION(ValueMinLength valueMinLength) {
		setValueMinLength(valueMinLength);
	}

	@Override
	public ValueMinLength getValueMinLength() {
		return valueMinLength;
	}

	@Override
	public void setValueMinLength(ValueMinLength valueMinLength) {
		this.valueMinLength = valueMinLength;
	}

	public PROPERTY_VALUE_SPECIFICATION(ValueName valueName) {
		setValueName(valueName);
	}

	@Override
	public ValueName getValueName() {
		return valueName;
	}

	@Override
	public void setValueName(ValueName valueName) {
		this.valueName = valueName;
	}

	public PROPERTY_VALUE_SPECIFICATION(ValuePattern valuePattern) {
		setValuePattern(valuePattern);
	}

	@Override
	public ValuePattern getValuePattern() {
		return valuePattern;
	}

	@Override
	public void setValuePattern(ValuePattern valuePattern) {
		this.valuePattern = valuePattern;
	}

	public PROPERTY_VALUE_SPECIFICATION(ValueRequired valueRequired) {
		setValueRequired(valueRequired);
	}

	@Override
	public ValueRequired getValueRequired() {
		return valueRequired;
	}

	@Override
	public void setValueRequired(ValueRequired valueRequired) {
		this.valueRequired = valueRequired;
	}

	public void copy(Clazz.PropertyValueSpecification org) {
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
		setDefaultValue(org.getDefaultValue());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaxValue(org.getMaxValue());
		setMinValue(org.getMinValue());
		setMultipleValues(org.getMultipleValues());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setReadonlyValue(org.getReadonlyValue());
		setSameAs(org.getSameAs());
		setStepValue(org.getStepValue());
		setSubjectOf(org.getSubjectOf());
		setUrl(org.getUrl());
		setValueMaxLength(org.getValueMaxLength());
		setValueMinLength(org.getValueMinLength());
		setValueName(org.getValueName());
		setValuePattern(org.getValuePattern());
		setValueRequired(org.getValueRequired());
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
