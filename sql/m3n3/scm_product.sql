CREATE TABLE scm_product(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalProperty
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  */
 additional_property VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Audience
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Category
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$PhysicalActivityCategory
  */
 category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Color
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 color VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Depth
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 depth VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Height
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 height VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IsAccessoryOrSparePartFor
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  */
 is_accessory_or_spare_part_for VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$IsConsumableFor
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  */
 is_consumable_for VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ItemCondition
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$OfferItemCondition
  */
 item_condition VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Manufacturer
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  */
 manufacturer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Material
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 material VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Model
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ProductModel
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 model VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ProductID
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 product_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ProductionDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 production_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PurchaseDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 purchase_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ReleaseDate
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Date
  */
 release_date VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Weight
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 weight VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Width
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 width VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);