package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENCODING;
import org.kyojo.schemaorg.m3n4.core.Container.Encoding;

@ExternalDomain
public class EncodingConverter implements DomainConverter<Encoding, String> {

	@Override
	public String fromDomainToValue(Encoding domain) {
		return domain.getNativeValue();
	}

	@Override
	public Encoding fromValueToDomain(String value) {
		return new ENCODING(value);
	}

}
