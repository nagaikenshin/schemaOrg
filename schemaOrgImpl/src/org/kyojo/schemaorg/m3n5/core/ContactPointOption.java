package org.kyojo.schemaorg.m3n5.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
