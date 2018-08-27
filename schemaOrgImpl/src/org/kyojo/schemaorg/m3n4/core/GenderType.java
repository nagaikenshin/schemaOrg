package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
