package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_MENU_SECTION;
import org.kyojo.schemaorg.m3n5.core.Container.HasMenuSection;

@ExternalDomain
public class HasMenuSectionConverter implements DomainConverter<HasMenuSection, String> {

	@Override
	public String fromDomainToValue(HasMenuSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasMenuSection fromValueToDomain(String value) {
		return new HAS_MENU_SECTION(value);
	}

}