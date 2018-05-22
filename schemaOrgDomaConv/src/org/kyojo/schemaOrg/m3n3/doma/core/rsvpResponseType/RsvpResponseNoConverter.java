package org.kyojo.schemaOrg.m3n3.doma.core.rsvpResponseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.rsvpResponseType.RSVP_RESPONSE_NO;
import org.kyojo.schemaOrg.m3n3.core.RsvpResponseType.RsvpResponseNo;

@ExternalDomain
public class RsvpResponseNoConverter implements DomainConverter<RsvpResponseNo, String> {

	@Override
	public String fromDomainToValue(RsvpResponseNo domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpResponseNo fromValueToDomain(String value) {
		return new RSVP_RESPONSE_NO(value);
	}

}
