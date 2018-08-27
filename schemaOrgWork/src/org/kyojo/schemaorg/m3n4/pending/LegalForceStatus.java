package org.kyojo.schemaorg.m3n4.pending;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/LegalForceStatus")
@CamelizedName("legalForceStatus")
@ConstantizedName("LEGAL_FORCE_STATUS")
public interface LegalForceStatus extends Clazz.LegalForceStatus {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InForce")
	@SchemaOrgLabel("InForce")
	@SchemaOrgComment(""
			+ "Indicates that a legislation is in force.")
	@CamelizedName("inForce")
	@ConstantizedName("IN_FORCE")
	@SampleValue("1")
	public interface InForce extends LegalForceStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NotInForce")
	@SchemaOrgLabel("NotInForce")
	@SchemaOrgComment(""
			+ "Indicates that a legislation is currently not in force.")
	@CamelizedName("notInForce")
	@ConstantizedName("NOT_IN_FORCE")
	@SampleValue("2")
	public interface NotInForce extends LegalForceStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PartiallyInForce")
	@SchemaOrgLabel("PartiallyInForce")
	@SchemaOrgComment(""
			+ "Indicates that parts of the legislation are in force, and parts are not.")
	@CamelizedName("partiallyInForce")
	@ConstantizedName("PARTIALLY_IN_FORCE")
	@SampleValue("3")
	public interface PartiallyInForce extends LegalForceStatus {

	}

}
