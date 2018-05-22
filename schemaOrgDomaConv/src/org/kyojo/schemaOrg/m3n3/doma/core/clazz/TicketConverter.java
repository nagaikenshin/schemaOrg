package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TICKET;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Ticket;

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
