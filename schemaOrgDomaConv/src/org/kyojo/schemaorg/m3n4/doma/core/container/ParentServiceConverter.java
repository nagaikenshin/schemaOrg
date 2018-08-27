package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PARENT_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Container.ParentService;

@ExternalDomain
public class ParentServiceConverter implements DomainConverter<ParentService, String> {

	@Override
	public String fromDomainToValue(ParentService domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParentService fromValueToDomain(String value) {
		return new PARENT_SERVICE(value);
	}

}
