package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MaxValue;
import org.kyojo.schemaorg.m3n4.core.Container.MinValue;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.UnitCode;
import org.kyojo.schemaorg.m3n4.core.Container.UnitText;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.Value;
import org.kyojo.schemaorg.m3n4.core.Container.ValueReference;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Clazz;
import org.kyojo.schemaorg.m3n4.pending.Container.Duration;
import org.kyojo.schemaorg.m3n4.pending.Container.Median;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile10;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile25;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile75;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile90;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class QUANTITATIVE_VALUE_DISTRIBUTION implements Clazz.QuantitativeValueDistribution {

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
	public Duration duration;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MaxValue maxValue;
	public Median median;
	public MinValue minValue;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Percentile10 percentile10;
	public Percentile25 percentile25;
	public Percentile75 percentile75;
	public Percentile90 percentile90;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public UnitCode unitCode;
	public UnitText unitText;
	public Url url;
	public Value value;
	public ValueReference valueReference;

	public QUANTITATIVE_VALUE_DISTRIBUTION() {
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(Long seq) {
		setSeq(seq);
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(String string) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(AdditionalProperty additionalProperty) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(AdditionalType additionalType) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(AlternateName alternateName) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Description description) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(DisambiguatingDescription disambiguatingDescription) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Duration duration) {
		setDuration(duration);
	}

	@Override
	public Duration getDuration() {
		return duration;
	}

	@Override
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(Identifier identifier) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Image image) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(MainEntityOfPage mainEntityOfPage) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(MaxValue maxValue) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Median median) {
		setMedian(median);
	}

	@Override
	public Median getMedian() {
		return median;
	}

	@Override
	public void setMedian(Median median) {
		this.median = median;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(MinValue minValue) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Name name) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(NameFuzzy nameFuzzy) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(NameRuby nameRuby) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Percentile10 percentile10) {
		setPercentile10(percentile10);
	}

	@Override
	public Percentile10 getPercentile10() {
		return percentile10;
	}

	@Override
	public void setPercentile10(Percentile10 percentile10) {
		this.percentile10 = percentile10;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(Percentile25 percentile25) {
		setPercentile25(percentile25);
	}

	@Override
	public Percentile25 getPercentile25() {
		return percentile25;
	}

	@Override
	public void setPercentile25(Percentile25 percentile25) {
		this.percentile25 = percentile25;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(Percentile75 percentile75) {
		setPercentile75(percentile75);
	}

	@Override
	public Percentile75 getPercentile75() {
		return percentile75;
	}

	@Override
	public void setPercentile75(Percentile75 percentile75) {
		this.percentile75 = percentile75;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(Percentile90 percentile90) {
		setPercentile90(percentile90);
	}

	@Override
	public Percentile90 getPercentile90() {
		return percentile90;
	}

	@Override
	public void setPercentile90(Percentile90 percentile90) {
		this.percentile90 = percentile90;
	}

	public QUANTITATIVE_VALUE_DISTRIBUTION(PotentialAction potentialAction) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(SameAs sameAs) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(SubjectOf subjectOf) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(UnitCode unitCode) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(UnitText unitText) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Url url) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Value value) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(ValueReference valueReference) {
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

	public QUANTITATIVE_VALUE_DISTRIBUTION(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalProperty additionalProperty,
			AdditionalType additionalType,
			AlternateName alternateName,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Duration duration,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			MaxValue maxValue,
			Median median,
			MinValue minValue,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Percentile10 percentile10,
			Percentile25 percentile25,
			Percentile75 percentile75,
			Percentile90 percentile90,
			PotentialAction potentialAction,
			SameAs sameAs,
			SubjectOf subjectOf,
			UnitCode unitCode,
			UnitText unitText,
			Url url,
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
		setAdditionalProperty(additionalProperty);
		setAdditionalType(additionalType);
		setAlternateName(alternateName);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDuration(duration);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setMaxValue(maxValue);
		setMedian(median);
		setMinValue(minValue);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPercentile10(percentile10);
		setPercentile25(percentile25);
		setPercentile75(percentile75);
		setPercentile90(percentile90);
		setPotentialAction(potentialAction);
		setSameAs(sameAs);
		setSubjectOf(subjectOf);
		setUnitCode(unitCode);
		setUnitText(unitText);
		setUrl(url);
		setValue(value);
		setValueReference(valueReference);
	}

	public void copy(Clazz.QuantitativeValueDistribution org) {
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
		setDuration(org.getDuration());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaxValue(org.getMaxValue());
		setMedian(org.getMedian());
		setMinValue(org.getMinValue());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPercentile10(org.getPercentile10());
		setPercentile25(org.getPercentile25());
		setPercentile75(org.getPercentile75());
		setPercentile90(org.getPercentile90());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setUnitCode(org.getUnitCode());
		setUnitText(org.getUnitText());
		setUrl(org.getUrl());
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
