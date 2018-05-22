package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_X;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPregnancyCategory.FDAcategoryX;

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
