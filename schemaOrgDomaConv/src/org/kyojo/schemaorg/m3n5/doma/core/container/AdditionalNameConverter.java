package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADDITIONAL_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalName;

@ExternalDomain
public class AdditionalNameConverter implements DomainConverter<AdditionalName, String> {

	@Override
	public String fromDomainToValue(AdditionalName domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdditionalName fromValueToDomain(String value) {
		return new ADDITIONAL_NAME(value);
	}

}
