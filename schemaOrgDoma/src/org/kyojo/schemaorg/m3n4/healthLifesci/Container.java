package org.kyojo.schemaorg.m3n4.healthLifesci;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n4.core.Clazz.Duration;
import org.kyojo.schemaorg.m3n4.core.Clazz.Energy;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hospital;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.core.Container.Instrument;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.DataType.Date;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/action")
	@SchemaOrgLabel("action")
	@SchemaOrgComment(""
			+ "Obsolete term for <a class=\"localLink\""
			+ " href=\"http://schema.org/muscleAction\">muscleAction</a>. Not to be confused"
			+ " with <a class=\"localLink\""
			+ " href=\"http://schema.org/potentialAction\">potentialAction</a>.")
	@CamelizedName("action")
	@ConstantizedName("ACTION")
	public interface Action extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/activeIngredient")
	@SchemaOrgLabel("activeIngredient")
	@SchemaOrgComment(""
			+ "An active ingredient, typically chemical compounds and/or biologic substances.")
	@CamelizedName("activeIngredient")
	@ConstantizedName("ACTIVE_INGREDIENT")
	public interface ActiveIngredient extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/activityDuration")
	@SchemaOrgLabel("activityDuration")
	@SchemaOrgComment(""
			+ "Length of time to engage in the activity.")
	@CamelizedName("activityDuration")
	@ConstantizedName("ACTIVITY_DURATION")
	public interface ActivityDuration extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
		public boolean hasDuration();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/activityFrequency")
	@SchemaOrgLabel("activityFrequency")
	@SchemaOrgComment(""
			+ "How often one should engage in the activity.")
	@CamelizedName("activityFrequency")
	@ConstantizedName("ACTIVITY_FREQUENCY")
	public interface ActivityFrequency extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalVariable")
	@SchemaOrgLabel("additionalVariable")
	@SchemaOrgComment(""
			+ "Any additional component of the exercise prescription that may need to be"
			+ " articulated to the patient. This may include the order of exercises, the number"
			+ " of repetitions of movement, quantitative distance, progressions over time, etc.")
	@CamelizedName("additionalVariable")
	@ConstantizedName("ADDITIONAL_VARIABLE")
	public interface AdditionalVariable extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/administrationRoute")
	@SchemaOrgLabel("administrationRoute")
	@SchemaOrgComment(""
			+ "A route by which this drug may be administered, e.g. 'oral'.")
	@CamelizedName("administrationRoute")
	@ConstantizedName("ADMINISTRATION_ROUTE")
	public interface AdministrationRoute extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/adverseOutcome")
	@SchemaOrgLabel("adverseOutcome")
	@SchemaOrgComment(""
			+ "A possible complication and/or side effect of this therapy. If it is known that"
			+ " an adverse outcome is serious (resulting in death, disability, or permanent"
			+ " damage; requiring hospitalization; or is otherwise life-threatening or requires"
			+ " immediate medical attention), tag it as a seriouseAdverseOutcome instead.")
	@CamelizedName("adverseOutcome")
	@ConstantizedName("ADVERSE_OUTCOME")
	public interface AdverseOutcome extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/affectedBy")
	@SchemaOrgLabel("affectedBy")
	@SchemaOrgComment("Drugs that affect the test's results.")
	@CamelizedName("affectedBy")
	@ConstantizedName("AFFECTED_BY")
	public interface AffectedBy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alcoholWarning")
	@SchemaOrgLabel("alcoholWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to consumption of"
			+ " alcohol while taking this drug.")
	@CamelizedName("alcoholWarning")
	@ConstantizedName("ALCOHOL_WARNING")
	public interface AlcoholWarning extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/algorithm")
	@SchemaOrgLabel("algorithm")
	@SchemaOrgComment(""
			+ "The algorithm or rules to follow to compute the score.")
	@CamelizedName("algorithm")
	@ConstantizedName("ALGORITHM")
	public interface Algorithm extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/antagonist")
	@SchemaOrgLabel("antagonist")
	@SchemaOrgComment(""
			+ "The muscle whose action counteracts the specified muscle.")
	@CamelizedName("antagonist")
	@ConstantizedName("ANTAGONIST")
	public interface Antagonist extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/applicableLocation")
	@SchemaOrgLabel("applicableLocation")
	@SchemaOrgComment(""
			+ "The location in which the status applies.")
	@CamelizedName("applicableLocation")
	@ConstantizedName("APPLICABLE_LOCATION")
	public interface ApplicableLocation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arterialBranch")
	@SchemaOrgLabel("arterialBranch")
	@SchemaOrgComment(""
			+ "The branches that comprise the arterial structure.")
	@CamelizedName("arterialBranch")
	@ConstantizedName("ARTERIAL_BRANCH")
	public interface ArterialBranch extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedAnatomy")
	@SchemaOrgLabel("associatedAnatomy")
	@SchemaOrgComment(""
			+ "The anatomy of the underlying organ system or structures associated with this"
			+ " entity.")
	@CamelizedName("associatedAnatomy")
	@ConstantizedName("ASSOCIATED_ANATOMY")
	public interface AssociatedAnatomy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedPathophysiology")
	@SchemaOrgLabel("associatedPathophysiology")
	@SchemaOrgComment(""
			+ "If applicable, a description of the pathophysiology associated with the"
			+ " anatomical system, including potential abnormal changes in the mechanical,"
			+ " physical, and biochemical functions of the system.")
	@CamelizedName("associatedPathophysiology")
	@ConstantizedName("ASSOCIATED_PATHOPHYSIOLOGY")
	public interface AssociatedPathophysiology extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableIn")
	@SchemaOrgLabel("availableIn")
	@SchemaOrgComment(""
			+ "The location in which the strength is available.")
	@CamelizedName("availableIn")
	@ConstantizedName("AVAILABLE_IN")
	public interface AvailableIn extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableService")
	@SchemaOrgLabel("availableService")
	@SchemaOrgComment(""
			+ "A medical service available from this provider.")
	@CamelizedName("availableService")
	@ConstantizedName("AVAILABLE_SERVICE")
	public interface AvailableService extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableStrength")
	@SchemaOrgLabel("availableStrength")
	@SchemaOrgComment(""
			+ "An available dosage strength for the drug.")
	@CamelizedName("availableStrength")
	@ConstantizedName("AVAILABLE_STRENGTH")
	public interface AvailableStrength extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableTest")
	@SchemaOrgLabel("availableTest")
	@SchemaOrgComment(""
			+ "A diagnostic test or procedure offered by this lab.")
	@CamelizedName("availableTest")
	@ConstantizedName("AVAILABLE_TEST")
	public interface AvailableTest extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/background")
	@SchemaOrgLabel("background")
	@SchemaOrgComment(""
			+ "Descriptive information establishing a historical perspective on the supplement."
			+ " May include the rationale for the name, the population where the supplement"
			+ " first came to prominence, etc.")
	@CamelizedName("background")
	@ConstantizedName("BACKGROUND")
	public interface Background extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/biomechnicalClass")
	@SchemaOrgLabel("biomechnicalClass")
	@SchemaOrgComment(""
			+ "The biomechanical properties of the bone.")
	@CamelizedName("biomechnicalClass")
	@ConstantizedName("BIOMECHNICAL_CLASS")
	public interface BiomechnicalClass extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bloodSupply")
	@SchemaOrgLabel("bloodSupply")
	@SchemaOrgComment(""
			+ "The blood vessel that carries blood from the heart to the muscle.")
	@CamelizedName("bloodSupply")
	@ConstantizedName("BLOOD_SUPPLY")
	public interface BloodSupply extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bodyLocation")
	@SchemaOrgLabel("bodyLocation")
	@SchemaOrgComment(""
			+ "Location in the body of the anatomical structure.")
	@CamelizedName("bodyLocation")
	@ConstantizedName("BODY_LOCATION")
	public interface BodyLocation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/breastfeedingWarning")
	@SchemaOrgLabel("breastfeedingWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to this drug's use by"
			+ " breastfeeding mothers.")
	@CamelizedName("breastfeedingWarning")
	@ConstantizedName("BREASTFEEDING_WARNING")
	public interface BreastfeedingWarning extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cause")
	@SchemaOrgLabel("cause")
	@SchemaOrgComment(""
			+ "Specifying a cause of something in general. e.g in medicine , one of the"
			+ " causative agent(s) that are most directly responsible for the pathophysiologic"
			+ " process that eventually results in the occurrence.")
	@CamelizedName("cause")
	@ConstantizedName("CAUSE")
	public interface Cause extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/causeOf")
	@SchemaOrgLabel("causeOf")
	@SchemaOrgComment(""
			+ "The condition, complication, symptom, sign, etc. caused.")
	@CamelizedName("causeOf")
	@ConstantizedName("CAUSE_OF")
	public interface CauseOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/clinicalPharmacology")
	@SchemaOrgLabel("clinicalPharmacology")
	@SchemaOrgComment(""
			+ "Description of the absorption and elimination of drugs, including their"
			+ " concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics,"
			+ " pD).")
	@CamelizedName("clinicalPharmacology")
	@ConstantizedName("CLINICAL_PHARMACOLOGY")
	public interface ClinicalPharmacology extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/code")
	@SchemaOrgLabel("code")
	@SchemaOrgComment(""
			+ "A medical code for the entity, taken from a controlled vocabulary or ontology"
			+ " such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.")
	@CamelizedName("code")
	@ConstantizedName("CODE")
	public interface Code extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/codingSystem")
	@SchemaOrgLabel("codingSystem")
	@SchemaOrgComment("The coding system, e.g. 'ICD-10'.")
	@CamelizedName("codingSystem")
	@ConstantizedName("CODING_SYSTEM")
	public interface CodingSystem extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/comprisedOf")
	@SchemaOrgLabel("comprisedOf")
	@SchemaOrgComment(""
			+ "Specifying something physically contained by something else. Typically used here"
			+ " for the underlying anatomical structures, such as organs, that comprise the"
			+ " anatomical system.")
	@CamelizedName("comprisedOf")
	@ConstantizedName("COMPRISED_OF")
	public interface ComprisedOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/connectedTo")
	@SchemaOrgLabel("connectedTo")
	@SchemaOrgComment(""
			+ "Other anatomical structures to which this structure is connected.")
	@CamelizedName("connectedTo")
	@ConstantizedName("CONNECTED_TO")
	public interface ConnectedTo extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contraindication")
	@SchemaOrgLabel("contraindication")
	@SchemaOrgComment("A contraindication for this therapy.")
	@CamelizedName("contraindication")
	@ConstantizedName("CONTRAINDICATION")
	public interface Contraindication extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cost")
	@SchemaOrgLabel("cost")
	@SchemaOrgComment(""
			+ "Cost per unit of the drug, as reported by the source being tagged.")
	@CamelizedName("cost")
	@ConstantizedName("COST")
	public interface Cost extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public Clazz.DrugCost getDrugCost();
		public void setDrugCost(Clazz.DrugCost drugCost);
		public List<Clazz.DrugCost> getDrugCostList();
		public void setDrugCostList(List<Clazz.DrugCost> drugCostList);
		public boolean hasDrugCost();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costCategory")
	@SchemaOrgLabel("costCategory")
	@SchemaOrgComment(""
			+ "The category of cost, such as wholesale, retail, reimbursement cap, etc.")
	@CamelizedName("costCategory")
	@ConstantizedName("COST_CATEGORY")
	public interface CostCategory extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public Clazz.DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(Clazz.DrugCostCategory drugCostCategory);
		public List<Clazz.DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<Clazz.DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costCurrency")
	@SchemaOrgLabel("costCurrency")
	@SchemaOrgComment(""
			+ "The currency (in 3-letter of the drug cost. See:"
			+ " http://en.wikipedia.org/wiki/ISO_4217")
	@CamelizedName("costCurrency")
	@ConstantizedName("COST_CURRENCY")
	public interface CostCurrency extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costOrigin")
	@SchemaOrgLabel("costOrigin")
	@SchemaOrgComment(""
			+ "Additional details to capture the origin of the cost data. For example,"
			+ " 'Medicare Part B'.")
	@CamelizedName("costOrigin")
	@ConstantizedName("COST_ORIGIN")
	public interface CostOrigin extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costPerUnit")
	@SchemaOrgLabel("costPerUnit")
	@SchemaOrgComment("The cost per unit of the drug.")
	@CamelizedName("costPerUnit")
	@ConstantizedName("COST_PER_UNIT")
	public interface CostPerUnit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diagnosis")
	@SchemaOrgLabel("diagnosis")
	@SchemaOrgComment(""
			+ "One or more alternative conditions considered in the differential diagnosis"
			+ " process as output of a diagnosis process.")
	@CamelizedName("diagnosis")
	@ConstantizedName("DIAGNOSIS")
	public interface Diagnosis extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diagram")
	@SchemaOrgLabel("diagram")
	@SchemaOrgComment(""
			+ "An image containing a diagram that illustrates the structure and/or its"
			+ " component substructures and/or connections with other structures.")
	@CamelizedName("diagram")
	@ConstantizedName("DIAGRAM")
	public interface Diagram extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ImageObject">http://schema.org/ImageObject</a>
		 */
		public ImageObject getImageObject();
		public void setImageObject(ImageObject imageObject);
		public List<ImageObject> getImageObjectList();
		public void setImageObjectList(List<ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diet")
	@SchemaOrgLabel("diet")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The diet used in this action.")
	@CamelizedName("diet")
	@ConstantizedName("DIET")
	public interface Diet extends Instrument, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dietFeatures")
	@SchemaOrgLabel("dietFeatures")
	@SchemaOrgComment(""
			+ "Nutritional information specific to the dietary plan. May include dietary"
			+ " recommendations on what foods to avoid, what foods to consume, and specific"
			+ " alterations/deviations from the USDA or other regulatory body's approved"
			+ " dietary guidelines.")
	@CamelizedName("dietFeatures")
	@ConstantizedName("DIET_FEATURES")
	public interface DietFeatures extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/differentialDiagnosis")
	@SchemaOrgLabel("differentialDiagnosis")
	@SchemaOrgComment(""
			+ "One of a set of differential diagnoses for the condition. Specifically, a"
			+ " closely-related or competing diagnosis typically considered later in the"
			+ " cognitive process whereby this medical condition is distinguished from others"
			+ " most likely responsible for a similar collection of signs and symptoms to reach"
			+ " the most parsimonious diagnosis or diagnoses in a patient.")
	@CamelizedName("differentialDiagnosis")
	@ConstantizedName("DIFFERENTIAL_DIAGNOSIS")
	public interface DifferentialDiagnosis extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/distinguishingSign")
	@SchemaOrgLabel("distinguishingSign")
	@SchemaOrgComment(""
			+ "One of a set of signs and symptoms that can be used to distinguish this"
			+ " diagnosis from others in the differential diagnosis.")
	@CamelizedName("distinguishingSign")
	@ConstantizedName("DISTINGUISHING_SIGN")
	public interface DistinguishingSign extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dosageForm")
	@SchemaOrgLabel("dosageForm")
	@SchemaOrgComment(""
			+ "A dosage form in which this drug/supplement is available, e.g. 'tablet',"
			+ " 'suspension', 'injection'.")
	@CamelizedName("dosageForm")
	@ConstantizedName("DOSAGE_FORM")
	public interface DosageForm extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/doseSchedule")
	@SchemaOrgLabel("doseSchedule")
	@SchemaOrgComment(""
			+ "A dosing schedule for the drug for a given population, either observed,"
			+ " recommended, or maximum dose based on the type used.")
	@CamelizedName("doseSchedule")
	@ConstantizedName("DOSE_SCHEDULE")
	public interface DoseSchedule extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/doseUnit")
	@SchemaOrgLabel("doseUnit")
	@SchemaOrgComment("The unit of the dose, e.g. 'mg'.")
	@CamelizedName("doseUnit")
	@ConstantizedName("DOSE_UNIT")
	public interface DoseUnit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/doseValue")
	@SchemaOrgLabel("doseValue")
	@SchemaOrgComment("The value of the dose, e.g. 500.")
	@CamelizedName("doseValue")
	@ConstantizedName("DOSE_VALUE")
	public interface DoseValue extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drainsTo")
	@SchemaOrgLabel("drainsTo")
	@SchemaOrgComment(""
			+ "The vasculature that the vein drains into.")
	@CamelizedName("drainsTo")
	@ConstantizedName("DRAINS_TO")
	public interface DrainsTo extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drug")
	@SchemaOrgLabel("drug")
	@SchemaOrgComment(""
			+ "Specifying a drug or medicine used in a medication procedure")
	@CamelizedName("drug")
	@ConstantizedName("DRUG")
	public interface Drug extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drugClass")
	@SchemaOrgLabel("drugClass")
	@SchemaOrgComment(""
			+ "The class of drug this belongs to (e.g., statins).")
	@CamelizedName("drugClass")
	@ConstantizedName("DRUG_CLASS")
	public interface DrugClass extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public Clazz.DrugClass getDrugClass();
		public void setDrugClass(Clazz.DrugClass drugClass);
		public List<Clazz.DrugClass> getDrugClassList();
		public void setDrugClassList(List<Clazz.DrugClass> drugClassList);
		public boolean hasDrugClass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drugUnit")
	@SchemaOrgLabel("drugUnit")
	@SchemaOrgComment(""
			+ "The unit in which the drug is measured, e.g. '5 mg tablet'.")
	@CamelizedName("drugUnit")
	@ConstantizedName("DRUG_UNIT")
	public interface DrugUnit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/duplicateTherapy")
	@SchemaOrgLabel("duplicateTherapy")
	@SchemaOrgComment(""
			+ "A therapy that duplicates or overlaps this one.")
	@CamelizedName("duplicateTherapy")
	@ConstantizedName("DUPLICATE_THERAPY")
	public interface DuplicateTherapy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/endorsers")
	@SchemaOrgLabel("endorsers")
	@SchemaOrgComment(""
			+ "People or organizations that endorse the plan.")
	@CamelizedName("endorsers")
	@ConstantizedName("ENDORSERS")
	public interface Endorsers extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/epidemiology")
	@SchemaOrgLabel("epidemiology")
	@SchemaOrgComment(""
			+ "The characteristics of associated patients, such as age, gender, race etc.")
	@CamelizedName("epidemiology")
	@ConstantizedName("EPIDEMIOLOGY")
	public interface Epidemiology extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/estimatesRiskOf")
	@SchemaOrgLabel("estimatesRiskOf")
	@SchemaOrgComment(""
			+ "The condition, complication, or symptom whose risk is being estimated.")
	@CamelizedName("estimatesRiskOf")
	@ConstantizedName("ESTIMATES_RISK_OF")
	public interface EstimatesRiskOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/evidenceLevel")
	@SchemaOrgLabel("evidenceLevel")
	@SchemaOrgComment(""
			+ "Strength of evidence of the data used to formulate the guideline (enumerated).")
	@CamelizedName("evidenceLevel")
	@ConstantizedName("EVIDENCE_LEVEL")
	public interface EvidenceLevel extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public Clazz.MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(Clazz.MedicalEvidenceLevel medicalEvidenceLevel);
		public List<Clazz.MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<Clazz.MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/evidenceOrigin")
	@SchemaOrgLabel("evidenceOrigin")
	@SchemaOrgComment(""
			+ "Source of the data used to formulate the guidance, e.g. RCT, consensus opinion,"
			+ " etc.")
	@CamelizedName("evidenceOrigin")
	@ConstantizedName("EVIDENCE_ORIGIN")
	public interface EvidenceOrigin extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exercisePlan")
	@SchemaOrgLabel("exercisePlan")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The exercise plan used on this action.")
	@CamelizedName("exercisePlan")
	@ConstantizedName("EXERCISE_PLAN")
	public interface ExercisePlan extends Instrument, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exerciseRelatedDiet")
	@SchemaOrgLabel("exerciseRelatedDiet")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The diet used in this action.")
	@CamelizedName("exerciseRelatedDiet")
	@ConstantizedName("EXERCISE_RELATED_DIET")
	public interface ExerciseRelatedDiet extends Instrument, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exerciseType")
	@SchemaOrgLabel("exerciseType")
	@SchemaOrgComment(""
			+ "Type(s) of exercise or activity, such as strength training, flexibility"
			+ " training, aerobics, cardiac rehabilitation, etc.")
	@CamelizedName("exerciseType")
	@ConstantizedName("EXERCISE_TYPE")
	public interface ExerciseType extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/expectedPrognosis")
	@SchemaOrgLabel("expectedPrognosis")
	@SchemaOrgComment(""
			+ "The likely outcome in either the short term or long term of the medical"
			+ " condition.")
	@CamelizedName("expectedPrognosis")
	@ConstantizedName("EXPECTED_PROGNOSIS")
	public interface ExpectedPrognosis extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/expertConsiderations")
	@SchemaOrgLabel("expertConsiderations")
	@SchemaOrgComment(""
			+ "Medical expert advice related to the plan.")
	@CamelizedName("expertConsiderations")
	@ConstantizedName("EXPERT_CONSIDERATIONS")
	public interface ExpertConsiderations extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/followup")
	@SchemaOrgLabel("followup")
	@SchemaOrgComment(""
			+ "Typical or recommended followup care after the procedure is performed.")
	@CamelizedName("followup")
	@ConstantizedName("FOLLOWUP")
	public interface Followup extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/foodWarning")
	@SchemaOrgLabel("foodWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to consumption of"
			+ " specific foods while taking this drug.")
	@CamelizedName("foodWarning")
	@ConstantizedName("FOOD_WARNING")
	public interface FoodWarning extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/frequency")
	@SchemaOrgLabel("frequency")
	@SchemaOrgComment(""
			+ "How often the dose is taken, e.g. 'daily'.")
	@CamelizedName("frequency")
	@ConstantizedName("FREQUENCY")
	public interface Frequency extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/function")
	@SchemaOrgLabel("function")
	@SchemaOrgComment("Function of the anatomical structure.")
	@CamelizedName("function")
	@ConstantizedName("FUNCTION")
	public interface Function extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/functionalClass")
	@SchemaOrgLabel("functionalClass")
	@SchemaOrgComment(""
			+ "The degree of mobility the joint allows.")
	@CamelizedName("functionalClass")
	@ConstantizedName("FUNCTIONAL_CLASS")
	public interface FunctionalClass extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/guideline")
	@SchemaOrgLabel("guideline")
	@SchemaOrgComment(""
			+ "A medical guideline related to this entity.")
	@CamelizedName("guideline")
	@ConstantizedName("GUIDELINE")
	public interface Guideline extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/guidelineDate")
	@SchemaOrgLabel("guidelineDate")
	@SchemaOrgComment(""
			+ "Date on which this guideline's recommendation was made.")
	@CamelizedName("guidelineDate")
	@ConstantizedName("GUIDELINE_DATE")
	public interface GuidelineDate extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Date">http://schema.org/Date</a>
		 */
		public Date getDate();
		public void setDate(Date date);
		public List<Date> getDateList();
		public void setDateList(List<Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/guidelineSubject")
	@SchemaOrgLabel("guidelineSubject")
	@SchemaOrgComment(""
			+ "The medical conditions, treatments, etc. that are the subject of the guideline.")
	@CamelizedName("guidelineSubject")
	@ConstantizedName("GUIDELINE_SUBJECT")
	public interface GuidelineSubject extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/healthCondition")
	@SchemaOrgLabel("healthCondition")
	@SchemaOrgComment(""
			+ "Specifying the health condition(s) of a patient, medical study, or other target"
			+ " audience.")
	@CamelizedName("healthCondition")
	@ConstantizedName("HEALTH_CONDITION")
	public interface HealthCondition extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hospitalAffiliation")
	@SchemaOrgLabel("hospitalAffiliation")
	@SchemaOrgComment(""
			+ "A hospital with which the physician or office is affiliated.")
	@CamelizedName("hospitalAffiliation")
	@ConstantizedName("HOSPITAL_AFFILIATION")
	public interface HospitalAffiliation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Hospital">http://schema.org/Hospital</a>
		 */
		public Hospital getHospital();
		public void setHospital(Hospital hospital);
		public List<Hospital> getHospitalList();
		public void setHospitalList(List<Hospital> hospitalList);
		public boolean hasHospital();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/howPerformed")
	@SchemaOrgLabel("howPerformed")
	@SchemaOrgComment("How the procedure is performed.")
	@CamelizedName("howPerformed")
	@ConstantizedName("HOW_PERFORMED")
	public interface HowPerformed extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/identifyingExam")
	@SchemaOrgLabel("identifyingExam")
	@SchemaOrgComment(""
			+ "A physical examination that can identify this sign.")
	@CamelizedName("identifyingExam")
	@ConstantizedName("IDENTIFYING_EXAM")
	public interface IdentifyingExam extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/identifyingTest")
	@SchemaOrgLabel("identifyingTest")
	@SchemaOrgComment(""
			+ "A diagnostic test that can identify this sign.")
	@CamelizedName("identifyingTest")
	@ConstantizedName("IDENTIFYING_TEST")
	public interface IdentifyingTest extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/imagingTechnique")
	@SchemaOrgLabel("imagingTechnique")
	@SchemaOrgComment("Imaging technique used.")
	@CamelizedName("imagingTechnique")
	@ConstantizedName("IMAGING_TECHNIQUE")
	public interface ImagingTechnique extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public Clazz.MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(Clazz.MedicalImagingTechnique medicalImagingTechnique);
		public List<Clazz.MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<Clazz.MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includedRiskFactor")
	@SchemaOrgLabel("includedRiskFactor")
	@SchemaOrgComment(""
			+ "A modifiable or non-modifiable risk factor included in the calculation, e.g."
			+ " age, coexisting condition.")
	@CamelizedName("includedRiskFactor")
	@ConstantizedName("INCLUDED_RISK_FACTOR")
	public interface IncludedRiskFactor extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/increasesRiskOf")
	@SchemaOrgLabel("increasesRiskOf")
	@SchemaOrgComment(""
			+ "The condition, complication, etc. influenced by this factor.")
	@CamelizedName("increasesRiskOf")
	@ConstantizedName("INCREASES_RISK_OF")
	public interface IncreasesRiskOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/indication")
	@SchemaOrgLabel("indication")
	@SchemaOrgComment(""
			+ "A factor that indicates use of this therapy for treatment and/or prevention of a"
			+ " condition, symptom, etc. For therapies such as drugs, indications can include"
			+ " both officially-approved indications as well as off-label uses. These can be"
			+ " distinguished by using the ApprovedIndication subtype of MedicalIndication.")
	@CamelizedName("indication")
	@ConstantizedName("INDICATION")
	public interface Indication extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/infectiousAgent")
	@SchemaOrgLabel("infectiousAgent")
	@SchemaOrgComment(""
			+ "The actual infectious agent, such as a specific bacterium.")
	@CamelizedName("infectiousAgent")
	@ConstantizedName("INFECTIOUS_AGENT")
	public interface InfectiousAgent extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/infectiousAgentClass")
	@SchemaOrgLabel("infectiousAgentClass")
	@SchemaOrgComment(""
			+ "The class of infectious agent (bacteria, prion, etc.) that causes the disease.")
	@CamelizedName("infectiousAgentClass")
	@ConstantizedName("INFECTIOUS_AGENT_CLASS")
	public interface InfectiousAgentClass extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public Clazz.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Clazz.InfectiousAgentClass infectiousAgentClass);
		public List<Clazz.InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<Clazz.InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/insertion")
	@SchemaOrgLabel("insertion")
	@SchemaOrgComment(""
			+ "The place of attachment of a muscle, or what the muscle moves.")
	@CamelizedName("insertion")
	@ConstantizedName("INSERTION")
	public interface Insertion extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/intensity")
	@SchemaOrgLabel("intensity")
	@SchemaOrgComment(""
			+ "Quantitative measure gauging the degree of force involved in the exercise, for"
			+ " example, heartbeats per minute. May include the velocity of the movement.")
	@CamelizedName("intensity")
	@ConstantizedName("INTENSITY")
	public interface Intensity extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactingDrug")
	@SchemaOrgLabel("interactingDrug")
	@SchemaOrgComment(""
			+ "Another drug that is known to interact with this drug in a way that impacts the"
			+ " effect of this drug or causes a risk to the patient. Note: disease interactions"
			+ " are typically captured as contraindications.")
	@CamelizedName("interactingDrug")
	@ConstantizedName("INTERACTING_DRUG")
	public interface InteractingDrug extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isAvailableGenerically")
	@SchemaOrgLabel("isAvailableGenerically")
	@SchemaOrgComment(""
			+ "True if the drug is available in a generic form (regardless of name).")
	@CamelizedName("isAvailableGenerically")
	@ConstantizedName("IS_AVAILABLE_GENERICALLY")
	public interface IsAvailableGenerically extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isProprietary")
	@SchemaOrgLabel("isProprietary")
	@SchemaOrgComment(""
			+ "True if this item's name is a proprietary/brand name (vs. generic name).")
	@CamelizedName("isProprietary")
	@ConstantizedName("IS_PROPRIETARY")
	public interface IsProprietary extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/labelDetails")
	@SchemaOrgLabel("labelDetails")
	@SchemaOrgComment("Link to the drug's label details.")
	@CamelizedName("labelDetails")
	@ConstantizedName("LABEL_DETAILS")
	public interface LabelDetails extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legalStatus")
	@SchemaOrgLabel("legalStatus")
	@SchemaOrgComment(""
			+ "The drug or supplement's legal status, including any controlled substance"
			+ " schedules that apply.")
	@CamelizedName("legalStatus")
	@ConstantizedName("LEGAL_STATUS")
	public interface LegalStatus extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public Clazz.MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(Clazz.MedicalEnumeration medicalEnumeration);
		public List<Clazz.MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<Clazz.MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/maximumIntake")
	@SchemaOrgLabel("maximumIntake")
	@SchemaOrgComment(""
			+ "Recommended intake of this supplement for a given population as defined by a"
			+ " specific recommending authority.")
	@CamelizedName("maximumIntake")
	@ConstantizedName("MAXIMUM_INTAKE")
	public interface MaximumIntake extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mechanismOfAction")
	@SchemaOrgLabel("mechanismOfAction")
	@SchemaOrgComment(""
			+ "The specific biochemical interaction through which this drug or supplement"
			+ " produces its pharmacological effect.")
	@CamelizedName("mechanismOfAction")
	@ConstantizedName("MECHANISM_OF_ACTION")
	public interface MechanismOfAction extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/medicalSpecialty")
	@SchemaOrgLabel("medicalSpecialty")
	@SchemaOrgComment("A medical specialty of the provider.")
	@CamelizedName("medicalSpecialty")
	@ConstantizedName("MEDICAL_SPECIALTY")
	public interface MedicalSpecialty extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/medicineSystem")
	@SchemaOrgLabel("medicineSystem")
	@SchemaOrgComment(""
			+ "The system of medicine that includes this MedicalEntity, for example"
			+ " 'evidence-based', 'homeopathic', 'chiropractic', etc.")
	@CamelizedName("medicineSystem")
	@ConstantizedName("MEDICINE_SYSTEM")
	public interface MedicineSystem extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public Clazz.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Clazz.MedicineSystem medicineSystem);
		public List<Clazz.MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<Clazz.MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/muscleAction")
	@SchemaOrgLabel("muscleAction")
	@SchemaOrgComment("The movement the muscle generates.")
	@CamelizedName("muscleAction")
	@ConstantizedName("MUSCLE_ACTION")
	public interface MuscleAction extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/naturalProgression")
	@SchemaOrgLabel("naturalProgression")
	@SchemaOrgComment(""
			+ "The expected progression of the condition if it is not treated and allowed to"
			+ " progress naturally.")
	@CamelizedName("naturalProgression")
	@ConstantizedName("NATURAL_PROGRESSION")
	public interface NaturalProgression extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nerve")
	@SchemaOrgLabel("nerve")
	@SchemaOrgComment(""
			+ "The underlying innervation associated with the muscle.")
	@CamelizedName("nerve")
	@ConstantizedName("NERVE")
	public interface Nerve extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nerveMotor")
	@SchemaOrgLabel("nerveMotor")
	@SchemaOrgComment(""
			+ "The neurological pathway extension that involves muscle control.")
	@CamelizedName("nerveMotor")
	@ConstantizedName("NERVE_MOTOR")
	public interface NerveMotor extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nonProprietaryName")
	@SchemaOrgLabel("nonProprietaryName")
	@SchemaOrgComment(""
			+ "The generic name of this drug or supplement.")
	@CamelizedName("nonProprietaryName")
	@ConstantizedName("NON_PROPRIETARY_NAME")
	public interface NonProprietaryName extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/normalRange")
	@SchemaOrgLabel("normalRange")
	@SchemaOrgComment(""
			+ "Range of acceptable values for a typical patient, when applicable.")
	@CamelizedName("normalRange")
	@ConstantizedName("NORMAL_RANGE")
	public interface NormalRange extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public Clazz.MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(Clazz.MedicalEnumeration medicalEnumeration);
		public List<Clazz.MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<Clazz.MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/origin")
	@SchemaOrgLabel("origin")
	@SchemaOrgComment(""
			+ "The place or point where a muscle arises.")
	@CamelizedName("origin")
	@ConstantizedName("ORIGIN")
	public interface Origin extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/originatesFrom")
	@SchemaOrgLabel("originatesFrom")
	@SchemaOrgComment(""
			+ "The vasculature the lymphatic structure originates, or afferents, from.")
	@CamelizedName("originatesFrom")
	@ConstantizedName("ORIGINATES_FROM")
	public interface OriginatesFrom extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/outcome")
	@SchemaOrgLabel("outcome")
	@SchemaOrgComment(""
			+ "Expected or actual outcomes of the study.")
	@CamelizedName("outcome")
	@ConstantizedName("OUTCOME")
	public interface Outcome extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/overdosage")
	@SchemaOrgLabel("overdosage")
	@SchemaOrgComment(""
			+ "Any information related to overdose on a drug, including signs or symptoms,"
			+ " treatments, contact information for emergency response.")
	@CamelizedName("overdosage")
	@ConstantizedName("OVERDOSAGE")
	public interface Overdosage extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/overview")
	@SchemaOrgLabel("overview")
	@SchemaOrgComment(""
			+ "Descriptive information establishing the overarching theory/philosophy of the"
			+ " plan. May include the rationale for the name, the population where the plan"
			+ " first came to prominence, etc.")
	@CamelizedName("overview")
	@ConstantizedName("OVERVIEW")
	public interface Overview extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfSystem")
	@SchemaOrgLabel("partOfSystem")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that this structure is part of.")
	@CamelizedName("partOfSystem")
	@ConstantizedName("PART_OF_SYSTEM")
	public interface PartOfSystem extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pathophysiology")
	@SchemaOrgLabel("pathophysiology")
	@SchemaOrgComment(""
			+ "Changes in the normal mechanical, physical, and biochemical functions that are"
			+ " associated with this activity or condition.")
	@CamelizedName("pathophysiology")
	@ConstantizedName("PATHOPHYSIOLOGY")
	public interface Pathophysiology extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/phase")
	@SchemaOrgLabel("phase")
	@SchemaOrgComment("The phase of the clinical trial.")
	@CamelizedName("phase")
	@ConstantizedName("PHASE")
	public interface Phase extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/physiologicalBenefits")
	@SchemaOrgLabel("physiologicalBenefits")
	@SchemaOrgComment(""
			+ "Specific physiologic benefits associated to the plan.")
	@CamelizedName("physiologicalBenefits")
	@ConstantizedName("PHYSIOLOGICAL_BENEFITS")
	public interface PhysiologicalBenefits extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/population")
	@SchemaOrgLabel("population")
	@SchemaOrgComment(""
			+ "Any characteristics of the population used in the study, e.g. 'males under 65'.")
	@CamelizedName("population")
	@ConstantizedName("POPULATION")
	public interface Population extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/possibleComplication")
	@SchemaOrgLabel("possibleComplication")
	@SchemaOrgComment(""
			+ "A possible unexpected and unfavorable evolution of a medical condition."
			+ " Complications may include worsening of the signs or symptoms of the disease,"
			+ " extension of the condition to other organ systems, etc.")
	@CamelizedName("possibleComplication")
	@ConstantizedName("POSSIBLE_COMPLICATION")
	public interface PossibleComplication extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/possibleTreatment")
	@SchemaOrgLabel("possibleTreatment")
	@SchemaOrgComment(""
			+ "A possible treatment to address this condition, sign or symptom.")
	@CamelizedName("possibleTreatment")
	@ConstantizedName("POSSIBLE_TREATMENT")
	public interface PossibleTreatment extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/postOp")
	@SchemaOrgLabel("postOp")
	@SchemaOrgComment(""
			+ "A description of the postoperative procedures, care, and/or followups for this"
			+ " device.")
	@CamelizedName("postOp")
	@ConstantizedName("POST_OP")
	public interface PostOp extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/preOp")
	@SchemaOrgLabel("preOp")
	@SchemaOrgComment(""
			+ "A description of the workup, testing, and other preparations required before"
			+ " implanting this device.")
	@CamelizedName("preOp")
	@ConstantizedName("PRE_OP")
	public interface PreOp extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pregnancyCategory")
	@SchemaOrgLabel("pregnancyCategory")
	@SchemaOrgComment("Pregnancy category of this drug.")
	@CamelizedName("pregnancyCategory")
	@ConstantizedName("PREGNANCY_CATEGORY")
	public interface PregnancyCategory extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public Clazz.DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(Clazz.DrugPregnancyCategory drugPregnancyCategory);
		public List<Clazz.DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<Clazz.DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pregnancyWarning")
	@SchemaOrgLabel("pregnancyWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to this drug's use"
			+ " during pregnancy.")
	@CamelizedName("pregnancyWarning")
	@ConstantizedName("PREGNANCY_WARNING")
	public interface PregnancyWarning extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/preparation")
	@SchemaOrgLabel("preparation")
	@SchemaOrgComment(""
			+ "Typical preparation that a patient must undergo before having the procedure"
			+ " performed.")
	@CamelizedName("preparation")
	@ConstantizedName("PREPARATION")
	public interface Preparation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/prescribingInfo")
	@SchemaOrgLabel("prescribingInfo")
	@SchemaOrgComment(""
			+ "Link to prescribing information for the drug.")
	@CamelizedName("prescribingInfo")
	@ConstantizedName("PRESCRIBING_INFO")
	public interface PrescribingInfo extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/prescriptionStatus")
	@SchemaOrgLabel("prescriptionStatus")
	@SchemaOrgComment(""
			+ "Indicates the status of drug prescription eg. local catalogs classifications or"
			+ " whether the drug is available by prescription or over-the-counter, etc.")
	@CamelizedName("prescriptionStatus")
	@ConstantizedName("PRESCRIPTION_STATUS")
	public interface PrescriptionStatus extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public Clazz.DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(Clazz.DrugPrescriptionStatus drugPrescriptionStatus);
		public List<Clazz.DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<Clazz.DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/primaryPrevention")
	@SchemaOrgLabel("primaryPrevention")
	@SchemaOrgComment(""
			+ "A preventative therapy used to prevent an initial occurrence of the medical"
			+ " condition, such as vaccination.")
	@CamelizedName("primaryPrevention")
	@ConstantizedName("PRIMARY_PREVENTION")
	public interface PrimaryPrevention extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/procedure")
	@SchemaOrgLabel("procedure")
	@SchemaOrgComment(""
			+ "A description of the procedure involved in setting up, using, and/or installing"
			+ " the device.")
	@CamelizedName("procedure")
	@ConstantizedName("PROCEDURE")
	public interface Procedure extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/procedureType")
	@SchemaOrgLabel("procedureType")
	@SchemaOrgComment(""
			+ "The type of procedure, for example Surgical, Noninvasive, or Percutaneous.")
	@CamelizedName("procedureType")
	@ConstantizedName("PROCEDURE_TYPE")
	public interface ProcedureType extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public Clazz.MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(Clazz.MedicalProcedureType medicalProcedureType);
		public List<Clazz.MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<Clazz.MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/proprietaryName")
	@SchemaOrgLabel("proprietaryName")
	@SchemaOrgComment(""
			+ "Proprietary name given to the diet plan, typically by its originator or creator.")
	@CamelizedName("proprietaryName")
	@ConstantizedName("PROPRIETARY_NAME")
	public interface ProprietaryName extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publicationType")
	@SchemaOrgLabel("publicationType")
	@SchemaOrgComment(""
			+ "The type of the medical article, taken from the US NLM MeSH publication type"
			+ " catalog. See also <a href=\"http://www.nlm.nih.gov/mesh/pubtypes.html\">MeSH"
			+ " documentation</a>.")
	@CamelizedName("publicationType")
	@ConstantizedName("PUBLICATION_TYPE")
	public interface PublicationType extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/purpose")
	@SchemaOrgLabel("purpose")
	@SchemaOrgComment(""
			+ "A goal towards an action is taken. Can be concrete or abstract.")
	@CamelizedName("purpose")
	@ConstantizedName("PURPOSE")
	public interface Purpose extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalDevicePurpose">http://schema.org/MedicalDevicePurpose</a>
		 */
		public Clazz.MedicalDevicePurpose getMedicalDevicePurpose();
		public void setMedicalDevicePurpose(Clazz.MedicalDevicePurpose medicalDevicePurpose);
		public List<Clazz.MedicalDevicePurpose> getMedicalDevicePurposeList();
		public void setMedicalDevicePurposeList(List<Clazz.MedicalDevicePurpose> medicalDevicePurposeList);
		public boolean hasMedicalDevicePurpose();

		/**
		 * @see <a href="http://schema.org/Thing">http://schema.org/Thing</a>
		 */
		public Thing getThing();
		public void setThing(Thing thing);
		public List<Thing> getThingList();
		public void setThingList(List<Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recognizingAuthority")
	@SchemaOrgLabel("recognizingAuthority")
	@SchemaOrgComment(""
			+ "If applicable, the organization that officially recognizes this entity as part"
			+ " of its endorsed system of medicine.")
	@CamelizedName("recognizingAuthority")
	@ConstantizedName("RECOGNIZING_AUTHORITY")
	public interface RecognizingAuthority extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recommendationStrength")
	@SchemaOrgLabel("recommendationStrength")
	@SchemaOrgComment(""
			+ "Strength of the guideline's recommendation (e.g. 'class I').")
	@CamelizedName("recommendationStrength")
	@ConstantizedName("RECOMMENDATION_STRENGTH")
	public interface RecommendationStrength extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recommendedIntake")
	@SchemaOrgLabel("recommendedIntake")
	@SchemaOrgComment(""
			+ "Recommended intake of this supplement for a given population as defined by a"
			+ " specific recommending authority.")
	@CamelizedName("recommendedIntake")
	@ConstantizedName("RECOMMENDED_INTAKE")
	public interface RecommendedIntake extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/regionDrained")
	@SchemaOrgLabel("regionDrained")
	@SchemaOrgComment(""
			+ "The anatomical or organ system drained by this vessel; generally refers to a"
			+ " specific part of an organ.")
	@CamelizedName("regionDrained")
	@ConstantizedName("REGION_DRAINED")
	public interface RegionDrained extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedAnatomy")
	@SchemaOrgLabel("relatedAnatomy")
	@SchemaOrgComment(""
			+ "Anatomical systems or structures that relate to the superficial anatomy.")
	@CamelizedName("relatedAnatomy")
	@ConstantizedName("RELATED_ANATOMY")
	public interface RelatedAnatomy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedCondition")
	@SchemaOrgLabel("relatedCondition")
	@SchemaOrgComment(""
			+ "A medical condition associated with this anatomy.")
	@CamelizedName("relatedCondition")
	@ConstantizedName("RELATED_CONDITION")
	public interface RelatedCondition extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedDrug")
	@SchemaOrgLabel("relatedDrug")
	@SchemaOrgComment(""
			+ "Any other drug related to this one, for example commonly-prescribed"
			+ " alternatives.")
	@CamelizedName("relatedDrug")
	@ConstantizedName("RELATED_DRUG")
	public interface RelatedDrug extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedStructure")
	@SchemaOrgLabel("relatedStructure")
	@SchemaOrgComment(""
			+ "Related anatomical structure(s) that are not part of the system but relate or"
			+ " connect to it, such as vascular bundles associated with an organ system.")
	@CamelizedName("relatedStructure")
	@ConstantizedName("RELATED_STRUCTURE")
	public interface RelatedStructure extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedTherapy")
	@SchemaOrgLabel("relatedTherapy")
	@SchemaOrgComment(""
			+ "A medical therapy related to this anatomy.")
	@CamelizedName("relatedTherapy")
	@ConstantizedName("RELATED_THERAPY")
	public interface RelatedTherapy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relevantSpecialty")
	@SchemaOrgLabel("relevantSpecialty")
	@SchemaOrgComment(""
			+ "If applicable, a medical specialty in which this entity is relevant.")
	@CamelizedName("relevantSpecialty")
	@ConstantizedName("RELEVANT_SPECIALTY")
	public interface RelevantSpecialty extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/repetitions")
	@SchemaOrgLabel("repetitions")
	@SchemaOrgComment(""
			+ "Number of times one should repeat the activity.")
	@CamelizedName("repetitions")
	@ConstantizedName("REPETITIONS")
	public interface Repetitions extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/restPeriods")
	@SchemaOrgLabel("restPeriods")
	@SchemaOrgComment(""
			+ "How often one should break from the activity.")
	@CamelizedName("restPeriods")
	@ConstantizedName("REST_PERIODS")
	public interface RestPeriods extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/riskFactor")
	@SchemaOrgLabel("riskFactor")
	@SchemaOrgComment(""
			+ "A modifiable or non-modifiable factor that increases the risk of a patient"
			+ " contracting this condition, e.g. age,  coexisting condition.")
	@CamelizedName("riskFactor")
	@ConstantizedName("RISK_FACTOR")
	public interface RiskFactor extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/risks")
	@SchemaOrgLabel("risks")
	@SchemaOrgComment(""
			+ "Specific physiologic risks associated to the diet plan.")
	@CamelizedName("risks")
	@ConstantizedName("RISKS")
	public interface Risks extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/runsTo")
	@SchemaOrgLabel("runsTo")
	@SchemaOrgComment(""
			+ "The vasculature the lymphatic structure runs, or efferents, to.")
	@CamelizedName("runsTo")
	@ConstantizedName("RUNS_TO")
	public interface RunsTo extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/safetyConsideration")
	@SchemaOrgLabel("safetyConsideration")
	@SchemaOrgComment(""
			+ "Any potential safety concern associated with the supplement. May include"
			+ " interactions with other drugs and foods, pregnancy, breastfeeding, known"
			+ " adverse reactions, and documented efficacy of the supplement.")
	@CamelizedName("safetyConsideration")
	@ConstantizedName("SAFETY_CONSIDERATION")
	public interface SafetyConsideration extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/secondaryPrevention")
	@SchemaOrgLabel("secondaryPrevention")
	@SchemaOrgComment(""
			+ "A preventative therapy used to prevent reoccurrence of the medical condition"
			+ " after an initial episode of the condition.")
	@CamelizedName("secondaryPrevention")
	@ConstantizedName("SECONDARY_PREVENTION")
	public interface SecondaryPrevention extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sensoryUnit")
	@SchemaOrgLabel("sensoryUnit")
	@SchemaOrgComment(""
			+ "The neurological pathway extension that inputs and sends information to the"
			+ " brain or spinal cord.")
	@CamelizedName("sensoryUnit")
	@ConstantizedName("SENSORY_UNIT")
	public interface SensoryUnit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seriousAdverseOutcome")
	@SchemaOrgLabel("seriousAdverseOutcome")
	@SchemaOrgComment(""
			+ "A possible serious complication and/or serious side effect of this therapy."
			+ " Serious adverse outcomes include those that are life-threatening; result in"
			+ " death, disability, or permanent damage; require hospitalization or prolong"
			+ " existing hospitalization; cause congenital anomalies or birth defects; or"
			+ " jeopardize the patient and may require medical or surgical intervention to"
			+ " prevent one of the outcomes in this definition.")
	@CamelizedName("seriousAdverseOutcome")
	@ConstantizedName("SERIOUS_ADVERSE_OUTCOME")
	public interface SeriousAdverseOutcome extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/signDetected")
	@SchemaOrgLabel("signDetected")
	@SchemaOrgComment("A sign detected by the test.")
	@CamelizedName("signDetected")
	@ConstantizedName("SIGN_DETECTED")
	public interface SignDetected extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/signOrSymptom")
	@SchemaOrgLabel("signOrSymptom")
	@SchemaOrgComment(""
			+ "A sign or symptom of this condition. Signs are objective or physically"
			+ " observable manifestations of the medical condition while symptoms are the"
			+ " subjective experience of the medical condition.")
	@CamelizedName("signOrSymptom")
	@ConstantizedName("SIGN_OR_SYMPTOM")
	public interface SignOrSymptom extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/significance")
	@SchemaOrgLabel("significance")
	@SchemaOrgComment(""
			+ "The significance associated with the superficial anatomy; as an example, how"
			+ " characteristics of the superficial anatomy can suggest underlying medical"
			+ " conditions or courses of treatment.")
	@CamelizedName("significance")
	@ConstantizedName("SIGNIFICANCE")
	public interface Significance extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/source")
	@SchemaOrgLabel("source")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that the artery originates from.")
	@CamelizedName("source")
	@ConstantizedName("SOURCE")
	public interface Source extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sourcedFrom")
	@SchemaOrgLabel("sourcedFrom")
	@SchemaOrgComment(""
			+ "The neurological pathway that originates the neurons.")
	@CamelizedName("sourcedFrom")
	@ConstantizedName("SOURCED_FROM")
	public interface SourcedFrom extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/stage")
	@SchemaOrgLabel("stage")
	@SchemaOrgComment(""
			+ "The stage of the condition, if applicable.")
	@CamelizedName("stage")
	@ConstantizedName("STAGE")
	public interface Stage extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/stageAsNumber")
	@SchemaOrgLabel("stageAsNumber")
	@SchemaOrgComment(""
			+ "The stage represented as a number, e.g. 3.")
	@CamelizedName("stageAsNumber")
	@ConstantizedName("STAGE_AS_NUMBER")
	public interface StageAsNumber extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/status")
	@SchemaOrgLabel("status")
	@SchemaOrgComment("The status of the study (enumerated).")
	@CamelizedName("status")
	@ConstantizedName("STATUS")
	public interface Status extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/EventStatusType">http://schema.org/EventStatusType</a>
		 */
		public EventStatusType getEventStatusType();
		public void setEventStatusType(EventStatusType eventStatusType);
		public List<EventStatusType> getEventStatusTypeList();
		public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList);
		public boolean hasEventStatusType();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public Clazz.MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(Clazz.MedicalStudyStatus medicalStudyStatus);
		public List<Clazz.MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<Clazz.MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/strengthUnit")
	@SchemaOrgLabel("strengthUnit")
	@SchemaOrgComment(""
			+ "The units of an active ingredient's strength, e.g. mg.")
	@CamelizedName("strengthUnit")
	@ConstantizedName("STRENGTH_UNIT")
	public interface StrengthUnit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/strengthValue")
	@SchemaOrgLabel("strengthValue")
	@SchemaOrgComment(""
			+ "The value of an active ingredient's strength, e.g. 325.")
	@CamelizedName("strengthValue")
	@ConstantizedName("STRENGTH_VALUE")
	public interface StrengthValue extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/structuralClass")
	@SchemaOrgLabel("structuralClass")
	@SchemaOrgComment(""
			+ "The name given to how bone physically connects to each other.")
	@CamelizedName("structuralClass")
	@ConstantizedName("STRUCTURAL_CLASS")
	public interface StructuralClass extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/study")
	@SchemaOrgLabel("study")
	@SchemaOrgComment(""
			+ "A medical study or trial related to this entity.")
	@CamelizedName("study")
	@ConstantizedName("STUDY")
	public interface Study extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studyDesign")
	@SchemaOrgLabel("studyDesign")
	@SchemaOrgComment(""
			+ "Specifics about the observational study design (enumerated).")
	@CamelizedName("studyDesign")
	@ConstantizedName("STUDY_DESIGN")
	public interface StudyDesign extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public Clazz.MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(Clazz.MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<Clazz.MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<Clazz.MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studyLocation")
	@SchemaOrgLabel("studyLocation")
	@SchemaOrgComment(""
			+ "The location in which the study is taking/took place.")
	@CamelizedName("studyLocation")
	@ConstantizedName("STUDY_LOCATION")
	public interface StudyLocation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studySubject")
	@SchemaOrgLabel("studySubject")
	@SchemaOrgComment(""
			+ "A subject of the study, i.e. one of the medical conditions, therapies, devices,"
			+ " drugs, etc. investigated by the study.")
	@CamelizedName("studySubject")
	@ConstantizedName("STUDY_SUBJECT")
	public interface StudySubject extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subStageSuffix")
	@SchemaOrgLabel("subStageSuffix")
	@SchemaOrgComment("The substage, e.g. 'a' for Stage IIIa.")
	@CamelizedName("subStageSuffix")
	@ConstantizedName("SUB_STAGE_SUFFIX")
	public interface SubStageSuffix extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subStructure")
	@SchemaOrgLabel("subStructure")
	@SchemaOrgComment(""
			+ "Component (sub-)structure(s) that comprise this anatomical structure.")
	@CamelizedName("subStructure")
	@ConstantizedName("SUB_STRUCTURE")
	public interface SubStructure extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subTest")
	@SchemaOrgLabel("subTest")
	@SchemaOrgComment("A component test of the panel.")
	@CamelizedName("subTest")
	@ConstantizedName("SUB_TEST")
	public interface SubTest extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subtype")
	@SchemaOrgLabel("subtype")
	@SchemaOrgComment(""
			+ "A more specific type of the condition, where applicable, for example 'Type 1"
			+ " Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.")
	@CamelizedName("subtype")
	@ConstantizedName("SUBTYPE")
	public interface Subtype extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/supplyTo")
	@SchemaOrgLabel("supplyTo")
	@SchemaOrgComment(""
			+ "The area to which the artery supplies blood.")
	@CamelizedName("supplyTo")
	@ConstantizedName("SUPPLY_TO")
	public interface SupplyTo extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetPopulation")
	@SchemaOrgLabel("targetPopulation")
	@SchemaOrgComment(""
			+ "Characteristics of the population for which this is intended, or which typically"
			+ " uses it, e.g. 'adults'.")
	@CamelizedName("targetPopulation")
	@ConstantizedName("TARGET_POPULATION")
	public interface TargetPopulation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tissueSample")
	@SchemaOrgLabel("tissueSample")
	@SchemaOrgComment(""
			+ "The type of tissue sample required for the test.")
	@CamelizedName("tissueSample")
	@ConstantizedName("TISSUE_SAMPLE")
	public interface TissueSample extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/transmissionMethod")
	@SchemaOrgLabel("transmissionMethod")
	@SchemaOrgComment(""
			+ "How the disease spreads, either as a route or vector, for example 'direct"
			+ " contact', 'Aedes aegypti', etc.")
	@CamelizedName("transmissionMethod")
	@ConstantizedName("TRANSMISSION_METHOD")
	public interface TransmissionMethod extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trialDesign")
	@SchemaOrgLabel("trialDesign")
	@SchemaOrgComment(""
			+ "Specifics about the trial design (enumerated).")
	@CamelizedName("trialDesign")
	@ConstantizedName("TRIAL_DESIGN")
	public interface TrialDesign extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public Clazz.MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(Clazz.MedicalTrialDesign medicalTrialDesign);
		public List<Clazz.MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<Clazz.MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tributary")
	@SchemaOrgLabel("tributary")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that the vein flows into; a larger structure that"
			+ " the vein connects to.")
	@CamelizedName("tributary")
	@ConstantizedName("TRIBUTARY")
	public interface Tributary extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/typicalTest")
	@SchemaOrgLabel("typicalTest")
	@SchemaOrgComment(""
			+ "A medical test typically performed given this condition.")
	@CamelizedName("typicalTest")
	@ConstantizedName("TYPICAL_TEST")
	public interface TypicalTest extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/usedToDiagnose")
	@SchemaOrgLabel("usedToDiagnose")
	@SchemaOrgComment(""
			+ "A condition the test is used to diagnose.")
	@CamelizedName("usedToDiagnose")
	@ConstantizedName("USED_TO_DIAGNOSE")
	public interface UsedToDiagnose extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/usesDevice")
	@SchemaOrgLabel("usesDevice")
	@SchemaOrgComment("Device used to perform the test.")
	@CamelizedName("usesDevice")
	@ConstantizedName("USES_DEVICE")
	public interface UsesDevice extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/warning")
	@SchemaOrgLabel("warning")
	@SchemaOrgComment(""
			+ "Any FDA or other warnings about the drug (text or URL).")
	@CamelizedName("warning")
	@ConstantizedName("WARNING")
	public interface Warning extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workload")
	@SchemaOrgLabel("workload")
	@SchemaOrgComment(""
			+ "Quantitative measure of the physiologic output of the exercise; also referred to"
			+ " as energy expenditure.")
	@CamelizedName("workload")
	@ConstantizedName("WORKLOAD")
	public interface Workload extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Energy">http://schema.org/Energy</a>
		 */
		public Energy getEnergy();
		public void setEnergy(Energy energy);
		public List<Energy> getEnergyList();
		public void setEnergyList(List<Energy> energyList);
		public boolean hasEnergy();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

}
