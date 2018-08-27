package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FUNDER;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;

@ExternalDomain
public class FunderConverter implements DomainConverter<Funder, String> {

	@Override
	public String fromDomainToValue(Funder domain) {
		return domain.getNativeValue();
	}

	@Override
	public Funder fromValueToDomain(String value) {
		return new FUNDER(value);
	}

}
