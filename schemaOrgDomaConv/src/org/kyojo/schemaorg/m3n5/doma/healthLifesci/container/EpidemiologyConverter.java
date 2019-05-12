package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.EPIDEMIOLOGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Epidemiology;

@ExternalDomain
public class EpidemiologyConverter implements DomainConverter<Epidemiology, String> {

	@Override
	public String fromDomainToValue(Epidemiology domain) {
		return domain.getNativeValue();
	}

	@Override
	public Epidemiology fromValueToDomain(String value) {
		return new EPIDEMIOLOGY(value);
	}

}