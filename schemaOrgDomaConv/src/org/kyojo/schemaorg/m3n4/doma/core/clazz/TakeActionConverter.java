package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TAKE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TakeAction;

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
