package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HAS_MENU_ITEM;
import org.kyojo.schemaorg.m3n4.core.Container.HasMenuItem;

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
