package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENCODING_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.Container.EncodingFormat;

@ExternalDomain
public class EncodingFormatConverter implements DomainConverter<EncodingFormat, String> {

	@Override
	public String fromDomainToValue(EncodingFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public EncodingFormat fromValueToDomain(String value) {
		return new ENCODING_FORMAT(value);
	}

}
