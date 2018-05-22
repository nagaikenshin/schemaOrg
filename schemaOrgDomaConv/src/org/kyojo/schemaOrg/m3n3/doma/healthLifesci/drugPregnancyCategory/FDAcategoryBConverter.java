package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugPregnancyCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_B;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugPregnancyCategory.FDAcategoryB;

@ExternalDomain
public class FDAcategoryBConverter implements DomainConverter<FDAcategoryB, String> {

	@Override
	public String fromDomainToValue(FDAcategoryB domain) {
		return domain.getNativeValue();
	}

	@Override
	public FDAcategoryB fromValueToDomain(String value) {
		return new FDA_CATEGORY_B(value);
	}

}
