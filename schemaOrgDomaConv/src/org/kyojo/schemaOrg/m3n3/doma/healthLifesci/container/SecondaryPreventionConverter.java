package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SECONDARY_PREVENTION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SecondaryPrevention;

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
