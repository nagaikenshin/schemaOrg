package org.kyojo.schemaOrg.m3n3.doma.core.rsvpResponseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.rsvpResponseType.RSVP_RESPONSE_MAYBE;
import org.kyojo.schemaOrg.m3n3.core.RsvpResponseType.RsvpResponseMaybe;

@ExternalDomain
public class RsvpResponseMaybeConverter implements DomainConverter<RsvpResponseMaybe, String> {

	@Override
	public String fromDomainToValue(RsvpResponseMaybe domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpResponseMaybe fromValueToDomain(String value) {
		return new RSVP_RESPONSE_MAYBE(value);
	}

}
