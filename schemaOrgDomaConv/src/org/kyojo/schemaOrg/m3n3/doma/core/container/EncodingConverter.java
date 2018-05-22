package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENCODING;
import org.kyojo.schemaOrg.m3n3.core.Container.Encoding;

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
