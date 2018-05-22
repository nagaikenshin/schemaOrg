package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/ActionStatusType")
@CamelizedName("actionStatusType")
@ConstantizedName("ACTION_STATUS_TYPE")
public interface ActionStatusType extends Clazz.ActionStatusType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ActiveActionStatus")
	@SchemaOrgLabel("ActiveActionStatus")
	@SchemaOrgComment(""
			+ "An in-progress action (e.g, while watching the movie, or driving to a location).")
	@CamelizedName("activeActionStatus")
	@ConstantizedName("ACTIVE_ACTION_STATUS")
	@SampleValue("1")
	public interface ActiveActionStatus extends ActionStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CompletedActionStatus")
	@SchemaOrgLabel("CompletedActionStatus")
	@SchemaOrgComment("An action that has already taken place.")
	@CamelizedName("completedActionStatus")
	@ConstantizedName("COMPLETED_ACTION_STATUS")
	@SampleValue("2")
	public interface CompletedActionStatus extends ActionStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FailedActionStatus")
	@SchemaOrgLabel("FailedActionStatus")
	@SchemaOrgComment(""
			+ "An action that failed to complete. The action's error property and the HTTP"
			+ " return code contain more information about the failure.")
	@CamelizedName("failedActionStatus")
	@ConstantizedName("FAILED_ACTION_STATUS")
	@SampleValue("3")
	public interface FailedActionStatus extends ActionStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PotentialActionStatus")
	@SchemaOrgLabel("PotentialActionStatus")
	@SchemaOrgComment(""
			+ "A description of an action that is supported.")
	@CamelizedName("potentialActionStatus")
	@ConstantizedName("POTENTIAL_ACTION_STATUS")
	@SampleValue("4")
	public interface PotentialActionStatus extends ActionStatusType {

	}

}
