package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ORIGIN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Origin;

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
