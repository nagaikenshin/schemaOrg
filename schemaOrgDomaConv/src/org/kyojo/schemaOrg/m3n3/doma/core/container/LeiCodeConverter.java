package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LEI_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.LeiCode;

@ExternalDomain
public class LeiCodeConverter implements DomainConverter<LeiCode, String> {

	@Override
	public String fromDomainToValue(LeiCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public LeiCode fromValueToDomain(String value) {
		return new LEI_CODE(value);
	}

}
