package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.NON_PROPRIETARY_NAME;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.NonProprietaryName;

@ExternalDomain
public class NonProprietaryNameConverter implements DomainConverter<NonProprietaryName, String> {

	@Override
	public String fromDomainToValue(NonProprietaryName domain) {
		return domain.getNativeValue();
	}

	@Override
	public NonProprietaryName fromValueToDomain(String value) {
		return new NON_PROPRIETARY_NAME(value);
	}

}
