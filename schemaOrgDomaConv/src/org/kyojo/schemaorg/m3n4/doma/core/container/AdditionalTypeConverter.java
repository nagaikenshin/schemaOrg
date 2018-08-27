package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ADDITIONAL_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;

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
