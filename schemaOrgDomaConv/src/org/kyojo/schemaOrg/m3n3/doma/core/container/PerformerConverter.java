package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERFORMER;
import org.kyojo.schemaOrg.m3n3.core.Container.Performer;

@ExternalDomain
public class PerformerConverter implements DomainConverter<Performer, String> {

	@Override
	public String fromDomainToValue(Performer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Performer fromValueToDomain(String value) {
		return new PERFORMER(value);
	}

}
