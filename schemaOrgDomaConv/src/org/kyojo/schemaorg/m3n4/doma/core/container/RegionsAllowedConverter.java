package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REGIONS_ALLOWED;
import org.kyojo.schemaorg.m3n4.core.Container.RegionsAllowed;

@ExternalDomain
public class RegionsAllowedConverter implements DomainConverter<RegionsAllowed, String> {

	@Override
	public String fromDomainToValue(RegionsAllowed domain) {
		return domain.getNativeValue();
	}

	@Override
	public RegionsAllowed fromValueToDomain(String value) {
		return new REGIONS_ALLOWED(value);
	}

}
