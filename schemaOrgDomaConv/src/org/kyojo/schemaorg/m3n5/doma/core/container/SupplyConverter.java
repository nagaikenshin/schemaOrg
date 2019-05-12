package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUPPLY;
import org.kyojo.schemaorg.m3n5.core.Container.Supply;

@ExternalDomain
public class SupplyConverter implements DomainConverter<Supply, String> {

	@Override
	public String fromDomainToValue(Supply domain) {
		return domain.getNativeValue();
	}

	@Override
	public Supply fromValueToDomain(String value) {
		return new SUPPLY(value);
	}

}