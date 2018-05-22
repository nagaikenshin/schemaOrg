package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMMUNICATE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CommunicateAction;

@ExternalDomain
public class CommunicateActionConverter implements DomainConverter<CommunicateAction, String> {

	@Override
	public String fromDomainToValue(CommunicateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommunicateAction fromValueToDomain(String value) {
		return new COMMUNICATE_ACTION(value);
	}

}
