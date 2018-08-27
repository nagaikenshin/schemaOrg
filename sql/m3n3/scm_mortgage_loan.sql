CREATE TABLE scm_mortgage_loan(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Amount
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaorg.m3n3.core.DataType$Number
  */
 amount VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AnnualPercentageRate
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n3.core.DataType$Number
  */
 annual_percentage_rate VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AreaServed
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 area_served VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Audience
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AvailableChannel
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ServiceChannel
  */
 available_channel VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Broker
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 broker VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Category
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$PhysicalActivityCategory
  */
 category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Currency
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 currency VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$DomiciledMortgage
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Boolean
  */
 domiciled_mortgage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$FeesAndCommissionsSpecification
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 fees_and_commissions_specification VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$GracePeriod
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Duration
  */
 grace_period VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$HasOfferCatalog
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OfferCatalog
  */
 has_offer_catalog VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$HoursAvailable
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OpeningHoursSpecification
  */
 hours_available VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$InterestRate
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n3.core.DataType$Number
  */
 interest_rate VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IsRelatedTo
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Service
  */
 is_related_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IsSimilarTo
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Service
  */
 is_similar_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$LoanMortgageMandateAmount
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$MonetaryAmount
  */
 loan_mortgage_mandate_amount VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$LoanRepaymentForm
  * param: org.kyojo.schemaorg.m3n3.pending.Clazz$RepaymentSpecification
  */
 loan_repayment_form VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$LoanTerm
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Duration
  *        org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 loan_term VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$LoanType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 loan_type VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Offers
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Offer
  */
 offers VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Provider
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ProviderMobility
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 provider_mobility VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$RecourseLoan
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Boolean
  */
 recourse_loan VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$RenegotiableLoan
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Boolean
  */
 renegotiable_loan VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$RequiredCollateral
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 required_collateral VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ServiceOutput
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 service_output VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ServiceType
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 service_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.pending.Container$TermsOfService
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 terms_of_service VARCHAR(100) NULL,

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