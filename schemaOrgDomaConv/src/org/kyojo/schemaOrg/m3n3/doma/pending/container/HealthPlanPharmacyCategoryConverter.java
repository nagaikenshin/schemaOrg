package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_PHARMACY_CATEGORY;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanPharmacyCategory;

@ExternalDomain
public class HealthPlanPharmacyCategoryConverter implements DomainConverter<HealthPlanPharmacyCategory, String> {

	@Override
	public String fromDomainToValue(HealthPlanPharmacyCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanPharmacyCategory fromValueToDomain(String value) {
		return new HEALTH_PLAN_PHARMACY_CATEGORY(value);
	}

}
