CREATE TABLE scm_claim_review(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$About
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  */
 about VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessMode
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 access_mode VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessModeSufficient
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 access_mode_sufficient VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessibilityAPI
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 accessibility_api VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessibilityControl
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 accessibility_control VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessibilityFeature
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 accessibility_feature VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessibilityHazard
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 accessibility_hazard VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccessibilitySummary
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 accessibility_summary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AccountablePerson
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 accountable_person VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AlternativeHeadline
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 alternative_headline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AssociatedMedia
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$MediaObject
  */
 associated_media VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Audience
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Audio
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AudioObject
  */
 audio VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Author
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 author VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Award
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 award VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Character
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 character VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Citation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 citation VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ClaimReviewed
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 claim_reviewed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Comment
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Comment
  */
 comment VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$CommentCount
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  */
 comment_count VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ContentLocation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 content_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ContentRating
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 content_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$ContentReferenceTime
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 content_reference_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Contributor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 contributor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$CopyrightHolder
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 copyright_holder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$CopyrightYear
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 copyright_year VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Creator
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 creator VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DateCreated
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  *        org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 date_created VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DateModified
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  *        org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  */
 date_modified VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DatePublished
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 date_published VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$DiscussionUrl
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 discussion_url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Editor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 editor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EducationalAlignment
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$AlignmentObject
  */
 educational_alignment VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$EducationalUse
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 educational_use VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Encoding
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$MediaObject
  */
 encoding VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ExampleOfWork
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 example_of_work VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Expires
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Date
  */
 expires VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FileFormat
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 file_format VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Funder
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 funder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Genre
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 genre VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HasPart
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 has_part VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Headline
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 headline VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$InteractionStatistic
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$InteractionCounter
  */
 interaction_statistic VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$InteractivityType
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 interactivity_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsAccessibleForFree
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_accessible_for_free VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsBasedOn
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 is_based_on VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsFamilyFriendly
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_family_friendly VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsPartOf
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 is_part_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ItemReviewed
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  */
 item_reviewed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Keywords
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 keywords VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$LearningResourceType
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 learning_resource_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$License
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 license VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$LocationCreated
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 location_created VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntity
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  */
 main_entity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Material
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Product
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 material VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Mentions
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Thing
  */
 mentions VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Position
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Integer
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 position VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Producer
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 producer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Provider
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Publication
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PublicationEvent
  */
 publication VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Publisher
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 publisher VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.bib.Container$PublisherImprint
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 publisher_imprint VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PublishingPrinciples
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 publishing_principles VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$RecordedAt
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Event
  */
 recorded_at VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ReleasedEvent
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PublicationEvent
  */
 released_event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Review
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Review
  */
 review VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ReviewBody
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 review_body VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ReviewRating
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Rating
  */
 review_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SameAs
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SchemaVersion
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 schema_version VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SourceOrganization
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  */
 source_organization VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SpatialCoverage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 spatial_coverage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Sponsor
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Organization
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Person
  */
 sponsor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$TemporalCoverage
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$DateTime
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 temporal_coverage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Text
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 text VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ThumbnailUrl
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 thumbnail_url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$TimeRequired
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Duration
  */
 time_required VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.bib.Container$TranslationOfWork
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 translation_of_work VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Version
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Number
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 version VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Video
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$VideoObject
  */
 video VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$WorkExample
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 work_example VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.bib.Container$WorkTranslation
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$CreativeWork
  */
 work_translation VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);