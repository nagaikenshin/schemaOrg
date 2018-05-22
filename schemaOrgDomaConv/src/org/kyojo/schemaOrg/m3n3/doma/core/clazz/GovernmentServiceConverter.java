package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GOVERNMENT_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GovernmentService;

@ExternalDomain
public class GovernmentServiceConverter implements DomainConverter<GovernmentService, String> {

	@Override
	public String fromDomainToValue(GovernmentService domain) {
		return domain.getNativeValue();
	}

	@Override
	public GovernmentService fromValueToDomain(String value) {
		return new GOVERNMENT_SERVICE(value);
	}

}
