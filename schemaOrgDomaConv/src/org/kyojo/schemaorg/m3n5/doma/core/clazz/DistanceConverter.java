package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DISTANCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Distance;

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
