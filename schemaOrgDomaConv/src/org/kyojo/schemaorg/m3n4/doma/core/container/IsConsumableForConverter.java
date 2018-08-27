package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IS_CONSUMABLE_FOR;
import org.kyojo.schemaorg.m3n4.core.Container.IsConsumableFor;

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
