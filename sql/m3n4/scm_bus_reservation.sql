CREATE TABLE scm_bus_reservation(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$BookingTime
  * param: org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 booking_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Broker
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 broker VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ModifiedTime
  * param: org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 modified_time VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PriceCurrency
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 price_currency VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ProgramMembershipUsed
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ProgramMembership
  */
 program_membership_used VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Provider
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReservationFor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  */
 reservation_for VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReservationId
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 reservation_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReservationStatus
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ReservationStatusType
  */
 reservation_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReservedTicket
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Ticket
  */
 reserved_ticket VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$TotalPrice
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PriceSpecification
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 total_price VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$UnderName
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 under_name VARCHAR(100) NULL,

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