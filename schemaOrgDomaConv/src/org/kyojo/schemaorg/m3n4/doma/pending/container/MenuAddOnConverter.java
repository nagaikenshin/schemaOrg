package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.MENU_ADD_ON;
import org.kyojo.schemaorg.m3n4.pending.Container.MenuAddOn;

@ExternalDomain
public class MenuAddOnConverter implements DomainConverter<MenuAddOn, String> {

	@Override
	public String fromDomainToValue(MenuAddOn domain) {
		return domain.getNativeValue();
	}

	@Override
	public MenuAddOn fromValueToDomain(String value) {
		return new MENU_ADD_ON(value);
	}

}
