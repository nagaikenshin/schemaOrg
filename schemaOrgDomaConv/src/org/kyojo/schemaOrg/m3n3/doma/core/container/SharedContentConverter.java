package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SHARED_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SharedContent;

@ExternalDomain
public class SharedContentConverter implements DomainConverter<SharedContent, String> {

	@Override
	public String fromDomainToValue(SharedContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SharedContent fromValueToDomain(String value) {
		return new SHARED_CONTENT(value);
	}

}
