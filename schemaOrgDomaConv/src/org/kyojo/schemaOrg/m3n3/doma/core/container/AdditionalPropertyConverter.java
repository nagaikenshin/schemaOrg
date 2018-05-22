package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADDITIONAL_PROPERTY;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty;

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
