package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.FREQUENCY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Frequency;

@ExternalDomain
public class FrequencyConverter implements DomainConverter<Frequency, String> {

	@Override
	public String fromDomainToValue(Frequency domain) {
		return domain.getNativeValue();
	}

	@Override
	public Frequency fromValueToDomain(String value) {
		return new FREQUENCY(value);
	}

}
