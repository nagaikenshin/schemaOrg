package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG_COST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DrugCost;

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
