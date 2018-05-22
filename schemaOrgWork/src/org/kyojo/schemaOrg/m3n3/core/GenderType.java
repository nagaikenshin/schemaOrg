package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/GenderType")
@CamelizedName("genderType")
@ConstantizedName("GENDER_TYPE")
public interface GenderType extends Clazz.GenderType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Female")
	@SchemaOrgLabel("Female")
	@SchemaOrgComment("The female gender.")
	@CamelizedName("female")
	@ConstantizedName("FEMALE")
	@SampleValue("2")
	public interface Female extends GenderType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Male")
	@SchemaOrgLabel("Male")
	@SchemaOrgComment("The male gender.")
	@CamelizedName("male")
	@ConstantizedName("MALE")
	@SampleValue("1")
	public interface Male extends GenderType {

	}

}
