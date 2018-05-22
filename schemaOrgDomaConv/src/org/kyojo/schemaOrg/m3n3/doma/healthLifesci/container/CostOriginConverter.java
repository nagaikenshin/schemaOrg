package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.COST_ORIGIN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostOrigin;

@ExternalDomain
public class CostOriginConverter implements DomainConverter<CostOrigin, String> {

	@Override
	public String fromDomainToValue(CostOrigin domain) {
		return domain.getNativeValue();
	}

	@Override
	public CostOrigin fromValueToDomain(String value) {
		return new COST_ORIGIN(value);
	}

}
