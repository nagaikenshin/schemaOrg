package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ITEM_LIST_ELEMENT;
import org.kyojo.schemaorg.m3n4.core.Container.ItemListElement;

@ExternalDomain
public class ItemListElementConverter implements DomainConverter<ItemListElement, String> {

	@Override
	public String fromDomainToValue(ItemListElement domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemListElement fromValueToDomain(String value) {
		return new ITEM_LIST_ELEMENT(value);
	}

}
