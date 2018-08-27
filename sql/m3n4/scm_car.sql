CREATE TABLE scm_car(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$AccelerationTime
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 acceleration_time VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$AcrissCode
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 acriss_code VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Audience
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Audience
  */
 audience VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Award
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 award VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$BodyType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QualitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 body_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Brand
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Brand
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 brand VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$CargoVolume
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 cargo_volume VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$Category
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Thing
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$PhysicalActivityCategory
  */
 category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Color
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 color VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DateVehicleFirstRegistered
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 date_vehicle_first_registered VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Depth
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 depth VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DriveWheelConfiguration
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$DriveWheelConfigurationValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 drive_wheel_configuration VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$EmissionsCO2
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 emissions_co2 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$FuelCapacity
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 fuel_capacity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$FuelConsumption
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 fuel_consumption VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$FuelEfficiency
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 fuel_efficiency VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$FuelType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QualitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 fuel_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Gtin12
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 gtin12 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Gtin13
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 gtin13 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Gtin14
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 gtin14 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Gtin8
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 gtin8 VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Height
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 height VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsAccessoryOrSparePartFor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  */
 is_accessory_or_spare_part_for VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsConsumableFor
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  */
 is_consumable_for VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsRelatedTo
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Service
  */
 is_related_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$IsSimilarTo
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Service
  */
 is_similar_to VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ItemCondition
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$OfferItemCondition
  */
 item_condition VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$KnownVehicleDamages
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 known_vehicle_damages VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Logo
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 logo VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Manufacturer
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Organization
  */
 manufacturer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Material
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Product
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 material VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$MeetsEmissionStandard
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QualitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 meets_emission_standard VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MileageFromOdometer
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 mileage_from_odometer VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Model
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$ProductModel
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 model VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$ModelDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 model_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Mpn
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 mpn VARCHAR(100) NULL,

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
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NumberOfAirbags
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Number
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 number_of_airbags VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NumberOfAxles
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 number_of_axles VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NumberOfDoors
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 number_of_doors VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NumberOfForwardGears
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 number_of_forward_gears VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NumberOfPreviousOwners
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 number_of_previous_owners VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Offers
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Offer
  */
 offers VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$Payload
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 payload VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Action
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ProductID
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 product_id VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ProductionDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 production_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PurchaseDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 purchase_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$ReleaseDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 release_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Review
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Review
  */
 review VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$RoofLoad
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 roof_load VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$SeatingCapacity
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 seating_capacity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Sku
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 sku VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$Speed
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 speed VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SteeringPosition
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$SteeringPositionValue
  */
 steering_position VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$TongueWeight
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 tongue_weight VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$TrailerWeight
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 trailer_weight VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Url
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleConfiguration
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_configuration VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleEngine
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$EngineSpecification
  */
 vehicle_engine VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleIdentificationNumber
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_identification_number VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleInteriorColor
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_interior_color VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleInteriorType
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_interior_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleModelDate
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Date
  */
 vehicle_model_date VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleSeatingCapacity
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 vehicle_seating_capacity VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$VehicleSpecialUsage
  * param: org.kyojo.schemaorg.m3n4.auto.Clazz$CarUsageType
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_special_usage VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$VehicleTransmission
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QualitativeValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 vehicle_transmission VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Weight
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 weight VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$WeightTotal
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 weight_total VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.auto.Container$Wheelbase
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
  */
 wheelbase VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Width
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Distance
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QuantitativeValue
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