package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INELIGIBLE_REGION;
import org.kyojo.schemaOrg.m3n3.core.Container.IneligibleRegion;

@ExternalDomain
public class IneligibleRegionConverter implements DomainConverter<IneligibleRegion, String> {

	@Override
	public String fromDomainToValue(IneligibleRegion domain) {
		return domain.getNativeValue();
	}

	@Override
	public IneligibleRegion fromValueToDomain(String value) {
		return new INELIGIBLE_REGION(value);
	}

}
