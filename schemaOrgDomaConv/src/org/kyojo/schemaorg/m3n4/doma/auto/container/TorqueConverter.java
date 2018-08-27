package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.TORQUE;
import org.kyojo.schemaorg.m3n4.auto.Container.Torque;

@ExternalDomain
public class TorqueConverter implements DomainConverter<Torque, String> {

	@Override
	public String fromDomainToValue(Torque domain) {
		return domain.getNativeValue();
	}

	@Override
	public Torque fromValueToDomain(String value) {
		return new TORQUE(value);
	}

}
