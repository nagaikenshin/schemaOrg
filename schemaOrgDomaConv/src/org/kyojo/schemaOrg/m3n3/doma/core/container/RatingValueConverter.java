package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RATING_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Container.RatingValue;

@ExternalDomain
public class RatingValueConverter implements DomainConverter<RatingValue, String> {

	@Override
	public String fromDomainToValue(RatingValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public RatingValue fromValueToDomain(String value) {
		return new RATING_VALUE(value);
	}

}
