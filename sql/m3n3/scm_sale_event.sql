CREATE TABLE scm_sale_event(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$About
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  */
 about VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Actor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 actor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Attendee
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 attendee VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Audience
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Composer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 composer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Contributor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 contributor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Description
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Director
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 director VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DoorTime
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 door_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Duration
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Duration
  */
 duration VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EndDate
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  *        org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 end_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EventStatus
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$EventStatusType
  */
 event_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Funder
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 funder VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$InLanguage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Language
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 in_language VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsAccessibleForFree
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_accessible_for_free VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Location
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MaximumAttendeeCapacity
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 maximum_attendee_capacity VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Offers
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Offer
  */
 offers VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Organizer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 organizer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Performer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 performer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PreviousStartDate
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 previous_start_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RecordedIn
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 recorded_in VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RemainingAttendeeCapacity
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 remaining_attendee_capacity VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Sponsor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 sponsor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$StartDate
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  *        org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 start_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SubEvent
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Event
  */
 sub_event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SuperEvent
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Event
  */
 super_event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Translator
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 translator VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$TypicalAgeRange
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 typical_age_range VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorkFeatured
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 work_featured VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorkPerformed
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 work_performed VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);