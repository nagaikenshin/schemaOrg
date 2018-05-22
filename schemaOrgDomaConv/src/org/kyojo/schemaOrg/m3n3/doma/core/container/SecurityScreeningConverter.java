package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SECURITY_SCREENING;
import org.kyojo.schemaOrg.m3n3.core.Container.SecurityScreening;

@ExternalDomain
public class SecurityScreeningConverter implements DomainConverter<SecurityScreening, String> {

	@Override
	public String fromDomainToValue(SecurityScreening domain) {
		return domain.getNativeValue();
	}

	@Override
	public SecurityScreening fromValueToDomain(String value) {
		return new SECURITY_SCREENING(value);
	}

}
