package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONFIRM_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ConfirmAction;

@ExternalDomain
public class ConfirmActionConverter implements DomainConverter<ConfirmAction, String> {

	@Override
	public String fromDomainToValue(ConfirmAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ConfirmAction fromValueToDomain(String value) {
		return new CONFIRM_ACTION(value);
	}

}
