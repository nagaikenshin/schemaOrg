package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MENU_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MenuItem;

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
