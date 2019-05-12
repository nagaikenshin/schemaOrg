package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTherapy;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalSpecialty")
@CamelizedName("medicalSpecialty")
@ConstantizedName("MEDICAL_SPECIALTY")
public interface MedicalSpecialty extends Clazz.MedicalSpecialty {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Anesthesia")
	@SchemaOrgLabel("Anesthesia")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to study of anesthetics and"
			+ " their application.")
	@CamelizedName("anesthesia")
	@ConstantizedName("ANESTHESIA")
	@SampleValue("1")
	public interface Anesthesia extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Cardiovascular")
	@SchemaOrgLabel("Cardiovascular")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of heart and vasculature.")
	@CamelizedName("cardiovascular")
	@ConstantizedName("CARDIOVASCULAR")
	@SampleValue("2")
	public interface Cardiovascular extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CommunityHealth")
	@SchemaOrgLabel("CommunityHealth")
	@SchemaOrgComment(""
			+ "A field of public health focusing on improving health characteristics of a"
			+ " defined population in relation with their geographical or environment areas")
	@CamelizedName("communityHealth")
	@ConstantizedName("COMMUNITY_HEALTH")
	@SampleValue("3")
	public interface CommunityHealth extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Dentistry")
	@SchemaOrgLabel("Dentistry")
	@SchemaOrgComment(""
			+ "A branch of medicine that is involved in the dental care.")
	@CamelizedName("dentistry")
	@ConstantizedName("DENTISTRY")
	@SampleValue("4")
	public interface Dentistry extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Dermatology")
	@SchemaOrgLabel("Dermatology")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of skin.")
	@CamelizedName("dermatology")
	@ConstantizedName("DERMATOLOGY")
	@SampleValue("5")
	public interface Dermatology extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DietNutrition")
	@SchemaOrgLabel("DietNutrition")
	@SchemaOrgComment(""
			+ "Dietetic and nutrition as a medical speciality.")
	@CamelizedName("dietNutrition")
	@ConstantizedName("DIET_NUTRITION")
	@SampleValue("6")
	public interface DietNutrition extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Emergency")
	@SchemaOrgLabel("Emergency")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that deals with the evaluation and initial"
			+ " treatment of medical conditions caused by trauma or sudden illness.")
	@CamelizedName("emergency")
	@ConstantizedName("EMERGENCY")
	@SampleValue("7")
	public interface Emergency extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Endocrine")
	@SchemaOrgLabel("Endocrine")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of endocrine glands and their secretions.")
	@CamelizedName("endocrine")
	@ConstantizedName("ENDOCRINE")
	@SampleValue("8")
	public interface Endocrine extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Gastroenterologic")
	@SchemaOrgLabel("Gastroenterologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of digestive system.")
	@CamelizedName("gastroenterologic")
	@ConstantizedName("GASTROENTEROLOGIC")
	@SampleValue("9")
	public interface Gastroenterologic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Genetic")
	@SchemaOrgLabel("Genetic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to hereditary transmission"
			+ " and the variation of inherited characteristics and disorders.")
	@CamelizedName("genetic")
	@ConstantizedName("GENETIC")
	@SampleValue("10")
	public interface Genetic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Geriatric")
	@SchemaOrgLabel("Geriatric")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with the diagnosis and"
			+ " treatment of diseases, debilities and provision of care to the aged.")
	@CamelizedName("geriatric")
	@ConstantizedName("GERIATRIC")
	@SampleValue("11")
	public interface Geriatric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Gynecologic")
	@SchemaOrgLabel("Gynecologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to the health care of women,"
			+ " particularly in the diagnosis and treatment of disorders affecting the female"
			+ " reproductive system.")
	@CamelizedName("gynecologic")
	@ConstantizedName("GYNECOLOGIC")
	@SampleValue("12")
	public interface Gynecologic extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Hematologic")
	@SchemaOrgLabel("Hematologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of blood and blood producing organs.")
	@CamelizedName("hematologic")
	@ConstantizedName("HEMATOLOGIC")
	@SampleValue("13")
	public interface Hematologic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Infectious")
	@SchemaOrgLabel("Infectious")
	@SchemaOrgComment(""
			+ "Something in medical science that pertains to infectious diseases i.e caused by"
			+ " bacterial, viral, fungal or parasitic infections.")
	@CamelizedName("infectious")
	@ConstantizedName("INFECTIOUS")
	@SampleValue("14")
	public interface Infectious extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LaboratoryScience")
	@SchemaOrgLabel("LaboratoryScience")
	@SchemaOrgComment(""
			+ "A medical science pertaining to chemical, hematological, immunologic,"
			+ " microscopic, or bacteriological diagnostic analyses or research")
	@CamelizedName("laboratoryScience")
	@ConstantizedName("LABORATORY_SCIENCE")
	@SampleValue("15")
	public interface LaboratoryScience extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Midwifery")
	@SchemaOrgLabel("Midwifery")
	@SchemaOrgComment(""
			+ "A nurse-like health profession that deals with pregnancy, childbirth, and the"
			+ " postpartum period (including care of the newborn), besides sexual and"
			+ " reproductive health of women throughout their lives.")
	@CamelizedName("midwifery")
	@ConstantizedName("MIDWIFERY")
	@SampleValue("16")
	public interface Midwifery extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Musculoskeletal")
	@SchemaOrgLabel("Musculoskeletal")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to diagnosis and treatment of"
			+ " disorders of muscles, ligaments and skeletal system.")
	@CamelizedName("musculoskeletal")
	@ConstantizedName("MUSCULOSKELETAL")
	@SampleValue("17")
	public interface Musculoskeletal extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Neurologic")
	@SchemaOrgLabel("Neurologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that studies the nerves and nervous system"
			+ " and its respective disease states.")
	@CamelizedName("neurologic")
	@ConstantizedName("NEUROLOGIC")
	@SampleValue("18")
	public interface Neurologic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Nursing")
	@SchemaOrgLabel("Nursing")
	@SchemaOrgComment(""
			+ "A health profession of a person formally educated and trained in the care of the"
			+ " sick or infirm person.")
	@CamelizedName("nursing")
	@ConstantizedName("NURSING")
	@SampleValue("19")
	public interface Nursing extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Obstetric")
	@SchemaOrgLabel("Obstetric")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that specializes in the care of women"
			+ " during the prenatal and postnatal care and with the delivery of the child.")
	@CamelizedName("obstetric")
	@ConstantizedName("OBSTETRIC")
	@SampleValue("20")
	public interface Obstetric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Oncologic")
	@SchemaOrgLabel("Oncologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that deals with benign and malignant"
			+ " tumors, including the study of their development, diagnosis, treatment and"
			+ " prevention.")
	@CamelizedName("oncologic")
	@ConstantizedName("ONCOLOGIC")
	@SampleValue("22")
	public interface Oncologic extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Optometric")
	@SchemaOrgLabel("Optometric")
	@SchemaOrgComment(""
			+ "The science or practice of testing visual acuity and prescribing corrective"
			+ " lenses.")
	@CamelizedName("optometric")
	@ConstantizedName("OPTOMETRIC")
	@SampleValue("23")
	public interface Optometric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Otolaryngologic")
	@SchemaOrgLabel("Otolaryngologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with the ear, nose and"
			+ " throat and their respective disease states.")
	@CamelizedName("otolaryngologic")
	@ConstantizedName("OTOLARYNGOLOGIC")
	@SampleValue("24")
	public interface Otolaryngologic extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Pathology")
	@SchemaOrgLabel("Pathology")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with the study of the"
			+ " cause, origin and nature of a disease state, including its consequences as a"
			+ " result of manifestation of the disease. In clinical care, the term is used to"
			+ " designate a branch of medicine using laboratory tests to diagnose and determine"
			+ " the prognostic significance of illness.")
	@CamelizedName("pathology")
	@ConstantizedName("PATHOLOGY")
	@SampleValue("25")
	public interface Pathology extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Pediatric")
	@SchemaOrgLabel("Pediatric")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that specializes in the care of infants,"
			+ " children and adolescents.")
	@CamelizedName("pediatric")
	@ConstantizedName("PEDIATRIC")
	@SampleValue("26")
	public interface Pediatric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PharmacySpecialty")
	@SchemaOrgLabel("PharmacySpecialty")
	@SchemaOrgComment(""
			+ "The practice or art and science of preparing and dispensing drugs and medicines.")
	@CamelizedName("pharmacySpecialty")
	@ConstantizedName("PHARMACY_SPECIALTY")
	@SampleValue("27")
	public interface PharmacySpecialty extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Physiotherapy")
	@SchemaOrgLabel("Physiotherapy")
	@SchemaOrgComment(""
			+ "The practice of treatment of disease, injury, or deformity by physical methods"
			+ " such as massage, heat treatment, and exercise rather than by drugs or surgery..")
	@CamelizedName("physiotherapy")
	@ConstantizedName("PHYSIOTHERAPY")
	@SampleValue("28")
	public interface Physiotherapy extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PlasticSurgery")
	@SchemaOrgLabel("PlasticSurgery")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to therapeutic or cosmetic"
			+ " repair or re-formation of missing, injured or malformed tissues or body parts"
			+ " by manual and instrumental means.")
	@CamelizedName("plasticSurgery")
	@ConstantizedName("PLASTIC_SURGERY")
	@SampleValue("29")
	public interface PlasticSurgery extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Podiatric")
	@SchemaOrgLabel("Podiatric")
	@SchemaOrgComment(""
			+ "Podiatry is the care of the human foot, especially the diagnosis and treatment"
			+ " of foot disorders.")
	@CamelizedName("podiatric")
	@ConstantizedName("PODIATRIC")
	@SampleValue("30")
	public interface Podiatric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PrimaryCare")
	@SchemaOrgLabel("PrimaryCare")
	@SchemaOrgComment(""
			+ "The medical care by a physician, or other health-care professional, who is the"
			+ " patient's first contact with the health-care system and who may recommend a"
			+ " specialist if necessary.")
	@CamelizedName("primaryCare")
	@ConstantizedName("PRIMARY_CARE")
	@SampleValue("31")
	public interface PrimaryCare extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Psychiatric")
	@SchemaOrgLabel("Psychiatric")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with the study,"
			+ " treatment, and prevention of mental illness, using both medical and"
			+ " psychological therapies.")
	@CamelizedName("psychiatric")
	@ConstantizedName("PSYCHIATRIC")
	@SampleValue("32")
	public interface Psychiatric extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicHealth")
	@SchemaOrgLabel("PublicHealth")
	@SchemaOrgComment(""
			+ "Branch of medicine that pertains to the health services to improve and protect"
			+ " community health, especially epidemiology, sanitation, immunization, and"
			+ " preventive medicine.")
	@CamelizedName("publicHealth")
	@ConstantizedName("PUBLIC_HEALTH")
	@SampleValue("33")
	public interface PublicHealth extends MedicalBusiness, MedicalSpecialty, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Pulmonary")
	@SchemaOrgLabel("Pulmonary")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to the study of the"
			+ " respiratory system and its respective disease states.")
	@CamelizedName("pulmonary")
	@ConstantizedName("PULMONARY")
	@SampleValue("34")
	public interface Pulmonary extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Radiography")
	@SchemaOrgLabel("Radiography")
	@SchemaOrgComment(""
			+ "Radiography is an imaging technique that uses electromagnetic radiation other"
			+ " than visible light, especially X-rays, to view the internal structure of a"
			+ " non-uniformly composed and opaque object such as the human body.")
	@CamelizedName("radiography")
	@ConstantizedName("RADIOGRAPHY")
	@SampleValue("35")
	public interface Radiography extends MedicalImagingTechnique, MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Renal")
	@SchemaOrgLabel("Renal")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to the study of the kidneys"
			+ " and its respective disease states.")
	@CamelizedName("renal")
	@ConstantizedName("RENAL")
	@SampleValue("36")
	public interface Renal extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RespiratoryTherapy")
	@SchemaOrgLabel("RespiratoryTherapy")
	@SchemaOrgComment(""
			+ "The therapy that is concerned with the maintenance or improvement of respiratory"
			+ " function (as in patients with pulmonary disease).")
	@CamelizedName("respiratoryTherapy")
	@ConstantizedName("RESPIRATORY_THERAPY")
	@SampleValue("37")
	public interface RespiratoryTherapy extends MedicalSpecialty, MedicalTherapy, SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Rheumatologic")
	@SchemaOrgLabel("Rheumatologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that deals with the study and treatment of"
			+ " rheumatic, autoimmune or joint diseases.")
	@CamelizedName("rheumatologic")
	@ConstantizedName("RHEUMATOLOGIC")
	@SampleValue("38")
	public interface Rheumatologic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SpeechPathology")
	@SchemaOrgLabel("SpeechPathology")
	@SchemaOrgComment(""
			+ "The scientific study and treatment of defects, disorders, and malfunctions of"
			+ " speech and voice, as stuttering, lisping, or lalling, and of language"
			+ " disturbances, as aphasia or delayed language acquisition.")
	@CamelizedName("speechPathology")
	@ConstantizedName("SPEECH_PATHOLOGY")
	@SampleValue("39")
	public interface SpeechPathology extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Surgical")
	@SchemaOrgLabel("Surgical")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that pertains to treating diseases,"
			+ " injuries and deformities by manual and instrumental means.")
	@CamelizedName("surgical")
	@ConstantizedName("SURGICAL")
	@SampleValue("40")
	public interface Surgical extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Toxicologic")
	@SchemaOrgLabel("Toxicologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with poisons, their"
			+ " nature, effects and detection and involved in the treatment of poisoning.")
	@CamelizedName("toxicologic")
	@ConstantizedName("TOXICOLOGIC")
	@SampleValue("41")
	public interface Toxicologic extends MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Urologic")
	@SchemaOrgLabel("Urologic")
	@SchemaOrgComment(""
			+ "A specific branch of medical science that is concerned with the diagnosis and"
			+ " treatment of diseases pertaining to the urinary tract and the urogenital"
			+ " system.")
	@CamelizedName("urologic")
	@ConstantizedName("UROLOGIC")
	@SampleValue("42")
	public interface Urologic extends MedicalSpecialty {

	}

}
