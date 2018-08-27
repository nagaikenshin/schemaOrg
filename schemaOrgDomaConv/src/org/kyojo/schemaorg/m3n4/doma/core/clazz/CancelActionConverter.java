package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CANCEL_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.CancelAction;

@ExternalDomain
public class CancelActionConverter implements DomainConverter<CancelAction, String> {

	@Override
	public String fromDomainToValue(CancelAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CancelAction fromValueToDomain(String value) {
		return new CANCEL_ACTION(value);
	}

}
