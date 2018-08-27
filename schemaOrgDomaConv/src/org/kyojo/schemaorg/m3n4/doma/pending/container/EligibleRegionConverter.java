package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ELIGIBLE_REGION;
import org.kyojo.schemaorg.m3n4.pending.Container.EligibleRegion;

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
