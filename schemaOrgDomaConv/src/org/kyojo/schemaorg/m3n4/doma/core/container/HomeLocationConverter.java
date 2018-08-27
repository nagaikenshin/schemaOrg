package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOME_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.HomeLocation;

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
