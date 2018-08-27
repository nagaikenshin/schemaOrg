package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SHARED_CONTENT;
import org.kyojo.schemaorg.m3n4.core.Container.SharedContent;

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
