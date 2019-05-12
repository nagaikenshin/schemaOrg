package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADDITIONAL_PROPERTY;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalProperty;

@ExternalDomain
public class AdditionalPropertyConverter implements DomainConverter<AdditionalProperty, String> {

	@Override
	public String fromDomainToValue(AdditionalProperty domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdditionalProperty fromValueToDomain(String value) {
		return new ADDITIONAL_PROPERTY(value);
	}

}