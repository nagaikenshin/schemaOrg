package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PREPARATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Preparation;

@ExternalDomain
public class PreparationConverter implements DomainConverter<Preparation, String> {

	@Override
	public String fromDomainToValue(Preparation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Preparation fromValueToDomain(String value) {
		return new PREPARATION(value);
	}

}
