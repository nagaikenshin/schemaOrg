package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_GATE;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalGate;

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
