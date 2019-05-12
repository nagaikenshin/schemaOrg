package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.AVAILABLE_IN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.AvailableIn;

@ExternalDomain
public class AvailableInConverter implements DomainConverter<AvailableIn, String> {

	@Override
	public String fromDomainToValue(AvailableIn domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableIn fromValueToDomain(String value) {
		return new AVAILABLE_IN(value);
	}

}