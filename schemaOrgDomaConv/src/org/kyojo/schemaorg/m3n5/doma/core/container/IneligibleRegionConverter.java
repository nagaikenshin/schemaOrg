package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INELIGIBLE_REGION;
import org.kyojo.schemaorg.m3n5.core.Container.IneligibleRegion;

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
