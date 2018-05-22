package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BED;
import org.kyojo.schemaOrg.m3n3.core.Container.Bed;

@ExternalDomain
public class BedConverter implements DomainConverter<Bed, String> {

	@Override
	public String fromDomainToValue(Bed domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bed fromValueToDomain(String value) {
		return new BED(value);
	}

}
