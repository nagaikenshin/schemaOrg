CREATE TABLE scm_exercise_action(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ActionStatus
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$ActionStatusType
  */
 action_status VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Agent
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 agent VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Description
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$Diet
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$Diet
  */
 diet VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Distance
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Distance
  */
 distance VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$EndTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 end_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Error
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 error VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Event
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Event
  */
 event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ExerciseCourse
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 exercise_course VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$ExercisePlan
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$ExercisePlan
  */
 exercise_plan VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$ExerciseRelatedDiet
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n3.healthLifesci.Clazz$Diet
  */
 exercise_related_diet VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.healthLifesci.Container$ExerciseType
  * param: org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 exercise_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$FromLocation
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 from_location VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Instrument
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 instrument VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Location
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 location VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Object
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 object VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Opponent
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 opponent VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Participant
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  */
 participant VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Result
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Thing
  */
 result VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SportsActivityLocation
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.Clazz$SportsActivityLocation
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 sports_activity_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SportsEvent
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.Clazz$SportsEvent
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 sports_event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$SportsTeam
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n3.core.Clazz$Person
  *        org.kyojo.schemaorg.m3n3.core.Clazz$SportsTeam
  */
 sports_team VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$StartTime
  * param: org.kyojo.schemaorg.m3n3.core.DataType$DateTime
  */
 start_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$Target
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$EntryPoint
  */
 target VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n3.core.Container$ToLocation
  * param: org.kyojo.schemaorg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaorg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaorg.m3n3.core.DataType$Text
  */
 to_location VARCHAR(100) NULL,

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