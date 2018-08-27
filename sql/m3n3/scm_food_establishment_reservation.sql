CREATE TABLE scm_food_establishment_reservation(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$BookingTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 booking_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Broker
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 broker VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EndTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 end_time VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ModifiedTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 modified_time VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PartySize
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Integer
  *        org.kyojo.schemaorg.m3n3.core.Clazz$QuantitativeValue
  */
 party_size VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PriceCurrency
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 price_currency VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ProgramMembershipUsed
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ProgramMembership
  */
 program_membership_used VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Provider
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ReservationFor
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 reservation_for VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ReservationId
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 reservation_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ReservationStatus
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ReservationStatusType
  */
 reservation_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ReservedTicket
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Ticket
  */
 reserved_ticket VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$StartTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 start_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$TotalPrice
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$PriceSpecification
  *        org.kyojo.schemaorg.m3n3.core.DataType$Number
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 total_price VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$UnderName
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 under_name VARCHAR(100) NULL,

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