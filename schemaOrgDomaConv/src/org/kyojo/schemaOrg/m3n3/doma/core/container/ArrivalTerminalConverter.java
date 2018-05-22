package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_TERMINAL;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTerminal;

@ExternalDomain
public class ArrivalTerminalConverter implements DomainConverter<ArrivalTerminal, String> {

	@Override
	public String fromDomainToValue(ArrivalTerminal domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalTerminal fromValueToDomain(String value) {
		return new ARRIVAL_TERMINAL(value);
	}

}
