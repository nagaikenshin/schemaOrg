package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM;
import org.kyojo.schemaorg.m3n5.core.Container.Item;

@ExternalDomain
public class ItemConverter implements DomainConverter<Item, String> {

	@Override
	public String fromDomainToValue(Item domain) {
		return domain.getNativeValue();
	}

	@Override
	public Item fromValueToDomain(String value) {
		return new ITEM(value);
	}

}