package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ATTENDEE;
import org.kyojo.schemaorg.m3n5.core.Container.Attendee;

@ExternalDomain
public class AttendeeConverter implements DomainConverter<Attendee, String> {

	@Override
	public String fromDomainToValue(Attendee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Attendee fromValueToDomain(String value) {
		return new ATTENDEE(value);
	}

}
