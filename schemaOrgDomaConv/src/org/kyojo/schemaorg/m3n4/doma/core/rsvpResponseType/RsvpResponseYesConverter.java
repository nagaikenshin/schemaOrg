package org.kyojo.schemaorg.m3n4.doma.core.rsvpResponseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.rsvpResponseType.RSVP_RESPONSE_YES;
import org.kyojo.schemaorg.m3n4.core.RsvpResponseType.RsvpResponseYes;

@ExternalDomain
public class RsvpResponseYesConverter implements DomainConverter<RsvpResponseYes, String> {

	@Override
	public String fromDomainToValue(RsvpResponseYes domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpResponseYes fromValueToDomain(String value) {
		return new RSVP_RESPONSE_YES(value);
	}

}
