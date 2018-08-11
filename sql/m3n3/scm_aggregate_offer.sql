CREATE TABLE scm_aggregate_offer(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AcceptedPaymentMethod
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$LoanOrCredit
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PaymentMethod
  */
 accepted_payment_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AddOn
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Offer
  */
 add_on VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdvanceBookingRequirement
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 advance_booking_requirement VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AggregateRating
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AggregateRating
  */
 aggregate_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AreaServed
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 area_served VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Availability
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ItemAvailability
  */
 availability VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AvailabilityEnds
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 availability_ends VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AvailabilityStarts
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 availability_starts VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AvailableAtOrFrom
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AdministrativeArea
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 available_at_or_from VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AvailableDeliveryMethod
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$DeliveryMethod
  */
 available_delivery_method VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$BusinessFunction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$BusinessFunction
  */
 business_function VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Category
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  *        org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz$PhysicalActivityCategory
  */
 category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DeliveryLeadTime
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 delivery_lead_time VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EligibleCustomerType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$BusinessEntityType
  */
 eligible_customer_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EligibleDuration
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 eligible_duration VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Gtin12
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 gtin12 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Gtin13
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 gtin13 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Gtin14
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 gtin14 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Gtin8
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 gtin8 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HighPrice
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 high_price VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IncludesObject
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$TypeAndQuantityNode
  */
 includes_object VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IneligibleRegion
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 ineligible_region VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$InventoryLevel
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 inventory_level VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ItemCondition
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$OfferItemCondition
  */
 item_condition VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ItemOffered
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Service
  */
 item_offered VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$LowPrice
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 low_price VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Mpn
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 mpn VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$OfferCount
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 offer_count VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$OfferedBy
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 offered_by VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Offers
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Offer
  */
 offers VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PriceSpecification
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PriceSpecification
  */
 price_specification VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PriceValidUntil
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 price_valid_until VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Review
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Review
  */
 review VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Seller
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 seller VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SerialNumber
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 serial_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Sku
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 sku VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Warranty
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$WarrantyPromise
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