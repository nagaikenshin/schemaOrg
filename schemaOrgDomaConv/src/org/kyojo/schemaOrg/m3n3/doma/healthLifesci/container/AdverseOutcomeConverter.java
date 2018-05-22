package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ADVERSE_OUTCOME;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdverseOutcome;

@ExternalDomain
public class AdverseOutcomeConverter implements DomainConverter<AdverseOutcome, String> {

	@Override
	public String fromDomainToValue(AdverseOutcome domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdverseOutcome fromValueToDomain(String value) {
		return new ADVERSE_OUTCOME(value);
	}

}
