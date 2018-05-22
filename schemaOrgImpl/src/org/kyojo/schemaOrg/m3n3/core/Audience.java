package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
