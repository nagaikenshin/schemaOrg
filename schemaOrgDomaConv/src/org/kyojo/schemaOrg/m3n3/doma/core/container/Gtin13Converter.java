package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GTIN13;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin13;

@ExternalDomain
public class Gtin13Converter implements DomainConverter<Gtin13, String> {

	@Override
	public String fromDomainToValue(Gtin13 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gtin13 fromValueToDomain(String value) {
		return new GTIN13(value);
	}

}
