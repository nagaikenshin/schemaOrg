package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MENU_SECTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MenuSection;

@ExternalDomain
public class MenuSectionConverter implements DomainConverter<MenuSection, String> {

	@Override
	public String fromDomainToValue(MenuSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public MenuSection fromValueToDomain(String value) {
		return new MENU_SECTION(value);
	}

}
