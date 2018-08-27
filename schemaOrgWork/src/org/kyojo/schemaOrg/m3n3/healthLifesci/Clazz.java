package org.kyojo.schemaorg.m3n3.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n3.core.Clazz.Audience;
import org.kyojo.schemaorg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n3.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n3.core.Clazz.LocalBusiness;
import org.kyojo.schemaorg.m3n3.core.Clazz.MedicalOrganization;
import org.kyojo.schemaorg.m3n3.core.Clazz.PeopleAudience;
import org.kyojo.schemaorg.m3n3.core.Clazz.Person;
import org.kyojo.schemaorg.m3n3.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaorg.m3n3.core.Clazz.Specialty;
import org.kyojo.schemaorg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n3.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n3.core.Container.Category;
import org.kyojo.schemaorg.m3n3.core.Container.Manufacturer;
import org.kyojo.schemaorg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.pending.Clazz.CategoryCode;
import org.kyojo.schemaorg.m3n3.pending.Container.CodeValue;
import org.kyojo.schemaorg.m3n3.pending.Container.IncludedInHealthInsurancePlan;
import org.kyojo.schemaorg.m3n3.pending.Container.Rxcui;

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
		 * @see <a href="http://schema.org/associatedPathophysiology">http://schema.org/associatedPathophysiology</a>
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * @see <a href="http://schema.org/bodyLocation">http://schema.org/bodyLocation</a>
		 */
		public Container.BodyLocation getBodyLocation();
		public void setBodyLocation(Container.BodyLocation bodyLocation);

		/**
		 * @see <a href="http://schema.org/connectedTo">http://schema.org/connectedTo</a>
		 */
		public Container.ConnectedTo getConnectedTo();
		public void setConnectedTo(Container.ConnectedTo connectedTo);

		/**
		 * @see <a href="http://schema.org/diagram">http://schema.org/diagram</a>
		 */
		public Container.Diagram getDiagram();
		public void setDiagram(Container.Diagram diagram);

		/**
		 * @see <a href="http://schema.org/function">http://schema.org/function</a>
		 */
		public Container.Function getFunction();
		public void setFunction(Container.Function function);

		/**
		 * @see <a href="http://schema.org/partOfSystem">http://schema.org/partOfSystem</a>
		 */
		public Container.PartOfSystem getPartOfSystem();
		public void setPartOfSystem(Container.PartOfSystem partOfSystem);

		/**
		 * @see <a href="http://schema.org/relatedCondition">http://schema.org/relatedCondition</a>
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * @see <a href="http://schema.org/relatedTherapy">http://schema.org/relatedTherapy</a>
		 */
		public Container.RelatedTherapy getRelatedTherapy();
		public void setRelatedTherapy(Container.RelatedTherapy relatedTherapy);

		/**
		 * @see <a href="http://schema.org/subStructure">http://schema.org/subStructure</a>
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
		 * @see <a href="http://schema.org/associatedPathophysiology">http://schema.org/associatedPathophysiology</a>
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * @see <a href="http://schema.org/comprisedOf">http://schema.org/comprisedOf</a>
		 */
		public Container.ComprisedOf getComprisedOf();
		public void setComprisedOf(Container.ComprisedOf comprisedOf);

		/**
		 * @see <a href="http://schema.org/relatedCondition">http://schema.org/relatedCondition</a>
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * @see <a href="http://schema.org/relatedStructure">http://schema.org/relatedStructure</a>
		 */
		public Container.RelatedStructure getRelatedStructure();
		public void setRelatedStructure(Container.RelatedStructure relatedStructure);

		/**
		 * @see <a href="http://schema.org/relatedTherapy">http://schema.org/relatedTherapy</a>
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
		 * @see <a href="http://schema.org/arterialBranch">http://schema.org/arterialBranch</a>
		 */
		public Container.ArterialBranch getArterialBranch();
		public void setArterialBranch(Container.ArterialBranch arterialBranch);

		/**
		 * @see <a href="http://schema.org/source">http://schema.org/source</a>
		 */
		public Container.Source getSource();
		public void setSource(Container.Source source);

		/**
		 * @see <a href="http://schema.org/supplyTo">http://schema.org/supplyTo</a>
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
		 * @see <a href="http://schema.org/diagnosis">http://schema.org/diagnosis</a>
		 */
		public Container.Diagnosis getDiagnosis();
		public void setDiagnosis(Container.Diagnosis diagnosis);

		/**
		 * @see <a href="http://schema.org/distinguishingSign">http://schema.org/distinguishingSign</a>
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
		 * @see <a href="http://schema.org/availableTest">http://schema.org/availableTest</a>
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
		 * @see <a href="http://schema.org/dietFeatures">http://schema.org/dietFeatures</a>
		 */
		public Container.DietFeatures getDietFeatures();
		public void setDietFeatures(Container.DietFeatures dietFeatures);

		/**
		 * @see <a href="http://schema.org/endorsers">http://schema.org/endorsers</a>
		 */
		public Container.Endorsers getEndorsers();
		public void setEndorsers(Container.Endorsers endorsers);

		/**
		 * @see <a href="http://schema.org/expertConsiderations">http://schema.org/expertConsiderations</a>
		 */
		public Container.ExpertConsiderations getExpertConsiderations();
		public void setExpertConsiderations(Container.ExpertConsiderations expertConsiderations);

		/**
		 * @see <a href="http://schema.org/overview">http://schema.org/overview</a>
		 */
		public Container.Overview getOverview();
		public void setOverview(Container.Overview overview);

		/**
		 * @see <a href="http://schema.org/physiologicalBenefits">http://schema.org/physiologicalBenefits</a>
		 */
		public Container.PhysiologicalBenefits getPhysiologicalBenefits();
		public void setPhysiologicalBenefits(Container.PhysiologicalBenefits physiologicalBenefits);

		/**
		 * @see <a href="http://schema.org/risks">http://schema.org/risks</a>
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
		 * @see <a href="http://schema.org/activeIngredient">http://schema.org/activeIngredient</a>
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * @see <a href="http://schema.org/background">http://schema.org/background</a>
		 */
		public Container.Background getBackground();
		public void setBackground(Container.Background background);

		/**
		 * @see <a href="http://schema.org/isProprietary">http://schema.org/isProprietary</a>
		 */
		public Container.IsProprietary getIsProprietary();
		public void setIsProprietary(Container.IsProprietary isProprietary);

		/**
		 * @see <a href="http://schema.org/legalStatus">http://schema.org/legalStatus</a>
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * @see <a href="http://schema.org/manufacturer">http://schema.org/manufacturer</a>
		 */
		public Manufacturer getManufacturer();
		public void setManufacturer(Manufacturer manufacturer);

		/**
		 * @see <a href="http://schema.org/maximumIntake">http://schema.org/maximumIntake</a>
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * @see <a href="http://schema.org/mechanismOfAction">http://schema.org/mechanismOfAction</a>
		 */
		public Container.MechanismOfAction getMechanismOfAction();
		public void setMechanismOfAction(Container.MechanismOfAction mechanismOfAction);

		/**
		 * @see <a href="http://schema.org/nonProprietaryName">http://schema.org/nonProprietaryName</a>
		 */
		public Container.NonProprietaryName getNonProprietaryName();
		public void setNonProprietaryName(Container.NonProprietaryName nonProprietaryName);

		/**
		 * @see <a href="http://schema.org/proprietaryName">http://schema.org/proprietaryName</a>
		 */
		public Container.ProprietaryName getProprietaryName();
		public void setProprietaryName(Container.ProprietaryName proprietaryName);

		/**
		 * @see <a href="http://schema.org/recommendedIntake">http://schema.org/recommendedIntake</a>
		 */
		public Container.RecommendedIntake getRecommendedIntake();
		public void setRecommendedIntake(Container.RecommendedIntake recommendedIntake);

		/**
		 * @see <a href="http://schema.org/safetyConsideration">http://schema.org/safetyConsideration</a>
		 */
		public Container.SafetyConsideration getSafetyConsideration();
		public void setSafetyConsideration(Container.SafetyConsideration safetyConsideration);

		/**
		 * @see <a href="http://schema.org/targetPopulation">http://schema.org/targetPopulation</a>
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
		 * @see <a href="http://schema.org/doseUnit">http://schema.org/doseUnit</a>
		 */
		public Container.DoseUnit getDoseUnit();
		public void setDoseUnit(Container.DoseUnit doseUnit);

		/**
		 * @see <a href="http://schema.org/doseValue">http://schema.org/doseValue</a>
		 */
		public Container.DoseValue getDoseValue();
		public void setDoseValue(Container.DoseValue doseValue);

		/**
		 * @see <a href="http://schema.org/frequency">http://schema.org/frequency</a>
		 */
		public Container.Frequency getFrequency();
		public void setFrequency(Container.Frequency frequency);

		/**
		 * @see <a href="http://schema.org/targetPopulation">http://schema.org/targetPopulation</a>
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
		 * @see <a href="http://schema.org/activeIngredient">http://schema.org/activeIngredient</a>
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * @see <a href="http://schema.org/administrationRoute">http://schema.org/administrationRoute</a>
		 */
		public Container.AdministrationRoute getAdministrationRoute();
		public void setAdministrationRoute(Container.AdministrationRoute administrationRoute);

		/**
		 * @see <a href="http://schema.org/alcoholWarning">http://schema.org/alcoholWarning</a>
		 */
		public Container.AlcoholWarning getAlcoholWarning();
		public void setAlcoholWarning(Container.AlcoholWarning alcoholWarning);

		/**
		 * @see <a href="http://schema.org/availableStrength">http://schema.org/availableStrength</a>
		 */
		public Container.AvailableStrength getAvailableStrength();
		public void setAvailableStrength(Container.AvailableStrength availableStrength);

		/**
		 * @see <a href="http://schema.org/breastfeedingWarning">http://schema.org/breastfeedingWarning</a>
		 */
		public Container.BreastfeedingWarning getBreastfeedingWarning();
		public void setBreastfeedingWarning(Container.BreastfeedingWarning breastfeedingWarning);

		/**
		 * @see <a href="http://schema.org/clinicalPharmacology">http://schema.org/clinicalPharmacology</a>
		 */
		public Container.ClinicalPharmacology getClinicalPharmacology();
		public void setClinicalPharmacology(Container.ClinicalPharmacology clinicalPharmacology);

		/**
		 * @see <a href="http://schema.org/cost">http://schema.org/cost</a>
		 */
		public Container.Cost getCost();
		public void setCost(Container.Cost cost);

		/**
		 * @see <a href="http://schema.org/dosageForm">http://schema.org/dosageForm</a>
		 */
		public Container.DosageForm getDosageForm();
		public void setDosageForm(Container.DosageForm dosageForm);

		/**
		 * @see <a href="http://schema.org/doseSchedule">http://schema.org/doseSchedule</a>
		 */
		public Container.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Container.DoseSchedule doseSchedule);

		/**
		 * @see <a href="http://schema.org/drugClass">http://schema.org/drugClass</a>
		 */
		public Container.DrugClass getDrugClass();
		public void setDrugClass(Container.DrugClass drugClass);

		/**
		 * @see <a href="http://schema.org/drugUnit">http://schema.org/drugUnit</a>
		 */
		public Container.DrugUnit getDrugUnit();
		public void setDrugUnit(Container.DrugUnit drugUnit);

		/**
		 * @see <a href="http://schema.org/foodWarning">http://schema.org/foodWarning</a>
		 */
		public Container.FoodWarning getFoodWarning();
		public void setFoodWarning(Container.FoodWarning foodWarning);

		/**
		 * @see <a href="http://schema.org/includedInHealthInsurancePlan">http://schema.org/includedInHealthInsurancePlan</a>
		 */
		public IncludedInHealthInsurancePlan getIncludedInHealthInsurancePlan();
		public void setIncludedInHealthInsurancePlan(IncludedInHealthInsurancePlan includedInHealthInsurancePlan);

		/**
		 * @see <a href="http://schema.org/interactingDrug">http://schema.org/interactingDrug</a>
		 */
		public Container.InteractingDrug getInteractingDrug();
		public void setInteractingDrug(Container.InteractingDrug interactingDrug);

		/**
		 * @see <a href="http://schema.org/isAvailableGenerically">http://schema.org/isAvailableGenerically</a>
		 */
		public Container.IsAvailableGenerically getIsAvailableGenerically();
		public void setIsAvailableGenerically(Container.IsAvailableGenerically isAvailableGenerically);

		/**
		 * @see <a href="http://schema.org/isProprietary">http://schema.org/isProprietary</a>
		 */
		public Container.IsProprietary getIsProprietary();
		public void setIsProprietary(Container.IsProprietary isProprietary);

		/**
		 * @see <a href="http://schema.org/labelDetails">http://schema.org/labelDetails</a>
		 */
		public Container.LabelDetails getLabelDetails();
		public void setLabelDetails(Container.LabelDetails labelDetails);

		/**
		 * @see <a href="http://schema.org/legalStatus">http://schema.org/legalStatus</a>
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * @see <a href="http://schema.org/manufacturer">http://schema.org/manufacturer</a>
		 */
		public Manufacturer getManufacturer();
		public void setManufacturer(Manufacturer manufacturer);

		/**
		 * @see <a href="http://schema.org/maximumIntake">http://schema.org/maximumIntake</a>
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * @see <a href="http://schema.org/mechanismOfAction">http://schema.org/mechanismOfAction</a>
		 */
		public Container.MechanismOfAction getMechanismOfAction();
		public void setMechanismOfAction(Container.MechanismOfAction mechanismOfAction);

		/**
		 * @see <a href="http://schema.org/nonProprietaryName">http://schema.org/nonProprietaryName</a>
		 */
		public Container.NonProprietaryName getNonProprietaryName();
		public void setNonProprietaryName(Container.NonProprietaryName nonProprietaryName);

		/**
		 * @see <a href="http://schema.org/overdosage">http://schema.org/overdosage</a>
		 */
		public Container.Overdosage getOverdosage();
		public void setOverdosage(Container.Overdosage overdosage);

		/**
		 * @see <a href="http://schema.org/pregnancyCategory">http://schema.org/pregnancyCategory</a>
		 */
		public Container.PregnancyCategory getPregnancyCategory();
		public void setPregnancyCategory(Container.PregnancyCategory pregnancyCategory);

		/**
		 * @see <a href="http://schema.org/pregnancyWarning">http://schema.org/pregnancyWarning</a>
		 */
		public Container.PregnancyWarning getPregnancyWarning();
		public void setPregnancyWarning(Container.PregnancyWarning pregnancyWarning);

		/**
		 * @see <a href="http://schema.org/prescribingInfo">http://schema.org/prescribingInfo</a>
		 */
		public Container.PrescribingInfo getPrescribingInfo();
		public void setPrescribingInfo(Container.PrescribingInfo prescribingInfo);

		/**
		 * @see <a href="http://schema.org/prescriptionStatus">http://schema.org/prescriptionStatus</a>
		 */
		public Container.PrescriptionStatus getPrescriptionStatus();
		public void setPrescriptionStatus(Container.PrescriptionStatus prescriptionStatus);

		/**
		 * @see <a href="http://schema.org/proprietaryName">http://schema.org/proprietaryName</a>
		 */
		public Container.ProprietaryName getProprietaryName();
		public void setProprietaryName(Container.ProprietaryName proprietaryName);

		/**
		 * @see <a href="http://schema.org/relatedDrug">http://schema.org/relatedDrug</a>
		 */
		public Container.RelatedDrug getRelatedDrug();
		public void setRelatedDrug(Container.RelatedDrug relatedDrug);

		/**
		 * @see <a href="http://schema.org/rxcui">http://schema.org/rxcui</a>
		 */
		public Rxcui getRxcui();
		public void setRxcui(Rxcui rxcui);

		/**
		 * @see <a href="http://schema.org/warning">http://schema.org/warning</a>
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
		 * @see <a href="http://schema.org/drug">http://schema.org/drug</a>
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
		 * @see <a href="http://schema.org/applicableLocation">http://schema.org/applicableLocation</a>
		 */
		public Container.ApplicableLocation getApplicableLocation();
		public void setApplicableLocation(Container.ApplicableLocation applicableLocation);

		/**
		 * @see <a href="http://schema.org/costCategory">http://schema.org/costCategory</a>
		 */
		public Container.CostCategory getCostCategory();
		public void setCostCategory(Container.CostCategory costCategory);

		/**
		 * @see <a href="http://schema.org/costCurrency">http://schema.org/costCurrency</a>
		 */
		public Container.CostCurrency getCostCurrency();
		public void setCostCurrency(Container.CostCurrency costCurrency);

		/**
		 * @see <a href="http://schema.org/costOrigin">http://schema.org/costOrigin</a>
		 */
		public Container.CostOrigin getCostOrigin();
		public void setCostOrigin(Container.CostOrigin costOrigin);

		/**
		 * @see <a href="http://schema.org/costPerUnit">http://schema.org/costPerUnit</a>
		 */
		public Container.CostPerUnit getCostPerUnit();
		public void setCostPerUnit(Container.CostPerUnit costPerUnit);

		/**
		 * @see <a href="http://schema.org/drugUnit">http://schema.org/drugUnit</a>
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
		 * @see <a href="http://schema.org/applicableLocation">http://schema.org/applicableLocation</a>
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
		 * @see <a href="http://schema.org/activeIngredient">http://schema.org/activeIngredient</a>
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * @see <a href="http://schema.org/availableIn">http://schema.org/availableIn</a>
		 */
		public Container.AvailableIn getAvailableIn();
		public void setAvailableIn(Container.AvailableIn availableIn);

		/**
		 * @see <a href="http://schema.org/maximumIntake">http://schema.org/maximumIntake</a>
		 */
		public Container.MaximumIntake getMaximumIntake();
		public void setMaximumIntake(Container.MaximumIntake maximumIntake);

		/**
		 * @see <a href="http://schema.org/strengthUnit">http://schema.org/strengthUnit</a>
		 */
		public Container.StrengthUnit getStrengthUnit();
		public void setStrengthUnit(Container.StrengthUnit strengthUnit);

		/**
		 * @see <a href="http://schema.org/strengthValue">http://schema.org/strengthValue</a>
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
		 * @see <a href="http://schema.org/activityDuration">http://schema.org/activityDuration</a>
		 */
		public Container.ActivityDuration getActivityDuration();
		public void setActivityDuration(Container.ActivityDuration activityDuration);

		/**
		 * @see <a href="http://schema.org/activityFrequency">http://schema.org/activityFrequency</a>
		 */
		public Container.ActivityFrequency getActivityFrequency();
		public void setActivityFrequency(Container.ActivityFrequency activityFrequency);

		/**
		 * @see <a href="http://schema.org/additionalVariable">http://schema.org/additionalVariable</a>
		 */
		public Container.AdditionalVariable getAdditionalVariable();
		public void setAdditionalVariable(Container.AdditionalVariable additionalVariable);

		/**
		 * @see <a href="http://schema.org/exerciseType">http://schema.org/exerciseType</a>
		 */
		public Container.ExerciseType getExerciseType();
		public void setExerciseType(Container.ExerciseType exerciseType);

		/**
		 * @see <a href="http://schema.org/intensity">http://schema.org/intensity</a>
		 */
		public Container.Intensity getIntensity();
		public void setIntensity(Container.Intensity intensity);

		/**
		 * @see <a href="http://schema.org/repetitions">http://schema.org/repetitions</a>
		 */
		public Container.Repetitions getRepetitions();
		public void setRepetitions(Container.Repetitions repetitions);

		/**
		 * @see <a href="http://schema.org/restPeriods">http://schema.org/restPeriods</a>
		 */
		public Container.RestPeriods getRestPeriods();
		public void setRestPeriods(Container.RestPeriods restPeriods);

		/**
		 * @see <a href="http://schema.org/workload">http://schema.org/workload</a>
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
		 * @see <a href="http://schema.org/imagingTechnique">http://schema.org/imagingTechnique</a>
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
		 * @see <a href="http://schema.org/infectiousAgent">http://schema.org/infectiousAgent</a>
		 */
		public Container.InfectiousAgent getInfectiousAgent();
		public void setInfectiousAgent(Container.InfectiousAgent infectiousAgent);

		/**
		 * @see <a href="http://schema.org/infectiousAgentClass">http://schema.org/infectiousAgentClass</a>
		 */
		public Container.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Container.InfectiousAgentClass infectiousAgentClass);

		/**
		 * @see <a href="http://schema.org/transmissionMethod">http://schema.org/transmissionMethod</a>
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
		 * @see <a href="http://schema.org/biomechnicalClass">http://schema.org/biomechnicalClass</a>
		 */
		public Container.BiomechnicalClass getBiomechnicalClass();
		public void setBiomechnicalClass(Container.BiomechnicalClass biomechnicalClass);

		/**
		 * @see <a href="http://schema.org/functionalClass">http://schema.org/functionalClass</a>
		 */
		public Container.FunctionalClass getFunctionalClass();
		public void setFunctionalClass(Container.FunctionalClass functionalClass);

		/**
		 * @see <a href="http://schema.org/structuralClass">http://schema.org/structuralClass</a>
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
		 * @see <a href="http://schema.org/originatesFrom">http://schema.org/originatesFrom</a>
		 */
		public Container.OriginatesFrom getOriginatesFrom();
		public void setOriginatesFrom(Container.OriginatesFrom originatesFrom);

		/**
		 * @see <a href="http://schema.org/regionDrained">http://schema.org/regionDrained</a>
		 */
		public Container.RegionDrained getRegionDrained();
		public void setRegionDrained(Container.RegionDrained regionDrained);

		/**
		 * @see <a href="http://schema.org/runsTo">http://schema.org/runsTo</a>
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
		 * @see <a href="http://schema.org/causeOf">http://schema.org/causeOf</a>
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
		 * @see <a href="http://schema.org/availableService">http://schema.org/availableService</a>
		 */
		public Container.AvailableService getAvailableService();
		public void setAvailableService(Container.AvailableService availableService);

		/**
		 * @see <a href="http://schema.org/medicalSpecialty">http://schema.org/medicalSpecialty</a>
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
		 * @see <a href="http://schema.org/codeValue">http://schema.org/codeValue</a>
		 */
		public CodeValue getCodeValue();
		public void setCodeValue(CodeValue codeValue);

		/**
		 * @see <a href="http://schema.org/codingSystem">http://schema.org/codingSystem</a>
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
		 * @see <a href="http://schema.org/associatedAnatomy">http://schema.org/associatedAnatomy</a>
		 */
		public Container.AssociatedAnatomy getAssociatedAnatomy();
		public void setAssociatedAnatomy(Container.AssociatedAnatomy associatedAnatomy);

		/**
		 * @see <a href="http://schema.org/cause">http://schema.org/cause</a>
		 */
		public Container.Cause getCause();
		public void setCause(Container.Cause cause);

		/**
		 * @see <a href="http://schema.org/differentialDiagnosis">http://schema.org/differentialDiagnosis</a>
		 */
		public Container.DifferentialDiagnosis getDifferentialDiagnosis();
		public void setDifferentialDiagnosis(Container.DifferentialDiagnosis differentialDiagnosis);

		/**
		 * @see <a href="http://schema.org/drug">http://schema.org/drug</a>
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * @see <a href="http://schema.org/epidemiology">http://schema.org/epidemiology</a>
		 */
		public Container.Epidemiology getEpidemiology();
		public void setEpidemiology(Container.Epidemiology epidemiology);

		/**
		 * @see <a href="http://schema.org/expectedPrognosis">http://schema.org/expectedPrognosis</a>
		 */
		public Container.ExpectedPrognosis getExpectedPrognosis();
		public void setExpectedPrognosis(Container.ExpectedPrognosis expectedPrognosis);

		/**
		 * @see <a href="http://schema.org/naturalProgression">http://schema.org/naturalProgression</a>
		 */
		public Container.NaturalProgression getNaturalProgression();
		public void setNaturalProgression(Container.NaturalProgression naturalProgression);

		/**
		 * @see <a href="http://schema.org/pathophysiology">http://schema.org/pathophysiology</a>
		 */
		public Container.Pathophysiology getPathophysiology();
		public void setPathophysiology(Container.Pathophysiology pathophysiology);

		/**
		 * @see <a href="http://schema.org/possibleComplication">http://schema.org/possibleComplication</a>
		 */
		public Container.PossibleComplication getPossibleComplication();
		public void setPossibleComplication(Container.PossibleComplication possibleComplication);

		/**
		 * @see <a href="http://schema.org/possibleTreatment">http://schema.org/possibleTreatment</a>
		 */
		public Container.PossibleTreatment getPossibleTreatment();
		public void setPossibleTreatment(Container.PossibleTreatment possibleTreatment);

		/**
		 * @see <a href="http://schema.org/primaryPrevention">http://schema.org/primaryPrevention</a>
		 */
		public Container.PrimaryPrevention getPrimaryPrevention();
		public void setPrimaryPrevention(Container.PrimaryPrevention primaryPrevention);

		/**
		 * @see <a href="http://schema.org/riskFactor">http://schema.org/riskFactor</a>
		 */
		public Container.RiskFactor getRiskFactor();
		public void setRiskFactor(Container.RiskFactor riskFactor);

		/**
		 * @see <a href="http://schema.org/secondaryPrevention">http://schema.org/secondaryPrevention</a>
		 */
		public Container.SecondaryPrevention getSecondaryPrevention();
		public void setSecondaryPrevention(Container.SecondaryPrevention secondaryPrevention);

		/**
		 * @see <a href="http://schema.org/signOrSymptom">http://schema.org/signOrSymptom</a>
		 */
		public Container.SignOrSymptom getSignOrSymptom();
		public void setSignOrSymptom(Container.SignOrSymptom signOrSymptom);

		/**
		 * @see <a href="http://schema.org/stage">http://schema.org/stage</a>
		 */
		public Container.Stage getStage();
		public void setStage(Container.Stage stage);

		/**
		 * @see <a href="http://schema.org/status">http://schema.org/status</a>
		 */
		public Container.Status getStatus();
		public void setStatus(Container.Status status);

		/**
		 * @see <a href="http://schema.org/subtype">http://schema.org/subtype</a>
		 */
		public Container.Subtype getSubtype();
		public void setSubtype(Container.Subtype subtype);

		/**
		 * @see <a href="http://schema.org/typicalTest">http://schema.org/typicalTest</a>
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
		 * @see <a href="http://schema.org/stageAsNumber">http://schema.org/stageAsNumber</a>
		 */
		public Container.StageAsNumber getStageAsNumber();
		public void setStageAsNumber(Container.StageAsNumber stageAsNumber);

		/**
		 * @see <a href="http://schema.org/subStageSuffix">http://schema.org/subStageSuffix</a>
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
		 * @see <a href="http://schema.org/adverseOutcome">http://schema.org/adverseOutcome</a>
		 */
		public Container.AdverseOutcome getAdverseOutcome();
		public void setAdverseOutcome(Container.AdverseOutcome adverseOutcome);

		/**
		 * @see <a href="http://schema.org/contraindication">http://schema.org/contraindication</a>
		 */
		public Container.Contraindication getContraindication();
		public void setContraindication(Container.Contraindication contraindication);

		/**
		 * @see <a href="http://schema.org/indication">http://schema.org/indication</a>
		 */
		public Container.Indication getIndication();
		public void setIndication(Container.Indication indication);

		/**
		 * @see <a href="http://schema.org/postOp">http://schema.org/postOp</a>
		 */
		public Container.PostOp getPostOp();
		public void setPostOp(Container.PostOp postOp);

		/**
		 * @see <a href="http://schema.org/preOp">http://schema.org/preOp</a>
		 */
		public Container.PreOp getPreOp();
		public void setPreOp(Container.PreOp preOp);

		/**
		 * @see <a href="http://schema.org/procedure">http://schema.org/procedure</a>
		 */
		public Container.Procedure getProcedure();
		public void setProcedure(Container.Procedure procedure);

		/**
		 * @see <a href="http://schema.org/purpose">http://schema.org/purpose</a>
		 */
		public Container.Purpose getPurpose();
		public void setPurpose(Container.Purpose purpose);

		/**
		 * @see <a href="http://schema.org/seriousAdverseOutcome">http://schema.org/seriousAdverseOutcome</a>
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
		 * @see <a href="http://schema.org/code">http://schema.org/code</a>
		 */
		public Container.Code getCode();
		public void setCode(Container.Code code);

		/**
		 * @see <a href="http://schema.org/guideline">http://schema.org/guideline</a>
		 */
		public Container.Guideline getGuideline();
		public void setGuideline(Container.Guideline guideline);

		/**
		 * @see <a href="http://schema.org/legalStatus">http://schema.org/legalStatus</a>
		 */
		public Container.LegalStatus getLegalStatus();
		public void setLegalStatus(Container.LegalStatus legalStatus);

		/**
		 * @see <a href="http://schema.org/medicineSystem">http://schema.org/medicineSystem</a>
		 */
		public Container.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Container.MedicineSystem medicineSystem);

		/**
		 * @see <a href="http://schema.org/recognizingAuthority">http://schema.org/recognizingAuthority</a>
		 */
		public Container.RecognizingAuthority getRecognizingAuthority();
		public void setRecognizingAuthority(Container.RecognizingAuthority recognizingAuthority);

		/**
		 * @see <a href="http://schema.org/relevantSpecialty">http://schema.org/relevantSpecialty</a>
		 */
		public Container.RelevantSpecialty getRelevantSpecialty();
		public void setRelevantSpecialty(Container.RelevantSpecialty relevantSpecialty);

		/**
		 * @see <a href="http://schema.org/study">http://schema.org/study</a>
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
		 * @see <a href="http://schema.org/evidenceLevel">http://schema.org/evidenceLevel</a>
		 */
		public Container.EvidenceLevel getEvidenceLevel();
		public void setEvidenceLevel(Container.EvidenceLevel evidenceLevel);

		/**
		 * @see <a href="http://schema.org/evidenceOrigin">http://schema.org/evidenceOrigin</a>
		 */
		public Container.EvidenceOrigin getEvidenceOrigin();
		public void setEvidenceOrigin(Container.EvidenceOrigin evidenceOrigin);

		/**
		 * @see <a href="http://schema.org/guidelineDate">http://schema.org/guidelineDate</a>
		 */
		public Container.GuidelineDate getGuidelineDate();
		public void setGuidelineDate(Container.GuidelineDate guidelineDate);

		/**
		 * @see <a href="http://schema.org/guidelineSubject">http://schema.org/guidelineSubject</a>
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
		 * @see <a href="http://schema.org/recommendationStrength">http://schema.org/recommendationStrength</a>
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
		 * @see <a href="http://schema.org/studyDesign">http://schema.org/studyDesign</a>
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
		 * @see <a href="http://schema.org/bodyLocation">http://schema.org/bodyLocation</a>
		 */
		public Container.BodyLocation getBodyLocation();
		public void setBodyLocation(Container.BodyLocation bodyLocation);

		/**
		 * @see <a href="http://schema.org/followup">http://schema.org/followup</a>
		 */
		public Container.Followup getFollowup();
		public void setFollowup(Container.Followup followup);

		/**
		 * @see <a href="http://schema.org/howPerformed">http://schema.org/howPerformed</a>
		 */
		public Container.HowPerformed getHowPerformed();
		public void setHowPerformed(Container.HowPerformed howPerformed);

		/**
		 * @see <a href="http://schema.org/indication">http://schema.org/indication</a>
		 */
		public Container.Indication getIndication();
		public void setIndication(Container.Indication indication);

		/**
		 * @see <a href="http://schema.org/outcome">http://schema.org/outcome</a>
		 */
		public Container.Outcome getOutcome();
		public void setOutcome(Container.Outcome outcome);

		/**
		 * @see <a href="http://schema.org/preparation">http://schema.org/preparation</a>
		 */
		public Container.Preparation getPreparation();
		public void setPreparation(Container.Preparation preparation);

		/**
		 * @see <a href="http://schema.org/procedureType">http://schema.org/procedureType</a>
		 */
		public Container.ProcedureType getProcedureType();
		public void setProcedureType(Container.ProcedureType procedureType);

		/**
		 * @see <a href="http://schema.org/status">http://schema.org/status</a>
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
		 * @see <a href="http://schema.org/estimatesRiskOf">http://schema.org/estimatesRiskOf</a>
		 */
		public Container.EstimatesRiskOf getEstimatesRiskOf();
		public void setEstimatesRiskOf(Container.EstimatesRiskOf estimatesRiskOf);

		/**
		 * @see <a href="http://schema.org/includedRiskFactor">http://schema.org/includedRiskFactor</a>
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
		 * @see <a href="http://schema.org/increasesRiskOf">http://schema.org/increasesRiskOf</a>
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
		 * @see <a href="http://schema.org/algorithm">http://schema.org/algorithm</a>
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
		 * @see <a href="http://schema.org/publicationType">http://schema.org/publicationType</a>
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
		 * @see <a href="http://schema.org/identifyingExam">http://schema.org/identifyingExam</a>
		 */
		public Container.IdentifyingExam getIdentifyingExam();
		public void setIdentifyingExam(Container.IdentifyingExam identifyingExam);

		/**
		 * @see <a href="http://schema.org/identifyingTest">http://schema.org/identifyingTest</a>
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
		 * @see <a href="http://schema.org/cause">http://schema.org/cause</a>
		 */
		public Container.Cause getCause();
		public void setCause(Container.Cause cause);

		/**
		 * @see <a href="http://schema.org/possibleTreatment">http://schema.org/possibleTreatment</a>
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
		 * @see <a href="http://schema.org/healthCondition">http://schema.org/healthCondition</a>
		 */
		public Container.HealthCondition getHealthCondition();
		public void setHealthCondition(Container.HealthCondition healthCondition);

		/**
		 * @see <a href="http://schema.org/outcome">http://schema.org/outcome</a>
		 */
		public Container.Outcome getOutcome();
		public void setOutcome(Container.Outcome outcome);

		/**
		 * @see <a href="http://schema.org/population">http://schema.org/population</a>
		 */
		public Container.Population getPopulation();
		public void setPopulation(Container.Population population);

		/**
		 * @see <a href="http://schema.org/sponsor">http://schema.org/sponsor</a>
		 */
		public Sponsor getSponsor();
		public void setSponsor(Sponsor sponsor);

		/**
		 * @see <a href="http://schema.org/status">http://schema.org/status</a>
		 */
		public Container.Status getStatus();
		public void setStatus(Container.Status status);

		/**
		 * @see <a href="http://schema.org/studyLocation">http://schema.org/studyLocation</a>
		 */
		public Container.StudyLocation getStudyLocation();
		public void setStudyLocation(Container.StudyLocation studyLocation);

		/**
		 * @see <a href="http://schema.org/studySubject">http://schema.org/studySubject</a>
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
		 * @see <a href="http://schema.org/affectedBy">http://schema.org/affectedBy</a>
		 */
		public Container.AffectedBy getAffectedBy();
		public void setAffectedBy(Container.AffectedBy affectedBy);

		/**
		 * @see <a href="http://schema.org/normalRange">http://schema.org/normalRange</a>
		 */
		public Container.NormalRange getNormalRange();
		public void setNormalRange(Container.NormalRange normalRange);

		/**
		 * @see <a href="http://schema.org/signDetected">http://schema.org/signDetected</a>
		 */
		public Container.SignDetected getSignDetected();
		public void setSignDetected(Container.SignDetected signDetected);

		/**
		 * @see <a href="http://schema.org/usedToDiagnose">http://schema.org/usedToDiagnose</a>
		 */
		public Container.UsedToDiagnose getUsedToDiagnose();
		public void setUsedToDiagnose(Container.UsedToDiagnose usedToDiagnose);

		/**
		 * @see <a href="http://schema.org/usesDevice">http://schema.org/usesDevice</a>
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
		 * @see <a href="http://schema.org/subTest">http://schema.org/subTest</a>
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
		 * @see <a href="http://schema.org/contraindication">http://schema.org/contraindication</a>
		 */
		public Container.Contraindication getContraindication();
		public void setContraindication(Container.Contraindication contraindication);

		/**
		 * @see <a href="http://schema.org/duplicateTherapy">http://schema.org/duplicateTherapy</a>
		 */
		public Container.DuplicateTherapy getDuplicateTherapy();
		public void setDuplicateTherapy(Container.DuplicateTherapy duplicateTherapy);

		/**
		 * @see <a href="http://schema.org/seriousAdverseOutcome">http://schema.org/seriousAdverseOutcome</a>
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
		 * @see <a href="http://schema.org/phase">http://schema.org/phase</a>
		 */
		public Container.Phase getPhase();
		public void setPhase(Container.Phase phase);

		/**
		 * @see <a href="http://schema.org/trialDesign">http://schema.org/trialDesign</a>
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
		 * @see <a href="http://schema.org/action">http://schema.org/action</a>
		 */
		public Container.Action getAction();
		public void setAction(Container.Action action);

		/**
		 * @see <a href="http://schema.org/antagonist">http://schema.org/antagonist</a>
		 */
		public Container.Antagonist getAntagonist();
		public void setAntagonist(Container.Antagonist antagonist);

		/**
		 * @see <a href="http://schema.org/bloodSupply">http://schema.org/bloodSupply</a>
		 */
		public Container.BloodSupply getBloodSupply();
		public void setBloodSupply(Container.BloodSupply bloodSupply);

		/**
		 * @see <a href="http://schema.org/insertion">http://schema.org/insertion</a>
		 */
		public Container.Insertion getInsertion();
		public void setInsertion(Container.Insertion insertion);

		/**
		 * @see <a href="http://schema.org/muscleAction">http://schema.org/muscleAction</a>
		 */
		public Container.MuscleAction getMuscleAction();
		public void setMuscleAction(Container.MuscleAction muscleAction);

		/**
		 * @see <a href="http://schema.org/nerve">http://schema.org/nerve</a>
		 */
		public Container.Nerve getNerve();
		public void setNerve(Container.Nerve nerve);

		/**
		 * @see <a href="http://schema.org/origin">http://schema.org/origin</a>
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
		 * @see <a href="http://schema.org/nerveMotor">http://schema.org/nerveMotor</a>
		 */
		public Container.NerveMotor getNerveMotor();
		public void setNerveMotor(Container.NerveMotor nerveMotor);

		/**
		 * @see <a href="http://schema.org/sensoryUnit">http://schema.org/sensoryUnit</a>
		 */
		public Container.SensoryUnit getSensoryUnit();
		public void setSensoryUnit(Container.SensoryUnit sensoryUnit);

		/**
		 * @see <a href="http://schema.org/sourcedFrom">http://schema.org/sourcedFrom</a>
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
		 * @see <a href="http://schema.org/tissueSample">http://schema.org/tissueSample</a>
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
		 * @see <a href="http://schema.org/diagnosis">http://schema.org/diagnosis</a>
		 */
		public Container.Diagnosis getDiagnosis();
		public void setDiagnosis(Container.Diagnosis diagnosis);

		/**
		 * @see <a href="http://schema.org/drug">http://schema.org/drug</a>
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * @see <a href="http://schema.org/healthCondition">http://schema.org/healthCondition</a>
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
		 * @see <a href="http://schema.org/associatedAnatomy">http://schema.org/associatedAnatomy</a>
		 */
		public Container.AssociatedAnatomy getAssociatedAnatomy();
		public void setAssociatedAnatomy(Container.AssociatedAnatomy associatedAnatomy);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * @see <a href="http://schema.org/epidemiology">http://schema.org/epidemiology</a>
		 */
		public Container.Epidemiology getEpidemiology();
		public void setEpidemiology(Container.Epidemiology epidemiology);

		/**
		 * @see <a href="http://schema.org/pathophysiology">http://schema.org/pathophysiology</a>
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
		 * @see <a href="http://schema.org/activeIngredient">http://schema.org/activeIngredient</a>
		 */
		public Container.ActiveIngredient getActiveIngredient();
		public void setActiveIngredient(Container.ActiveIngredient activeIngredient);

		/**
		 * @see <a href="http://schema.org/maximumIntake">http://schema.org/maximumIntake</a>
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
		 * @see <a href="http://schema.org/associatedPathophysiology">http://schema.org/associatedPathophysiology</a>
		 */
		public Container.AssociatedPathophysiology getAssociatedPathophysiology();
		public void setAssociatedPathophysiology(Container.AssociatedPathophysiology associatedPathophysiology);

		/**
		 * @see <a href="http://schema.org/relatedAnatomy">http://schema.org/relatedAnatomy</a>
		 */
		public Container.RelatedAnatomy getRelatedAnatomy();
		public void setRelatedAnatomy(Container.RelatedAnatomy relatedAnatomy);

		/**
		 * @see <a href="http://schema.org/relatedCondition">http://schema.org/relatedCondition</a>
		 */
		public Container.RelatedCondition getRelatedCondition();
		public void setRelatedCondition(Container.RelatedCondition relatedCondition);

		/**
		 * @see <a href="http://schema.org/relatedTherapy">http://schema.org/relatedTherapy</a>
		 */
		public Container.RelatedTherapy getRelatedTherapy();
		public void setRelatedTherapy(Container.RelatedTherapy relatedTherapy);

		/**
		 * @see <a href="http://schema.org/significance">http://schema.org/significance</a>
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
		 * @see <a href="http://schema.org/adverseOutcome">http://schema.org/adverseOutcome</a>
		 */
		public Container.AdverseOutcome getAdverseOutcome();
		public void setAdverseOutcome(Container.AdverseOutcome adverseOutcome);

		/**
		 * @see <a href="http://schema.org/doseSchedule">http://schema.org/doseSchedule</a>
		 */
		public Container.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Container.DoseSchedule doseSchedule);

		/**
		 * @see <a href="http://schema.org/drug">http://schema.org/drug</a>
		 */
		public Container.Drug getDrug();
		public void setDrug(Container.Drug drug);

		/**
		 * @see <a href="http://schema.org/indication">http://schema.org/indication</a>
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
		 * @see <a href="http://schema.org/drainsTo">http://schema.org/drainsTo</a>
		 */
		public Container.DrainsTo getDrainsTo();
		public void setDrainsTo(Container.DrainsTo drainsTo);

		/**
		 * @see <a href="http://schema.org/regionDrained">http://schema.org/regionDrained</a>
		 */
		public Container.RegionDrained getRegionDrained();
		public void setRegionDrained(Container.RegionDrained regionDrained);

		/**
		 * @see <a href="http://schema.org/tributary">http://schema.org/tributary</a>
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
