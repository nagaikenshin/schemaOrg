package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPLY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ApplyAction;

@ExternalDomain
public class ApplyActionConverter implements DomainConverter<ApplyAction, String> {

	@Override
	public String fromDomainToValue(ApplyAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplyAction fromValueToDomain(String value) {
		return new APPLY_ACTION(value);
	}

}
