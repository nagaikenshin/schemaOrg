package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REGISTER_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.RegisterAction;

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
