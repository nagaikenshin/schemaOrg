CREATE TABLE scm_performing_group(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$ActionableFeedbackPolicy
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 actionable_feedback_policy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Address
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 address VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AggregateRating
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AggregateRating
  */
 aggregate_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Alumni
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 alumni VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AreaServed
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 area_served VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Award
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 award VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Brand
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Brand
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 brand VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ContactPoint
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ContactPoint
  */
 contact_point VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$CorrectionsPolicy
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 corrections_policy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Department
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 department VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$DissolutionDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 dissolution_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$DiversityPolicy
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 diversity_policy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Duns
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 duns VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Email
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 email VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Employee
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 employee VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$EthicsPolicy
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 ethics_policy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Event
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Event
  */
 event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$FaxNumber
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 fax_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Founder
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 founder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$FoundingDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 founding_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$FoundingLocation
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  */
 founding_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Funder
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 funder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$GlobalLocationNumber
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 global_location_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$HasOfferCatalog
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OfferCatalog
  */
 has_offer_catalog VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$HasPOS
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  */
 has_pos VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IsicV4
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 isic_v4 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$LegalName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 legal_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$LeiCode
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 lei_code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Location
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Logo
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 logo VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MakesOffer
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Offer
  */
 makes_offer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Member
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 member VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MemberOf
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$ProgramMembership
  */
 member_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Naics
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 naics VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$NumberOfEmployees
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 number_of_employees VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Owns
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OwnershipInfo
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Product
  */
 owns VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ParentOrganization
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 parent_organization VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PublishingPrinciples
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 publishing_principles VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Review
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Review
  */
 review VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Seeks
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Demand
  */
 seeks VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Sponsor
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 sponsor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SubOrganization
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 sub_organization VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$TaxID
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 tax_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Telephone
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 telephone VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$UnnamedSourcesPolicy
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 unnamed_sources_policy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Url
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$VatID
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 vat_id VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);