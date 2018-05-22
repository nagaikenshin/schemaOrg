package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TICKET_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.TicketNumber;

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
