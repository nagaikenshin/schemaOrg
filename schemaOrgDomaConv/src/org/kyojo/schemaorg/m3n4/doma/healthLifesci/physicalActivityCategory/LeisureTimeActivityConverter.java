package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.LEISURE_TIME_ACTIVITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.LeisureTimeActivity;

@ExternalDomain
public class LeisureTimeActivityConverter implements DomainConverter<LeisureTimeActivity, String> {

	@Override
	public String fromDomainToValue(LeisureTimeActivity domain) {
		return domain.getNativeValue();
	}

	@Override
	public LeisureTimeActivity fromValueToDomain(String value) {
		return new LEISURE_TIME_ACTIVITY(value);
	}

}
