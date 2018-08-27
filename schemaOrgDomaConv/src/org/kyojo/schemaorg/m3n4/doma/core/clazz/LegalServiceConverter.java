package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LEGAL_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegalService;

@ExternalDomain
public class LegalServiceConverter implements DomainConverter<LegalService, String> {

	@Override
	public String fromDomainToValue(LegalService domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegalService fromValueToDomain(String value) {
		return new LEGAL_SERVICE(value);
	}

}
