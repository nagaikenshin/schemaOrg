package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GREATER;
import org.kyojo.schemaorg.m3n4.core.Container.Greater;

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
