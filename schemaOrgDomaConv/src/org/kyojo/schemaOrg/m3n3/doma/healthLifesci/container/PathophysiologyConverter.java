package org.kyojo.schemaorg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.PATHOPHYSIOLOGY;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Pathophysiology;

@ExternalDomain
public class PathophysiologyConverter implements DomainConverter<Pathophysiology, String> {

	@Override
	public String fromDomainToValue(Pathophysiology domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pathophysiology fromValueToDomain(String value) {
		return new PATHOPHYSIOLOGY(value);
	}

}
