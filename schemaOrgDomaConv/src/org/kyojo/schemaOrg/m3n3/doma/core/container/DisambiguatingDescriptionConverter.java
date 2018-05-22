package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISAMBIGUATING_DESCRIPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;

@ExternalDomain
public class DisambiguatingDescriptionConverter implements DomainConverter<DisambiguatingDescription, String> {

	@Override
	public String fromDomainToValue(DisambiguatingDescription domain) {
		return domain.getNativeValue();
	}

	@Override
	public DisambiguatingDescription fromValueToDomain(String value) {
		return new DISAMBIGUATING_DESCRIPTION(value);
	}

}
