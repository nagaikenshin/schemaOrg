package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARENT_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Container.ParentService;

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
