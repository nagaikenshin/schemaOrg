package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SENSORY_UNIT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SensoryUnit;

@ExternalDomain
public class SensoryUnitConverter implements DomainConverter<SensoryUnit, String> {

	@Override
	public String fromDomainToValue(SensoryUnit domain) {
		return domain.getNativeValue();
	}

	@Override
	public SensoryUnit fromValueToDomain(String value) {
		return new SENSORY_UNIT(value);
	}

}
