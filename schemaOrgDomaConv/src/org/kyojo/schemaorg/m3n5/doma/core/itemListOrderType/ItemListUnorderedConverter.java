package org.kyojo.schemaorg.m3n5.doma.core.itemListOrderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.itemListOrderType.ITEM_LIST_UNORDERED;
import org.kyojo.schemaorg.m3n5.core.ItemListOrderType.ItemListUnordered;

@ExternalDomain
public class ItemListUnorderedConverter implements DomainConverter<ItemListUnordered, String> {

	@Override
	public String fromDomainToValue(ItemListUnordered domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListUnordered fromValueToDomain(String value) {
		return new ITEM_LIST_UNORDERED(value);
	}

}
