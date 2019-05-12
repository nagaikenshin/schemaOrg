package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.TERMS_OF_SERVICE;
import org.kyojo.schemaorg.m3n5.pending.Container.TermsOfService;

@ExternalDomain
public class TermsOfServiceConverter implements DomainConverter<TermsOfService, String> {

	@Override
	public String fromDomainToValue(TermsOfService domain) {
		return domain.getNativeValue();
	}

	@Override
	public TermsOfService fromValueToDomain(String value) {
		return new TERMS_OF_SERVICE(value);
	}

}
