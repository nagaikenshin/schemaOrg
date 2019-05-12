package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUDDHIST_TEMPLE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BuddhistTemple;

@ExternalDomain
public class BuddhistTempleConverter implements DomainConverter<BuddhistTemple, String> {

	@Override
	public String fromDomainToValue(BuddhistTemple domain) {
		return domain.getNativeValue();
	}

	@Override
	public BuddhistTemple fromValueToDomain(String value) {
		return new BUDDHIST_TEMPLE(value);
	}

}
