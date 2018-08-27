CREATE TABLE scm_medical_guideline_recommendation(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

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
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$EvidenceLevel
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalEvidenceLevel
  */
 evidence_level VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$EvidenceOrigin
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 evidence_origin VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Guideline
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalGuideline
  */
 guideline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$GuidelineDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 guideline_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$GuidelineSubject
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalEntity
  */
 guideline_subject VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RecommendationStrength
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 recommendation_strength VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

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