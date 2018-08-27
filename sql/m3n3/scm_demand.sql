CREATE TABLE scm_demand(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AcceptedPaymentMethod
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$LoanOrCredit
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PaymentMethod
  */
 accepted_payment_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdvanceBookingRequirement
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 advance_booking_requirement VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AreaServed
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 area_served VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Availability
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ItemAvailability
  */
 availability VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AvailabilityEnds
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 availability_ends VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AvailabilityStarts
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 availability_starts VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AvailableAtOrFrom
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 available_at_or_from VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AvailableDeliveryMethod
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$DeliveryMethod
  */
 available_delivery_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$BusinessFunction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$BusinessFunction
  */
 business_function VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$DeliveryLeadTime
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 delivery_lead_time VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EligibleCustomerType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$BusinessEntityType
  */
 eligible_customer_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EligibleDuration
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 eligible_duration VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EligibleQuantity
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 eligible_quantity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EligibleRegion
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 eligible_region VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EligibleTransactionVolume
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PriceSpecification
  */
 eligible_transaction_volume VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Gtin12
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 gtin12 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Gtin13
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 gtin13 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Gtin14
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 gtin14 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Gtin8
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 gtin8 VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IncludesObject
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$TypeAndQuantityNode
  */
 includes_object VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IneligibleRegion
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 ineligible_region VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$InventoryLevel
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 inventory_level VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ItemCondition
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OfferItemCondition
  */
 item_condition VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ItemOffered
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Service
  */
 item_offered VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Mpn
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 mpn VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PriceSpecification
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PriceSpecification
  */
 price_specification VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Seller
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 seller VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SerialNumber
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 serial_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Sku
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 sku VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Url
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ValidFrom
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 valid_from VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ValidThrough
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 valid_through VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Warranty
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$WarrantyPromise
  */
 warranty VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);