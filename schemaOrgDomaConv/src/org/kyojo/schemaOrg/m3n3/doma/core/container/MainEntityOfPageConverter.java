package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAIN_ENTITY_OF_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;

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
