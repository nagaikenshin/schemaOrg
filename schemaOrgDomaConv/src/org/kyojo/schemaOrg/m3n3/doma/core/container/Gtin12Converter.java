package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GTIN12;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin12;

@ExternalDomain
public class Gtin12Converter implements DomainConverter<Gtin12, String> {

	@Override
	public String fromDomainToValue(Gtin12 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gtin12 fromValueToDomain(String value) {
		return new GTIN12(value);
	}

}
