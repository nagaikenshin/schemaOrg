package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAIN_ENTITY;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntity;

@ExternalDomain
public class MainEntityConverter implements DomainConverter<MainEntity, String> {

	@Override
	public String fromDomainToValue(MainEntity domain) {
		return domain.getNativeValue();
	}

	@Override
	public MainEntity fromValueToDomain(String value) {
		return new MAIN_ENTITY(value);
	}

}
