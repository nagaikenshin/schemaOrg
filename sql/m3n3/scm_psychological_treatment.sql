CREATE TABLE scm_psychological_treatment(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$AdverseOutcome
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalEntity
  */
 adverse_outcome VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$BodyLocation
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 body_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Code
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalCode
  */
 code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Description
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$DoseSchedule
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DoseSchedule
  */
 dose_schedule VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Drug
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$Drug
  */
 drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Followup
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 followup VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Guideline
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalGuideline
  */
 guideline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$HowPerformed
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 how_performed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Identifier
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 identifier VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Image
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ImageObject
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 image VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Indication
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalIndication
  */
 indication VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$LegalStatus
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugLegalStatus
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalEnumeration
  */
 legal_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$MedicineSystem
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicineSystem
  */
 medicine_system VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Name
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$NameFuzzy
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 name_fuzzy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$NameRuby
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Outcome
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalEntity
  */
 outcome VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Preparation
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalEntity
  */
 preparation VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$ProcedureType
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalProcedureType
  */
 procedure_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Status
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$EventStatusType
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalStudyStatus
  */
 status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Study
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalStudy
  */
 study VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
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