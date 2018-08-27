package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
