package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DriveWheelConfigurationValue")
@CamelizedName("driveWheelConfigurationValue")
@ConstantizedName("DRIVE_WHEEL_CONFIGURATION_VALUE")
public interface DriveWheelConfigurationValue extends Clazz.DriveWheelConfigurationValue {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AllWheelDriveConfiguration")
	@SchemaOrgLabel("AllWheelDriveConfiguration")
	@SchemaOrgComment(""
			+ "All-wheel Drive is a transmission layout where the engine drives all four"
			+ " wheels.")
	@CamelizedName("allWheelDriveConfiguration")
	@ConstantizedName("ALL_WHEEL_DRIVE_CONFIGURATION")
	@SampleValue("1")
	public interface AllWheelDriveConfiguration extends DriveWheelConfigurationValue {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FourWheelDriveConfiguration")
	@SchemaOrgLabel("FourWheelDriveConfiguration")
	@SchemaOrgComment(""
			+ "Four-wheel drive is a transmission layout where the engine primarily drives two"
			+ " wheels with a part-time four-wheel drive capability.")
	@CamelizedName("fourWheelDriveConfiguration")
	@ConstantizedName("FOUR_WHEEL_DRIVE_CONFIGURATION")
	@SampleValue("2")
	public interface FourWheelDriveConfiguration extends DriveWheelConfigurationValue {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FrontWheelDriveConfiguration")
	@SchemaOrgLabel("FrontWheelDriveConfiguration")
	@SchemaOrgComment(""
			+ "Front-wheel drive is a transmission layout where the engine drives the front"
			+ " wheels.")
	@CamelizedName("frontWheelDriveConfiguration")
	@ConstantizedName("FRONT_WHEEL_DRIVE_CONFIGURATION")
	@SampleValue("3")
	public interface FrontWheelDriveConfiguration extends DriveWheelConfigurationValue {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RearWheelDriveConfiguration")
	@SchemaOrgLabel("RearWheelDriveConfiguration")
	@SchemaOrgComment(""
			+ "Real-wheel drive is a transmission layout where the engine drives the rear"
			+ " wheels.")
	@CamelizedName("rearWheelDriveConfiguration")
	@ConstantizedName("REAR_WHEEL_DRIVE_CONFIGURATION")
	@SampleValue("4")
	public interface RearWheelDriveConfiguration extends DriveWheelConfigurationValue {

	}

}
