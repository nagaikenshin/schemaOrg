package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/ContactPointOption")
@CamelizedName("contactPointOption")
@ConstantizedName("CONTACT_POINT_OPTION")
public interface ContactPointOption extends Clazz.ContactPointOption {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HearingImpairedSupported")
	@SchemaOrgLabel("HearingImpairedSupported")
	@SchemaOrgComment(""
			+ "Uses devices to support users with hearing impairments.")
	@CamelizedName("hearingImpairedSupported")
	@ConstantizedName("HEARING_IMPAIRED_SUPPORTED")
	@SampleValue("1")
	public interface HearingImpairedSupported extends ContactPointOption {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TollFree")
	@SchemaOrgLabel("TollFree")
	@SchemaOrgComment(""
			+ "The associated telephone number is toll free.")
	@CamelizedName("tollFree")
	@ConstantizedName("TOLL_FREE")
	@SampleValue("2")
	public interface TollFree extends ContactPointOption {

	}

}
