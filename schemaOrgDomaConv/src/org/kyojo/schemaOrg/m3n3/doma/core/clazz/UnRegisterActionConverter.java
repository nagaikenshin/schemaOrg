package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UN_REGISTER_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.UnRegisterAction;

@ExternalDomain
public class UnRegisterActionConverter implements DomainConverter<UnRegisterAction, String> {

	@Override
	public String fromDomainToValue(UnRegisterAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnRegisterAction fromValueToDomain(String value) {
		return new UN_REGISTER_ACTION(value);
	}

}
