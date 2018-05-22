package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TAKE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TakeAction;

@ExternalDomain
public class TakeActionConverter implements DomainConverter<TakeAction, String> {

	@Override
	public String fromDomainToValue(TakeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TakeAction fromValueToDomain(String value) {
		return new TAKE_ACTION(value);
	}

}
