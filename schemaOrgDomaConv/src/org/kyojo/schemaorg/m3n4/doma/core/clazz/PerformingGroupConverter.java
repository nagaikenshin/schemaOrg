package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERFORMING_GROUP;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingGroup;

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
