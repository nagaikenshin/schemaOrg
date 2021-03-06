package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_COST_CATEGORY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCostCategory;

@ExternalDomain
public class DrugCostCategoryConverter implements DomainConverter<DrugCostCategory, String> {

	@Override
	public String fromDomainToValue(DrugCostCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugCostCategory fromValueToDomain(String value) {
		return new DRUG_COST_CATEGORY(value);
	}

}
