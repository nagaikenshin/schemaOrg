package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BAKERY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Bakery;

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
