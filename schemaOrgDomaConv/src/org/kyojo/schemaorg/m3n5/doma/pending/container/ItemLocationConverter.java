package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.ITEM_LOCATION;
import org.kyojo.schemaorg.m3n5.pending.Container.ItemLocation;

@ExternalDomain
public class ItemLocationConverter implements DomainConverter<ItemLocation, String> {

	@Override
	public String fromDomainToValue(ItemLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemLocation fromValueToDomain(String value) {
		return new ITEM_LOCATION(value);
	}

}
