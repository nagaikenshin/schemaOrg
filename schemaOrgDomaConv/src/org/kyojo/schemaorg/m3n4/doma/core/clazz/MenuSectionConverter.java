package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MENU_SECTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;

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
