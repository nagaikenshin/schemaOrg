package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PHYSIOLOGICAL_BENEFITS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PhysiologicalBenefits;

@ExternalDomain
public class PhysiologicalBenefitsConverter implements DomainConverter<PhysiologicalBenefits, String> {

	@Override
	public String fromDomainToValue(PhysiologicalBenefits domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhysiologicalBenefits fromValueToDomain(String value) {
		return new PHYSIOLOGICAL_BENEFITS(value);
	}

}
