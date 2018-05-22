package org.kyojo.schemaOrg.m3n3.core.steeringPositionValue;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Equal;
import org.kyojo.schemaOrg.m3n3.core.Container.Greater;
import org.kyojo.schemaOrg.m3n3.core.Container.GreaterOrEqual;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.Lesser;
import org.kyojo.schemaOrg.m3n3.core.Container.LesserOrEqual;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.NonEqual;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueReference;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.SteeringPositionValue;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy;

public class LEFT_HAND_DRIVING implements SteeringPositionValue.LeftHandDriving {

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
	public SupersededBy supersededBy;
	public Url url;
	public ValueReference valueReference;

	public LEFT_HAND_DRIVING() {
	}

	public LEFT_HAND_DRIVING(Long seq) {
		setSeq(seq);
	}

	public LEFT_HAND_DRIVING(String string) {
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

	public LEFT_HAND_DRIVING(AdditionalProperty additionalProperty) {
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

	public LEFT_HAND_DRIVING(AdditionalType additionalType) {
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

	public LEFT_HAND_DRIVING(AlternateName alternateName) {
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

	public LEFT_HAND_DRIVING(Description description) {
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

	public LEFT_HAND_DRIVING(DisambiguatingDescription disambiguatingDescription) {
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

	public LEFT_HAND_DRIVING(Equal equal) {
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

	public LEFT_HAND_DRIVING(Greater greater) {
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

	public LEFT_HAND_DRIVING(GreaterOrEqual greaterOrEqual) {
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

	public LEFT_HAND_DRIVING(Identifier identifier) {
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

	public LEFT_HAND_DRIVING(Image image) {
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

	public LEFT_HAND_DRIVING(Lesser lesser) {
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

	public LEFT_HAND_DRIVING(LesserOrEqual lesserOrEqual) {
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

	public LEFT_HAND_DRIVING(MainEntityOfPage mainEntityOfPage) {
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

	public LEFT_HAND_DRIVING(Name name) {
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

	public LEFT_HAND_DRIVING(NameFuzzy nameFuzzy) {
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

	public LEFT_HAND_DRIVING(NameRuby nameRuby) {
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

	public LEFT_HAND_DRIVING(NonEqual nonEqual) {
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

	public LEFT_HAND_DRIVING(PotentialAction potentialAction) {
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

	public LEFT_HAND_DRIVING(SameAs sameAs) {
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

	public LEFT_HAND_DRIVING(SupersededBy supersededBy) {
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

	public LEFT_HAND_DRIVING(Url url) {
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

	public LEFT_HAND_DRIVING(ValueReference valueReference) {
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

	public LEFT_HAND_DRIVING(Long seq,
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
			Equal equal,
			Greater greater,
			GreaterOrEqual greaterOrEqual,
			Identifier identifier,
			Image image,
			Lesser lesser,
			LesserOrEqual lesserOrEqual,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NonEqual nonEqual,
			PotentialAction potentialAction,
			SameAs sameAs,
			SupersededBy supersededBy,
			Url url,
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
		setEqual(equal);
		setGreater(greater);
		setGreaterOrEqual(greaterOrEqual);
		setIdentifier(identifier);
		setImage(image);
		setLesser(lesser);
		setLesserOrEqual(lesserOrEqual);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNonEqual(nonEqual);
		setPotentialAction(potentialAction);
		setSameAs(sameAs);
		setSupersededBy(supersededBy);
		setUrl(url);
		setValueReference(valueReference);
	}

	public void copy(SteeringPositionValue.LeftHandDriving org) {
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
		return SteeringPositionValue.LeftHandDriving.class.getAnnotation(SampleValue.class).value();
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
