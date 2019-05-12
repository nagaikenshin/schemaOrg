package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TEMPORAL;
import org.kyojo.schemaorg.m3n5.core.Container.Temporal;

@ExternalDomain
public class TemporalConverter implements DomainConverter<Temporal, String> {

	@Override
	public String fromDomainToValue(Temporal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Temporal fromValueToDomain(String value) {
		return new TEMPORAL(value);
	}

}
