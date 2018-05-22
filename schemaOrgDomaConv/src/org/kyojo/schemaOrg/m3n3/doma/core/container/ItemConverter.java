package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.Item;

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
