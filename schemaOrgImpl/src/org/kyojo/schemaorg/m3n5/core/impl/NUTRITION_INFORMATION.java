package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Calories;
import org.kyojo.schemaorg.m3n5.core.Container.CarbohydrateContent;
import org.kyojo.schemaorg.m3n5.core.Container.CholesterolContent;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.FatContent;
import org.kyojo.schemaorg.m3n5.core.Container.FiberContent;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.ProteinContent;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.SaturatedFatContent;
import org.kyojo.schemaorg.m3n5.core.Container.ServingSize;
import org.kyojo.schemaorg.m3n5.core.Container.SodiumContent;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.SugarContent;
import org.kyojo.schemaorg.m3n5.core.Container.TransFatContent;
import org.kyojo.schemaorg.m3n5.core.Container.UnsaturatedFatContent;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;

public class NUTRITION_INFORMATION implements Clazz.NutritionInformation {

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
	public Calories calories;
	public CarbohydrateContent carbohydrateContent;
	public CholesterolContent cholesterolContent;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public FatContent fatContent;
	public FiberContent fiberContent;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public ProteinContent proteinContent;
	public SameAs sameAs;
	public SaturatedFatContent saturatedFatContent;
	public ServingSize servingSize;
	public SodiumContent sodiumContent;
	public SubjectOf subjectOf;
	public SugarContent sugarContent;
	public TransFatContent transFatContent;
	public UnsaturatedFatContent unsaturatedFatContent;
	public Url url;

	public NUTRITION_INFORMATION() {
	}

	public NUTRITION_INFORMATION(Long seq) {
		setSeq(seq);
	}

	public NUTRITION_INFORMATION(String string) {
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

	public NUTRITION_INFORMATION(AdditionalType additionalType) {
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

	public NUTRITION_INFORMATION(AlternateName alternateName) {
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

	public NUTRITION_INFORMATION(Calories calories) {
		setCalories(calories);
	}

	@Override
	public Calories getCalories() {
		return calories;
	}

	@Override
	public void setCalories(Calories calories) {
		this.calories = calories;
	}

	public NUTRITION_INFORMATION(CarbohydrateContent carbohydrateContent) {
		setCarbohydrateContent(carbohydrateContent);
	}

	@Override
	public CarbohydrateContent getCarbohydrateContent() {
		return carbohydrateContent;
	}

	@Override
	public void setCarbohydrateContent(CarbohydrateContent carbohydrateContent) {
		this.carbohydrateContent = carbohydrateContent;
	}

	public NUTRITION_INFORMATION(CholesterolContent cholesterolContent) {
		setCholesterolContent(cholesterolContent);
	}

	@Override
	public CholesterolContent getCholesterolContent() {
		return cholesterolContent;
	}

	@Override
	public void setCholesterolContent(CholesterolContent cholesterolContent) {
		this.cholesterolContent = cholesterolContent;
	}

	public NUTRITION_INFORMATION(Description description) {
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

	public NUTRITION_INFORMATION(DisambiguatingDescription disambiguatingDescription) {
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

	public NUTRITION_INFORMATION(FatContent fatContent) {
		setFatContent(fatContent);
	}

	@Override
	public FatContent getFatContent() {
		return fatContent;
	}

	@Override
	public void setFatContent(FatContent fatContent) {
		this.fatContent = fatContent;
	}

	public NUTRITION_INFORMATION(FiberContent fiberContent) {
		setFiberContent(fiberContent);
	}

	@Override
	public FiberContent getFiberContent() {
		return fiberContent;
	}

	@Override
	public void setFiberContent(FiberContent fiberContent) {
		this.fiberContent = fiberContent;
	}

	public NUTRITION_INFORMATION(Identifier identifier) {
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

	public NUTRITION_INFORMATION(Image image) {
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

	public NUTRITION_INFORMATION(MainEntityOfPage mainEntityOfPage) {
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

	public NUTRITION_INFORMATION(Name name) {
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

	public NUTRITION_INFORMATION(NameFuzzy nameFuzzy) {
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

	public NUTRITION_INFORMATION(NameRuby nameRuby) {
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

	public NUTRITION_INFORMATION(PotentialAction potentialAction) {
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

	public NUTRITION_INFORMATION(ProteinContent proteinContent) {
		setProteinContent(proteinContent);
	}

	@Override
	public ProteinContent getProteinContent() {
		return proteinContent;
	}

	@Override
	public void setProteinContent(ProteinContent proteinContent) {
		this.proteinContent = proteinContent;
	}

	public NUTRITION_INFORMATION(SameAs sameAs) {
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

	public NUTRITION_INFORMATION(SaturatedFatContent saturatedFatContent) {
		setSaturatedFatContent(saturatedFatContent);
	}

	@Override
	public SaturatedFatContent getSaturatedFatContent() {
		return saturatedFatContent;
	}

	@Override
	public void setSaturatedFatContent(SaturatedFatContent saturatedFatContent) {
		this.saturatedFatContent = saturatedFatContent;
	}

	public NUTRITION_INFORMATION(ServingSize servingSize) {
		setServingSize(servingSize);
	}

	@Override
	public ServingSize getServingSize() {
		return servingSize;
	}

	@Override
	public void setServingSize(ServingSize servingSize) {
		this.servingSize = servingSize;
	}

	public NUTRITION_INFORMATION(SodiumContent sodiumContent) {
		setSodiumContent(sodiumContent);
	}

	@Override
	public SodiumContent getSodiumContent() {
		return sodiumContent;
	}

	@Override
	public void setSodiumContent(SodiumContent sodiumContent) {
		this.sodiumContent = sodiumContent;
	}

	public NUTRITION_INFORMATION(SubjectOf subjectOf) {
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

	public NUTRITION_INFORMATION(SugarContent sugarContent) {
		setSugarContent(sugarContent);
	}

	@Override
	public SugarContent getSugarContent() {
		return sugarContent;
	}

	@Override
	public void setSugarContent(SugarContent sugarContent) {
		this.sugarContent = sugarContent;
	}

	public NUTRITION_INFORMATION(TransFatContent transFatContent) {
		setTransFatContent(transFatContent);
	}

	@Override
	public TransFatContent getTransFatContent() {
		return transFatContent;
	}

	@Override
	public void setTransFatContent(TransFatContent transFatContent) {
		this.transFatContent = transFatContent;
	}

	public NUTRITION_INFORMATION(UnsaturatedFatContent unsaturatedFatContent) {
		setUnsaturatedFatContent(unsaturatedFatContent);
	}

	@Override
	public UnsaturatedFatContent getUnsaturatedFatContent() {
		return unsaturatedFatContent;
	}

	@Override
	public void setUnsaturatedFatContent(UnsaturatedFatContent unsaturatedFatContent) {
		this.unsaturatedFatContent = unsaturatedFatContent;
	}

	public NUTRITION_INFORMATION(Url url) {
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

	public void copy(Clazz.NutritionInformation org) {
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
		setCalories(org.getCalories());
		setCarbohydrateContent(org.getCarbohydrateContent());
		setCholesterolContent(org.getCholesterolContent());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setFatContent(org.getFatContent());
		setFiberContent(org.getFiberContent());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setProteinContent(org.getProteinContent());
		setSameAs(org.getSameAs());
		setSaturatedFatContent(org.getSaturatedFatContent());
		setServingSize(org.getServingSize());
		setSodiumContent(org.getSodiumContent());
		setSubjectOf(org.getSubjectOf());
		setSugarContent(org.getSugarContent());
		setTransFatContent(org.getTransFatContent());
		setUnsaturatedFatContent(org.getUnsaturatedFatContent());
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
