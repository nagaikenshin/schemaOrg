package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TOURIST_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.TouristType;

@ExternalDomain
public class TouristTypeConverter implements DomainConverter<TouristType, String> {

	@Override
	public String fromDomainToValue(TouristType domain) {
		return domain.getNativeValue();
	}

	@Override
	public TouristType fromValueToDomain(String value) {
		return new TOURIST_TYPE(value);
	}

}
