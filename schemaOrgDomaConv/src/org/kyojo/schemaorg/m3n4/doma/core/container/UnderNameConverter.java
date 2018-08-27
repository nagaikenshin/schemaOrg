package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.UNDER_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.UnderName;

@ExternalDomain
public class UnderNameConverter implements DomainConverter<UnderName, String> {

	@Override
	public String fromDomainToValue(UnderName domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnderName fromValueToDomain(String value) {
		return new UNDER_NAME(value);
	}

}