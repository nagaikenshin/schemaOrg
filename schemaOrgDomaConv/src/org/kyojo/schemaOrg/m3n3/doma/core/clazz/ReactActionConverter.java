package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REACT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReactAction;

@ExternalDomain
public class ReactActionConverter implements DomainConverter<ReactAction, String> {

	@Override
	public String fromDomainToValue(ReactAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReactAction fromValueToDomain(String value) {
		return new REACT_ACTION(value);
	}

}
