package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.VESSEL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.Vessel;

@ExternalDomain
public class VesselConverter implements DomainConverter<Vessel, String> {

	@Override
	public String fromDomainToValue(Vessel domain) {
		return domain.getNativeValue();
	}

	@Override
	public Vessel fromValueToDomain(String value) {
		return new VESSEL(value);
	}

}
