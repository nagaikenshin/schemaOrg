package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISTANCE;
import org.kyojo.schemaOrg.m3n3.core.Container.Distance;

@ExternalDomain
public class DistanceConverter implements DomainConverter<Distance, String> {

	@Override
	public String fromDomainToValue(Distance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Distance fromValueToDomain(String value) {
		return new DISTANCE(value);
	}

}
