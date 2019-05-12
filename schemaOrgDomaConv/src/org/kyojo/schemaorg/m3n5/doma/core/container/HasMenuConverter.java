package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_MENU;
import org.kyojo.schemaorg.m3n5.core.Container.HasMenu;

@ExternalDomain
public class HasMenuConverter implements DomainConverter<HasMenu, String> {

	@Override
	public String fromDomainToValue(HasMenu domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasMenu fromValueToDomain(String value) {
		return new HAS_MENU(value);
	}

}