package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ARTERY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Artery;

@ExternalDomain
public class ArteryConverter implements DomainConverter<Artery, String> {

	@Override
	public String fromDomainToValue(Artery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Artery fromValueToDomain(String value) {
		return new ARTERY(value);
	}

}
