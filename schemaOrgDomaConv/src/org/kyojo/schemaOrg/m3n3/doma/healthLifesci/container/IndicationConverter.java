package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INDICATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Indication;

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
