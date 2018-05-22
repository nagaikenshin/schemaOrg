package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_CONSUMABLE_FOR;
import org.kyojo.schemaOrg.m3n3.core.Container.IsConsumableFor;

@ExternalDomain
public class IsConsumableForConverter implements DomainConverter<IsConsumableFor, String> {

	@Override
	public String fromDomainToValue(IsConsumableFor domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsConsumableFor fromValueToDomain(String value) {
		return new IS_CONSUMABLE_FOR(value);
	}

}
