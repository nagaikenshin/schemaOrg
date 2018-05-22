package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ALGORITHM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Algorithm;

@ExternalDomain
public class AlgorithmConverter implements DomainConverter<Algorithm, String> {

	@Override
	public String fromDomainToValue(Algorithm domain) {
		return domain.getNativeValue();
	}

	@Override
	public Algorithm fromValueToDomain(String value) {
		return new ALGORITHM(value);
	}

}
