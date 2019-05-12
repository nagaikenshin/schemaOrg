package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERFORMANCE_ROLE;
import org.kyojo.schemaorg.m3n5.core.Clazz.PerformanceRole;

@ExternalDomain
public class PerformanceRoleConverter implements DomainConverter<PerformanceRole, String> {

	@Override
	public String fromDomainToValue(PerformanceRole domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformanceRole fromValueToDomain(String value) {
		return new PERFORMANCE_ROLE(value);
	}

}
