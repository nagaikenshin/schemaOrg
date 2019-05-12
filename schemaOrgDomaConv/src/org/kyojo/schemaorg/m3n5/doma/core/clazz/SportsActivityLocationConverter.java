package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_ACTIVITY_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SportsActivityLocation;

@ExternalDomain
public class SportsActivityLocationConverter implements DomainConverter<SportsActivityLocation, String> {

	@Override
	public String fromDomainToValue(SportsActivityLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportsActivityLocation fromValueToDomain(String value) {
		return new SPORTS_ACTIVITY_LOCATION(value);
	}

}
