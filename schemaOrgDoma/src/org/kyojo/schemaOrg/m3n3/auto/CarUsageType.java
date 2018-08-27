package org.kyojo.schemaorg.m3n3.auto;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/CarUsageType")
@CamelizedName("carUsageType")
@ConstantizedName("CAR_USAGE_TYPE")
public interface CarUsageType extends Clazz.CarUsageType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrivingSchoolVehicleUsage")
	@SchemaOrgLabel("DrivingSchoolVehicleUsage")
	@SchemaOrgComment(""
			+ "Indicates the usage of the vehicle for driving school.")
	@CamelizedName("drivingSchoolVehicleUsage")
	@ConstantizedName("DRIVING_SCHOOL_VEHICLE_USAGE")
	@SampleValue("1")
	public interface DrivingSchoolVehicleUsage extends CarUsageType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RentalVehicleUsage")
	@SchemaOrgLabel("RentalVehicleUsage")
	@SchemaOrgComment(""
			+ "Indicates the usage of the vehicle as a rental car.")
	@CamelizedName("rentalVehicleUsage")
	@ConstantizedName("RENTAL_VEHICLE_USAGE")
	@SampleValue("2")
	public interface RentalVehicleUsage extends CarUsageType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TaxiVehicleUsage")
	@SchemaOrgLabel("TaxiVehicleUsage")
	@SchemaOrgComment(""
			+ "Indicates the usage of the car as a taxi.")
	@CamelizedName("taxiVehicleUsage")
	@ConstantizedName("TAXI_VEHICLE_USAGE")
	@SampleValue("3")
	public interface TaxiVehicleUsage extends CarUsageType {

	}

}
