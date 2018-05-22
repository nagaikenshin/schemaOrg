package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INFORM_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InformAction;

@ExternalDomain
public class InformActionConverter implements DomainConverter<InformAction, String> {

	@Override
	public String fromDomainToValue(InformAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public InformAction fromValueToDomain(String value) {
		return new INFORM_ACTION(value);
	}

}
