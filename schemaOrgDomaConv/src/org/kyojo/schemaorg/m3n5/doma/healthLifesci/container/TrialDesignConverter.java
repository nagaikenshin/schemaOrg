package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TRIAL_DESIGN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.TrialDesign;

@ExternalDomain
public class TrialDesignConverter implements DomainConverter<TrialDesign, String> {

	@Override
	public String fromDomainToValue(TrialDesign domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrialDesign fromValueToDomain(String value) {
		return new TRIAL_DESIGN(value);
	}

}
