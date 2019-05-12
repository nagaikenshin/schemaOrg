package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalObservationalStudyDesign")
@CamelizedName("medicalObservationalStudyDesign")
@ConstantizedName("MEDICAL_OBSERVATIONAL_STUDY_DESIGN")
public interface MedicalObservationalStudyDesign extends Clazz.MedicalObservationalStudyDesign {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CaseSeries")
	@SchemaOrgLabel("CaseSeries")
	@SchemaOrgComment(""
			+ "A case series (also known as a clinical series) is a medical research study that"
			+ " tracks patients with a known exposure given similar treatment or examines their"
			+ " medical records for exposure and outcome. A case series can be retrospective or"
			+ " prospective and usually involves a smaller number of patients than the more"
			+ " powerful case-control studies or randomized controlled trials. Case series may"
			+ " be consecutive or non-consecutive, depending on whether all cases presenting to"
			+ " the reporting authors over a period of time were included, or only a selection.")
	@CamelizedName("caseSeries")
	@ConstantizedName("CASE_SERIES")
	@SampleValue("1")
	public interface CaseSeries extends MedicalObservationalStudyDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CohortStudy")
	@SchemaOrgLabel("CohortStudy")
	@SchemaOrgComment(""
			+ "Also known as a panel study. A cohort study is a form of longitudinal study used"
			+ " in medicine and social science. It is one type of study design and should be"
			+ " compared with a cross-sectional study.  A cohort is a group of people who share"
			+ " a common characteristic or experience within a defined period (e.g., are born,"
			+ " leave school, lose their job, are exposed to a drug or a vaccine, etc.). The"
			+ " comparison group may be the general population from which the cohort is drawn,"
			+ " or it may be another cohort of persons thought to have had little or no"
			+ " exposure to the substance under investigation, but otherwise similar."
			+ " Alternatively, subgroups within the cohort may be compared with each other.")
	@CamelizedName("cohortStudy")
	@ConstantizedName("COHORT_STUDY")
	@SampleValue("2")
	public interface CohortStudy extends MedicalObservationalStudyDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CrossSectional")
	@SchemaOrgLabel("CrossSectional")
	@SchemaOrgComment(""
			+ "Studies carried out on pre-existing data (usually from 'snapshot' surveys), such"
			+ " as that collected by the Census Bureau. Sometimes called Prevalence Studies.")
	@CamelizedName("crossSectional")
	@ConstantizedName("CROSS_SECTIONAL")
	@SampleValue("3")
	public interface CrossSectional extends MedicalObservationalStudyDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Longitudinal")
	@SchemaOrgLabel("Longitudinal")
	@SchemaOrgComment(""
			+ "Unlike cross-sectional studies, longitudinal studies track the same people, and"
			+ " therefore the differences observed in those people are less likely to be the"
			+ " result of cultural differences across generations. Longitudinal studies are"
			+ " also used in medicine to uncover predictors of certain diseases.")
	@CamelizedName("longitudinal")
	@ConstantizedName("LONGITUDINAL")
	@SampleValue("4")
	public interface Longitudinal extends MedicalObservationalStudyDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Observational")
	@SchemaOrgLabel("Observational")
	@SchemaOrgComment("An observational study design.")
	@CamelizedName("observational")
	@ConstantizedName("OBSERVATIONAL")
	@SampleValue("5")
	public interface Observational extends MedicalObservationalStudyDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Registry")
	@SchemaOrgLabel("Registry")
	@SchemaOrgComment("A registry-based study design.")
	@CamelizedName("registry")
	@ConstantizedName("REGISTRY")
	@SampleValue("6")
	public interface Registry extends MedicalObservationalStudyDesign {

	}

}
