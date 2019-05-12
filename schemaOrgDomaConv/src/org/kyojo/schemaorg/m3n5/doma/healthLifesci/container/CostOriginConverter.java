package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COST_ORIGIN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CostOrigin;

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