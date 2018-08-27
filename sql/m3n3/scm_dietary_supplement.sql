CREATE TABLE scm_dietary_supplement(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$ActiveIngredient
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 active_ingredient VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Background
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 background VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Code
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalCode
  */
 code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Description
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Guideline
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalGuideline
  */
 guideline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Identifier
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 identifier VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Image
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 image VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$IsProprietary
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Boolean
  */
 is_proprietary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$LegalStatus
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$DrugLegalStatus
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalEnumeration
  */
 legal_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Manufacturer
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 manufacturer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$MaximumIntake
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MaximumDoseSchedule
  */
 maximum_intake VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$MechanismOfAction
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 mechanism_of_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$MedicineSystem
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicineSystem
  */
 medicine_system VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Name
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$NameFuzzy
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 name_fuzzy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$NameRuby
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$NonProprietaryName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 non_proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$ProprietaryName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RecommendedIntake
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$RecommendedDoseSchedule
  */
 recommended_intake VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$SafetyConsideration
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 safety_consideration VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Study
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalStudy
  */
 study VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$TargetPopulation
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 target_population VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Url
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);