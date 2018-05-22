package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GREATER;
import org.kyojo.schemaOrg.m3n3.core.Container.Greater;

@ExternalDomain
public class GreaterConverter implements DomainConverter<Greater, String> {

	@Override
	public String fromDomainToValue(Greater domain) {
		return domain.getNativeValue();
	}

	@Override
	public Greater fromValueToDomain(String value) {
		return new GREATER(value);
	}

}
