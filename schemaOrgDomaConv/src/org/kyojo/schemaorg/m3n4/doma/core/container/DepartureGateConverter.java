package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEPARTURE_GATE;
import org.kyojo.schemaorg.m3n4.core.Container.DepartureGate;

@ExternalDomain
public class DepartureGateConverter implements DomainConverter<DepartureGate, String> {

	@Override
	public String fromDomainToValue(DepartureGate domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureGate fromValueToDomain(String value) {
		return new DEPARTURE_GATE(value);
	}

}