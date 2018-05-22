package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.ACRISS_CODE;
import org.kyojo.schemaOrg.m3n3.auto.Container.AcrissCode;

@ExternalDomain
public class AcrissCodeConverter implements DomainConverter<AcrissCode, String> {

	@Override
	public String fromDomainToValue(AcrissCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcrissCode fromValueToDomain(String value) {
		return new ACRISS_CODE(value);
	}

}
