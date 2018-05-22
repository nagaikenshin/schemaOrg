package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENCODING_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.EncodingType;

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
