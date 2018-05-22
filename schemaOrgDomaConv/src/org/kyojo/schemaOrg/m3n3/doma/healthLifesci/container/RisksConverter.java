package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RISKS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Risks;

@ExternalDomain
public class RisksConverter implements DomainConverter<Risks, String> {

	@Override
	public String fromDomainToValue(Risks domain) {
		return domain.getNativeValue();
	}

	@Override
	public Risks fromValueToDomain(String value) {
		return new RISKS(value);
	}

}
