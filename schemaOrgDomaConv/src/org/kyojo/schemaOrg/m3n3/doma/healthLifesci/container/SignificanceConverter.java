package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SIGNIFICANCE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Significance;

@ExternalDomain
public class SignificanceConverter implements DomainConverter<Significance, String> {

	@Override
	public String fromDomainToValue(Significance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Significance fromValueToDomain(String value) {
		return new SIGNIFICANCE(value);
	}

}
