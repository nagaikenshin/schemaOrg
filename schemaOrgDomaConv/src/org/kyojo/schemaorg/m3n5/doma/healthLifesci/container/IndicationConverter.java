package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.INDICATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Indication;

@ExternalDomain
public class IndicationConverter implements DomainConverter<Indication, String> {

	@Override
	public String fromDomainToValue(Indication domain) {
		return domain.getNativeValue();
	}

	@Override
	public Indication fromValueToDomain(String value) {
		return new INDICATION(value);
	}

}
