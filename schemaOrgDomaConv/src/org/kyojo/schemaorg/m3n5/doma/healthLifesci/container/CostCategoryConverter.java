package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COST_CATEGORY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CostCategory;

@ExternalDomain
public class CostCategoryConverter implements DomainConverter<CostCategory, String> {

	@Override
	public String fromDomainToValue(CostCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public CostCategory fromValueToDomain(String value) {
		return new COST_CATEGORY(value);
	}

}