package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.COST_CATEGORY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostCategory;

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
