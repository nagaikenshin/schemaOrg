package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVOIR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Reservoir;

@ExternalDomain
public class ReservoirConverter implements DomainConverter<Reservoir, String> {

	@Override
	public String fromDomainToValue(Reservoir domain) {
		return domain.getNativeValue();
	}

	@Override
	public Reservoir fromValueToDomain(String value) {
		return new RESERVOIR(value);
	}

}
