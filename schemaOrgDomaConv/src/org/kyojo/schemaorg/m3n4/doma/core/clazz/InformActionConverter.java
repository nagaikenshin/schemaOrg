package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INFORM_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.InformAction;

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
