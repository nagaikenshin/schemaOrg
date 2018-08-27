package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RISKS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Risks;

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
