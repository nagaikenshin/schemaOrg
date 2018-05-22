CREATE TABLE scm_job_posting(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$BaseSalary
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PriceSpecification
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 base_salary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DatePosted
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 date_posted VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EducationRequirements
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 education_requirements VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EmploymentType
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 employment_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$EstimatedSalary
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PriceSpecification
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 estimated_salary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ExperienceRequirements
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 experience_requirements VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HiringOrganization
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 hiring_organization VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IncentiveCompensation
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 incentive_compensation VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Industry
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 industry VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$JobBenefits
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 job_benefits VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$JobLocation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 job_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$OccupationalCategory
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 occupational_category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Qualifications
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 qualifications VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Responsibilities
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 responsibilities VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SalaryCurrency
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 salary_currency VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Skills
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 skills VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SpecialCommitments
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 special_commitments VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Title
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 title VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ValidThrough
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 valid_through VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorkHours
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 work_hours VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);