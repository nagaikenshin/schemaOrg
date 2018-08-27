CREATE TABLE scm_invoice(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccountId
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 account_id VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$BillingPeriod
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Duration
  */
 billing_period VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Broker
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 broker VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$Category
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$PhysicalActivityCategory
  */
 category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ConfirmationNumber
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 confirmation_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Customer
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 customer VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MinimumPaymentDue
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PriceSpecification
  */
 minimum_payment_due VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PaymentDueDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 payment_due_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PaymentMethod
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PaymentMethod
  */
 payment_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PaymentMethodId
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 payment_method_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PaymentStatus
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PaymentStatusType
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 payment_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Provider
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReferencesOrder
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Order
  */
 references_order VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ScheduledPaymentDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 scheduled_payment_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$TotalPaymentDue
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$MonetaryAmount
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PriceSpecification
  */
 total_payment_due VARCHAR(100) NULL,

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