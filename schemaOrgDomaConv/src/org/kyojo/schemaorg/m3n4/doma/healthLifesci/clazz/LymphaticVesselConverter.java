package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.LYMPHATIC_VESSEL;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LymphaticVessel;

@ExternalDomain
public class LymphaticVesselConverter implements DomainConverter<LymphaticVessel, String> {

	@Override
	public String fromDomainToValue(LymphaticVessel domain) {
		return domain.getNativeValue();
	}

	@Override
	public LymphaticVessel fromValueToDomain(String value) {
		return new LYMPHATIC_VESSEL(value);
	}

}
