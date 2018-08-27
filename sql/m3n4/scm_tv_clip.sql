CREATE TABLE scm_tv_clip(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$About
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  */
 about VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessMode
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 access_mode VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessModeSufficient
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 access_mode_sufficient VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessibilityAPI
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 accessibility_api VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessibilityControl
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 accessibility_control VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessibilityFeature
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 accessibility_feature VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessibilityHazard
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 accessibility_hazard VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccessibilitySummary
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 accessibility_summary VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AccountablePerson
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 accountable_person VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Actor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 actor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AggregateRating
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$AggregateRating
  */
 aggregate_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AlternativeHeadline
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alternative_headline VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AssociatedMedia
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$MediaObject
  */
 associated_media VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Audience
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Audio
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$AudioObject
  */
 audio VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Author
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 author VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Award
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 award VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Character
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 character VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Citation
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 citation VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ClipNumber
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Integer
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 clip_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Comment
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Comment
  */
 comment VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$CommentCount
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Integer
  */
 comment_count VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ContentLocation
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Place
  */
 content_location VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ContentRating
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Rating
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 content_rating VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$ContentReferenceTime
  * param: org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 content_reference_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Contributor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 contributor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$CopyrightHolder
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 copyright_holder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$CopyrightYear
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 copyright_year VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$Correction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CorrectionComment
  */
 correction VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Creator
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 creator VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DateCreated
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  *        org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 date_created VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DateModified
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  *        org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  */
 date_modified VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DatePublished
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 date_published VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Description
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Director
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 director VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DiscussionUrl
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 discussion_url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Editor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 editor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$EducationalAlignment
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$AlignmentObject
  */
 educational_alignment VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$EducationalUse
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 educational_use VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Encoding
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$MediaObject
  */
 encoding VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$EncodingFormat
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 encoding_format VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ExampleOfWork
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  */
 example_of_work VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Expires
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 expires VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Funder
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 funder VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Genre
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 genre VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$HasPart
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Trip
  */
 has_part VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Headline
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 headline VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$InLanguage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Language
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 in_language VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$InteractionStatistic
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$InteractionCounter
  */
 interaction_statistic VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$InteractivityType
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 interactivity_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsAccessibleForFree
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Boolean
  */
 is_accessible_for_free VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsBasedOn
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 is_based_on VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsFamilyFriendly
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Boolean
  */
 is_family_friendly VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsPartOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Trip
  */
 is_part_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Keywords
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 keywords VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$LearningResourceType
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 learning_resource_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$License
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 license VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$LocationCreated
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Place
  */
 location_created VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntity
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  */
 main_entity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Material
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 material VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Mentions
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  */
 mentions VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MusicBy
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$MusicGroup
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 music_by VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Offers
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Offer
  */
 offers VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PartOfEpisode
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Episode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Trip
  */
 part_of_episode VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PartOfSeason
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Trip
  */
 part_of_season VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PartOfSeries
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Trip
  */
 part_of_series VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Position
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Integer
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 position VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Producer
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 producer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Provider
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 provider VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Publication
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PublicationEvent
  */
 publication VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Publisher
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 publisher VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.bib.Container$PublisherImprint
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 publisher_imprint VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PublishingPrinciples
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 publishing_principles VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$RecordedAt
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 recorded_at VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReleasedEvent
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PublicationEvent
  */
 released_event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Review
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Review
  */
 review VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SchemaVersion
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 schema_version VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SdDatePublished
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 sd_date_published VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SdLicense
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 sd_license VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SdPublisher
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 sd_publisher VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SourceOrganization
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 source_organization VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SpatialCoverage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Place
  */
 spatial_coverage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Sponsor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 sponsor VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$TemporalCoverage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$DateTime
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 temporal_coverage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Text
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 text VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ThumbnailUrl
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 thumbnail_url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$TimeRequired
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Duration
  */
 time_required VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.bib.Container$TranslationOfWork
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  */
 translation_of_work VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Translator
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Person
  */
 translator VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$TypicalAgeRange
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 typical_age_range VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Url
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Version
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 version VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Video
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$VideoObject
  */
 video VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$WorkExample
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  */
 work_example VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.bib.Container$WorkTranslation
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
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