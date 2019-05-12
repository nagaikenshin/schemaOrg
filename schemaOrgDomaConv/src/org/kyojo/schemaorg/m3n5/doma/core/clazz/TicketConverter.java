package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TICKET;
import org.kyojo.schemaorg.m3n5.core.Clazz.Ticket;

@ExternalDomain
public class TicketConverter implements DomainConverter<Ticket, String> {

	@Override
	public String fromDomainToValue(Ticket domain) {
		return domain.getNativeValue();
	}

	@Override
	public Ticket fromValueToDomain(String value) {
		return new TICKET(value);
	}

}
