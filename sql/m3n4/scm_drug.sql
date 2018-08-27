CREATE TABLE scm_drug(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$ActiveIngredient
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 active_ingredient VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$AdministrationRoute
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 administration_route VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$AlcoholWarning
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alcohol_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$AvailableStrength
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugStrength
  */
 available_strength VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$BreastfeedingWarning
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 breastfeeding_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$ClinicalPharmacology
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 clinical_pharmacology VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Code
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalCode
  */
 code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Cost
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugCost
  */
 cost VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Description
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$DosageForm
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 dosage_form VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$DoseSchedule
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DoseSchedule
  */
 dose_schedule VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$DrugClass
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugClass
  */
 drug_class VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$DrugUnit
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 drug_unit VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$FoodWarning
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 food_warning VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$IncludedInHealthInsurancePlan
  * param: org.kyojo.schemaorg.m3n4.pending.Clazz$HealthInsurancePlan
  */
 included_in_health_insurance_plan VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$InteractingDrug
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Drug
  */
 interacting_drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$IsAvailableGenerically
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Boolean
  */
 is_available_generically VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$IsProprietary
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Boolean
  */
 is_proprietary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$LabelDetails
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 label_details VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Manufacturer
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 manufacturer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$MaximumIntake
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MaximumDoseSchedule
  */
 maximum_intake VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$MechanismOfAction
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 mechanism_of_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$MedicineSystem
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicineSystem
  */
 medicine_system VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$NonProprietaryName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 non_proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Overdosage
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 overdosage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$PregnancyCategory
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugPregnancyCategory
  */
 pregnancy_category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$PregnancyWarning
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 pregnancy_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$PrescribingInfo
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 prescribing_info VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$PrescriptionStatus
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$DrugPrescriptionStatus
  */
 prescription_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$ProprietaryName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RelatedDrug
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Drug
  */
 related_drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$Rxcui
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 rxcui VARCHAR(100) NULL,

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

 /**
  * type:  org.kyojo.schemaorg.m3n4.healthLifesci.Container$Warning
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 warning VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);