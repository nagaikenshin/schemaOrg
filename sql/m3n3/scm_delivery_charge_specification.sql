CREATE TABLE scm_delivery_charge_specification(
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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AppliesToDeliveryMethod
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$DeliveryMethod
  */
 applies_to_delivery_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AreaServed
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 area_served VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EligibleQuantity
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 eligible_quantity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EligibleRegion
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 eligible_region VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EligibleTransactionVolume
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PriceSpecification
  */
 eligible_transaction_volume VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IneligibleRegion
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 ineligible_region VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MaxPrice
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 max_price VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MinPrice
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 min_price VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Price
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 price VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PriceCurrency
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 price_currency VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ValidFrom
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 valid_from VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ValidThrough
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 valid_through VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ValueAddedTaxIncluded
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 value_added_tax_included VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);