package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_SHIPPED;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemShipped;

@ExternalDomain
public class ItemShippedConverter implements DomainConverter<ItemShipped, String> {

	@Override
	public String fromDomainToValue(ItemShipped domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemShipped fromValueToDomain(String value) {
		return new ITEM_SHIPPED(value);
	}

}
