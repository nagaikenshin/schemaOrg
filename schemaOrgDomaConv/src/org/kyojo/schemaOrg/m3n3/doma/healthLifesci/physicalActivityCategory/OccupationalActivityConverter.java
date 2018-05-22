package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalActivityCategory.OCCUPATIONAL_ACTIVITY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalActivityCategory.OccupationalActivity;

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
