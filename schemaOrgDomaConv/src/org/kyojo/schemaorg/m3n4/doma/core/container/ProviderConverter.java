package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROVIDER;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;

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
