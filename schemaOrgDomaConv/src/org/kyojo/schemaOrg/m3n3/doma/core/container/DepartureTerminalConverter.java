package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_TERMINAL;
import org.kyojo.schemaOrg.m3n3.core.Container.DepartureTerminal;

@ExternalDomain
public class DepartureTerminalConverter implements DomainConverter<DepartureTerminal, String> {

	@Override
	public String fromDomainToValue(DepartureTerminal domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureTerminal fromValueToDomain(String value) {
		return new DEPARTURE_TERMINAL(value);
	}

}
