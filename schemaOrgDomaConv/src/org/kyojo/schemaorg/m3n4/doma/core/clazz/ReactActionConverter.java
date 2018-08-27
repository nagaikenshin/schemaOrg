package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REACT_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReactAction;

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
