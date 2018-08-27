package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MAIN_ENTITY_OF_PAGE;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;

@ExternalDomain
public class MainEntityOfPageConverter implements DomainConverter<MainEntityOfPage, String> {

	@Override
	public String fromDomainToValue(MainEntityOfPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public MainEntityOfPage fromValueToDomain(String value) {
		return new MAIN_ENTITY_OF_PAGE(value);
	}

}
