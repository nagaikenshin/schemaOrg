package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLIC_ACCESS;
import org.kyojo.schemaOrg.m3n3.core.Container.PublicAccess;

@ExternalDomain
public class PublicAccessConverter implements DomainConverter<PublicAccess, Boolean> {

	@Override
	public Boolean fromDomainToValue(PublicAccess domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicAccess fromValueToDomain(Boolean value) {
		return new PUBLIC_ACCESS(value);
	}

}
