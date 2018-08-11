CREATE TABLE scm_drug(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$ActiveIngredient
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 active_ingredient VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$AdministrationRoute
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 administration_route VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$AlcoholWarning
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alcohol_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$AvailableStrength
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugStrength
  */
 available_strength VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$BreastfeedingWarning
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 breastfeeding_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$ClinicalPharmacology
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 clinical_pharmacology VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Code
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalCode
  */
 code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Cost
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugCost
  */
 cost VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$DosageForm
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 dosage_form VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$DoseSchedule
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DoseSchedule
  */
 dose_schedule VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$DrugClass
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugClass
  */
 drug_class VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$DrugUnit
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 drug_unit VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$FoodWarning
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 food_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Guideline
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalGuideline
  */
 guideline VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$IncludedInHealthInsurancePlan
  * param: org.kyojo.schemaOrg.m3n3.pending.Clazz$HealthInsurancePlan
  */
 included_in_health_insurance_plan VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$InteractingDrug
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$Drug
  */
 interacting_drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$IsAvailableGenerically
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_available_generically VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$IsProprietary
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_proprietary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$LabelDetails
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 label_details VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Manufacturer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 manufacturer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$MaximumIntake
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MaximumDoseSchedule
  */
 maximum_intake VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$MechanismOfAction
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 mechanism_of_action VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$NonProprietaryName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 non_proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Overdosage
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 overdosage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$PregnancyCategory
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugPregnancyCategory
  */
 pregnancy_category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$PregnancyWarning
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 pregnancy_warning VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$PrescribingInfo
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 prescribing_info VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$PrescriptionStatus
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$DrugPrescriptionStatus
  */
 prescription_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$ProprietaryName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 proprietary_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$RecognizingAuthority
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 recognizing_authority VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$RelatedDrug
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$Drug
  */
 related_drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$RelevantSpecialty
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalSpecialty
  */
 relevant_specialty VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$Rxcui
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 rxcui VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

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

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Warning
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
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