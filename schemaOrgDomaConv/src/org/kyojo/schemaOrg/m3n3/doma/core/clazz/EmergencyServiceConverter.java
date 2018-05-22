package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EMERGENCY_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EmergencyService;

@ExternalDomain
public class EmergencyServiceConverter implements DomainConverter<EmergencyService, String> {

	@Override
	public String fromDomainToValue(EmergencyService domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmergencyService fromValueToDomain(String value) {
		return new EMERGENCY_SERVICE(value);
	}

}
