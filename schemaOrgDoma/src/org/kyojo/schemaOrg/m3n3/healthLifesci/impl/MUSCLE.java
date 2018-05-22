package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
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
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Action;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Antagonist;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BloodSupply;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BodyLocation;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ConnectedTo;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagram;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Function;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Insertion;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MuscleAction;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Nerve;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Origin;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PartOfSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStructure;


public class MUSCLE implements Clazz.Muscle {

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
	public Action action;
	public AdditionalType additionalType;
	public AlternateName alternateName;
	public Antagonist antagonist;
	public AssociatedPathophysiology associatedPathophysiology;
	public BloodSupply bloodSupply;
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
	public Insertion insertion;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public MedicineSystem medicineSystem;
	public MuscleAction muscleAction;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Nerve nerve;
	public Origin origin;
	public PartOfSystem partOfSystem;
	public PotentialAction potentialAction;
	public RecognizingAuthority recognizingAuthority;
	public RelatedCondition relatedCondition;
	public RelatedTherapy relatedTherapy;
	public RelevantSpecialty relevantSpecialty;
	public SameAs sameAs;
	public Study study;
	public SubStructure subStructure;
	public Url url;

	public MUSCLE() {
	}

	public MUSCLE(Long seq) {
		setSeq(seq);
	}

	public MUSCLE(String string) {
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

	public MUSCLE(Action action) {
		setAction(action);
	}

	@Override
	public Action getAction() {
		return action;
	}

	@Override
	public void setAction(Action action) {
		this.action = action;
	}

	public MUSCLE(AdditionalType additionalType) {
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

	public MUSCLE(AlternateName alternateName) {
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

	public MUSCLE(Antagonist antagonist) {
		setAntagonist(antagonist);
	}

	@Override
	public Antagonist getAntagonist() {
		return antagonist;
	}

	@Override
	public void setAntagonist(Antagonist antagonist) {
		this.antagonist = antagonist;
	}

	public MUSCLE(AssociatedPathophysiology associatedPathophysiology) {
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

	public MUSCLE(BloodSupply bloodSupply) {
		setBloodSupply(bloodSupply);
	}

	@Override
	public BloodSupply getBloodSupply() {
		return bloodSupply;
	}

	@Override
	public void setBloodSupply(BloodSupply bloodSupply) {
		this.bloodSupply = bloodSupply;
	}

	public MUSCLE(BodyLocation bodyLocation) {
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

	public MUSCLE(Code code) {
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

	public MUSCLE(ConnectedTo connectedTo) {
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

	public MUSCLE(Description description) {
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

	public MUSCLE(Diagram diagram) {
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

	public MUSCLE(DisambiguatingDescription disambiguatingDescription) {
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

	public MUSCLE(Function function) {
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

	public MUSCLE(Guideline guideline) {
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

	public MUSCLE(Identifier identifier) {
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

	public MUSCLE(Image image) {
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

	public MUSCLE(Insertion insertion) {
		setInsertion(insertion);
	}

	@Override
	public Insertion getInsertion() {
		return insertion;
	}

	@Override
	public void setInsertion(Insertion insertion) {
		this.insertion = insertion;
	}

	public MUSCLE(LegalStatus legalStatus) {
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

	public MUSCLE(MainEntityOfPage mainEntityOfPage) {
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

	public MUSCLE(MedicineSystem medicineSystem) {
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

	public MUSCLE(MuscleAction muscleAction) {
		setMuscleAction(muscleAction);
	}

	@Override
	public MuscleAction getMuscleAction() {
		return muscleAction;
	}

	@Override
	public void setMuscleAction(MuscleAction muscleAction) {
		this.muscleAction = muscleAction;
	}

	public MUSCLE(Name name) {
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

	public MUSCLE(NameFuzzy nameFuzzy) {
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

	public MUSCLE(NameRuby nameRuby) {
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

	public MUSCLE(Nerve nerve) {
		setNerve(nerve);
	}

	@Override
	public Nerve getNerve() {
		return nerve;
	}

	@Override
	public void setNerve(Nerve nerve) {
		this.nerve = nerve;
	}

	public MUSCLE(Origin origin) {
		setOrigin(origin);
	}

	@Override
	public Origin getOrigin() {
		return origin;
	}

	@Override
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public MUSCLE(PartOfSystem partOfSystem) {
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

	public MUSCLE(PotentialAction potentialAction) {
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

	public MUSCLE(RecognizingAuthority recognizingAuthority) {
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

	public MUSCLE(RelatedCondition relatedCondition) {
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

	public MUSCLE(RelatedTherapy relatedTherapy) {
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

	public MUSCLE(RelevantSpecialty relevantSpecialty) {
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

	public MUSCLE(SameAs sameAs) {
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

	public MUSCLE(Study study) {
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

	public MUSCLE(SubStructure subStructure) {
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

	public MUSCLE(Url url) {
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

	public MUSCLE(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			Action action,
			AdditionalType additionalType,
			AlternateName alternateName,
			Antagonist antagonist,
			AssociatedPathophysiology associatedPathophysiology,
			BloodSupply bloodSupply,
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
			Insertion insertion,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			MedicineSystem medicineSystem,
			MuscleAction muscleAction,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Nerve nerve,
			Origin origin,
			PartOfSystem partOfSystem,
			PotentialAction potentialAction,
			RecognizingAuthority recognizingAuthority,
			RelatedCondition relatedCondition,
			RelatedTherapy relatedTherapy,
			RelevantSpecialty relevantSpecialty,
			SameAs sameAs,
			Study study,
			SubStructure subStructure,
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
		setAction(action);
		setAdditionalType(additionalType);
		setAlternateName(alternateName);
		setAntagonist(antagonist);
		setAssociatedPathophysiology(associatedPathophysiology);
		setBloodSupply(bloodSupply);
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
		setInsertion(insertion);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setMedicineSystem(medicineSystem);
		setMuscleAction(muscleAction);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNerve(nerve);
		setOrigin(origin);
		setPartOfSystem(partOfSystem);
		setPotentialAction(potentialAction);
		setRecognizingAuthority(recognizingAuthority);
		setRelatedCondition(relatedCondition);
		setRelatedTherapy(relatedTherapy);
		setRelevantSpecialty(relevantSpecialty);
		setSameAs(sameAs);
		setStudy(study);
		setSubStructure(subStructure);
		setUrl(url);
	}

	public void copy(Clazz.Muscle org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAction(org.getAction());
		setAdditionalType(org.getAdditionalType());
		setAlternateName(org.getAlternateName());
		setAntagonist(org.getAntagonist());
		setAssociatedPathophysiology(org.getAssociatedPathophysiology());
		setBloodSupply(org.getBloodSupply());
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
		setInsertion(org.getInsertion());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setMuscleAction(org.getMuscleAction());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNerve(org.getNerve());
		setOrigin(org.getOrigin());
		setPartOfSystem(org.getPartOfSystem());
		setPotentialAction(org.getPotentialAction());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelatedCondition(org.getRelatedCondition());
		setRelatedTherapy(org.getRelatedTherapy());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSameAs(org.getSameAs());
		setStudy(org.getStudy());
		setSubStructure(org.getSubStructure());
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
