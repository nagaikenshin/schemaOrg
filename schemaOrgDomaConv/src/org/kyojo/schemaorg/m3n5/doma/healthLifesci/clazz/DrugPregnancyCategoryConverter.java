package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_PREGNANCY_CATEGORY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPregnancyCategory;

@ExternalDomain
public class DrugPregnancyCategoryConverter implements DomainConverter<DrugPregnancyCategory, String> {

	@Override
	public String fromDomainToValue(DrugPregnancyCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugPregnancyCategory fromValueToDomain(String value) {
		return new DRUG_PREGNANCY_CATEGORY(value);
	}

}