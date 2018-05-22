package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELIGIBLE_REGION;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleRegion;

@ExternalDomain
public class EligibleRegionConverter implements DomainConverter<EligibleRegion, String> {

	@Override
	public String fromDomainToValue(EligibleRegion domain) {
		return domain.getNativeValue();
	}

	@Override
	public EligibleRegion fromValueToDomain(String value) {
		return new ELIGIBLE_REGION(value);
	}

}
