package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_LIST;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ItemList;

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
