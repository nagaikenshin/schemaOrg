package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgType;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/Boolean")
@SchemaOrgLabel("Boolean")
@SchemaOrgComment("Boolean: True or False.")
@CamelizedName("b00lean")
@ConstantizedName("B00LEAN")
public interface B00lean extends SchemaOrgType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/False")
	@SchemaOrgLabel("False")
	@SchemaOrgComment("The boolean value false.")
	@CamelizedName("false")
	@ConstantizedName("FALSE")
	@SampleValue("0")
	public interface False extends B00lean {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/True")
	@SchemaOrgLabel("True")
	@SchemaOrgComment("The boolean value true.")
	@CamelizedName("true")
	@ConstantizedName("TRUE")
	@SampleValue("1")
	public interface True extends B00lean {

	}

}
