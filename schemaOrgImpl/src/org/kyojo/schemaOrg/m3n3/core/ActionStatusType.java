package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
