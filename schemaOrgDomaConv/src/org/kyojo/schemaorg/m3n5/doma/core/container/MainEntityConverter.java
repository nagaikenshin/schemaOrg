package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MAIN_ENTITY;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntity;

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