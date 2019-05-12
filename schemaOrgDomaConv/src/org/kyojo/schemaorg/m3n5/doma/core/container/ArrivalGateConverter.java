package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_GATE;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalGate;

@ExternalDomain
public class ArrivalGateConverter implements DomainConverter<ArrivalGate, String> {

	@Override
	public String fromDomainToValue(ArrivalGate domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalGate fromValueToDomain(String value) {
		return new ARRIVAL_GATE(value);
	}

}
