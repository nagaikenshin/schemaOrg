package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERFORM_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformAction;

@ExternalDomain
public class PerformActionConverter implements DomainConverter<PerformAction, String> {

	@Override
	public String fromDomainToValue(PerformAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformAction fromValueToDomain(String value) {
		return new PERFORM_ACTION(value);
	}

}
