package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PRIMARY_PREVENTION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PrimaryPrevention;

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
