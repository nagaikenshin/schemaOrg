package org.kyojo.schemaOrg.m3n3.doma.core.rsvpResponseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.rsvpResponseType.RSVP_RESPONSE_YES;
import org.kyojo.schemaOrg.m3n3.core.RsvpResponseType.RsvpResponseYes;

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
