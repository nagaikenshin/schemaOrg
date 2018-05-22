package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FUNDER;
import org.kyojo.schemaOrg.m3n3.core.Container.Funder;

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
