package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROVIDER;
import org.kyojo.schemaOrg.m3n3.core.Container.Provider;

@ExternalDomain
public class ProviderConverter implements DomainConverter<Provider, String> {

	@Override
	public String fromDomainToValue(Provider domain) {
		return domain.getNativeValue();
	}

	@Override
	public Provider fromValueToDomain(String value) {
		return new PROVIDER(value);
	}

}
