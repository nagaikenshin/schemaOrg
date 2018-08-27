package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RESERVED_TICKET;
import org.kyojo.schemaorg.m3n4.core.Container.ReservedTicket;

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
