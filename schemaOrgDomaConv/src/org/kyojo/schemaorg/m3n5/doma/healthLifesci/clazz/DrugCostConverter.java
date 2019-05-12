package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_COST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCost;

@ExternalDomain
public class DrugCostConverter implements DomainConverter<DrugCost, String> {

	@Override
	public String fromDomainToValue(DrugCost domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrugCost fromValueToDomain(String value) {
		return new DRUG_COST(value);
	}

}
