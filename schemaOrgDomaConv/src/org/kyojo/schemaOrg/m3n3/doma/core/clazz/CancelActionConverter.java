package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CANCEL_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CancelAction;

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
