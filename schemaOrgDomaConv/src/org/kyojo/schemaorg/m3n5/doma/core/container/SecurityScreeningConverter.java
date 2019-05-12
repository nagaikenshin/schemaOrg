package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SECURITY_SCREENING;
import org.kyojo.schemaorg.m3n5.core.Container.SecurityScreening;

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
