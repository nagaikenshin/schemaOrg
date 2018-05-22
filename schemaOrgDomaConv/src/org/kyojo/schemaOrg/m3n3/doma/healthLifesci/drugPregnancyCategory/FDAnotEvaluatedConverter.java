package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPregnancyCategory.FDA_NOT_EVALUATED;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPregnancyCategory.FDAnotEvaluated;

@ExternalDomain
public class FDAnotEvaluatedConverter implements DomainConverter<FDAnotEvaluated, String> {

	@Override
	public String fromDomainToValue(FDAnotEvaluated domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAnotEvaluated fromValueToDomain(String value) {
		return new FDA_NOT_EVALUATED(value);
	}

}
