package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HINDU_TEMPLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HinduTemple;

@ExternalDomain
public class HinduTempleConverter implements DomainConverter<HinduTemple, String> {

	@Override
	public String fromDomainToValue(HinduTemple domain) {
		return domain.getNativeValue();
	}

	@Override
	public HinduTemple fromValueToDomain(String value) {
		return new HINDU_TEMPLE(value);
	}

}
