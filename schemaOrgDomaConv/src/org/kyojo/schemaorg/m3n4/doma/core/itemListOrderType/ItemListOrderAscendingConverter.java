package org.kyojo.schemaorg.m3n4.doma.core.itemListOrderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemListOrderType.ITEM_LIST_ORDER_ASCENDING;
import org.kyojo.schemaorg.m3n4.core.ItemListOrderType.ItemListOrderAscending;

@ExternalDomain
public class ItemListOrderAscendingConverter implements DomainConverter<ItemListOrderAscending, String> {

	@Override
	public String fromDomainToValue(ItemListOrderAscending domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListOrderAscending fromValueToDomain(String value) {
		return new ITEM_LIST_ORDER_ASCENDING(value);
	}

}
