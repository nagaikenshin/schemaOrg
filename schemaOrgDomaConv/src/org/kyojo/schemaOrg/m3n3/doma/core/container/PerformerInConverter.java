package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORMER_IN;
import org.kyojo.schemaOrg.m3n3.core.Container.PerformerIn;

@ExternalDomain
public class PerformerInConverter implements DomainConverter<PerformerIn, String> {

	@Override
	public String fromDomainToValue(PerformerIn domain) {
		return domain.getNativeValue();
	}

	@Override
	public PerformerIn fromValueToDomain(String value) {
		return new PERFORMER_IN(value);
	}

}
