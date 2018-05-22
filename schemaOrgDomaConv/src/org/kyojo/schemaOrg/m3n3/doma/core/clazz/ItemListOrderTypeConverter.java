package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_LIST_ORDER_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ItemListOrderType;

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
