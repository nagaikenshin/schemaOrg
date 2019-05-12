package org.kyojo.schemaorg.m3n5.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_X;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugPregnancyCategory.FDAcategoryX;

@ExternalDomain
public class FDAcategoryXConverter implements DomainConverter<FDAcategoryX, String> {

	@Override
	public String fromDomainToValue(FDAcategoryX domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAcategoryX fromValueToDomain(String value) {
		return new FDA_CATEGORY_X(value);
	}

}
