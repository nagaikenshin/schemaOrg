package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM_SHIPPED;
import org.kyojo.schemaorg.m3n5.core.Container.ItemShipped;

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
