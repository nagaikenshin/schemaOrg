CREATE TABLE scm_muscle(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Action
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Antagonist
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Muscle
  */
 antagonist VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$AssociatedPathophysiology
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 associated_pathophysiology VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$BloodSupply
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Vessel
  */
 blood_supply VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$BodyLocation
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 body_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Code
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalCode
  */
 code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$ConnectedTo
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$AnatomicalStructure
  */
 connected_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Description
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Diagram
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  */
 diagram VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Function
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 function VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Guideline
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalGuideline
  */
 guideline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Identifier
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 identifier VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Image
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 image VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Insertion
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$AnatomicalStructure
  */
 insertion VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$LegalStatus
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugLegalStatus
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalEnumeration
  */
 legal_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$MedicineSystem
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicineSystem
  */
 medicine_system VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$MuscleAction
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 muscle_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Name
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NameFuzzy
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name_fuzzy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NameRuby
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Nerve
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Nerve
  */
 nerve VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Origin
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$AnatomicalStructure
  */
 origin VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$PartOfSystem
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$AnatomicalSystem
  */
 part_of_system VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RelatedCondition
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalCondition
  */
 related_condition VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RelatedTherapy
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalTherapy
  */
 related_therapy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Study
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalStudy
  */
 study VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$SubStructure
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$AnatomicalStructure
  */
 sub_structure VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Url
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
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