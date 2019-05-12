package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FIND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.FindAction;

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
