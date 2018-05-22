package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MENU;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Menu;

@ExternalDomain
public class MenuConverter implements DomainConverter<Menu, String> {

	@Override
	public String fromDomainToValue(Menu domain) {
		return domain.getNativeValue();
	}

	@Override
	public Menu fromValueToDomain(String value) {
		return new MENU(value);
	}

}
