package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REGISTER_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RegisterAction;

@ExternalDomain
public class RegisterActionConverter implements DomainConverter<RegisterAction, String> {

	@Override
	public String fromDomainToValue(RegisterAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public RegisterAction fromValueToDomain(String value) {
		return new REGISTER_ACTION(value);
	}

}
