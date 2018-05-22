package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
