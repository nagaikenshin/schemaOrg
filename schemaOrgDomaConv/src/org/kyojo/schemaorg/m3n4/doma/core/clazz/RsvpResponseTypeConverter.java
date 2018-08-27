package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RSVP_RESPONSE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpResponseType;

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