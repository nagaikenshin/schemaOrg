package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.FUNCTION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Function;

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
