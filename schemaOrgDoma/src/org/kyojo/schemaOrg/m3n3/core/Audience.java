package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/Audience")
@CamelizedName("audience")
@ConstantizedName("AUDIENCE")
public interface Audience extends Clazz.Audience {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Researcher")
	@SchemaOrgLabel("Researcher")
	@SchemaOrgComment("Researchers.")
	@CamelizedName("researcher")
	@ConstantizedName("RESEARCHER")
	@SampleValue("1")
	public interface Researcher extends Audience {

	}

}
