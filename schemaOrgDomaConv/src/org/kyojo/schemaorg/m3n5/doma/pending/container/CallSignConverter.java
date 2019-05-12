package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CALL_SIGN;
import org.kyojo.schemaorg.m3n5.pending.Container.CallSign;

@ExternalDomain
public class CallSignConverter implements DomainConverter<CallSign, String> {

	@Override
	public String fromDomainToValue(CallSign domain) {
		return domain.getNativeValue();
	}

	@Override
	public CallSign fromValueToDomain(String value) {
		return new CALL_SIGN(value);
	}

}
