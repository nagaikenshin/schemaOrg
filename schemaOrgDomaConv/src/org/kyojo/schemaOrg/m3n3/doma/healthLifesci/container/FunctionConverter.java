package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.FUNCTION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Function;

@ExternalDomain
public class FunctionConverter implements DomainConverter<Function, String> {

	@Override
	public String fromDomainToValue(Function domain) {
		return domain.getNativeValue();
	}

	@Override
	public Function fromValueToDomain(String value) {
		return new FUNCTION(value);
	}

}
