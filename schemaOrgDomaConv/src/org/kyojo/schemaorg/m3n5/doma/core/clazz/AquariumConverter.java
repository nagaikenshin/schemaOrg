package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AQUARIUM;
import org.kyojo.schemaorg.m3n5.core.Clazz.Aquarium;

@ExternalDomain
public class AquariumConverter implements DomainConverter<Aquarium, String> {

	@Override
	public String fromDomainToValue(Aquarium domain) {
		return domain.getNativeValue();
	}

	@Override
	public Aquarium fromValueToDomain(String value) {
		return new AQUARIUM(value);
	}

}
