package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORMING_GROUP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PerformingGroup;

@ExternalDomain
public class PerformingGroupConverter implements DomainConverter<PerformingGroup, String> {

	@Override
	public String fromDomainToValue(PerformingGroup domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformingGroup fromValueToDomain(String value) {
		return new PERFORMING_GROUP(value);
	}

}
