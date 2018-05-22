package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.REGION_DRAINED;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RegionDrained;

@ExternalDomain
public class RegionDrainedConverter implements DomainConverter<RegionDrained, String> {

	@Override
	public String fromDomainToValue(RegionDrained domain) {
		return domain.getNativeValue();
	}

	@Override
	public RegionDrained fromValueToDomain(String value) {
		return new REGION_DRAINED(value);
	}

}
