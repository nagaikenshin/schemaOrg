package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugCostCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugCostCategory.RETAIL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugCostCategory.Retail;

@ExternalDomain
public class RetailConverter implements DomainConverter<Retail, String> {

	@Override
	public String fromDomainToValue(Retail domain) {
		return domain.getNativeValue();
	}

	@Override
	public Retail fromValueToDomain(String value) {
		return new RETAIL(value);
	}

}
