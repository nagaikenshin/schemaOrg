package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FIND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FindAction;

@ExternalDomain
public class FindActionConverter implements DomainConverter<FindAction, String> {

	@Override
	public String fromDomainToValue(FindAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public FindAction fromValueToDomain(String value) {
		return new FIND_ACTION(value);
	}

}
