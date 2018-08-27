package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TICKETED_SEAT;
import org.kyojo.schemaorg.m3n4.core.Container.TicketedSeat;

@ExternalDomain
public class TicketedSeatConverter implements DomainConverter<TicketedSeat, String> {

	@Override
	public String fromDomainToValue(TicketedSeat domain) {
		return domain.getNativeValue();
	}

	@Override
	public TicketedSeat fromValueToDomain(String value) {
		return new TICKETED_SEAT(value);
	}

}
