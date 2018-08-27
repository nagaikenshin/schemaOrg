package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ITEM_LIST_ORDER;
import org.kyojo.schemaorg.m3n4.core.Container.ItemListOrder;

@ExternalDomain
public class ItemListOrderConverter implements DomainConverter<ItemListOrder, String> {

	@Override
	public String fromDomainToValue(ItemListOrder domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListOrder fromValueToDomain(String value) {
		return new ITEM_LIST_ORDER(value);
	}

}
