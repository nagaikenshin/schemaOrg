package org.kyojo.schemaOrg.m3n3.doma.core.itemListOrderType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemListOrderType.ITEM_LIST_UNORDERED;
import org.kyojo.schemaOrg.m3n3.core.ItemListOrderType.ItemListUnordered;

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
