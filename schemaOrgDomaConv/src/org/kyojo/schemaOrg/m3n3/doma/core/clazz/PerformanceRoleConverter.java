package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORMANCE_ROLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PerformanceRole;

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
