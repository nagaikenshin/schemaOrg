package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SERIOUS_ADVERSE_OUTCOME;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SeriousAdverseOutcome;

@ExternalDomain
public class SeriousAdverseOutcomeConverter implements DomainConverter<SeriousAdverseOutcome, String> {

	@Override
	public String fromDomainToValue(SeriousAdverseOutcome domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeriousAdverseOutcome fromValueToDomain(String value) {
		return new SERIOUS_ADVERSE_OUTCOME(value);
	}

}
