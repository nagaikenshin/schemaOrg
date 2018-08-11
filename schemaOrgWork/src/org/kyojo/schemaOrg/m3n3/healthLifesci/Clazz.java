package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgClass;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Audience;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LocalBusiness;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MedicalOrganization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PeopleAudience;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Person;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Specialty;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WebPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Category;
import org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer;
import org.kyojo.schemaOrg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCode;
import org.kyojo.schemaOrg.m3n3.pending.Container.CodeValue;
import org.kyojo.schemaOrg.m3n3.pending.Container.IncludedInHealthInsurancePlan;
import org.kyojo.schemaOrg.m3n3.pending.Container.Rxcui;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AnatomicalStructure")
	@SchemaOrgLabel("AnatomicalStructure")
	@SchemaOrgComment(""
			+ "Any part of the human body, typically a component of an anatomical system."
			+ " Organs, tissues, and cells are all anatomical structures.")
	@CamelizedName("anatomicalStructure")
	@ConstantizedName("ANATOMICAL_STRUCTURE")
	public interface AnatomicalStructure extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedPathophysiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * uri: http://schema.org/bodyLocation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BodyLocation
		 */
		public Container.BodyLocation getBodyLocation();
		public void setBodyLocation(Container.BodyLocation bodyLocation);

		/**
		 * uri: http://schema.org/connectedTo
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ConnectedTo
		 */
		public Container.ConnectedTo getConnectedTo();
		public void setConnectedTo(Container.ConnectedTo connectedTo);

		/**
		 * uri: http://schema.org/diagram
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagram
		 */
		public Container.Diagram getDiagram();
		public void setDiagram(Container.Diagram diagram);

		/**
		 * uri: http://schema.org/function
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Function
		 */
		public Container.Function getFunction();
		public void setFunction(Container.Function function);

		/**
		 * uri: http://schema.org/partOfSystem
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PartOfSystem
		 */
		public Container.PartOfSystem getPartOfSystem();
		public void setPartOfSystem(Container.PartOfSystem partOfSystem);

		/**
		 * uri: http://schema.org/relatedCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * uri: http://schema.org/relatedTherapy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy
		 */
		public Container.RelatedTherapy getRelatedTherapy();
		public void setRelatedTherapy(Container.RelatedTherapy relatedTherapy);

		/**
		 * uri: http://schema.org/subStructure
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStructure
		 */
		public Container.SubStructure getSubStructure();
		public void setSubStructure(Container.SubStructure subStructure);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AnatomicalSystem")
	@SchemaOrgLabel("AnatomicalSystem")
	@SchemaOrgComment(""
			+ "An anatomical system is a group of anatomical structures that work together to"
			+ " perform a certain task. Anatomical systems, such as organ systems, are one"
			+ " organizing principle of anatomy, and can includes circulatory, digestive,"
			+ " endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive,"
			+ " respiratory, skeletal, urinary, vestibular, and other systems.")
	@CamelizedName("anatomicalSystem")
	@ConstantizedName("ANATOMICAL_SYSTEM")
	public interface AnatomicalSystem extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedPathophysiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * uri: http://schema.org/comprisedOf
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ComprisedOf
		 */
		public Container.ComprisedOf getComprisedOf();
		public void setComprisedOf(Container.ComprisedOf comprisedOf);

		/**
		 * uri: http://schema.org/relatedCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * uri: http://schema.org/relatedStructure
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedStructure
		 */
		public Container.RelatedStructure getRelatedStructure();
		public void setRelatedStructure(Container.RelatedStructure relatedStructure);

		/**
		 * uri: http://schema.org/relatedTherapy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy
		 */
		public Container.RelatedTherapy getRelatedTherapy();
		public void setRelatedTherapy(Container.RelatedTherapy relatedTherapy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ApprovedIndication")
	@SchemaOrgLabel("ApprovedIndication")
	@SchemaOrgComment(""
			+ "An indication for a medical therapy that has been formally specified or approved"
			+ " by a regulatory body that regulates use of the therapy; for example, the US FDA"
			+ " approves indications for most drugs in the US.")
	@CamelizedName("approvedIndication")
	@ConstantizedName("APPROVED_INDICATION")
	public interface ApprovedIndication extends MedicalIndication, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Artery")
	@SchemaOrgLabel("Artery")
	@SchemaOrgComment(""
			+ "A type of blood vessel that specifically carries blood away from the heart.")
	@CamelizedName("artery")
	@ConstantizedName("ARTERY")
	public interface Artery extends SchemaOrgClass, Vessel {

		/**
		 * uri: http://schema.org/arterialBranch
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ArterialBranch
		 */
		public Container.ArterialBranch getArterialBranch();
		public void setArterialBranch(Container.ArterialBranch arterialBranch);

		/**
		 * uri: http://schema.org/source
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Source
		 */
		public Container.Source getSource();
		public void setSource(Container.Source source);

		/**
		 * uri: http://schema.org/supplyTo
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SupplyTo
		 */
		public Container.SupplyTo getSupplyTo();
		public void setSupplyTo(Container.SupplyTo supplyTo);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BloodTest")
	@SchemaOrgLabel("BloodTest")
	@SchemaOrgComment(""
			+ "A medical test performed on a sample of a patient's blood.")
	@CamelizedName("bloodTest")
	@ConstantizedName("BLOOD_TEST")
	public interface BloodTest extends MedicalTest, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Bone")
	@SchemaOrgLabel("Bone")
	@SchemaOrgComment(""
			+ "Rigid connective tissue that comprises up the skeletal structure of the human"
			+ " body.")
	@CamelizedName("bone")
	@ConstantizedName("BONE")
	public interface Bone extends AnatomicalStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BrainStructure")
	@SchemaOrgLabel("BrainStructure")
	@SchemaOrgComment(""
			+ "Any anatomical structure which pertains to the soft nervous tissue functioning"
			+ " as the coordinating center of sensation and intellectual and nervous activity.")
	@CamelizedName("brainStructure")
	@ConstantizedName("BRAIN_STRUCTURE")
	public interface BrainStructure extends AnatomicalStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DDxElement")
	@SchemaOrgLabel("DDxElement")
	@SchemaOrgComment(""
			+ "An alternative, closely-related condition typically considered later in the"
			+ " differential diagnosis process along with the signs that are used to"
			+ " distinguish it.")
	@CamelizedName("ddxElement")
	@ConstantizedName("DDX_ELEMENT")
	public interface DDxElement extends MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/diagnosis
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagnosis
		 */
		public Container.Diagnosis getDiagnosis();
		public void setDiagnosis(Container.Diagnosis diagnosis);

		/**
		 * uri: http://schema.org/distinguishingSign
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DistinguishingSign
		 */
		public Container.DistinguishingSign getDistinguishingSign();
		public void setDistinguishingSign(Container.DistinguishingSign distinguishingSign);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DiagnosticLab")
	@SchemaOrgLabel("DiagnosticLab")
	@SchemaOrgComment(""
			+ "A medical laboratory that offers on-site or off-site diagnostic services.")
	@CamelizedName("diagnosticLab")
	@ConstantizedName("DIAGNOSTIC_LAB")
	public interface DiagnosticLab extends MedicalOrganization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableTest
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableTest
		 */
		public Container.AvailableTest getAvailableTest();
		public void setAvailableTest(Container.AvailableTest availableTest);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DiagnosticProcedure")
	@SchemaOrgLabel("DiagnosticProcedure")
	@SchemaOrgComment(""
			+ "A medical procedure intended primarily for diagnostic, as opposed to"
			+ " therapeutic, purposes.")
	@CamelizedName("diagnosticProcedure")
	@ConstantizedName("DIAGNOSTIC_PROCEDURE")
	public interface DiagnosticProcedure extends MedicalProcedure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Diet")
	@SchemaOrgLabel("Diet")
	@SchemaOrgComment(""
			+ "A strategy of regulating the intake of food to achieve or maintain a specific"
			+ " health-related goal.")
	@CamelizedName("diet")
	@ConstantizedName("DIET")
	public interface Diet extends CreativeWork, LifestyleModification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dietFeatures
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DietFeatures
		 */
		public Container.DietFeatures getDietFeatures();
		public void setDietFeatures(Container.DietFeatures dietFeatures);

		/**
		 * uri: http://schema.org/endorsers
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Endorsers
		 */
		public Container.Endorsers getEndorsers();
		public void setEndorsers(Container.Endorsers endorsers);

		/**
		 * uri: http://schema.org/expertConsiderations
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExpertConsiderations
		 */
		public Container.ExpertConsiderations getExpertConsiderations();
		public void setExpertConsiderations(Container.ExpertConsiderations expertConsiderations);

		/**
		 * uri: http://schema.org/overview
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Overview
		 */
		public Container.Overview getOverview();
		public void setOverview(Container.Overview overview);

		/**
		 * uri: http://schema.org/physiologicalBenefits
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PhysiologicalBenefits
		 */
		public Container.PhysiologicalBenefits getPhysiologicalBenefits();
		public void setPhysiologicalBenefits(Container.PhysiologicalBenefits physiologicalBenefits);

		/**
		 * uri: http://schema.org/risks
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Risks
		 */
		public Container.Risks getRisks();
		public void setRisks(Container.Risks risks);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DietarySupplement")
	@SchemaOrgLabel("DietarySupplement")
	@SchemaOrgComment(""
			+ "A product taken by mouth that contains a dietary ingredient intended to"
			+ " supplement the diet. Dietary ingredients may include vitamins, minerals, herbs"
			+ " or other botanicals, amino acids, and substances such as enzymes, organ"
			+ " tissues, glandulars and metabolites.")
	@CamelizedName("dietarySupplement")
	@ConstantizedName("DIETARY_SUPPLEMENT")
	public interface DietarySupplement extends SchemaOrgClass, Substance {

		/**
		 * uri: http://schema.org/activeIngredient
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * uri: http://schema.org/background
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Background
		 */
		public Container.Background getBackground();
		public void setBackground(Container.Background background);

		/**
		 * uri: http://schema.org/isProprietary
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsProprietary
		 */
		public Container.IsProprietary getIsProprietary();
		public void setIsProprietary(Container.IsProprietary isProprietary);

		/**
		 * uri: http://schema.org/legalStatus
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * uri: http://schema.org/manufacturer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer
		 */
		public Manufacturer getManufacturer();
		public void setManufacturer(Manufacturer manufacturer);

		/**
		 * uri: http://schema.org/maximumIntake
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * uri: http://schema.org/mechanismOfAction
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MechanismOfAction
		 */
		public Container.MechanismOfAction getMechanismOfAction();
		public void setMechanismOfAction(Container.MechanismOfAction mechanismOfAction);

		/**
		 * uri: http://schema.org/nonProprietaryName
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NonProprietaryName
		 */
		public Container.NonProprietaryName getNonProprietaryName();
		public void setNonProprietaryName(Container.NonProprietaryName nonProprietaryName);

		/**
		 * uri: http://schema.org/proprietaryName
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProprietaryName
		 */
		public Container.ProprietaryName getProprietaryName();
		public void setProprietaryName(Container.ProprietaryName proprietaryName);

		/**
		 * uri: http://schema.org/recommendedIntake
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecommendedIntake
		 */
		public Container.RecommendedIntake getRecommendedIntake();
		public void setRecommendedIntake(Container.RecommendedIntake recommendedIntake);

		/**
		 * uri: http://schema.org/safetyConsideration
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SafetyConsideration
		 */
		public Container.SafetyConsideration getSafetyConsideration();
		public void setSafetyConsideration(Container.SafetyConsideration safetyConsideration);

		/**
		 * uri: http://schema.org/targetPopulation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TargetPopulation
		 */
		public Container.TargetPopulation getTargetPopulation();
		public void setTargetPopulation(Container.TargetPopulation targetPopulation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DoseSchedule")
	@SchemaOrgLabel("DoseSchedule")
	@SchemaOrgComment(""
			+ "A specific dosing schedule for a drug or supplement.")
	@CamelizedName("doseSchedule")
	@ConstantizedName("DOSE_SCHEDULE")
	public interface DoseSchedule extends MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/doseUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseUnit
		 */
		public Container.DoseUnit getDoseUnit();
		public void setDoseUnit(Container.DoseUnit doseUnit);

		/**
		 * uri: http://schema.org/doseValue
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseValue
		 */
		public Container.DoseValue getDoseValue();
		public void setDoseValue(Container.DoseValue doseValue);

		/**
		 * uri: http://schema.org/frequency
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Frequency
		 */
		public Container.Frequency getFrequency();
		public void setFrequency(Container.Frequency frequency);

		/**
		 * uri: http://schema.org/targetPopulation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TargetPopulation
		 */
		public Container.TargetPopulation getTargetPopulation();
		public void setTargetPopulation(Container.TargetPopulation targetPopulation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Drug")
	@SchemaOrgLabel("Drug")
	@SchemaOrgComment(""
			+ "A chemical or biologic substance, used as a medical therapy, that has a"
			+ " physiological effect on an organism. Here the term drug is used interchangeably"
			+ " with the term medicine although clinical knowledge make a clear difference"
			+ " between them.")
	@CamelizedName("drug")
	@ConstantizedName("DRUG")
	public interface Drug extends SchemaOrgClass, Substance {

		/**
		 * uri: http://schema.org/activeIngredient
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * uri: http://schema.org/administrationRoute
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdministrationRoute
		 */
		public Container.AdministrationRoute getAdministrationRoute();
		public void setAdministrationRoute(Container.AdministrationRoute administrationRoute);

		/**
		 * uri: http://schema.org/alcoholWarning
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AlcoholWarning
		 */
		public Container.AlcoholWarning getAlcoholWarning();
		public void setAlcoholWarning(Container.AlcoholWarning alcoholWarning);

		/**
		 * uri: http://schema.org/availableStrength
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableStrength
		 */
		public Container.AvailableStrength getAvailableStrength();
		public void setAvailableStrength(Container.AvailableStrength availableStrength);

		/**
		 * uri: http://schema.org/breastfeedingWarning
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BreastfeedingWarning
		 */
		public Container.BreastfeedingWarning getBreastfeedingWarning();
		public void setBreastfeedingWarning(Container.BreastfeedingWarning breastfeedingWarning);

		/**
		 * uri: http://schema.org/clinicalPharmacology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ClinicalPharmacology
		 */
		public Container.ClinicalPharmacology getClinicalPharmacology();
		public void setClinicalPharmacology(Container.ClinicalPharmacology clinicalPharmacology);

		/**
		 * uri: http://schema.org/cost
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Cost
		 */
		public Container.Cost getCost();
		public void setCost(Container.Cost cost);

		/**
		 * uri: http://schema.org/dosageForm
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DosageForm
		 */
		public Container.DosageForm getDosageForm();
		public void setDosageForm(Container.DosageForm dosageForm);

		/**
		 * uri: http://schema.org/doseSchedule
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseSchedule
		 */
		public Container.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Container.DoseSchedule doseSchedule);

		/**
		 * uri: http://schema.org/drugClass
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugClass
		 */
		public Container.DrugClass getDrugClass();
		public void setDrugClass(Container.DrugClass drugClass);

		/**
		 * uri: http://schema.org/drugUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugUnit
		 */
		public Container.DrugUnit getDrugUnit();
		public void setDrugUnit(Container.DrugUnit drugUnit);

		/**
		 * uri: http://schema.org/foodWarning
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.FoodWarning
		 */
		public Container.FoodWarning getFoodWarning();
		public void setFoodWarning(Container.FoodWarning foodWarning);

		/**
		 * uri: http://schema.org/includedInHealthInsurancePlan
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.IncludedInHealthInsurancePlan
		 */
		public IncludedInHealthInsurancePlan getIncludedInHealthInsurancePlan();
		public void setIncludedInHealthInsurancePlan(IncludedInHealthInsurancePlan includedInHealthInsurancePlan);

		/**
		 * uri: http://schema.org/interactingDrug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.InteractingDrug
		 */
		public Container.InteractingDrug getInteractingDrug();
		public void setInteractingDrug(Container.InteractingDrug interactingDrug);

		/**
		 * uri: http://schema.org/isAvailableGenerically
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsAvailableGenerically
		 */
		public Container.IsAvailableGenerically getIsAvailableGenerically();
		public void setIsAvailableGenerically(Container.IsAvailableGenerically isAvailableGenerically);

		/**
		 * uri: http://schema.org/isProprietary
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsProprietary
		 */
		public Container.IsProprietary getIsProprietary();
		public void setIsProprietary(Container.IsProprietary isProprietary);

		/**
		 * uri: http://schema.org/labelDetails
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LabelDetails
		 */
		public Container.LabelDetails getLabelDetails();
		public void setLabelDetails(Container.LabelDetails labelDetails);

		/**
		 * uri: http://schema.org/legalStatus
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * uri: http://schema.org/manufacturer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer
		 */
		public Manufacturer getManufacturer();
		public void setManufacturer(Manufacturer manufacturer);

		/**
		 * uri: http://schema.org/maximumIntake
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * uri: http://schema.org/mechanismOfAction
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MechanismOfAction
		 */
		public Container.MechanismOfAction getMechanismOfAction();
		public void setMechanismOfAction(Container.MechanismOfAction mechanismOfAction);

		/**
		 * uri: http://schema.org/nonProprietaryName
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NonProprietaryName
		 */
		public Container.NonProprietaryName getNonProprietaryName();
		public void setNonProprietaryName(Container.NonProprietaryName nonProprietaryName);

		/**
		 * uri: http://schema.org/overdosage
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Overdosage
		 */
		public Container.Overdosage getOverdosage();
		public void setOverdosage(Container.Overdosage overdosage);

		/**
		 * uri: http://schema.org/pregnancyCategory
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyCategory
		 */
		public Container.PregnancyCategory getPregnancyCategory();
		public void setPregnancyCategory(Container.PregnancyCategory pregnancyCategory);

		/**
		 * uri: http://schema.org/pregnancyWarning
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyWarning
		 */
		public Container.PregnancyWarning getPregnancyWarning();
		public void setPregnancyWarning(Container.PregnancyWarning pregnancyWarning);

		/**
		 * uri: http://schema.org/prescribingInfo
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrescribingInfo
		 */
		public Container.PrescribingInfo getPrescribingInfo();
		public void setPrescribingInfo(Container.PrescribingInfo prescribingInfo);

		/**
		 * uri: http://schema.org/prescriptionStatus
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrescriptionStatus
		 */
		public Container.PrescriptionStatus getPrescriptionStatus();
		public void setPrescriptionStatus(Container.PrescriptionStatus prescriptionStatus);

		/**
		 * uri: http://schema.org/proprietaryName
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProprietaryName
		 */
		public Container.ProprietaryName getProprietaryName();
		public void setProprietaryName(Container.ProprietaryName proprietaryName);

		/**
		 * uri: http://schema.org/relatedDrug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedDrug
		 */
		public Container.RelatedDrug getRelatedDrug();
		public void setRelatedDrug(Container.RelatedDrug relatedDrug);

		/**
		 * uri: http://schema.org/rxcui
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Rxcui
		 */
		public Rxcui getRxcui();
		public void setRxcui(Rxcui rxcui);

		/**
		 * uri: http://schema.org/warning
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Warning
		 */
		public Container.Warning getWarning();
		public void setWarning(Container.Warning warning);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugClass")
	@SchemaOrgLabel("DrugClass")
	@SchemaOrgComment(""
			+ "A class of medical drugs, e.g., statins. Classes can represent general"
			+ " pharmacological class, common mechanisms of action, common physiological"
			+ " effects, etc.")
	@CamelizedName("drugClass")
	@ConstantizedName("DRUG_CLASS")
	public interface DrugClass extends MedicalEnumeration, SchemaOrgClass {

		/**
		 * uri: http://schema.org/drug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Drug
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugCost")
	@SchemaOrgLabel("DrugCost")
	@SchemaOrgComment(""
			+ "The cost per unit of a medical drug. Note that this type is not meant to"
			+ " represent the price in an offer of a drug for sale; see the Offer type for"
			+ " that. This type will typically be used to tag wholesale or average retail cost"
			+ " of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely"
			+ " depending on how and where they are paid for, so while this type captures some"
			+ " of the variables, costs should be used with caution by consumers of this"
			+ " schema's markup.")
	@CamelizedName("drugCost")
	@ConstantizedName("DRUG_COST")
	public interface DrugCost extends MedicalEnumeration, SchemaOrgClass {

		/**
		 * uri: http://schema.org/applicableLocation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ApplicableLocation
		 */
		public Container.ApplicableLocation getApplicableLocation();
		public void setApplicableLocation(Container.ApplicableLocation applicableLocation);

		/**
		 * uri: http://schema.org/costCategory
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostCategory
		 */
		public Container.CostCategory getCostCategory();
		public void setCostCategory(Container.CostCategory costCategory);

		/**
		 * uri: http://schema.org/costCurrency
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostCurrency
		 */
		public Container.CostCurrency getCostCurrency();
		public void setCostCurrency(Container.CostCurrency costCurrency);

		/**
		 * uri: http://schema.org/costOrigin
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostOrigin
		 */
		public Container.CostOrigin getCostOrigin();
		public void setCostOrigin(Container.CostOrigin costOrigin);

		/**
		 * uri: http://schema.org/costPerUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostPerUnit
		 */
		public Container.CostPerUnit getCostPerUnit();
		public void setCostPerUnit(Container.CostPerUnit costPerUnit);

		/**
		 * uri: http://schema.org/drugUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugUnit
		 */
		public Container.DrugUnit getDrugUnit();
		public void setDrugUnit(Container.DrugUnit drugUnit);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugCostCategory")
	@SchemaOrgLabel("DrugCostCategory")
	@SchemaOrgComment(""
			+ "Enumerated categories of medical drug costs.")
	@CamelizedName("drugCostCategory")
	@ConstantizedName("DRUG_COST_CATEGORY")
	public interface DrugCostCategory extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugLegalStatus")
	@SchemaOrgLabel("DrugLegalStatus")
	@SchemaOrgComment(""
			+ "The legal availability status of a medical drug.")
	@CamelizedName("drugLegalStatus")
	@ConstantizedName("DRUG_LEGAL_STATUS")
	public interface DrugLegalStatus extends MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/applicableLocation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ApplicableLocation
		 */
		public Container.ApplicableLocation getApplicableLocation();
		public void setApplicableLocation(Container.ApplicableLocation applicableLocation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugPregnancyCategory")
	@SchemaOrgLabel("DrugPregnancyCategory")
	@SchemaOrgComment(""
			+ "Categories that represent an assessment of the risk of fetal injury due to a"
			+ " drug or pharmaceutical used as directed by the mother during pregnancy.")
	@CamelizedName("drugPregnancyCategory")
	@ConstantizedName("DRUG_PREGNANCY_CATEGORY")
	public interface DrugPregnancyCategory extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugPrescriptionStatus")
	@SchemaOrgLabel("DrugPrescriptionStatus")
	@SchemaOrgComment(""
			+ "Indicates whether this drug is available by prescription or over-the-counter.")
	@CamelizedName("drugPrescriptionStatus")
	@ConstantizedName("DRUG_PRESCRIPTION_STATUS")
	public interface DrugPrescriptionStatus extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrugStrength")
	@SchemaOrgLabel("DrugStrength")
	@SchemaOrgComment(""
			+ "A specific strength in which a medical drug is available in a specific country.")
	@CamelizedName("drugStrength")
	@ConstantizedName("DRUG_STRENGTH")
	public interface DrugStrength extends MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/activeIngredient
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * uri: http://schema.org/availableIn
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableIn
		 */
		public Container.AvailableIn getAvailableIn();
		public void setAvailableIn(Container.AvailableIn availableIn);

		/**
		 * uri: http://schema.org/maximumIntake
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * uri: http://schema.org/strengthUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StrengthUnit
		 */
		public Container.StrengthUnit getStrengthUnit();
		public void setStrengthUnit(Container.StrengthUnit strengthUnit);

		/**
		 * uri: http://schema.org/strengthValue
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StrengthValue
		 */
		public Container.StrengthValue getStrengthValue();
		public void setStrengthValue(Container.StrengthValue strengthValue);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ExercisePlan")
	@SchemaOrgLabel("ExercisePlan")
	@SchemaOrgComment(""
			+ "Fitness-related activity designed for a specific health-related purpose,"
			+ " including defined exercise routines as well as activity prescribed by a"
			+ " clinician.")
	@CamelizedName("exercisePlan")
	@ConstantizedName("EXERCISE_PLAN")
	public interface ExercisePlan extends CreativeWork, PhysicalActivity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/activityDuration
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActivityDuration
		 */
		public Container.ActivityDuration getActivityDuration();
		public void setActivityDuration(Container.ActivityDuration activityDuration);

		/**
		 * uri: http://schema.org/activityFrequency
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActivityFrequency
		 */
		public Container.ActivityFrequency getActivityFrequency();
		public void setActivityFrequency(Container.ActivityFrequency activityFrequency);

		/**
		 * uri: http://schema.org/additionalVariable
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdditionalVariable
		 */
		public Container.AdditionalVariable getAdditionalVariable();
		public void setAdditionalVariable(Container.AdditionalVariable additionalVariable);

		/**
		 * uri: http://schema.org/exerciseType
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseType
		 */
		public Container.ExerciseType getExerciseType();
		public void setExerciseType(Container.ExerciseType exerciseType);

		/**
		 * uri: http://schema.org/intensity
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Intensity
		 */
		public Container.Intensity getIntensity();
		public void setIntensity(Container.Intensity intensity);

		/**
		 * uri: http://schema.org/repetitions
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Repetitions
		 */
		public Container.Repetitions getRepetitions();
		public void setRepetitions(Container.Repetitions repetitions);

		/**
		 * uri: http://schema.org/restPeriods
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RestPeriods
		 */
		public Container.RestPeriods getRestPeriods();
		public void setRestPeriods(Container.RestPeriods restPeriods);

		/**
		 * uri: http://schema.org/workload
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Workload
		 */
		public Container.Workload getWorkload();
		public void setWorkload(Container.Workload workload);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ImagingTest")
	@SchemaOrgLabel("ImagingTest")
	@SchemaOrgComment(""
			+ "Any medical imaging modality typically used for diagnostic purposes.")
	@CamelizedName("imagingTest")
	@ConstantizedName("IMAGING_TEST")
	public interface ImagingTest extends MedicalTest, SchemaOrgClass {

		/**
		 * uri: http://schema.org/imagingTechnique
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ImagingTechnique
		 */
		public Container.ImagingTechnique getImagingTechnique();
		public void setImagingTechnique(Container.ImagingTechnique imagingTechnique);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InfectiousAgentClass")
	@SchemaOrgLabel("InfectiousAgentClass")
	@SchemaOrgComment(""
			+ "Classes of agents or pathogens that transmit infectious diseases. Enumerated"
			+ " type.")
	@CamelizedName("infectiousAgentClass")
	@ConstantizedName("INFECTIOUS_AGENT_CLASS")
	public interface InfectiousAgentClass extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InfectiousDisease")
	@SchemaOrgLabel("InfectiousDisease")
	@SchemaOrgComment(""
			+ "An infectious disease is a clinically evident human disease resulting from the"
			+ " presence of pathogenic microbial agents, like pathogenic viruses, pathogenic"
			+ " bacteria, fungi, protozoa, multicellular parasites, and prions. To be"
			+ " considered an infectious disease, such pathogens are known to be able to cause"
			+ " this disease.")
	@CamelizedName("infectiousDisease")
	@ConstantizedName("INFECTIOUS_DISEASE")
	public interface InfectiousDisease extends MedicalCondition, SchemaOrgClass {

		/**
		 * uri: http://schema.org/infectiousAgent
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.InfectiousAgent
		 */
		public Container.InfectiousAgent getInfectiousAgent();
		public void setInfectiousAgent(Container.InfectiousAgent infectiousAgent);

		/**
		 * uri: http://schema.org/infectiousAgentClass
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.InfectiousAgentClass
		 */
		public Container.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Container.InfectiousAgentClass infectiousAgentClass);

		/**
		 * uri: http://schema.org/transmissionMethod
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TransmissionMethod
		 */
		public Container.TransmissionMethod getTransmissionMethod();
		public void setTransmissionMethod(Container.TransmissionMethod transmissionMethod);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Joint")
	@SchemaOrgLabel("Joint")
	@SchemaOrgComment(""
			+ "The anatomical location at which two or more bones make contact.")
	@CamelizedName("joint")
	@ConstantizedName("JOINT")
	public interface Joint extends AnatomicalStructure, SchemaOrgClass {

		/**
		 * uri: http://schema.org/biomechnicalClass
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BiomechnicalClass
		 */
		public Container.BiomechnicalClass getBiomechnicalClass();
		public void setBiomechnicalClass(Container.BiomechnicalClass biomechnicalClass);

		/**
		 * uri: http://schema.org/functionalClass
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.FunctionalClass
		 */
		public Container.FunctionalClass getFunctionalClass();
		public void setFunctionalClass(Container.FunctionalClass functionalClass);

		/**
		 * uri: http://schema.org/structuralClass
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StructuralClass
		 */
		public Container.StructuralClass getStructuralClass();
		public void setStructuralClass(Container.StructuralClass structuralClass);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LifestyleModification")
	@SchemaOrgLabel("LifestyleModification")
	@SchemaOrgComment(""
			+ "A process of care involving exercise, changes to diet, fitness routines, and"
			+ " other lifestyle changes aimed at improving a health condition.")
	@CamelizedName("lifestyleModification")
	@ConstantizedName("LIFESTYLE_MODIFICATION")
	public interface LifestyleModification extends MedicalEntity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Ligament")
	@SchemaOrgLabel("Ligament")
	@SchemaOrgComment(""
			+ "A short band of tough, flexible, fibrous connective tissue that functions to"
			+ " connect multiple bones, cartilages, and structurally support joints.")
	@CamelizedName("ligament")
	@ConstantizedName("LIGAMENT")
	public interface Ligament extends AnatomicalStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LymphaticVessel")
	@SchemaOrgLabel("LymphaticVessel")
	@SchemaOrgComment(""
			+ "A type of blood vessel that specifically carries lymph fluid unidirectionally"
			+ " toward the heart.")
	@CamelizedName("lymphaticVessel")
	@ConstantizedName("LYMPHATIC_VESSEL")
	public interface LymphaticVessel extends SchemaOrgClass, Vessel {

		/**
		 * uri: http://schema.org/originatesFrom
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.OriginatesFrom
		 */
		public Container.OriginatesFrom getOriginatesFrom();
		public void setOriginatesFrom(Container.OriginatesFrom originatesFrom);

		/**
		 * uri: http://schema.org/regionDrained
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RegionDrained
		 */
		public Container.RegionDrained getRegionDrained();
		public void setRegionDrained(Container.RegionDrained regionDrained);

		/**
		 * uri: http://schema.org/runsTo
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RunsTo
		 */
		public Container.RunsTo getRunsTo();
		public void setRunsTo(Container.RunsTo runsTo);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MaximumDoseSchedule")
	@SchemaOrgLabel("MaximumDoseSchedule")
	@SchemaOrgComment(""
			+ "The maximum dosing schedule considered safe for a drug or supplement as"
			+ " recommended by an authority or by the drug/supplement's manufacturer. Capture"
			+ " the recommending authority in the recognizingAuthority property of"
			+ " MedicalEntity.")
	@CamelizedName("maximumDoseSchedule")
	@ConstantizedName("MAXIMUM_DOSE_SCHEDULE")
	public interface MaximumDoseSchedule extends DoseSchedule, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalAudience")
	@SchemaOrgLabel("MedicalAudience")
	@SchemaOrgComment(""
			+ "Target audiences for medical web pages. Enumerated type.")
	@CamelizedName("medicalAudience")
	@ConstantizedName("MEDICAL_AUDIENCE")
	public interface MedicalAudience extends Audience, MedicalEnumeration, PeopleAudience, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalBusiness")
	@SchemaOrgLabel("MedicalBusiness")
	@SchemaOrgComment(""
			+ "A particular physical or virtual business of an organization for medical"
			+ " purposes. Examples of MedicalBusiness include differents business run by health"
			+ " professionals.")
	@CamelizedName("medicalBusiness")
	@ConstantizedName("MEDICAL_BUSINESS")
	public interface MedicalBusiness extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalCause")
	@SchemaOrgLabel("MedicalCause")
	@SchemaOrgComment(""
			+ "The causative agent(s) that are responsible for the pathophysiologic process"
			+ " that eventually results in a medical condition, symptom or sign. In this"
			+ " schema, unless otherwise specified this is meant to be the proximate cause of"
			+ " the medical condition, symptom or sign. The proximate cause is defined as the"
			+ " causative agent that most directly results in the medical condition, symptom or"
			+ " sign. For example, the HIV virus could be considered a cause of AIDS. Or in a"
			+ " diagnostic context, if a patient fell and sustained a hip fracture and two days"
			+ " later sustained a pulmonary embolism which eventuated in a cardiac arrest, the"
			+ " cause of the cardiac arrest (the proximate cause) would be the pulmonary"
			+ " embolism and not the fall. Medical causes can include cardiovascular, chemical,"
			+ " dermatologic, endocrine, environmental, gastroenterologic, genetic,"
			+ " hematologic, gynecologic, iatrogenic, infectious, musculoskeletal, neurologic,"
			+ " nutritional, obstetric, oncologic, otolaryngologic, pharmacologic, psychiatric,"
			+ " pulmonary, renal, rheumatologic, toxic, traumatic, or urologic causes; medical"
			+ " conditions can be causes as well.")
	@CamelizedName("medicalCause")
	@ConstantizedName("MEDICAL_CAUSE")
	public interface MedicalCause extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/causeOf
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CauseOf
		 */
		public Container.CauseOf getCauseOf();
		public void setCauseOf(Container.CauseOf causeOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalClinic")
	@SchemaOrgLabel("MedicalClinic")
	@SchemaOrgComment(""
			+ "A facility, often associated with a hospital or medical school, that is devoted"
			+ " to the specific diagnosis and/or healthcare. Previously limited to outpatients"
			+ " but with evolution it may be open to inpatients as well.")
	@CamelizedName("medicalClinic")
	@ConstantizedName("MEDICAL_CLINIC")
	public interface MedicalClinic extends MedicalBusiness, MedicalOrganization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableService
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableService
		 */
		public Container.AvailableService getAvailableService();
		public void setAvailableService(Container.AvailableService availableService);

		/**
		 * uri: http://schema.org/medicalSpecialty
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicalSpecialty
		 */
		public Container.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Container.MedicalSpecialty medicalSpecialty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalCode")
	@SchemaOrgLabel("MedicalCode")
	@SchemaOrgComment("A code for a medical entity.")
	@CamelizedName("medicalCode")
	@ConstantizedName("MEDICAL_CODE")
	public interface MedicalCode extends CategoryCode, MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/codeValue
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CodeValue
		 */
		public CodeValue getCodeValue();
		public void setCodeValue(CodeValue codeValue);

		/**
		 * uri: http://schema.org/codingSystem
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CodingSystem
		 */
		public Container.CodingSystem getCodingSystem();
		public void setCodingSystem(Container.CodingSystem codingSystem);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalCondition")
	@SchemaOrgLabel("MedicalCondition")
	@SchemaOrgComment(""
			+ "Any condition of the human body that affects the normal functioning of a person,"
			+ " whether physically or mentally. Includes diseases, injuries, disabilities,"
			+ " disorders, syndromes, etc.")
	@CamelizedName("medicalCondition")
	@ConstantizedName("MEDICAL_CONDITION")
	public interface MedicalCondition extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedAnatomy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedAnatomy
		 */
		public Container.AssociatedAnatomy getAssociatedAnatomy();
		public void setAssociatedAnatomy(Container.AssociatedAnatomy associatedAnatomy);

		/**
		 * uri: http://schema.org/cause
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Cause
		 */
		public Container.Cause getCause();
		public void setCause(Container.Cause cause);

		/**
		 * uri: http://schema.org/differentialDiagnosis
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DifferentialDiagnosis
		 */
		public Container.DifferentialDiagnosis getDifferentialDiagnosis();
		public void setDifferentialDiagnosis(Container.DifferentialDiagnosis differentialDiagnosis);

		/**
		 * uri: http://schema.org/drug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Drug
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * uri: http://schema.org/epidemiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Epidemiology
		 */
		public Container.Epidemiology getEpidemiology();
		public void setEpidemiology(Container.Epidemiology epidemiology);

		/**
		 * uri: http://schema.org/expectedPrognosis
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExpectedPrognosis
		 */
		public Container.ExpectedPrognosis getExpectedPrognosis();
		public void setExpectedPrognosis(Container.ExpectedPrognosis expectedPrognosis);

		/**
		 * uri: http://schema.org/naturalProgression
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NaturalProgression
		 */
		public Container.NaturalProgression getNaturalProgression();
		public void setNaturalProgression(Container.NaturalProgression naturalProgression);

		/**
		 * uri: http://schema.org/pathophysiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Pathophysiology
		 */
		public Container.Pathophysiology getPathophysiology();
		public void setPathophysiology(Container.Pathophysiology pathophysiology);

		/**
		 * uri: http://schema.org/possibleComplication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PossibleComplication
		 */
		public Container.PossibleComplication getPossibleComplication();
		public void setPossibleComplication(Container.PossibleComplication possibleComplication);

		/**
		 * uri: http://schema.org/possibleTreatment
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PossibleTreatment
		 */
		public Container.PossibleTreatment getPossibleTreatment();
		public void setPossibleTreatment(Container.PossibleTreatment possibleTreatment);

		/**
		 * uri: http://schema.org/primaryPrevention
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrimaryPrevention
		 */
		public Container.PrimaryPrevention getPrimaryPrevention();
		public void setPrimaryPrevention(Container.PrimaryPrevention primaryPrevention);

		/**
		 * uri: http://schema.org/riskFactor
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RiskFactor
		 */
		public Container.RiskFactor getRiskFactor();
		public void setRiskFactor(Container.RiskFactor riskFactor);

		/**
		 * uri: http://schema.org/secondaryPrevention
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SecondaryPrevention
		 */
		public Container.SecondaryPrevention getSecondaryPrevention();
		public void setSecondaryPrevention(Container.SecondaryPrevention secondaryPrevention);

		/**
		 * uri: http://schema.org/signOrSymptom
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SignOrSymptom
		 */
		public Container.SignOrSymptom getSignOrSymptom();
		public void setSignOrSymptom(Container.SignOrSymptom signOrSymptom);

		/**
		 * uri: http://schema.org/stage
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Stage
		 */
		public Container.Stage getStage();
		public void setStage(Container.Stage stage);

		/**
		 * uri: http://schema.org/status
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Status
		 */
		public Container.Status getStatus();
		public void setStatus(Container.Status status);

		/**
		 * uri: http://schema.org/subtype
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Subtype
		 */
		public Container.Subtype getSubtype();
		public void setSubtype(Container.Subtype subtype);

		/**
		 * uri: http://schema.org/typicalTest
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TypicalTest
		 */
		public Container.TypicalTest getTypicalTest();
		public void setTypicalTest(Container.TypicalTest typicalTest);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalConditionStage")
	@SchemaOrgLabel("MedicalConditionStage")
	@SchemaOrgComment(""
			+ "A stage of a medical condition, such as 'Stage IIIa'.")
	@CamelizedName("medicalConditionStage")
	@ConstantizedName("MEDICAL_CONDITION_STAGE")
	public interface MedicalConditionStage extends MedicalIntangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/stageAsNumber
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StageAsNumber
		 */
		public Container.StageAsNumber getStageAsNumber();
		public void setStageAsNumber(Container.StageAsNumber stageAsNumber);

		/**
		 * uri: http://schema.org/subStageSuffix
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStageSuffix
		 */
		public Container.SubStageSuffix getSubStageSuffix();
		public void setSubStageSuffix(Container.SubStageSuffix subStageSuffix);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalContraindication")
	@SchemaOrgLabel("MedicalContraindication")
	@SchemaOrgComment(""
			+ "A condition or factor that serves as a reason to withhold a certain medical"
			+ " therapy. Contraindications can be absolute (there are no reasonable"
			+ " circumstances for undertaking a course of action) or relative (the patient is"
			+ " at higher risk of complications, but that these risks may be outweighed by"
			+ " other considerations or mitigated by other measures).")
	@CamelizedName("medicalContraindication")
	@ConstantizedName("MEDICAL_CONTRAINDICATION")
	public interface MedicalContraindication extends MedicalEntity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalDevice")
	@SchemaOrgLabel("MedicalDevice")
	@SchemaOrgComment(""
			+ "Any object used in a medical capacity, such as to diagnose or treat a patient.")
	@CamelizedName("medicalDevice")
	@ConstantizedName("MEDICAL_DEVICE")
	public interface MedicalDevice extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/adverseOutcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdverseOutcome
		 */
		public Container.AdverseOutcome getAdverseOutcome();
		public void setAdverseOutcome(Container.AdverseOutcome adverseOutcome);

		/**
		 * uri: http://schema.org/contraindication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Contraindication
		 */
		public Container.Contraindication getContraindication();
		public void setContraindication(Container.Contraindication contraindication);

		/**
		 * uri: http://schema.org/indication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Indication
		 */
		public Container.Indication getIndication();
		public void setIndication(Container.Indication indication);

		/**
		 * uri: http://schema.org/postOp
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PostOp
		 */
		public Container.PostOp getPostOp();
		public void setPostOp(Container.PostOp postOp);

		/**
		 * uri: http://schema.org/preOp
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PreOp
		 */
		public Container.PreOp getPreOp();
		public void setPreOp(Container.PreOp preOp);

		/**
		 * uri: http://schema.org/procedure
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Procedure
		 */
		public Container.Procedure getProcedure();
		public void setProcedure(Container.Procedure procedure);

		/**
		 * uri: http://schema.org/purpose
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Purpose
		 */
		public Container.Purpose getPurpose();
		public void setPurpose(Container.Purpose purpose);

		/**
		 * uri: http://schema.org/seriousAdverseOutcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SeriousAdverseOutcome
		 */
		public Container.SeriousAdverseOutcome getSeriousAdverseOutcome();
		public void setSeriousAdverseOutcome(Container.SeriousAdverseOutcome seriousAdverseOutcome);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalDevicePurpose")
	@SchemaOrgLabel("MedicalDevicePurpose")
	@SchemaOrgComment(""
			+ "Categories of medical devices, organized by the purpose or intended use of the"
			+ " device.")
	@CamelizedName("medicalDevicePurpose")
	@ConstantizedName("MEDICAL_DEVICE_PURPOSE")
	public interface MedicalDevicePurpose extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalEntity")
	@SchemaOrgLabel("MedicalEntity")
	@SchemaOrgComment(""
			+ "The most generic type of entity related to health and the practice of medicine.")
	@CamelizedName("medicalEntity")
	@ConstantizedName("MEDICAL_ENTITY")
	public interface MedicalEntity extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/code
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code
		 */
		public Container.Code getCode();
		public void setCode(Container.Code code);

		/**
		 * uri: http://schema.org/guideline
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline
		 */
		public Container.Guideline getGuideline();
		public void setGuideline(Container.Guideline guideline);

		/**
		 * uri: http://schema.org/legalStatus
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * uri: http://schema.org/medicineSystem
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem
		 */
		public Container.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Container.MedicineSystem medicineSystem);

		/**
		 * uri: http://schema.org/recognizingAuthority
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority
		 */
		public Container.RecognizingAuthority getRecognizingAuthority();
		public void setRecognizingAuthority(Container.RecognizingAuthority recognizingAuthority);

		/**
		 * uri: http://schema.org/relevantSpecialty
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelevantSpecialty
		 */
		public Container.RelevantSpecialty getRelevantSpecialty();
		public void setRelevantSpecialty(Container.RelevantSpecialty relevantSpecialty);

		/**
		 * uri: http://schema.org/study
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study
		 */
		public Container.Study getStudy();
		public void setStudy(Container.Study study);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalEnumeration")
	@SchemaOrgLabel("MedicalEnumeration")
	@SchemaOrgComment(""
			+ "Enumerations related to health and the practice of medicine: A concept that is"
			+ " used to attribute a quality to another concept, as a qualifier, a collection of"
			+ " items or a listing of all of the elements of a set in medicine practice.")
	@CamelizedName("medicalEnumeration")
	@ConstantizedName("MEDICAL_ENUMERATION")
	public interface MedicalEnumeration extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalEvidenceLevel")
	@SchemaOrgLabel("MedicalEvidenceLevel")
	@SchemaOrgComment(""
			+ "Level of evidence for a medical guideline. Enumerated type.")
	@CamelizedName("medicalEvidenceLevel")
	@ConstantizedName("MEDICAL_EVIDENCE_LEVEL")
	public interface MedicalEvidenceLevel extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalGuideline")
	@SchemaOrgLabel("MedicalGuideline")
	@SchemaOrgComment(""
			+ "Any recommendation made by a standard society (e.g. ACC/AHA) or consensus"
			+ " statement that denotes how to diagnose and treat a particular condition. Note:"
			+ " this type should be used to tag the actual guideline recommendation; if the"
			+ " guideline recommendation occurs in a larger scholarly article, use"
			+ " MedicalScholarlyArticle to tag the overall article, not this type. Note also:"
			+ " the organization making the recommendation should be captured in the"
			+ " recognizingAuthority base property of MedicalEntity.")
	@CamelizedName("medicalGuideline")
	@ConstantizedName("MEDICAL_GUIDELINE")
	public interface MedicalGuideline extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/evidenceLevel
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.EvidenceLevel
		 */
		public Container.EvidenceLevel getEvidenceLevel();
		public void setEvidenceLevel(Container.EvidenceLevel evidenceLevel);

		/**
		 * uri: http://schema.org/evidenceOrigin
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.EvidenceOrigin
		 */
		public Container.EvidenceOrigin getEvidenceOrigin();
		public void setEvidenceOrigin(Container.EvidenceOrigin evidenceOrigin);

		/**
		 * uri: http://schema.org/guidelineDate
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.GuidelineDate
		 */
		public Container.GuidelineDate getGuidelineDate();
		public void setGuidelineDate(Container.GuidelineDate guidelineDate);

		/**
		 * uri: http://schema.org/guidelineSubject
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.GuidelineSubject
		 */
		public Container.GuidelineSubject getGuidelineSubject();
		public void setGuidelineSubject(Container.GuidelineSubject guidelineSubject);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalGuidelineContraindication")
	@SchemaOrgLabel("MedicalGuidelineContraindication")
	@SchemaOrgComment(""
			+ "A guideline contraindication that designates a process as harmful and where"
			+ " quality of the data supporting the contraindication is sound.")
	@CamelizedName("medicalGuidelineContraindication")
	@ConstantizedName("MEDICAL_GUIDELINE_CONTRAINDICATION")
	public interface MedicalGuidelineContraindication extends MedicalGuideline, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalGuidelineRecommendation")
	@SchemaOrgLabel("MedicalGuidelineRecommendation")
	@SchemaOrgComment(""
			+ "A guideline recommendation that is regarded as efficacious and where quality of"
			+ " the data supporting the recommendation is sound.")
	@CamelizedName("medicalGuidelineRecommendation")
	@ConstantizedName("MEDICAL_GUIDELINE_RECOMMENDATION")
	public interface MedicalGuidelineRecommendation extends MedicalGuideline, SchemaOrgClass {

		/**
		 * uri: http://schema.org/recommendationStrength
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecommendationStrength
		 */
		public Container.RecommendationStrength getRecommendationStrength();
		public void setRecommendationStrength(Container.RecommendationStrength recommendationStrength);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalImagingTechnique")
	@SchemaOrgLabel("MedicalImagingTechnique")
	@SchemaOrgComment(""
			+ "Any medical imaging modality typically used for diagnostic purposes. Enumerated"
			+ " type.")
	@CamelizedName("medicalImagingTechnique")
	@ConstantizedName("MEDICAL_IMAGING_TECHNIQUE")
	public interface MedicalImagingTechnique extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalIndication")
	@SchemaOrgLabel("MedicalIndication")
	@SchemaOrgComment(""
			+ "A condition or factor that indicates use of a medical therapy, including signs,"
			+ " symptoms, risk factors, anatomical states, etc.")
	@CamelizedName("medicalIndication")
	@ConstantizedName("MEDICAL_INDICATION")
	public interface MedicalIndication extends MedicalEntity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalIntangible")
	@SchemaOrgLabel("MedicalIntangible")
	@SchemaOrgComment(""
			+ "A utility class that serves as the umbrella for a number of 'intangible' things"
			+ " in the medical space.")
	@CamelizedName("medicalIntangible")
	@ConstantizedName("MEDICAL_INTANGIBLE")
	public interface MedicalIntangible extends MedicalEntity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalObservationalStudy")
	@SchemaOrgLabel("MedicalObservationalStudy")
	@SchemaOrgComment(""
			+ "An observational study is a type of medical study that attempts to infer the"
			+ " possible effect of a treatment through observation of a cohort of subjects over"
			+ " a period of time. In an observational study, the assignment of subjects into"
			+ " treatment groups versus control groups is outside the control of the"
			+ " investigator. This is in contrast with controlled studies, such as the"
			+ " randomized controlled trials represented by MedicalTrial, where each subject is"
			+ " randomly assigned to a treatment group or a control group before the start of"
			+ " the treatment.")
	@CamelizedName("medicalObservationalStudy")
	@ConstantizedName("MEDICAL_OBSERVATIONAL_STUDY")
	public interface MedicalObservationalStudy extends MedicalStudy, SchemaOrgClass {

		/**
		 * uri: http://schema.org/studyDesign
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StudyDesign
		 */
		public Container.StudyDesign getStudyDesign();
		public void setStudyDesign(Container.StudyDesign studyDesign);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalObservationalStudyDesign")
	@SchemaOrgLabel("MedicalObservationalStudyDesign")
	@SchemaOrgComment(""
			+ "Design models for observational medical studies. Enumerated type.")
	@CamelizedName("medicalObservationalStudyDesign")
	@ConstantizedName("MEDICAL_OBSERVATIONAL_STUDY_DESIGN")
	public interface MedicalObservationalStudyDesign extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalProcedure")
	@SchemaOrgLabel("MedicalProcedure")
	@SchemaOrgComment(""
			+ "A process of care used in either a diagnostic, therapeutic, preventive or"
			+ " palliative capacity that relies on invasive (surgical), non-invasive, or other"
			+ " techniques.")
	@CamelizedName("medicalProcedure")
	@ConstantizedName("MEDICAL_PROCEDURE")
	public interface MedicalProcedure extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/bodyLocation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BodyLocation
		 */
		public Container.BodyLocation getBodyLocation();
		public void setBodyLocation(Container.BodyLocation bodyLocation);

		/**
		 * uri: http://schema.org/followup
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Followup
		 */
		public Container.Followup getFollowup();
		public void setFollowup(Container.Followup followup);

		/**
		 * uri: http://schema.org/howPerformed
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HowPerformed
		 */
		public Container.HowPerformed getHowPerformed();
		public void setHowPerformed(Container.HowPerformed howPerformed);

		/**
		 * uri: http://schema.org/indication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Indication
		 */
		public Container.Indication getIndication();
		public void setIndication(Container.Indication indication);

		/**
		 * uri: http://schema.org/outcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Outcome
		 */
		public Container.Outcome getOutcome();
		public void setOutcome(Container.Outcome outcome);

		/**
		 * uri: http://schema.org/preparation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Preparation
		 */
		public Container.Preparation getPreparation();
		public void setPreparation(Container.Preparation preparation);

		/**
		 * uri: http://schema.org/procedureType
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProcedureType
		 */
		public Container.ProcedureType getProcedureType();
		public void setProcedureType(Container.ProcedureType procedureType);

		/**
		 * uri: http://schema.org/status
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Status
		 */
		public Container.Status getStatus();
		public void setStatus(Container.Status status);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalProcedureType")
	@SchemaOrgLabel("MedicalProcedureType")
	@SchemaOrgComment(""
			+ "An enumeration that describes different types of medical procedures.")
	@CamelizedName("medicalProcedureType")
	@ConstantizedName("MEDICAL_PROCEDURE_TYPE")
	public interface MedicalProcedureType extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalRiskCalculator")
	@SchemaOrgLabel("MedicalRiskCalculator")
	@SchemaOrgComment(""
			+ "A complex mathematical calculation requiring an online calculator, used to"
			+ " assess prognosis. Note: use the url property of Thing to record any URLs for"
			+ " online calculators.")
	@CamelizedName("medicalRiskCalculator")
	@ConstantizedName("MEDICAL_RISK_CALCULATOR")
	public interface MedicalRiskCalculator extends MedicalRiskEstimator, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalRiskEstimator")
	@SchemaOrgLabel("MedicalRiskEstimator")
	@SchemaOrgComment(""
			+ "Any rule set or interactive tool for estimating the risk of developing a"
			+ " complication or condition.")
	@CamelizedName("medicalRiskEstimator")
	@ConstantizedName("MEDICAL_RISK_ESTIMATOR")
	public interface MedicalRiskEstimator extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/estimatesRiskOf
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.EstimatesRiskOf
		 */
		public Container.EstimatesRiskOf getEstimatesRiskOf();
		public void setEstimatesRiskOf(Container.EstimatesRiskOf estimatesRiskOf);

		/**
		 * uri: http://schema.org/includedRiskFactor
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IncludedRiskFactor
		 */
		public Container.IncludedRiskFactor getIncludedRiskFactor();
		public void setIncludedRiskFactor(Container.IncludedRiskFactor includedRiskFactor);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalRiskFactor")
	@SchemaOrgLabel("MedicalRiskFactor")
	@SchemaOrgComment(""
			+ "A risk factor is anything that increases a person's likelihood of developing or"
			+ " contracting a disease, medical condition, or complication.")
	@CamelizedName("medicalRiskFactor")
	@ConstantizedName("MEDICAL_RISK_FACTOR")
	public interface MedicalRiskFactor extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/increasesRiskOf
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IncreasesRiskOf
		 */
		public Container.IncreasesRiskOf getIncreasesRiskOf();
		public void setIncreasesRiskOf(Container.IncreasesRiskOf increasesRiskOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalRiskScore")
	@SchemaOrgLabel("MedicalRiskScore")
	@SchemaOrgComment(""
			+ "A simple system that adds up the number of risk factors to yield a score that is"
			+ " associated with prognosis, e.g. CHAD score, TIMI risk score.")
	@CamelizedName("medicalRiskScore")
	@ConstantizedName("MEDICAL_RISK_SCORE")
	public interface MedicalRiskScore extends MedicalRiskEstimator, SchemaOrgClass {

		/**
		 * uri: http://schema.org/algorithm
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Algorithm
		 */
		public Container.Algorithm getAlgorithm();
		public void setAlgorithm(Container.Algorithm algorithm);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalScholarlyArticle")
	@SchemaOrgLabel("MedicalScholarlyArticle")
	@SchemaOrgComment(""
			+ "A scholarly article in the medical domain.")
	@CamelizedName("medicalScholarlyArticle")
	@ConstantizedName("MEDICAL_SCHOLARLY_ARTICLE")
	public interface MedicalScholarlyArticle extends SchemaOrgClass, ScholarlyArticle {

		/**
		 * uri: http://schema.org/publicationType
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PublicationType
		 */
		public Container.PublicationType getPublicationType();
		public void setPublicationType(Container.PublicationType publicationType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalSign")
	@SchemaOrgLabel("MedicalSign")
	@SchemaOrgComment(""
			+ "Any physical manifestation of a person's medical condition discoverable by"
			+ " objective diagnostic tests or physical examination.")
	@CamelizedName("medicalSign")
	@ConstantizedName("MEDICAL_SIGN")
	public interface MedicalSign extends MedicalSignOrSymptom, SchemaOrgClass {

		/**
		 * uri: http://schema.org/identifyingExam
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IdentifyingExam
		 */
		public Container.IdentifyingExam getIdentifyingExam();
		public void setIdentifyingExam(Container.IdentifyingExam identifyingExam);

		/**
		 * uri: http://schema.org/identifyingTest
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IdentifyingTest
		 */
		public Container.IdentifyingTest getIdentifyingTest();
		public void setIdentifyingTest(Container.IdentifyingTest identifyingTest);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalSignOrSymptom")
	@SchemaOrgLabel("MedicalSignOrSymptom")
	@SchemaOrgComment(""
			+ "Any feature associated or not with a medical condition. In medicine a symptom is"
			+ " generally subjective while a sign is objective.")
	@CamelizedName("medicalSignOrSymptom")
	@ConstantizedName("MEDICAL_SIGN_OR_SYMPTOM")
	public interface MedicalSignOrSymptom extends MedicalCondition, SchemaOrgClass {

		/**
		 * uri: http://schema.org/cause
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Cause
		 */
		public Container.Cause getCause();
		public void setCause(Container.Cause cause);

		/**
		 * uri: http://schema.org/possibleTreatment
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PossibleTreatment
		 */
		public Container.PossibleTreatment getPossibleTreatment();
		public void setPossibleTreatment(Container.PossibleTreatment possibleTreatment);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalSpecialty")
	@SchemaOrgLabel("MedicalSpecialty")
	@SchemaOrgComment(""
			+ "Any specific branch of medical science or practice. Medical specialities include"
			+ " clinical specialties that pertain to particular organ systems and their"
			+ " respective disease states, as well as allied health specialties. Enumerated"
			+ " type.")
	@CamelizedName("medicalSpecialty")
	@ConstantizedName("MEDICAL_SPECIALTY")
	public interface MedicalSpecialty extends MedicalEnumeration, SchemaOrgClass, Specialty {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalStudy")
	@SchemaOrgLabel("MedicalStudy")
	@SchemaOrgComment(""
			+ "A medical study is an umbrella type covering all kinds of research studies"
			+ " relating to human medicine or health, including observational studies and"
			+ " interventional trials and registries, randomized, controlled or not. When the"
			+ " specific type of study is known, use one of the extensions of this type, such"
			+ " as MedicalTrial or MedicalObservationalStudy. Also, note that this type should"
			+ " be used to mark up data that describes the study itself; to tag an article that"
			+ " publishes the results of a study, use MedicalScholarlyArticle. Note: use the"
			+ " code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.")
	@CamelizedName("medicalStudy")
	@ConstantizedName("MEDICAL_STUDY")
	public interface MedicalStudy extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition
		 */
		public Container.HealthCondition getHealthCondition();
		public void setHealthCondition(Container.HealthCondition healthCondition);

		/**
		 * uri: http://schema.org/outcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Outcome
		 */
		public Container.Outcome getOutcome();
		public void setOutcome(Container.Outcome outcome);

		/**
		 * uri: http://schema.org/population
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Population
		 */
		public Container.Population getPopulation();
		public void setPopulation(Container.Population population);

		/**
		 * uri: http://schema.org/sponsor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sponsor
		 */
		public Sponsor getSponsor();
		public void setSponsor(Sponsor sponsor);

		/**
		 * uri: http://schema.org/status
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Status
		 */
		public Container.Status getStatus();
		public void setStatus(Container.Status status);

		/**
		 * uri: http://schema.org/studyLocation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StudyLocation
		 */
		public Container.StudyLocation getStudyLocation();
		public void setStudyLocation(Container.StudyLocation studyLocation);

		/**
		 * uri: http://schema.org/studySubject
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StudySubject
		 */
		public Container.StudySubject getStudySubject();
		public void setStudySubject(Container.StudySubject studySubject);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalStudyStatus")
	@SchemaOrgLabel("MedicalStudyStatus")
	@SchemaOrgComment(""
			+ "The status of a medical study. Enumerated type.")
	@CamelizedName("medicalStudyStatus")
	@ConstantizedName("MEDICAL_STUDY_STATUS")
	public interface MedicalStudyStatus extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalSymptom")
	@SchemaOrgLabel("MedicalSymptom")
	@SchemaOrgComment(""
			+ "Any complaint sensed and expressed by the patient (therefore defined as"
			+ " subjective)  like stomachache, lower-back pain, or fatigue.")
	@CamelizedName("medicalSymptom")
	@ConstantizedName("MEDICAL_SYMPTOM")
	public interface MedicalSymptom extends MedicalSignOrSymptom, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalTest")
	@SchemaOrgLabel("MedicalTest")
	@SchemaOrgComment(""
			+ "Any medical test, typically performed for diagnostic purposes.")
	@CamelizedName("medicalTest")
	@ConstantizedName("MEDICAL_TEST")
	public interface MedicalTest extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/affectedBy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AffectedBy
		 */
		public Container.AffectedBy getAffectedBy();
		public void setAffectedBy(Container.AffectedBy affectedBy);

		/**
		 * uri: http://schema.org/normalRange
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NormalRange
		 */
		public Container.NormalRange getNormalRange();
		public void setNormalRange(Container.NormalRange normalRange);

		/**
		 * uri: http://schema.org/signDetected
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SignDetected
		 */
		public Container.SignDetected getSignDetected();
		public void setSignDetected(Container.SignDetected signDetected);

		/**
		 * uri: http://schema.org/usedToDiagnose
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.UsedToDiagnose
		 */
		public Container.UsedToDiagnose getUsedToDiagnose();
		public void setUsedToDiagnose(Container.UsedToDiagnose usedToDiagnose);

		/**
		 * uri: http://schema.org/usesDevice
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.UsesDevice
		 */
		public Container.UsesDevice getUsesDevice();
		public void setUsesDevice(Container.UsesDevice usesDevice);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalTestPanel")
	@SchemaOrgLabel("MedicalTestPanel")
	@SchemaOrgComment(""
			+ "Any collection of tests commonly ordered together.")
	@CamelizedName("medicalTestPanel")
	@ConstantizedName("MEDICAL_TEST_PANEL")
	public interface MedicalTestPanel extends MedicalTest, SchemaOrgClass {

		/**
		 * uri: http://schema.org/subTest
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubTest
		 */
		public Container.SubTest getSubTest();
		public void setSubTest(Container.SubTest subTest);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalTherapy")
	@SchemaOrgLabel("MedicalTherapy")
	@SchemaOrgComment(""
			+ "Any medical intervention designed to prevent, treat, and cure human diseases and"
			+ " medical conditions, including both curative and palliative therapies. Medical"
			+ " therapies are typically processes of care relying upon pharmacotherapy,"
			+ " behavioral therapy, supportive therapy (with fluid or nutrition for example),"
			+ " or detoxification (e.g. hemodialysis) aimed at improving or preventing a health"
			+ " condition.")
	@CamelizedName("medicalTherapy")
	@ConstantizedName("MEDICAL_THERAPY")
	public interface MedicalTherapy extends SchemaOrgClass, TherapeuticProcedure {

		/**
		 * uri: http://schema.org/contraindication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Contraindication
		 */
		public Container.Contraindication getContraindication();
		public void setContraindication(Container.Contraindication contraindication);

		/**
		 * uri: http://schema.org/duplicateTherapy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DuplicateTherapy
		 */
		public Container.DuplicateTherapy getDuplicateTherapy();
		public void setDuplicateTherapy(Container.DuplicateTherapy duplicateTherapy);

		/**
		 * uri: http://schema.org/seriousAdverseOutcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SeriousAdverseOutcome
		 */
		public Container.SeriousAdverseOutcome getSeriousAdverseOutcome();
		public void setSeriousAdverseOutcome(Container.SeriousAdverseOutcome seriousAdverseOutcome);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalTrial")
	@SchemaOrgLabel("MedicalTrial")
	@SchemaOrgComment(""
			+ "A medical trial is a type of medical study that uses scientific process used to"
			+ " compare the safety and efficacy of medical therapies or medical procedures. In"
			+ " general, medical trials are controlled and subjects are allocated at random to"
			+ " the different treatment and/or control groups.")
	@CamelizedName("medicalTrial")
	@ConstantizedName("MEDICAL_TRIAL")
	public interface MedicalTrial extends MedicalStudy, SchemaOrgClass {

		/**
		 * uri: http://schema.org/phase
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Phase
		 */
		public Container.Phase getPhase();
		public void setPhase(Container.Phase phase);

		/**
		 * uri: http://schema.org/trialDesign
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TrialDesign
		 */
		public Container.TrialDesign getTrialDesign();
		public void setTrialDesign(Container.TrialDesign trialDesign);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalTrialDesign")
	@SchemaOrgLabel("MedicalTrialDesign")
	@SchemaOrgComment(""
			+ "Design models for medical trials. Enumerated type.")
	@CamelizedName("medicalTrialDesign")
	@ConstantizedName("MEDICAL_TRIAL_DESIGN")
	public interface MedicalTrialDesign extends Enumeration, MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalWebPage")
	@SchemaOrgLabel("MedicalWebPage")
	@SchemaOrgComment(""
			+ "A web page that provides medical information.")
	@CamelizedName("medicalWebPage")
	@ConstantizedName("MEDICAL_WEB_PAGE")
	public interface MedicalWebPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicineSystem")
	@SchemaOrgLabel("MedicineSystem")
	@SchemaOrgComment("Systems of medical practice.")
	@CamelizedName("medicineSystem")
	@ConstantizedName("MEDICINE_SYSTEM")
	public interface MedicineSystem extends MedicalEnumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Muscle")
	@SchemaOrgLabel("Muscle")
	@SchemaOrgComment(""
			+ "A muscle is an anatomical structure consisting of a contractile form of tissue"
			+ " that animals use to effect movement.")
	@CamelizedName("muscle")
	@ConstantizedName("MUSCLE")
	public interface Muscle extends AnatomicalStructure, SchemaOrgClass {

		/**
		 * uri: http://schema.org/action
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Action
		 */
		public Container.Action getAction();
		public void setAction(Container.Action action);

		/**
		 * uri: http://schema.org/antagonist
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Antagonist
		 */
		public Container.Antagonist getAntagonist();
		public void setAntagonist(Container.Antagonist antagonist);

		/**
		 * uri: http://schema.org/bloodSupply
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BloodSupply
		 */
		public Container.BloodSupply getBloodSupply();
		public void setBloodSupply(Container.BloodSupply bloodSupply);

		/**
		 * uri: http://schema.org/insertion
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Insertion
		 */
		public Container.Insertion getInsertion();
		public void setInsertion(Container.Insertion insertion);

		/**
		 * uri: http://schema.org/muscleAction
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MuscleAction
		 */
		public Container.MuscleAction getMuscleAction();
		public void setMuscleAction(Container.MuscleAction muscleAction);

		/**
		 * uri: http://schema.org/nerve
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Nerve
		 */
		public Container.Nerve getNerve();
		public void setNerve(Container.Nerve nerve);

		/**
		 * uri: http://schema.org/origin
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Origin
		 */
		public Container.Origin getOrigin();
		public void setOrigin(Container.Origin origin);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Nerve")
	@SchemaOrgLabel("Nerve")
	@SchemaOrgComment(""
			+ "A common pathway for the electrochemical nerve impulses that are transmitted"
			+ " along each of the axons.")
	@CamelizedName("nerve")
	@ConstantizedName("NERVE")
	public interface Nerve extends AnatomicalStructure, SchemaOrgClass {

		/**
		 * uri: http://schema.org/nerveMotor
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NerveMotor
		 */
		public Container.NerveMotor getNerveMotor();
		public void setNerveMotor(Container.NerveMotor nerveMotor);

		/**
		 * uri: http://schema.org/sensoryUnit
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SensoryUnit
		 */
		public Container.SensoryUnit getSensoryUnit();
		public void setSensoryUnit(Container.SensoryUnit sensoryUnit);

		/**
		 * uri: http://schema.org/sourcedFrom
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SourcedFrom
		 */
		public Container.SourcedFrom getSourcedFrom();
		public void setSourcedFrom(Container.SourcedFrom sourcedFrom);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Optician")
	@SchemaOrgLabel("Optician")
	@SchemaOrgComment(""
			+ "A store that sells reading glasses and similar devices for improving vision.")
	@CamelizedName("optician")
	@ConstantizedName("OPTICIAN")
	public interface Optician extends MedicalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PalliativeProcedure")
	@SchemaOrgLabel("PalliativeProcedure")
	@SchemaOrgComment(""
			+ "A medical procedure intended primarily for palliative purposes, aimed at"
			+ " relieving the symptoms of an underlying health condition.")
	@CamelizedName("palliativeProcedure")
	@ConstantizedName("PALLIATIVE_PROCEDURE")
	public interface PalliativeProcedure extends MedicalProcedure, MedicalTherapy, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PathologyTest")
	@SchemaOrgLabel("PathologyTest")
	@SchemaOrgComment(""
			+ "A medical test performed by a laboratory that typically involves examination of"
			+ " a tissue sample by a pathologist.")
	@CamelizedName("pathologyTest")
	@ConstantizedName("PATHOLOGY_TEST")
	public interface PathologyTest extends MedicalTest, SchemaOrgClass {

		/**
		 * uri: http://schema.org/tissueSample
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TissueSample
		 */
		public Container.TissueSample getTissueSample();
		public void setTissueSample(Container.TissueSample tissueSample);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Patient")
	@SchemaOrgLabel("Patient")
	@SchemaOrgComment(""
			+ "A patient is any person recipient of health care services.")
	@CamelizedName("patient")
	@ConstantizedName("PATIENT")
	public interface Patient extends MedicalAudience, Person, SchemaOrgClass {

		/**
		 * uri: http://schema.org/diagnosis
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagnosis
		 */
		public Container.Diagnosis getDiagnosis();
		public void setDiagnosis(Container.Diagnosis diagnosis);

		/**
		 * uri: http://schema.org/drug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Drug
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * uri: http://schema.org/healthCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition
		 */
		public Container.HealthCondition getHealthCondition();
		public void setHealthCondition(Container.HealthCondition healthCondition);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PhysicalActivity")
	@SchemaOrgLabel("PhysicalActivity")
	@SchemaOrgComment(""
			+ "Any bodily activity that enhances or maintains physical fitness and overall"
			+ " health and wellness. Includes activity that is part of daily living and"
			+ " routine, structured exercise, and exercise prescribed as part of a medical"
			+ " treatment or recovery plan.")
	@CamelizedName("physicalActivity")
	@ConstantizedName("PHYSICAL_ACTIVITY")
	public interface PhysicalActivity extends LifestyleModification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedAnatomy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedAnatomy
		 */
		public Container.AssociatedAnatomy getAssociatedAnatomy();
		public void setAssociatedAnatomy(Container.AssociatedAnatomy associatedAnatomy);

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * uri: http://schema.org/epidemiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Epidemiology
		 */
		public Container.Epidemiology getEpidemiology();
		public void setEpidemiology(Container.Epidemiology epidemiology);

		/**
		 * uri: http://schema.org/pathophysiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Pathophysiology
		 */
		public Container.Pathophysiology getPathophysiology();
		public void setPathophysiology(Container.Pathophysiology pathophysiology);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PhysicalActivityCategory")
	@SchemaOrgLabel("PhysicalActivityCategory")
	@SchemaOrgComment(""
			+ "Categories of physical activity, organized by physiologic classification.")
	@CamelizedName("physicalActivityCategory")
	@ConstantizedName("PHYSICAL_ACTIVITY_CATEGORY")
	public interface PhysicalActivityCategory extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PhysicalExam")
	@SchemaOrgLabel("PhysicalExam")
	@SchemaOrgComment(""
			+ "A type of physical examination of a patient performed by a physician.")
	@CamelizedName("physicalExam")
	@ConstantizedName("PHYSICAL_EXAM")
	public interface PhysicalExam extends MedicalEnumeration, MedicalProcedure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PhysicalTherapy")
	@SchemaOrgLabel("PhysicalTherapy")
	@SchemaOrgComment(""
			+ "A process of progressive physical care and rehabilitation aimed at improving a"
			+ " health condition.")
	@CamelizedName("physicalTherapy")
	@ConstantizedName("PHYSICAL_THERAPY")
	public interface PhysicalTherapy extends MedicalTherapy, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PreventionIndication")
	@SchemaOrgLabel("PreventionIndication")
	@SchemaOrgComment(""
			+ "An indication for preventing an underlying condition, symptom, etc.")
	@CamelizedName("preventionIndication")
	@ConstantizedName("PREVENTION_INDICATION")
	public interface PreventionIndication extends MedicalIndication, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PsychologicalTreatment")
	@SchemaOrgLabel("PsychologicalTreatment")
	@SchemaOrgComment(""
			+ "A process of care relying upon counseling, dialogue and communication  aimed at"
			+ " improving a mental health condition without use of drugs.")
	@CamelizedName("psychologicalTreatment")
	@ConstantizedName("PSYCHOLOGICAL_TREATMENT")
	public interface PsychologicalTreatment extends SchemaOrgClass, TherapeuticProcedure {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadiationTherapy")
	@SchemaOrgLabel("RadiationTherapy")
	@SchemaOrgComment(""
			+ "A process of care using radiation aimed at improving a health condition.")
	@CamelizedName("radiationTherapy")
	@ConstantizedName("RADIATION_THERAPY")
	public interface RadiationTherapy extends MedicalTherapy, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RecommendedDoseSchedule")
	@SchemaOrgLabel("RecommendedDoseSchedule")
	@SchemaOrgComment(""
			+ "A recommended dosing schedule for a drug or supplement as prescribed or"
			+ " recommended by an authority or by the drug/supplement's manufacturer. Capture"
			+ " the recommending authority in the recognizingAuthority property of"
			+ " MedicalEntity.")
	@CamelizedName("recommendedDoseSchedule")
	@ConstantizedName("RECOMMENDED_DOSE_SCHEDULE")
	public interface RecommendedDoseSchedule extends DoseSchedule, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReportedDoseSchedule")
	@SchemaOrgLabel("ReportedDoseSchedule")
	@SchemaOrgComment(""
			+ "A patient-reported or observed dosing schedule for a drug or supplement.")
	@CamelizedName("reportedDoseSchedule")
	@ConstantizedName("REPORTED_DOSE_SCHEDULE")
	public interface ReportedDoseSchedule extends DoseSchedule, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Substance")
	@SchemaOrgLabel("Substance")
	@SchemaOrgComment(""
			+ "Any matter of defined composition that has discrete existence, whose origin may"
			+ " be biological, mineral or chemical.")
	@CamelizedName("substance")
	@ConstantizedName("SUBSTANCE")
	public interface Substance extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/activeIngredient
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * uri: http://schema.org/maximumIntake
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SuperficialAnatomy")
	@SchemaOrgLabel("SuperficialAnatomy")
	@SchemaOrgComment(""
			+ "Anatomical features that can be observed by sight (without dissection),"
			+ " including the form and proportions of the human body as well as surface"
			+ " landmarks that correspond to deeper subcutaneous structures. Superficial"
			+ " anatomy plays an important role in sports medicine, phlebotomy, and other"
			+ " medical specialties as underlying anatomical structures can be identified"
			+ " through surface palpation. For example, during back surgery, superficial"
			+ " anatomy can be used to palpate and count vertebrae to find the site of"
			+ " incision. Or in phlebotomy, superficial anatomy can be used to locate an"
			+ " underlying vein; for example, the median cubital vein can be located by"
			+ " palpating the borders of the cubital fossa (such as the epicondyles of the"
			+ " humerus) and then looking for the superficial signs of the vein, such as size,"
			+ " prominence, ability to refill after depression, and feel of surrounding tissue"
			+ " support. As another example, in a subluxation (dislocation) of the glenohumeral"
			+ " joint, the bony structure becomes pronounced with the deltoid muscle failing to"
			+ " cover the glenohumeral joint allowing the edges of the scapula to be"
			+ " superficially visible. Here, the superficial anatomy is the visible edges of"
			+ " the scapula, implying the underlying dislocation of the joint (the related"
			+ " anatomical structure).")
	@CamelizedName("superficialAnatomy")
	@ConstantizedName("SUPERFICIAL_ANATOMY")
	public interface SuperficialAnatomy extends MedicalEntity, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedPathophysiology
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * uri: http://schema.org/relatedAnatomy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedAnatomy
		 */
		public Container.RelatedAnatomy getRelatedAnatomy();
		public void setRelatedAnatomy(Container.RelatedAnatomy relatedAnatomy);

		/**
		 * uri: http://schema.org/relatedCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * uri: http://schema.org/relatedTherapy
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy
		 */
		public Container.RelatedTherapy getRelatedTherapy();
		public void setRelatedTherapy(Container.RelatedTherapy relatedTherapy);

		/**
		 * uri: http://schema.org/significance
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Significance
		 */
		public Container.Significance getSignificance();
		public void setSignificance(Container.Significance significance);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TherapeuticProcedure")
	@SchemaOrgLabel("TherapeuticProcedure")
	@SchemaOrgComment(""
			+ "A medical procedure intended primarily for therapeutic purposes, aimed at"
			+ " improving a health condition.")
	@CamelizedName("therapeuticProcedure")
	@ConstantizedName("THERAPEUTIC_PROCEDURE")
	public interface TherapeuticProcedure extends MedicalProcedure, SchemaOrgClass {

		/**
		 * uri: http://schema.org/adverseOutcome
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdverseOutcome
		 */
		public Container.AdverseOutcome getAdverseOutcome();
		public void setAdverseOutcome(Container.AdverseOutcome adverseOutcome);

		/**
		 * uri: http://schema.org/doseSchedule
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseSchedule
		 */
		public Container.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Container.DoseSchedule doseSchedule);

		/**
		 * uri: http://schema.org/drug
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Drug
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * uri: http://schema.org/indication
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Indication
		 */
		public Container.Indication getIndication();
		public void setIndication(Container.Indication indication);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TreatmentIndication")
	@SchemaOrgLabel("TreatmentIndication")
	@SchemaOrgComment(""
			+ "An indication for treating an underlying condition, symptom, etc.")
	@CamelizedName("treatmentIndication")
	@ConstantizedName("TREATMENT_INDICATION")
	public interface TreatmentIndication extends MedicalIndication, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Vein")
	@SchemaOrgLabel("Vein")
	@SchemaOrgComment(""
			+ "A type of blood vessel that specifically carries blood to the heart.")
	@CamelizedName("vein")
	@ConstantizedName("VEIN")
	public interface Vein extends SchemaOrgClass, Vessel {

		/**
		 * uri: http://schema.org/drainsTo
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrainsTo
		 */
		public Container.DrainsTo getDrainsTo();
		public void setDrainsTo(Container.DrainsTo drainsTo);

		/**
		 * uri: http://schema.org/regionDrained
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RegionDrained
		 */
		public Container.RegionDrained getRegionDrained();
		public void setRegionDrained(Container.RegionDrained regionDrained);

		/**
		 * uri: http://schema.org/tributary
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Tributary
		 */
		public Container.Tributary getTributary();
		public void setTributary(Container.Tributary tributary);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Vessel")
	@SchemaOrgLabel("Vessel")
	@SchemaOrgComment(""
			+ "A component of the human body circulatory system comprised of an intricate"
			+ " network of hollow tubes that transport blood throughout the entire body.")
	@CamelizedName("vessel")
	@ConstantizedName("VESSEL")
	public interface Vessel extends AnatomicalStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VeterinaryCare")
	@SchemaOrgLabel("VeterinaryCare")
	@SchemaOrgComment("A vet's office.")
	@CamelizedName("veterinaryCare")
	@ConstantizedName("VETERINARY_CARE")
	public interface VeterinaryCare extends MedicalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VitalSign")
	@SchemaOrgLabel("VitalSign")
	@SchemaOrgComment(""
			+ "Vital signs are measures of various physiological functions in order to assess"
			+ " the most basic body functions.")
	@CamelizedName("vitalSign")
	@ConstantizedName("VITAL_SIGN")
	public interface VitalSign extends MedicalSign, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
