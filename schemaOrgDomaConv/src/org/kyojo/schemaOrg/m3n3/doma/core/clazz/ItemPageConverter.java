package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ItemPage;

@ExternalDomain
public class ItemPageConverter implements DomainConverter<ItemPage, String> {

	@Override
	public String fromDomainToValue(ItemPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemPage fromValueToDomain(String value) {
		return new ITEM_PAGE(value);
	}

}
