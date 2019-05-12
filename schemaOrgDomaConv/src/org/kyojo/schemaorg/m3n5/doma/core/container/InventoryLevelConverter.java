package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INVENTORY_LEVEL;
import org.kyojo.schemaorg.m3n5.core.Container.InventoryLevel;

@ExternalDomain
public class InventoryLevelConverter implements DomainConverter<InventoryLevel, String> {

	@Override
	public String fromDomainToValue(InventoryLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public InventoryLevel fromValueToDomain(String value) {
		return new INVENTORY_LEVEL(value);
	}

}
