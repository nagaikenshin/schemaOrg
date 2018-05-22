package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.CODE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code;

@ExternalDomain
public class CodeConverter implements DomainConverter<Code, String> {

	@Override
	public String fromDomainToValue(Code domain) {
		return domain.getNativeValue();
	}

	@Override
	public Code fromValueToDomain(String value) {
		return new CODE(value);
	}

}
