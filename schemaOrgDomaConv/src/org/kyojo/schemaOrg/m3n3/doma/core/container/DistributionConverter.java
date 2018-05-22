package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISTRIBUTION;
import org.kyojo.schemaOrg.m3n3.core.Container.Distribution;

@ExternalDomain
public class DistributionConverter implements DomainConverter<Distribution, String> {

	@Override
	public String fromDomainToValue(Distribution domain) {
		return domain.getNativeValue();
	}

	@Override
	public Distribution fromValueToDomain(String value) {
		return new DISTRIBUTION(value);
	}

}
