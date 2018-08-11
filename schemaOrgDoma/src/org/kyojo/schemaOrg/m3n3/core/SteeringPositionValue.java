package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/SteeringPositionValue")
@CamelizedName("steeringPositionValue")
@ConstantizedName("STEERING_POSITION_VALUE")
public interface SteeringPositionValue extends Clazz.SteeringPositionValue {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LeftHandDriving")
	@SchemaOrgLabel("LeftHandDriving")
	@SchemaOrgComment(""
			+ "The steering position is on the left side of the vehicle (viewed from the main"
			+ " direction of driving).")
	@CamelizedName("leftHandDriving")
	@ConstantizedName("LEFT_HAND_DRIVING")
	@SampleValue("1")
	public interface LeftHandDriving extends SteeringPositionValue {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RightHandDriving")
	@SchemaOrgLabel("RightHandDriving")
	@SchemaOrgComment(""
			+ "The steering position is on the right side of the vehicle (viewed from the main"
			+ " direction of driving).")
	@CamelizedName("rightHandDriving")
	@ConstantizedName("RIGHT_HAND_DRIVING")
	@SampleValue("2")
	public interface RightHandDriving extends SteeringPositionValue {

	}

}
