package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SECONDARY_PREVENTION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SecondaryPrevention;

@ExternalDomain
public class SecondaryPreventionConverter implements DomainConverter<SecondaryPrevention, String> {

	@Override
	public String fromDomainToValue(SecondaryPrevention domain) {
		return domain.getNativeValue();
	}

	@Override
	public SecondaryPrevention fromValueToDomain(String value) {
		return new SECONDARY_PREVENTION(value);
	}

}
