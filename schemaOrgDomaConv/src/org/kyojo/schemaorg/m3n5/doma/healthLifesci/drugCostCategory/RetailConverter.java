package org.kyojo.schemaorg.m3n5.doma.healthLifesci.drugCostCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.RETAIL;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.Retail;

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