package org.kyojo.schemaorg.m3n5.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_C;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugPregnancyCategory.FDAcategoryC;

@ExternalDomain
public class FDAcategoryCConverter implements DomainConverter<FDAcategoryC, String> {

	@Override
	public String fromDomainToValue(FDAcategoryC domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAcategoryC fromValueToDomain(String value) {
		return new FDA_CATEGORY_C(value);
	}

}