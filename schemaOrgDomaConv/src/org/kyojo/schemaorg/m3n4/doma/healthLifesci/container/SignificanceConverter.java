package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SIGNIFICANCE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Significance;

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