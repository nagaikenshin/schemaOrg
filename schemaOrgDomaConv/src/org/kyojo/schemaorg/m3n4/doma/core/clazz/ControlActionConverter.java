package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTROL_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ControlAction;

@ExternalDomain
public class ControlActionConverter implements DomainConverter<ControlAction, String> {

	@Override
	public String fromDomainToValue(ControlAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ControlAction fromValueToDomain(String value) {
		return new CONTROL_ACTION(value);
	}

}
