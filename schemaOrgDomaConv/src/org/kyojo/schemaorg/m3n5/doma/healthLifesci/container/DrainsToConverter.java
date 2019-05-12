package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRAINS_TO;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DrainsTo;

@ExternalDomain
public class DrainsToConverter implements DomainConverter<DrainsTo, String> {

	@Override
	public String fromDomainToValue(DrainsTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrainsTo fromValueToDomain(String value) {
		return new DRAINS_TO(value);
	}

}
