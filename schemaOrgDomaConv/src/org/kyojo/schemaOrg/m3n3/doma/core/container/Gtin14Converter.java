package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GTIN14;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin14;

@ExternalDomain
public class Gtin14Converter implements DomainConverter<Gtin14, String> {

	@Override
	public String fromDomainToValue(Gtin14 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gtin14 fromValueToDomain(String value) {
		return new GTIN14(value);
	}

}
