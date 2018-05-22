package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/RsvpResponseType")
@CamelizedName("rsvpResponseType")
@ConstantizedName("RSVP_RESPONSE_TYPE")
public interface RsvpResponseType extends Clazz.RsvpResponseType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RsvpResponseMaybe")
	@SchemaOrgLabel("RsvpResponseMaybe")
	@SchemaOrgComment("The invitee may or may not attend.")
	@CamelizedName("rsvpResponseMaybe")
	@ConstantizedName("RSVP_RESPONSE_MAYBE")
	@SampleValue("1")
	public interface RsvpResponseMaybe extends RsvpResponseType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RsvpResponseNo")
	@SchemaOrgLabel("RsvpResponseNo")
	@SchemaOrgComment("The invitee will not attend.")
	@CamelizedName("rsvpResponseNo")
	@ConstantizedName("RSVP_RESPONSE_NO")
	@SampleValue("2")
	public interface RsvpResponseNo extends RsvpResponseType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RsvpResponseYes")
	@SchemaOrgLabel("RsvpResponseYes")
	@SchemaOrgComment("The invitee will attend.")
	@CamelizedName("rsvpResponseYes")
	@ConstantizedName("RSVP_RESPONSE_YES")
	@SampleValue("3")
	public interface RsvpResponseYes extends RsvpResponseType {

	}

}
