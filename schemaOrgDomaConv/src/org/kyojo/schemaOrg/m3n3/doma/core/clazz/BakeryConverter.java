package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BAKERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Bakery;

@ExternalDomain
public class BakeryConverter implements DomainConverter<Bakery, String> {

	@Override
	public String fromDomainToValue(Bakery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bakery fromValueToDomain(String value) {
		return new BAKERY(value);
	}

}
