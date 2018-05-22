package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOX;
import org.kyojo.schemaOrg.m3n3.core.Container.Box;

@ExternalDomain
public class BoxConverter implements DomainConverter<Box, String> {

	@Override
	public String fromDomainToValue(Box domain) {
		return domain.getNativeValue();
	}

	@Override
	public Box fromValueToDomain(String value) {
		return new BOX(value);
	}

}
