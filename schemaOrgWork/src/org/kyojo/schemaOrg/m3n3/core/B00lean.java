package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgType;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
