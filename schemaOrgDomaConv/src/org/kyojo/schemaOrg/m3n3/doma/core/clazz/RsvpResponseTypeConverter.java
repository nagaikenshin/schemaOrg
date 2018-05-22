package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RSVP_RESPONSE_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RsvpResponseType;

@ExternalDomain
public class RsvpResponseTypeConverter implements DomainConverter<RsvpResponseType, String> {

	@Override
	public String fromDomainToValue(RsvpResponseType domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpResponseType fromValueToDomain(String value) {
		return new RSVP_RESPONSE_TYPE(value);
	}

}
