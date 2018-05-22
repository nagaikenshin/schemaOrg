package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RSVP_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RsvpAction;

@ExternalDomain
public class RsvpActionConverter implements DomainConverter<RsvpAction, String> {

	@Override
	public String fromDomainToValue(RsvpAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public RsvpAction fromValueToDomain(String value) {
		return new RSVP_ACTION(value);
	}

}
