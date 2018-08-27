package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TICKET_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.TicketNumber;

@ExternalDomain
public class TicketNumberConverter implements DomainConverter<TicketNumber, String> {

	@Override
	public String fromDomainToValue(TicketNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public TicketNumber fromValueToDomain(String value) {
		return new TICKET_NUMBER(value);
	}

}
