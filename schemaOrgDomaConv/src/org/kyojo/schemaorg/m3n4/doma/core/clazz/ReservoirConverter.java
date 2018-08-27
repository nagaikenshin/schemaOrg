package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RESERVOIR;
import org.kyojo.schemaorg.m3n4.core.Clazz.Reservoir;

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
