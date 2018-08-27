package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
