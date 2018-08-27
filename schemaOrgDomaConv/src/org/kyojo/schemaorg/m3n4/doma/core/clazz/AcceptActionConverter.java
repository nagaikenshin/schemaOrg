package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCEPT_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AcceptAction;

@ExternalDomain
public class AcceptActionConverter implements DomainConverter<AcceptAction, String> {

	@Override
	public String fromDomainToValue(AcceptAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcceptAction fromValueToDomain(String value) {
		return new ACCEPT_ACTION(value);
	}

}
