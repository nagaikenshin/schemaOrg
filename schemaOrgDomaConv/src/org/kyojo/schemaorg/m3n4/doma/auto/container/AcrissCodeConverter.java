package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.ACRISS_CODE;
import org.kyojo.schemaorg.m3n4.auto.Container.AcrissCode;

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
