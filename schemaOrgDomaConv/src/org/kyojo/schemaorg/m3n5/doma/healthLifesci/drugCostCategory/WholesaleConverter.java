package org.kyojo.schemaorg.m3n5.doma.healthLifesci.drugCostCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.WHOLESALE;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.Wholesale;

@ExternalDomain
public class WholesaleConverter implements DomainConverter<Wholesale, String> {

	@Override
	public String fromDomainToValue(Wholesale domain) {
		return domain.getNativeValue();
	}

	@Override
	public Wholesale fromValueToDomain(String value) {
		return new WHOLESALE(value);
	}

}