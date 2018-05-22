package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADDITIONAL_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;

@ExternalDomain
public class AdditionalTypeConverter implements DomainConverter<AdditionalType, String> {

	@Override
	public String fromDomainToValue(AdditionalType domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdditionalType fromValueToDomain(String value) {
		return new ADDITIONAL_TYPE(value);
	}

}
