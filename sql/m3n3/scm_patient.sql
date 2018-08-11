CREATE TABLE scm_patient(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 additional_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Address
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 address VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Affiliation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$ProgramMembership
  */
 affiliation VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlumniOf
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$EducationalOrganization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 alumni_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AudienceType
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 audience_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Award
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 award VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$BirthDate
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 birth_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$BirthPlace
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 birth_place VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Brand
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Brand
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 brand VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Children
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 children VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Colleague
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 colleague VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ContactPoint
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ContactPoint
  */
 contact_point VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DeathDate
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 death_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DeathPlace
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 death_place VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Description
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Diagnosis
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalCondition
  */
 diagnosis VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$Drug
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$Drug
  */
 drug VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Duns
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 duns VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Email
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 email VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FamilyName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 family_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FamilyNameRuby
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 family_name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FaxNumber
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 fax_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Follows
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 follows VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Funder
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 funder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Gender
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$GenderType
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 gender VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$GeographicArea
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AdministrativeArea
  */
 geographic_area VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$GivenName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 given_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$GivenNameRuby
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 given_name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$GlobalLocationNumber
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 global_location_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HasOfferCatalog
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$OfferCatalog
  */
 has_offer_catalog VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HasPOS
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 has_pos VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.healthLifesci.Container$HealthCondition
  * param: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$MedicalCondition
  */
 health_condition VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Height
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Distance
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 height VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HomeLocation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ContactPoint
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 home_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HonorificPrefix
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 honorific_prefix VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HonorificSuffix
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 honorific_suffix VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsicV4
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 isic_v4 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$JobTitle
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 job_title VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Knows
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 knows VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MakesOffer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Offer
  */
 makes_offer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MemberOf
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$ProgramMembership
  */
 member_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Naics
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 naics VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Nationality
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Country
  */
 nationality VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$NetWorth
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PriceSpecification
  */
 net_worth VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Owns
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$OwnershipInfo
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Product
  */
 owns VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Parent
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 parent VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PerformerIn
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Event
  */
 performer_in VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PublishingPrinciples
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 publishing_principles VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RelatedTo
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 related_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RequiredGender
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 required_gender VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RequiredMaxAge
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 required_max_age VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RequiredMinAge
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 required_min_age VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Seeks
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Demand
  */
 seeks VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Sibling
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 sibling VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Sponsor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 sponsor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Spouse
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 spouse VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SuggestedGender
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 suggested_gender VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SuggestedMaxAge
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 suggested_max_age VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SuggestedMinAge
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 suggested_min_age VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.meta.Container$SupersededBy
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Enumeration
  *        org.kyojo.schemaOrg.m3n3.meta.Clazz$Class
  *        org.kyojo.schemaOrg.m3n3.meta.Clazz$Property
  */
 superseded_by VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$TaxID
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 tax_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Telephone
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 telephone VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$VatID
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 vat_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Weight
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 weight VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorkLocation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ContactPoint
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 work_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorksFor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 works_for VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);