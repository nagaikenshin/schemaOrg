package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOME_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.HomeLocation;

@ExternalDomain
public class HomeLocationConverter implements DomainConverter<HomeLocation, String> {

	@Override
	public String fromDomainToValue(HomeLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public HomeLocation fromValueToDomain(String value) {
		return new HOME_LOCATION(value);
	}

}
