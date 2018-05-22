package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAS_MENU_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.HasMenuItem;

@ExternalDomain
public class HasMenuItemConverter implements DomainConverter<HasMenuItem, String> {

	@Override
	public String fromDomainToValue(HasMenuItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasMenuItem fromValueToDomain(String value) {
		return new HAS_MENU_ITEM(value);
	}

}
