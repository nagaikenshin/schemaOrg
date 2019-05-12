package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ORIGIN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Origin;

@ExternalDomain
public class OriginConverter implements DomainConverter<Origin, String> {

	@Override
	public String fromDomainToValue(Origin domain) {
		return domain.getNativeValue();
	}

	@Override
	public Origin fromValueToDomain(String value) {
		return new ORIGIN(value);
	}

}