package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMMUNICATE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommunicateAction;

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
