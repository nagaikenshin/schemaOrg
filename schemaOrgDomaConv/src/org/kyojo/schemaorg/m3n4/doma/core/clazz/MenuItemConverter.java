package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MENU_ITEM;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuItem;

@ExternalDomain
public class MenuItemConverter implements DomainConverter<MenuItem, String> {

	@Override
	public String fromDomainToValue(MenuItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public MenuItem fromValueToDomain(String value) {
		return new MENU_ITEM(value);
	}

}
