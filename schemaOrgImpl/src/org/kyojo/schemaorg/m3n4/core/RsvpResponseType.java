package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
