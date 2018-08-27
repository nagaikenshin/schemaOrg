package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/BoardingPolicyType")
@CamelizedName("boardingPolicyType")
@ConstantizedName("BOARDING_POLICY_TYPE")
public interface BoardingPolicyType extends Clazz.BoardingPolicyType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GroupBoardingPolicy")
	@SchemaOrgLabel("GroupBoardingPolicy")
	@SchemaOrgComment(""
			+ "The airline boards by groups based on check-in time, priority, etc.")
	@CamelizedName("groupBoardingPolicy")
	@ConstantizedName("GROUP_BOARDING_POLICY")
	@SampleValue("1")
	public interface GroupBoardingPolicy extends BoardingPolicyType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ZoneBoardingPolicy")
	@SchemaOrgLabel("ZoneBoardingPolicy")
	@SchemaOrgComment(""
			+ "The airline boards by zones of the plane.")
	@CamelizedName("zoneBoardingPolicy")
	@ConstantizedName("ZONE_BOARDING_POLICY")
	@SampleValue("2")
	public interface ZoneBoardingPolicy extends BoardingPolicyType {

	}

}
