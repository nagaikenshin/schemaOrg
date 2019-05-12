package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM_LIST_ORDER_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemListOrderType;

@ExternalDomain
public class ItemListOrderTypeConverter implements DomainConverter<ItemListOrderType, String> {

	@Override
	public String fromDomainToValue(ItemListOrderType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListOrderType fromValueToDomain(String value) {
		return new ITEM_LIST_ORDER_TYPE(value);
	}

}
