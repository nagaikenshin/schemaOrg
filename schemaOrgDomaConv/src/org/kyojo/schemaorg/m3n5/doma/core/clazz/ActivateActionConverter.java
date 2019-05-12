package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACTIVATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ActivateAction;

@ExternalDomain
public class ActivateActionConverter implements DomainConverter<ActivateAction, String> {

	@Override
	public String fromDomainToValue(ActivateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActivateAction fromValueToDomain(String value) {
		return new ACTIVATE_ACTION(value);
	}

}
