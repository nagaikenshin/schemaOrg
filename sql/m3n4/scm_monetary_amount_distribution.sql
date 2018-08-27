CREATE TABLE scm_monetary_amount_distribution(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AdditionalProperty
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  */
 additional_property VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$Currency
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 currency VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MaxValue
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 max_value VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MinValue
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 min_value VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$UnitCode
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 unit_code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$UnitText
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 unit_text VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Url
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Value
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$StructuredValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Boolean
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 value VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ValueReference
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Enumeration
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QualitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$StructuredValue
  */
 value_reference VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);