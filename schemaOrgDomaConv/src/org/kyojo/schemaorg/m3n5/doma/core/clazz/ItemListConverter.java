package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM_LIST;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemList;

@ExternalDomain
public class ItemListConverter implements DomainConverter<ItemList, String> {

	@Override
	public String fromDomainToValue(ItemList domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemList fromValueToDomain(String value) {
		return new ITEM_LIST(value);
	}

}
