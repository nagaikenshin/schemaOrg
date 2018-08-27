package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SUBSTANCE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Substance;

@ExternalDomain
public class SubstanceConverter implements DomainConverter<Substance, String> {

	@Override
	public String fromDomainToValue(Substance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Substance fromValueToDomain(String value) {
		return new SUBSTANCE(value);
	}

}
