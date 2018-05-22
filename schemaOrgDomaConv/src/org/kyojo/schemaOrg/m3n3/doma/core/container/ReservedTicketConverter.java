package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVED_TICKET;
import org.kyojo.schemaOrg.m3n3.core.Container.ReservedTicket;

@ExternalDomain
public class ReservedTicketConverter implements DomainConverter<ReservedTicket, String> {

	@Override
	public String fromDomainToValue(ReservedTicket domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservedTicket fromValueToDomain(String value) {
		return new RESERVED_TICKET(value);
	}

}
