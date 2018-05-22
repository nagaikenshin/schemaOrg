CREATE TABLE scm_house(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalProperty
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  */
 additional_property VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AdditionalType
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Address
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PostalAddress
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 address VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$AmenityFeature
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$LocationFeatureSpecification
  */
 amenity_feature VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$BranchCode
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 branch_code VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ContainedInPlace
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 contained_in_place VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$ContainsPlace
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  */
 contains_place VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Event
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Event
  */
 event VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FaxNumber
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 fax_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$FloorSize
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  */
 floor_size VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Geo
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$GeoCoordinates
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$GeoShape
  */
 geo VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyContains
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_contains VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyCoveredBy
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_covered_by VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyCovers
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_covers VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyCrosses
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_crosses VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyDisjoint
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_disjoint VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyEquals
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_equals VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyIntersects
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_intersects VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyOverlaps
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_overlaps VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyTouches
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_touches VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.pending.Container$GeospatiallyWithin
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Place
  *        org.kyojo.schemaOrg.m3n3.pending.Clazz$GeospatialGeometry
  */
 geospatially_within VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$GlobalLocationNumber
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$PropertyValue
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 global_location_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$HasMap
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Map
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 has_map VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsAccessibleForFree
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 is_accessible_for_free VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$IsicV4
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 isic_v4 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Logo
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ImageObject
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 logo VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$NumberOfRooms
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Number
  */
 number_of_rooms VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$OpeningHoursSpecification
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$OpeningHoursSpecification
  */
 opening_hours_specification VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PermittedUsage
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 permitted_usage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PetsAllowed
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  *        org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 pets_allowed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Photo
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$ImageObject
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$Photograph
  *        org.kyojo.schemaOrg.m3n3.core.Clazz$URL
  */
 photo VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PotentialAction
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$PublicAccess
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 public_access VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SmokingAllowed
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Boolean
  */
 smoking_allowed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$SpecialOpeningHoursSpecification
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$OpeningHoursSpecification
  */
 special_opening_hours_specification VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Telephone
  * param: org.kyojo.schemaOrg.m3n3.core.DataType$Text
  */
 telephone VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaOrg.m3n3.core.Container$Url
  * param: org.kyojo.schemaOrg.m3n3.core.Clazz$URL
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