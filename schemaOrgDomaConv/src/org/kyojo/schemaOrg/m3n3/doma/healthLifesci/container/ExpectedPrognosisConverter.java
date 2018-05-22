package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EXPECTED_PROGNOSIS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExpectedPrognosis;

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
