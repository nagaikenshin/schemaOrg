package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RSVP_RESPONSE;
import org.kyojo.schemaOrg.m3n3.core.Container.RsvpResponse;

@ExternalDomain
public class RsvpResponseConverter implements DomainConverter<RsvpResponse, String> {

	@Override
	public String fromDomainToValue(RsvpResponse domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpResponse fromValueToDomain(String value) {
		return new RSVP_RESPONSE(value);
	}

}
