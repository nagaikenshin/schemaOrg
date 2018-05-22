package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_OFFERED;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemOffered;

@ExternalDomain
public class ItemOfferedConverter implements DomainConverter<ItemOffered, String> {

	@Override
	public String fromDomainToValue(ItemOffered domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemOffered fromValueToDomain(String value) {
		return new ITEM_OFFERED(value);
	}

}
