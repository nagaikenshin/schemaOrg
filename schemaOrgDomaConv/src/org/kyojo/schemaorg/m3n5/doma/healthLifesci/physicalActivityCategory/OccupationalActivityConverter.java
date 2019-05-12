package org.kyojo.schemaorg.m3n5.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.physicalActivityCategory.OCCUPATIONAL_ACTIVITY;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalActivityCategory.OccupationalActivity;

@ExternalDomain
public class OccupationalActivityConverter implements DomainConverter<OccupationalActivity, String> {

	@Override
	public String fromDomainToValue(OccupationalActivity domain) {
		return domain.getNativeValue();
	}

	@Override
	public OccupationalActivity fromValueToDomain(String value) {
		return new OCCUPATIONAL_ACTIVITY(value);
	}

}
