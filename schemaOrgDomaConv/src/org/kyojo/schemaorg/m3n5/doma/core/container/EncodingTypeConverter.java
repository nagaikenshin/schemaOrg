package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ENCODING_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.EncodingType;

@ExternalDomain
public class EncodingTypeConverter implements DomainConverter<EncodingType, String> {

	@Override
	public String fromDomainToValue(EncodingType domain) {
		return domain.getNativeValue();
	}

	@Override
	public EncodingType fromValueToDomain(String value) {
		return new ENCODING_TYPE(value);
	}

}
