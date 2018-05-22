package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EPIDEMIOLOGY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Epidemiology;

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
