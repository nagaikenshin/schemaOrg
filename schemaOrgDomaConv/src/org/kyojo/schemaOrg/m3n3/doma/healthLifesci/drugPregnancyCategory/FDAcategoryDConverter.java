package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_D;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPregnancyCategory.FDAcategoryD;

@ExternalDomain
public class FDAcategoryDConverter implements DomainConverter<FDAcategoryD, String> {

	@Override
	public String fromDomainToValue(FDAcategoryD domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAcategoryD fromValueToDomain(String value) {
		return new FDA_CATEGORY_D(value);
	}

}
