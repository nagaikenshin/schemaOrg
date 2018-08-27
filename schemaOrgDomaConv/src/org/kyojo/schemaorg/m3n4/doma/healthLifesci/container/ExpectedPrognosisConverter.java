package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXPECTED_PROGNOSIS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExpectedPrognosis;

@ExternalDomain
public class ExpectedPrognosisConverter implements DomainConverter<ExpectedPrognosis, String> {

	@Override
	public String fromDomainToValue(ExpectedPrognosis domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExpectedPrognosis fromValueToDomain(String value) {
		return new EXPECTED_PROGNOSIS(value);
	}

}
