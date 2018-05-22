package org.kyojo.schemaOrg.m3n3.pending;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
