package org.kyojo.schemaorg.m3n4.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.AEROBIC_ACTIVITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.AerobicActivity;

@ExternalDomain
public class AerobicActivityConverter implements DomainConverter<AerobicActivity, String> {

	@Override
	public String fromDomainToValue(AerobicActivity domain) {
		return domain.getNativeValue();
	}

	@Override
	public AerobicActivity fromValueToDomain(String value) {
		return new AEROBIC_ACTIVITY(value);
	}

}
