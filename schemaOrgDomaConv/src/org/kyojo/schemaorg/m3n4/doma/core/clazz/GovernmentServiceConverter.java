package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GOVERNMENT_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentService;

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
