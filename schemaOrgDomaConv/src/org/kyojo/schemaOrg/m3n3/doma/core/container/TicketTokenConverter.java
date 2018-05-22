package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TICKET_TOKEN;
import org.kyojo.schemaOrg.m3n3.core.Container.TicketToken;

@ExternalDomain
public class TicketTokenConverter implements DomainConverter<TicketToken, String> {

	@Override
	public String fromDomainToValue(TicketToken domain) {
		return domain.getNativeValue();
	}

	@Override
	public TicketToken fromValueToDomain(String value) {
		return new TICKET_TOKEN(value);
	}

}
