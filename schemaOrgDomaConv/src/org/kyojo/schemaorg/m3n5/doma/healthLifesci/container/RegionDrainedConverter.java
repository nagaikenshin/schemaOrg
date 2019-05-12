package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.REGION_DRAINED;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RegionDrained;

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
