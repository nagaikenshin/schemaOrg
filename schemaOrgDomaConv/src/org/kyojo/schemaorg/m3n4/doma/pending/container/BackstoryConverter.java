package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.BACKSTORY;
import org.kyojo.schemaorg.m3n4.pending.Container.Backstory;

@ExternalDomain
public class BackstoryConverter implements DomainConverter<Backstory, String> {

	@Override
	public String fromDomainToValue(Backstory domain) {
		return domain.getNativeValue();
	}

	@Override
	public Backstory fromValueToDomain(String value) {
		return new BACKSTORY(value);
	}

}
