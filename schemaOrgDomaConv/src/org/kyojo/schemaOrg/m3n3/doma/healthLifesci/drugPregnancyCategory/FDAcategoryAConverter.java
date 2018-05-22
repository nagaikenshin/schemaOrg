package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_A;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPregnancyCategory.FDAcategoryA;

@ExternalDomain
public class FDAcategoryAConverter implements DomainConverter<FDAcategoryA, String> {

	@Override
	public String fromDomainToValue(FDAcategoryA domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAcategoryA fromValueToDomain(String value) {
		return new FDA_CATEGORY_A(value);
	}

}
