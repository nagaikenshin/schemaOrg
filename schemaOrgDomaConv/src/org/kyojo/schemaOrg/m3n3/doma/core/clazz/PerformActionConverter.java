package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORM_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PerformAction;

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
