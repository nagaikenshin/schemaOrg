package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RSVP_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpAction;

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
