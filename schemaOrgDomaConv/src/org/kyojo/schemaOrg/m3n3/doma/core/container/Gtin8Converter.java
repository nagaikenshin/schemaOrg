package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GTIN8;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin8;

@ExternalDomain
public class Gtin8Converter implements DomainConverter<Gtin8, String> {

	@Override
	public String fromDomainToValue(Gtin8 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gtin8 fromValueToDomain(String value) {
		return new GTIN8(value);
	}

}
