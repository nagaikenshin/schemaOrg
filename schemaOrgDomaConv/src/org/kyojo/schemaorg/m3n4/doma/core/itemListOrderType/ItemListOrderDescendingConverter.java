package org.kyojo.schemaorg.m3n4.doma.core.itemListOrderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemListOrderType.ITEM_LIST_ORDER_DESCENDING;
import org.kyojo.schemaorg.m3n4.core.ItemListOrderType.ItemListOrderDescending;

@ExternalDomain
public class ItemListOrderDescendingConverter implements DomainConverter<ItemListOrderDescending, String> {

	@Override
	public String fromDomainToValue(ItemListOrderDescending domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListOrderDescending fromValueToDomain(String value) {
		return new ITEM_LIST_ORDER_DESCENDING(value);
	}

}
