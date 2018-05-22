package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROVIDER_MOBILITY;
import org.kyojo.schemaOrg.m3n3.core.Container.ProviderMobility;

@ExternalDomain
public class ProviderMobilityConverter implements DomainConverter<ProviderMobility, String> {

	@Override
	public String fromDomainToValue(ProviderMobility domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProviderMobility fromValueToDomain(String value) {
		return new PROVIDER_MOBILITY(value);
	}

}
