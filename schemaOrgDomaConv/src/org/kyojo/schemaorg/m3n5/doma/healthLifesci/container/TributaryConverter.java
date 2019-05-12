package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TRIBUTARY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Tributary;

@ExternalDomain
public class TributaryConverter implements DomainConverter<Tributary, String> {

	@Override
	public String fromDomainToValue(Tributary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Tributary fromValueToDomain(String value) {
		return new TRIBUTARY(value);
	}

}