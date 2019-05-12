package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RSVP_RESPONSE;
import org.kyojo.schemaorg.m3n5.core.Container.RsvpResponse;

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
