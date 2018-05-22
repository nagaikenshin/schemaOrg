package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTS_ACTIVITY_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SportsActivityLocation;

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
