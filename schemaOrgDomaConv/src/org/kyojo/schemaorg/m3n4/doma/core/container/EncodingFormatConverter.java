package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENCODING_FORMAT;
import org.kyojo.schemaorg.m3n4.core.Container.EncodingFormat;

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
