package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ArterialBranch;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BodyLocation;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ConnectedTo;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagram;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Function;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PartOfSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Source;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStructure;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SupplyTo;


public class ARTERY implements Clazz.Artery {

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
	public ArterialBranch arterialBranch;
	public AssociatedPathophysiology associatedPathophysiology;
	public BodyLocation bodyLocation;
	public Code code;
	public ConnectedTo connectedTo;
	public Description description;
	public Diagram diagram;
	public DisambiguatingDescription disambiguatingDescription;
	public Function function;
	public Guideline guideline;
	public Identifier identifier;
	public Image image;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PartOfSystem partOfSystem;
	public PotentialAction potentialAction;
	public RecognizingAuthority recognizingAuthority;
	public RelatedCondition relatedCondition;
	public RelatedTherapy relatedTherapy;
	public RelevantSpecialty relevantSpecialty;
	public SameAs sameAs;
	public Source source;
	public Study study;
	public SubStructure subStructure;
	public SupplyTo supplyTo;
	public Url url;

	public ARTERY() {
	}

	public ARTERY(Long seq) {
		setSeq(seq);
	}

	public ARTERY(String string) {
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

	public ARTERY(AdditionalType additionalType) {
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

	public ARTERY(AlternateName alternateName) {
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

	public ARTERY(ArterialBranch arterialBranch) {
		setArterialBranch(arterialBranch);
	}

	@Override
	public ArterialBranch getArterialBranch() {
		return arterialBranch;
	}

	@Override
	public void setArterialBranch(ArterialBranch arterialBranch) {
		this.arterialBranch = arterialBranch;
	}

	public ARTERY(AssociatedPathophysiology associatedPathophysiology) {
		setAssociatedPathophysiology(associatedPathophysiology);
	}

	@Override
	public AssociatedPathophysiology getAssociatedPathophysiology() {
		return associatedPathophysiology;
	}

	@Override
	public void setAssociatedPathophysiology(AssociatedPathophysiology associatedPathophysiology) {
		this.associatedPathophysiology = associatedPathophysiology;
	}

	public ARTERY(BodyLocation bodyLocation) {
		setBodyLocation(bodyLocation);
	}

	@Override
	public BodyLocation getBodyLocation() {
		return bodyLocation;
	}

	@Override
	public void setBodyLocation(BodyLocation bodyLocation) {
		this.bodyLocation = bodyLocation;
	}

	public ARTERY(Code code) {
		setCode(code);
	}

	@Override
	public Code getCode() {
		return code;
	}

	@Override
	public void setCode(Code code) {
		this.code = code;
	}

	public ARTERY(ConnectedTo connectedTo) {
		setConnectedTo(connectedTo);
	}

	@Override
	public ConnectedTo getConnectedTo() {
		return connectedTo;
	}

	@Override
	public void setConnectedTo(ConnectedTo connectedTo) {
		this.connectedTo = connectedTo;
	}

	public ARTERY(Description description) {
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

	public ARTERY(Diagram diagram) {
		setDiagram(diagram);
	}

	@Override
	public Diagram getDiagram() {
		return diagram;
	}

	@Override
	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}

	public ARTERY(DisambiguatingDescription disambiguatingDescription) {
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

	public ARTERY(Function function) {
		setFunction(function);
	}

	@Override
	public Function getFunction() {
		return function;
	}

	@Override
	public void setFunction(Function function) {
		this.function = function;
	}

	public ARTERY(Guideline guideline) {
		setGuideline(guideline);
	}

	@Override
	public Guideline getGuideline() {
		return guideline;
	}

	@Override
	public void setGuideline(Guideline guideline) {
		this.guideline = guideline;
	}

	public ARTERY(Identifier identifier) {
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

	public ARTERY(Image image) {
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

	public ARTERY(LegalStatus legalStatus) {
		setLegalStatus(legalStatus);
	}

	@Override
	public LegalStatus getLegalStatus() {
		return legalStatus;
	}

	@Override
	public void setLegalStatus(LegalStatus legalStatus) {
		this.legalStatus = legalStatus;
	}

	public ARTERY(MainEntityOfPage mainEntityOfPage) {
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

	public ARTERY(MedicineSystem medicineSystem) {
		setMedicineSystem(medicineSystem);
	}

	@Override
	public MedicineSystem getMedicineSystem() {
		return medicineSystem;
	}

	@Override
	public void setMedicineSystem(MedicineSystem medicineSystem) {
		this.medicineSystem = medicineSystem;
	}

	public ARTERY(Name name) {
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

	public ARTERY(NameFuzzy nameFuzzy) {
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

	public ARTERY(NameRuby nameRuby) {
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

	public ARTERY(PartOfSystem partOfSystem) {
		setPartOfSystem(partOfSystem);
	}

	@Override
	public PartOfSystem getPartOfSystem() {
		return partOfSystem;
	}

	@Override
	public void setPartOfSystem(PartOfSystem partOfSystem) {
		this.partOfSystem = partOfSystem;
	}

	public ARTERY(PotentialAction potentialAction) {
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

	public ARTERY(RecognizingAuthority recognizingAuthority) {
		setRecognizingAuthority(recognizingAuthority);
	}

	@Override
	public RecognizingAuthority getRecognizingAuthority() {
		return recognizingAuthority;
	}

	@Override
	public void setRecognizingAuthority(RecognizingAuthority recognizingAuthority) {
		this.recognizingAuthority = recognizingAuthority;
	}

	public ARTERY(RelatedCondition relatedCondition) {
		setRelatedCondition(relatedCondition);
	}

	@Override
	public RelatedCondition getRelatedCondition() {
		return relatedCondition;
	}

	@Override
	public void setRelatedCondition(RelatedCondition relatedCondition) {
		this.relatedCondition = relatedCondition;
	}

	public ARTERY(RelatedTherapy relatedTherapy) {
		setRelatedTherapy(relatedTherapy);
	}

	@Override
	public RelatedTherapy getRelatedTherapy() {
		return relatedTherapy;
	}

	@Override
	public void setRelatedTherapy(RelatedTherapy relatedTherapy) {
		this.relatedTherapy = relatedTherapy;
	}

	public ARTERY(RelevantSpecialty relevantSpecialty) {
		setRelevantSpecialty(relevantSpecialty);
	}

	@Override
	public RelevantSpecialty getRelevantSpecialty() {
		return relevantSpecialty;
	}

	@Override
	public void setRelevantSpecialty(RelevantSpecialty relevantSpecialty) {
		this.relevantSpecialty = relevantSpecialty;
	}

	public ARTERY(SameAs sameAs) {
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

	public ARTERY(Source source) {
		setSource(source);
	}

	@Override
	public Source getSource() {
		return source;
	}

	@Override
	public void setSource(Source source) {
		this.source = source;
	}

	public ARTERY(Study study) {
		setStudy(study);
	}

	@Override
	public Study getStudy() {
		return study;
	}

	@Override
	public void setStudy(Study study) {
		this.study = study;
	}

	public ARTERY(SubStructure subStructure) {
		setSubStructure(subStructure);
	}

	@Override
	public SubStructure getSubStructure() {
		return subStructure;
	}

	@Override
	public void setSubStructure(SubStructure subStructure) {
		this.subStructure = subStructure;
	}

	public ARTERY(SupplyTo supplyTo) {
		setSupplyTo(supplyTo);
	}

	@Override
	public SupplyTo getSupplyTo() {
		return supplyTo;
	}

	@Override
	public void setSupplyTo(SupplyTo supplyTo) {
		this.supplyTo = supplyTo;
	}

	public ARTERY(Url url) {
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

	public ARTERY(Long seq,
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
			ArterialBranch arterialBranch,
			AssociatedPathophysiology associatedPathophysiology,
			BodyLocation bodyLocation,
			Code code,
			ConnectedTo connectedTo,
			Description description,
			Diagram diagram,
			DisambiguatingDescription disambiguatingDescription,
			Function function,
			Guideline guideline,
			Identifier identifier,
			Image image,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			MedicineSystem medicineSystem,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PartOfSystem partOfSystem,
			PotentialAction potentialAction,
			RecognizingAuthority recognizingAuthority,
			RelatedCondition relatedCondition,
			RelatedTherapy relatedTherapy,
			RelevantSpecialty relevantSpecialty,
			SameAs sameAs,
			Source source,
			Study study,
			SubStructure subStructure,
			SupplyTo supplyTo,
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
		setArterialBranch(arterialBranch);
		setAssociatedPathophysiology(associatedPathophysiology);
		setBodyLocation(bodyLocation);
		setCode(code);
		setConnectedTo(connectedTo);
		setDescription(description);
		setDiagram(diagram);
		setDisambiguatingDescription(disambiguatingDescription);
		setFunction(function);
		setGuideline(guideline);
		setIdentifier(identifier);
		setImage(image);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setMedicineSystem(medicineSystem);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPartOfSystem(partOfSystem);
		setPotentialAction(potentialAction);
		setRecognizingAuthority(recognizingAuthority);
		setRelatedCondition(relatedCondition);
		setRelatedTherapy(relatedTherapy);
		setRelevantSpecialty(relevantSpecialty);
		setSameAs(sameAs);
		setSource(source);
		setStudy(study);
		setSubStructure(subStructure);
		setSupplyTo(supplyTo);
		setUrl(url);
	}

	public void copy(Clazz.Artery org) {
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
		setArterialBranch(org.getArterialBranch());
		setAssociatedPathophysiology(org.getAssociatedPathophysiology());
		setBodyLocation(org.getBodyLocation());
		setCode(org.getCode());
		setConnectedTo(org.getConnectedTo());
		setDescription(org.getDescription());
		setDiagram(org.getDiagram());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setFunction(org.getFunction());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPartOfSystem(org.getPartOfSystem());
		setPotentialAction(org.getPotentialAction());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelatedCondition(org.getRelatedCondition());
		setRelatedTherapy(org.getRelatedTherapy());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSameAs(org.getSameAs());
		setSource(org.getSource());
		setStudy(org.getStudy());
		setSubStructure(org.getSubStructure());
		setSupplyTo(org.getSupplyTo());
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
