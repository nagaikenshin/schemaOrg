package org.kyojo.schemaorg.m3n4.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_A;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPregnancyCategory.FDAcategoryA;

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
