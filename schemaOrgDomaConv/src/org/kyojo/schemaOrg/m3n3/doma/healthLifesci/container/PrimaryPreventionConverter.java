package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PRIMARY_PREVENTION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrimaryPrevention;

@ExternalDomain
public class PrimaryPreventionConverter implements DomainConverter<PrimaryPrevention, String> {

	@Override
	public String fromDomainToValue(PrimaryPrevention domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrimaryPrevention fromValueToDomain(String value) {
		return new PRIMARY_PREVENTION(value);
	}

}
